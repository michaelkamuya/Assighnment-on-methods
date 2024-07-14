//This program helps you to identify non-static,two static methods and a constructor 
public class Methods{
	// creating non static variable
	private int instanceVariable;
    //the construct
	public Methods(int value){
		this.instanceVariable = value;
	}
	//Another non static method
	public void instanceMethod(){
		System.out.println("Non staticMethod()");
		System.out.println("variable value: "+instanceVariable);
     //Static methods
	}
	public static void Method1() {
        System.out.println("Inside Method1()");
        System.out.println("This is a static method.");
    }
    public static void Method2() {
        System.out.println("Inside Method2()");
        System.out.println("This is another static method.");
    }
    // This is the Main method for  the program to run
     public static void main(String[] args) {
        // Calling of the static method 
        Method1();
        Method2();
         // creating   the constructor
        Methods obj = new Methods(19);
// Calling the instance method to the object
        obj.instanceMethod();
    }

}