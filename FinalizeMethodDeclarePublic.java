package javacodechecker;
import java.applet.Applet; 

public final class FinalizeMethodDeclarePublic extends Applet {
	// EMB-ISSUE: CodeIssueNames.FINALIZE_METHOD_DECLARE_PUBLIC
	public void finalize() {
		System.out.println("Hello");
		System.out.println("Hello");

		try{
			int i = 0;
			File f = new File("/usr/jenkins/workspace/demo.txt");
		}catch(Exception e){
			System.out.println("Exception"+e);
		}
		} 
}


