import java.util.Scanner;

public class Students{
        public static void main(String[] args){

        }

}
class Enter_As_Student {
        public static void student_mode(){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter your name: ");
                String name=sc.nextLine();
                System.out.print("Enter your Roll no.: ");
                int roll_no=sc.nextInt();
                System.out.println("Welcome "+name+"!!");
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
