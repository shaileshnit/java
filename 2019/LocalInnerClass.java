package InnerClass;

public class LocalInnerClass {

	private int data=30;//instance variable  
	void display(){
		class Local{  
			void msg(){System.out.println(data);}  
		}  
		Local l=new Local();  
		l.msg();  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass obj=new LocalInnerClass();  
		obj.display();
	}

}

//Internal class generated by the compiler
//import java.io.PrintStream;  
//class LocalInnerClass$Local  
//{  
//    final localInner1 this$0;  
//    localInner1$Local()  
//    {     
//        super();  
//        this$0 = Simple.this;  
//    }  
//    void msg()  
//    {  
//        System.out.println(localInner1.access$000(localInner1.this));  
//    }  
//} 


//Example of local inner class with local variable
//
//class localInner2{  
// private int data=30;//instance variable  
// void display(){  
//  int value=50;//local variable must be final till jdk 1.7 only  
//  class Local{  
//   void msg(){System.out.println(value);}  
//  }  
//  Local l=new Local();  
//  l.msg();  
// }  
// public static void main(String args[]){  
//  localInner2 obj=new localInner2();  
//  obj.display();  
// }  
//}