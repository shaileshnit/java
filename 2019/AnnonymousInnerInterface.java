package InnerClass;

interface Eatable{  
	int x=10;
	void eat();  
} 

public class AnnonymousInnerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eatable e=new Eatable(){  
			public void eat(){System.out.println("nice fruits"+x);}  
		};  
		e.eat();  
	}

}

//Internal class generated by the compiler
//
//import java.io.PrintStream;  
//static class TestAnonymousInner1$1 implements Eatable  
//{  
//TestAnonymousInner1$1(){}  
//void eat(){System.out.println("nice fruits");}  
//}