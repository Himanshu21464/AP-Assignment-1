import java.util.ArrayList;
import java.util.Scanner;

class Placement_Cell {
    int comp_opening_day,comp_opening_month,comp_opening_year;
    int comp_closing_day,comp_closing_month,comp_closing_year;
    int stud_opening_day,stud_opening_month,stud_opening_year;
    int stud_closing_day,stud_closing_month,stud_closing_year;
    int offered_students,unoffered_students,blocked_students;

    public Placement_Cell(){
        this.blocked_students=0;
        this.offered_students=0;
        this.unoffered_students=0;
        this.stud_opening_day=0;
        this.stud_opening_month=0;
        this.stud_opening_year=0;
        this.stud_closing_day=0;
        this.stud_closing_month=0;
        this.stud_closing_year=0;
        this.comp_closing_day=0;
        this.comp_closing_month=0;
        this.comp_closing_year=0;
        this.comp_opening_day=0;
        this.comp_opening_month=0;
        this.comp_opening_year=0;
    }
    static ArrayList<Placement_Cell> pc =new ArrayList<>();
    public static void student_registration(){
        System.out.println("----------------------------------------------");
        System.out.println("Fill in the Details:-");
        System.out.println("1. Set Opening time for Student Registrations");
        System.out.println("2. Set Closing time for Student Registrations");
        Scanner sc =new Scanner(System.in);
        int option=sc.nextInt();

        if (option==1){
            if(1==1){

            }
            //final String opening_date=sc.nextLine();
        } else if (option==2) {
            //final String closing_date = sc.nextLine();
        }else {
            System.out.println("Wrong Input!!!");
            System.out.println(" ");
            student_registration();
        }

    }

    public static void company_registration(){
        System.out.println("----------------------------------------------");
        System.out.println("Fill in the Details:-");
        System.out.println("1. Set Opening time for Company Registrations");
        System.out.println("2. Set Closing time for Company Registrations");
        Scanner sc =new Scanner(System.in);
        int option=sc.nextInt();
        if (option==1){
            final String opening_date=sc.nextLine();
        } else if (option==2) {
            final String closing_date = sc.nextLine();
        }else {
            System.out.println("Wrong Input!!!");
            System.out.println(" ");
            company_registration();
        }

    }




    public static void placement_function(){
        Scanner sc=new Scanner(System.in);
        int reg_students_count=0,reg_companies_count=0;
        System.out.println("Welcome to IIITD placement Cell");
        System.out.println(" 1. Open Student Registrations");
        System.out.println(" 2. Open Company Registrations");
        System.out.println(" 3. Get Number of Student Registrations");
        System.out.println(" 4. Get Number of Company Registrations");
        System.out.println(" 5. Get Number of Offered/Unoffered/Blocked Students");
        System.out.println(" 6. Get Student Details");
        System.out.println(" 7. Get Company Details");
        System.out.println(" 8. Get Average Package");
        System.out.println(" 9. Get Company Process Results");
        System.out.println("10. Back");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        if(choice==1){
            student_registration();
            reg_students_count++;

        } else if (choice==2) {
            company_registration();
            reg_companies_count++;

        } else if (choice==3) {
            System.out.println("Total number of Registered Students: "+reg_students_count);


        } else if (choice==4) {
            System.out.println("Total number of Registered Companies: "+reg_companies_count);

        } else if (choice==5) {
            System.out.println(" Number of Offered Students   : "+" //////// ");
            System.out.println(" Number of Unoffered Students : "+" //////// ");
            System.out.println(" Number of Blocked Students   : "+" //////// ");

        } else if (choice==6) {
            System.out.print("Enter name: ");
            String student_name=sc.nextLine();
            System.out.print("Enter Roll no: ");
            int rollno=sc.nextInt();


            //// show student details from student class


        } else if (choice==7) {
            System.out.print("Enter name: ");
            String company_name=sc.nextLine();


            //// print company details


        } else if (choice==8) {

            System.out.println("Average Package offered to the students of institute: "+ "  //////////   ");

        } else if (choice==9) {
            System.out.print("Enter the name of the company: ");
            String c_name=sc.nextLine();
            {
              /// code for printing selected students list
            }

            
        } else if (choice==10) {
            Future_Builder.Application();
            
        } else {
            System.out.println("Wrong Input");
        }
        

    }
}
