import java.util.ArrayList;
import java.util.Scanner;

class Placement_Cell {
    int comp_opening_day,comp_opening_month,comp_opening_year,comp_closing_day,comp_closing_month,comp_closing_year,stud_opening_day,stud_opening_month,stud_opening_year, stud_closing_day,stud_closing_month,stud_closing_year, offered_students,unoffered_students,blocked_students, reg_students_count,reg_companies_count;

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
        this.reg_students_count=0;
        this.reg_companies_count=0;
    }

    static Placement_Cell p1 = new Placement_Cell();
    static ArrayList<Placement_Cell> pc = new ArrayList<>();

    public static void placement_function(){
        Scanner sc=new Scanner(System.in);

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
        if (choice == 2) {
            System.out.println();
            System.out.println("Fill the following details to register for placement:");
            System.out.print("  1) Set the Opening date for company registrations(dd mm yyyy): ");
            Placement_Cell.p1.comp_opening_day = sc.nextInt();
            Placement_Cell.p1.comp_opening_month = sc.nextInt();
            Placement_Cell.p1.comp_opening_year = sc.nextInt();
            //////////////////////////////////////////////////////////////////////
            System.out.println();
            System.out.print("  2) Set the Closing date for company registrations(dd mm yyyy): ");
            Placement_Cell.p1.comp_closing_day = sc.nextInt();
            Placement_Cell.p1.comp_closing_month = sc.nextInt();
            Placement_Cell.p1.comp_closing_year = sc.nextInt();
            placement_function();
            /////////////////////////////////////////////////////////////////////////

        } else if (choice == 1) {
            System.out.println();
            System.out.println("Fill the following details to register for placement:");
            System.out.print("  1) Set the Opening date for Student registrations(dd mm yyyy): ");
            int stdoday = sc.nextInt();
            int stdomonth = sc.nextInt();
            int stdoyear = sc.nextInt();
            Placement_Cell.p1.stud_opening_day=stdoday;
            Placement_Cell.p1.stud_opening_month=stdomonth;
            Placement_Cell.p1.stud_opening_year=stdoyear;
            //////////////////////////////////////////////////////////////////////////
            System.out.println();
            System.out.print("  2) Set the Closing date for Student registrations(dd mm yyyy): ");
            Placement_Cell.p1.stud_closing_day = sc.nextInt();
            Placement_Cell.p1.stud_closing_month = sc.nextInt();
            Placement_Cell.p1.stud_closing_year = sc.nextInt();
            System.out.println(" ");
            placement_function();

            /////////////////////////////////////////////////////////////////
        } else if (choice == 3) {
            System.out.println();
            System.out.println("Number of Student Registered for Placement drive: " + Placement_Cell.p1.reg_students_count);
            placement_function();
        } else if (choice == 4) {
            System.out.println();
            System.out.println("Number of Company Registered for Placement drive: " + Placement_Cell.p1.reg_companies_count);
            placement_function();
        }
        else if (choice==5){

        } else if (choice==6) {
            System.out.println();
            for (int x = 0; x < Add_Students.student_list.size(); x++) {
                System.out.println("Name    : "+Add_Students.student_list.get(x).name);
                System.out.println("Roll no : "+Add_Students.student_list.get(x).Roll_no);
                System.out.println("Branch  : "+Add_Students.student_list.get(x).branch);
                System.out.println("CGPA    : "+Add_Students.student_list.get(x).CGPA);
                System.out.println("CTC     : "+Add_Students.student_list.get(x).ctc);
                System.out.println("Role    : "+Add_Students.student_list.get(x).Role);
                System.out.println();

            }
            placement_function();

        } else if (choice==7) {
            System.out.println();
            for (int y = 0; y <Company.company_list.size() ; y++) {
                System.out.println("Name    : "+Company.company_list.get(y).Company_name);
                System.out.println("Role    : "+Company.company_list.get(y).Role);
                System.out.println("CTC     : "+Company.company_list.get(y).ctc);
                System.out.println("CGPA    : "+Company.company_list.get(y).Cgpa_Criteria);
                System.out.println();

            }
            placement_function();
        } else if (choice==8) {
            double average=0,sum=0,count=0;

            for (int p = 0; p< Add_Students.student_list.size(); p++) {
                if(Add_Students.student_list.get(p).accepted==true){
                    count++;
                    sum=sum+Add_Students.student_list.get(p).ctc;
                }
                average=sum/count;
                System.out.println("Average Package: "+average);

            }
            placement_function();

        } else if (choice==9) {
            for (int i = 0; i <Add_Students.student_list.size() ; i++) {
                if(Add_Students.student_list.get(i).accepted==true){
                    System.out.println();
                    System.out.println("Name     : "+Add_Students.student_list.get(i).name);
                    System.out.println("Roll no  : "+Add_Students.student_list.get(i).Roll_no);
                    System.out.println("Branch   : "+Add_Students.student_list.get(i).branch);
                    System.out.println("CGPA     : "+Add_Students.student_list.get(i).CGPA);
                    System.out.println("Role     : "+Add_Students.student_list.get(i).Role);
                }

            }placement_function();
        } else if (choice==10) {
            Future_Builder.Application();

        } else {
            System.out.println("Wrong Input");
            placement_function();
        }

        }


}

