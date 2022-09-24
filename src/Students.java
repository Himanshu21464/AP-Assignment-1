import java.util.Scanner;

public class Students{

        public static void function(){
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("1. Enter as Student");
                System.out.println("2. Add Students");
                System.out.println("3. Back");
                System.out.println("Choose the Student query to perform: ");
                Scanner sc=new Scanner(System.in);
                int query=sc.nextInt();
                System.out.println(" ");
                if(query==1){
                        Enter_As_Student.credentials();
                } else if (query==2) {
                        Add_Students.Student_function();
                } else if (query==3) {
                        Future_Builder.Application();
                }  else{
                        System.out.println("Wrong Input!!");
                        System.out.println(" ");
                        Students.function();

                }
        }
        public static void main(String[] args){

        }

}
class Enter_As_Student {
        public static void credentials(){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter your name: ");
                String name=sc.nextLine();
                System.out.print("Enter your Roll no.: ");
                int roll_no=sc.nextInt();
                System.out.println("-------------- Welcome "+name+"!! -----------------");

                student_mode();
        }
        public static void student_mode(){
                Scanner sc =new Scanner(System.in);
                System.out.println("1. Register for Placement Drive");
                System.out.println("2. Register for Company");
                System.out.println("3. Get All available companies");
                System.out.println("4. Get Current Status");
                System.out.println("5. Update CGPA");
                System.out.println("6. Accept offer");
                System.out.println("7. Reject offer");
                System.out.println("8. Back");
                System.out.print("Enter your choice: ");
                int choice=sc.nextInt();
                System.out.println("----------------------------------------------------");
                if(choice==1){

                } else if (choice==2) {
                        // System.out.print();

                } else if (choice==3) {

                } else if (choice==4) {

                } else if (choice==5) {

                } else if (choice==6) {

                } else if (choice==7) {

                } else if (choice==8) {

                }else {
                        System.out.println("Wrong Input");
                        System.out.println(" ");
                        student_mode();
                }


        }
}

class Add_Students {
        String name;
        int Roll_no;
        double CGPA;
        String Branch;
        public Add_Students(){
        }


    public static void Student_function(){
            Scanner sc = new Scanner(System.in);
            Add_Students student =new Add_Students();
            System.out.print("Enter Student's name: ");
            student.name=sc.nextLine();
            System.out.print("Enter  Roll no: ");
            student.Roll_no= sc.nextInt();
            System.out.print("Enter CGPA: ");
            student.CGPA=sc.nextDouble();
            System.out.print("Enter Branch: ");
            sc.nextLine();
            student.Branch=sc.nextLine();

    }
}
