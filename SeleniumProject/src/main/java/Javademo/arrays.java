package Javademo;




public class arrays {

	public static void main(String[] args) {
		
		// Data Types:- 1. Primitive DataTypes and NonPrimitive DataType
		
		// num9600234
		//float, short,boolean,bit,byte
		
		
		short num0 = 1;
		int num1 = 10;
		long num2 = 1111111111;
		
		double num3 = 10.10;
		float num4 = 10.10f;

		boolean num5 = false;
		char ch = 'p';
		
		int x =10;
		
	char y = 'a';
	
String	z = "Hasan";
		
// syntax for Arrays:
	// names = "yousuf", "shihab", "Mamun"				

	//1. How to store the values into Arrays(Note: Two ways available)	
		
//first way
			/*int [] id = {10,20,30,40,50,60}; //array.length	
		
		System.out.println(id.length);
		System.out.print(id.[2]);
		
		System.out.println(id[1]);
		
		System.out.println("...................................");
		
			String[] names = {"yousuf", "shihab", "abcd", "mamun"}; 
			
		System.out.println(names.length);
		System.out.println(names[2]);*/
		
			//int[] ph = {123, 456, 789, 1 ,2 ,3 ,4};		
			//char[] ch1 = {'a', 'b', 'c', 'd'};
			
			//print ant particular value
				//System.out.println(names[2]);
		
			//how to get count of Array ---> array.lenght
				//System.out.println(names.length);
				//System.out.println(ph.length);

			//way-2		
			//ClassName obj = new ClassName();
			
			//String[] names = new String[4];
		
			String [] obj = new String[5];
			obj[0]=	"Najmul";
			obj[1] = "tipu";
			obj[2] = "mamun";
			obj[3] = "xyz";
			obj[4] = "abc";
			//obj[5] = "eva";
			//System.out.println(5);

			//System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");

			//2. How to pick value from Array ---> array[indexNumber]		
			System.out.println(obj[3]);


			//3. how to get count of Array ---> array.lenght
			System.out.println(obj.length);
			


			
			//System.out.println("********************");

				//for(i=0; i<=20; i++)
			//4. using for iterator, while loops and forEach		

			for (int i= 0; i <obj.length; i=i+1) {			
				System.out.println(obj[i]);
			}

			//String[] obj = new String[4];
			//obj[0] = "yousuf";
			//obj[1] = "shihab";
			//obj[2] = "Mamun";
			//obj[3] = "xyz";	

			//System.out.println("-------------------------------------------------------------");

			//1. For Each loop
		/*	for(String eachObj : obj) {			
				System.out.println(eachObj);
			}		

			System.out.println("-------------------------------------------------------------");

			//2. For loop		
			for(int i= 0 ; i <= 3; i++) {			
				System.out.println(obj[i]);
			}	*/	

			System.out.println("-------------------------------------------------------------");

			//3.While loop		
			/*int i =0;
			while (i<=3) {				
				System.out.println(obj[i]);
				i++;
		
		
		
		
		

	}*/

}
}
