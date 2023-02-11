import java.util.*;
public class stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> st = new Stack<>();
st.push("America");
st.push("england");
st.push("australia");
st.push("india");
	System.out.println("Stack =    " +st);
	System.out.println("the element that is at the top of the stack  =  "+st.peek());
st.pop();
System.out.println("popped element =   "+st.pop());
System.out.println(st);
	}

}
