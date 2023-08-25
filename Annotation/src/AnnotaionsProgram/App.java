package AnnotaionsProgram;

public class App {

	public static void main(String[] args) {
		
	var user = new User(1L , "harry");
	
	//System.out.println(user);
	var repo = new Repository<User>();
	repo.save(user);
	
	}
	
}
