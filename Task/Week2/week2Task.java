import java.util.Scanner;
public class week2Task {
    public static void main(String[] args) {

        /* Qno.1 Write a program to check whether a person can cast a vote or not. 
           The condition is you must be over 18 years old to vote.  */
        Scanner task = new Scanner(System.in);
      //   System.out.println("Enter your age:");
      //   int age = task.nextInt();

      //   if(age >= 18){
      //       System.out.println("You are eligible to vote!");
      //   }else{
      //       System.out.println("You are not eligible to vote yet.");
      //   }
        


      //   /* Qno.2  Write a program to calculate SI. 
      //      Formula Simple Interest = (PrincipleAmount*Time*Rate/100) */
        //Scanner task = new Scanner(System.in);
        System.out.println("Enter Principle Amount:");
        int principle = task.nextInt();
        System.out.println("Enter Time period:");
        int time = task.nextInt();
        System.out.println("Enter Rate:");
        int rate = task.nextInt();

        int SimpleInterest = ((principle*time*rate)/100);
        System.out.println("The simple interest is:" + SimpleInterest);
        
        


      //   /* Qno.3 Write a program to calculate area of triangle, and Volume of Cube and Cuboid.
      //      Formula: Volume of Cuboid = length*width*height
      //               Volume of Cube = Side*side*side */
      //   int length = 10, width = 20, height = 5;
      //   int Volume_of_Cuboid = length*width*height;
      //   System.out.println("The volume of cuboid is:" +Volume_of_Cuboid);
      //   int side = 12;
      //   int cube = side*side*side;
      //   System.out.println("The volume of cube is:" +cube);



      //   /* Qno.4 Write the ternary operator for question no. 1 */
      //   int age1 = 13;
      //   String check = (age1>=18) ? "Eligible to vote." : "Not eligible to vote.";
      //   System.out.println(check);

    

      //   /* Qno.5 Write a program to take two integer input from the user and print the sum and product of them. */
      //   //Scanner sp = new Scanner(System.in);
      //   System.out.println("Enter number 1:");
      //   int a = task.nextInt();
      //   System.out.println("Enter number 2:");
      //   int b = task.nextInt();

      //   int sum = a+b;
      //   int product = a*b;
      //   System.out.println("The sum of these two numbers is: " +sum);
      //   System.out.println("The product of these two numbers is: " +product);
        


      //   /* Qno.6 Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
      //      Finally, calculate the division of thus obtained sum and product and print the result. */
      //   //Scanner user = new Scanner(System.in);
      //   System.out.println("Enter first number: ");
      //   int c = task.nextInt();
      //   System.out.println("Enter second number: ");
      //   int d = task.nextInt();

      //   int sum1 = c+d;
      //   int product1 = c*d;
      //   float division = (sum1/product1);
      //   System.out.println("The sum of these two numbers is: " +sum1);
      //   System.out.println("The product of these two numbers is: " +product1);
      //   System.out.println("The division of obtained sum and product of two numbers is: " +division);
        


      //   /* Qno.7 Take the name, roll number and field of interest from the user and print in the format below. 
      //      Hey, my name is XYZ and my roll number is XYZ. My field of interest are XYZ. */
      //   //Scanner info = new Scanner(System.in);
      //   System.out.println("Enter your name: ");
      //   String name = task.nextLine();
      //   System.out.println("Enter your roll number: ");
      //   int roll_number = task.nextInt();
      //   System.out.println("Enter your field of interest: ");
      //   String hobby = task.nextLine();

      //   System.out.print("Hey, my name is " +name);
      //   System.out.print(" and my roll number is " +roll_number);
      //   System.out.print(". My field of interest are \n" +hobby);
        
        
        

        /* Qno.8 Take side of a square from user and print area and perimeter of it. 
           Also, calculate Simple Interest, Area of triangle and Volume of cube and cuboid. 
           Take the attributes as user input. */
        //Scanner task = new Scanner(System.in);
      //   System.out.println("Enter a side of square: ");
      //   int s = task.nextInt();
      //   int Area = s * s;
      //   int perimeter = 4 * s;
      //   System.out.println("The perimeter of square is:" +perimeter);
      //   System.out.println("The area of square is:" +Area);
        
      //   //calculating simple interest.
      //   System.out.println("Enter principle:");
      //   int p = task.nextInt();
      //   System.out.println("Enter time:");
      //   int t = task.nextInt();
      //   System.out.println("Enter rate:");
      //   int r = task.nextInt();
      //   float SI = (p*t*r)/100;
      //   System.out.println("The simple interest is:" +SI);

        //calculating area of triangle.
        System.out.println("Enter base of triangle:");
        int base = task.nextInt();
        System.out.println("Enter height of triangle:");
        int h = task.nextInt();
        double A = (1/2)*(base*h);
        System.out.println("The area of triangle is" +A);

      //   //calculating volume of cube and cuboid.
      //   System.out.println("Enter length of cube:");
      //   int l = task.nextInt();
      //   int V = l*l*l;
      //   System.out.println("The volume of cube is" +V);

      //   System.out.println("Enter length of cuboid:");
      //   int l1 = task.nextInt();
      //   System.out.println("Enter breadth of cuboid:");
      //   int b1 = task.nextInt();
      //   System.out.println("Enter height of cuboid:");
      //   int h1 = task.nextInt();
        
      //   int V1 = l1*b1*h1;
      //   System.out.println("The volume of cuboid is" +V1);



        /* Qno.9 Ask user to give two double input for length and breadth of a rectangle 
           and print area type casted to int. */
        System.out.println("");




        // SI.close();
        // sc.close();
        // sp.close();
        // user.close();
        // info.close();
        task.close();






    }
}