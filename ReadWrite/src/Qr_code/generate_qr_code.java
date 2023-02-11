package Qr_code;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
public class generate_qr_code {
	public static void main(String[] args) {
		try {
			database_connection obj_DBConnection = new database_connection();
            Connection connection = obj_DBConnection.getConnection();
            String query = "select * from student";
            Statement stmt = null;
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
            	generate_qr_code.generate_qr(rs.getString("SERIAL_NUMBER"),rs.getString("STUDENT_INFORMATION"));
            }
		} catch (Exception e) {
			// TODO: handle exceptionq]q
			System.out.println(e);
		}
	}
	public static void generate_qr(String image_name,String qrCodeData) {
        try {
            String filePath = "D:\\QRCODE\\"+image_name+".png";
            String charset = "UTF-8"; // or "ISO-8859-1"
            Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
         
            BitMatrix matrix1 = new MultiFormatWriter().encode(
            		new String(qrCodeData.getBytes(charset),charset),BarcodeFormat.QR_CODE, 200, 200);
        
            MatrixToImageWriter.writeToFile(matrix1, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
            System.out.println("QR Code image created successfully!");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

