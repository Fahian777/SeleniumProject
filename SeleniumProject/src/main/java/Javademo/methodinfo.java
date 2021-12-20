package Javademo;

public class methodinfo {

 public static void main(String arg[]) {
		System.out.println("Object creation Syntax:");
		System.out.println("CalssName object = new ClassName();");
		methodinfo allifo=new methodinfo();
		System.out.println("Inside class what we write normally:");
		
		System.out.println("Methods();");
		System.out.println("Variables;");
		allifo.javaMethodInfo();
		allifo.javaMethodsSignature();
		allifo.whyUseMethods();
		allifo.createAMethod();
		allifo.methodHave4Things();
		allifo.accessModifierType();
		allifo.accessModifierType();
		allifo.classLevelModifier();
		allifo.twoTypesMethod();
		allifo.returnType();
		allifo.paramitirizedMethod();
		}

	//inside class body we write methods
		public void javaMethodInfo()
		{
		System.out.println("Method :");
		System.out.println("-A method is a block of code which only runs when it is called");
		System.out.println("-Methods are used to perform certain actions, and they are also known as methods/functions.");
		System.out.println("-You can pass data into a method as arguments, known as parameterized method.");
	}
		public void javaMethodsSignature() 
		{
			System.out.println("Method signature:");
			System.out.println("a method signature is a combination of Access modifier, return type, method name and method body");
			System.out.println();
		}
			
		
		public void whyUseMethods() 
		{
			System.out.println("To reuse code: ");
			System.out.println("define the code once, and use it many times.");
			System.out.println();
		}
		
		public void createAMethod() 
		{
			System.out.println("A method must be declared within a class. It is defined with the name of the class, followed by two normal parentheses().");
			System.out.println("Java provides some pre-defined methods, method name always start with lowercase.");
			System.out.println("such as get(); close(); System.out.println(); ");
			System.out.println("but we can also create our own methods to perform certain actions:");
		}
		
		public void methodHave4Things() 
		{
			System.out.println("public- Access Modifier");
			System.out.println("void- return type");
			System.out.println("methodHave4Things()- Method name");
			System.out.println("{ System.out.println();}-Method body");
		}
		
		public void accessModifierType() 
		{
			System.out.println("Four types of access modifier:(Method level)");
			System.out.println("1. public");
			System.out.println("2. private");
			System.out.println("3. default/no modifier");
			System.out.println("4. protected");
		}
		public void methodLevelAccessModifierType() 
		{
			System.out.println("Method level Access Modifier:(4 types)");
			System.out.println("1. public->within class + within package + outside too");
			System.out.println("private->within same class only");
			System.out.println("3. default/no modifier-> within package");
			System.out.println("4. protected-> within class + within package");
		}
		public void classLevelModifier() {
			System.out.println("Class level modifier:(2 types)");
			System.out.println("1. public");
			System.out.println("2. default/no modifier");
		}
		public void twoTypesMethod() {
			System.out.println("Static and non Static method");
			System.out.println("Static method has always Static keyword");
			System.out.println("non static method has no static keyword");
			System.out.println("Non Static method not allowed to call inside static method");
			System.out.println("Normally we can't access static member from non static member.");
			System.out.println("for overcome this situation/issue we create a object of said class.");
		}
		public void returnType() {
			System.out.println("Retrurn type: based on the method output/return data type, we should update the return type.");
			System.out.println("Ex.  as int, String, boolean etc.");
		}
		public void paramitirizedMethod() {
			System.out.println("parameterized method: When we want to pass any value run time to the java method, then we called it as argument/parameter.");
			System.out.println("public String name(String username, String pwd){  //mamunhy, crmsfa");
			System.out.println("return Username + pwd;");
		}

	}//class body finish
	


