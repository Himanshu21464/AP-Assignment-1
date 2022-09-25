import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Global{
    public static int i;

}
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
    //static ArrayList<Placement_Cell> pc = new ArrayList<>();
    public static void update(double cgpa){
        Add_Students.student_list.get(Global.i).CGPA=cgpa;
    }
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
            System.out.print("  1) Set the Opening date for company registrations in (DD MM YYYY) format (Time is by default 11:59AM ): ");
            Placement_Cell.p1.comp_opening_day = sc.nextInt();
            Placement_Cell.p1.comp_opening_month = sc.nextInt();
            Placement_Cell.p1.comp_opening_year = sc.nextInt();
            /////////////////////////////////////////////////////////////////////////
            System.out.println();
            System.out.print("  2) Set the Closing date for company registrations in (DD MM YYYY) format (Time is by default 11:59AM ): ");
            Placement_Cell.p1.comp_closing_day = sc.nextInt();
            Placement_Cell.p1.comp_closing_month = sc.nextInt();
            Placement_Cell.p1.comp_closing_year = sc.nextInt();
            placement_function();
            /////////////////////////////////////////////////////////////////////////

        } else if (choice == 1) {
            System.out.println();
            System.out.println("Fill the following details to register for placement:");
            System.out.print("  1) Set the Opening date for Student registrations in (DD MM YYYY) format (Time is by default 11:59AM ): ");
            int stdoday = sc.nextInt();
            int stdomonth = sc.nextInt();
            int stdoyear = sc.nextInt();
            Placement_Cell.p1.stud_opening_day=stdoday;
            Placement_Cell.p1.stud_opening_month=stdomonth;
            Placement_Cell.p1.stud_opening_year=stdoyear;
            //////////////////////////////////////////////////////////////////////////
            System.out.println();
            System.out.print("  2) Set the Closing date for Student registrations in (DD MM YYYY) format (Time is by default 11:59AM ): ");
            Placement_Cell.p1.stud_closing_day = sc.nextInt();
            Placement_Cell.p1.stud_closing_month = sc.nextInt();
            Placement_Cell.p1.stud_closing_year = sc.nextInt();
            System.out.println(" ");
            placement_function();

            //////////////////////////////////////////////////////////////////////////
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
            System.out.println(" ");
            for (int x=0;x<Add_Students.student_list.size();x++){
                if(Add_Students.student_list.get(x).accepted==true){
                    Placement_Cell.p1.offered_students++;
                }else if (Add_Students.student_list.get(x).accepted==false) {
                    Placement_Cell.p1.unoffered_students++;
                }
                else if (Add_Students.student_list.get(x).blocked==true){
                    Placement_Cell.p1.blocked_students++;
                }

            }
            System.out.println("Offered Students   : "+Placement_Cell.p1.offered_students);
            System.out.println("Unoffered Students : "+Placement_Cell.p1.unoffered_students);
            System.out.println("Blocked Students   : "+Placement_Cell.p1.blocked_students);


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
class Students{

    public static void function(){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("1. Enter as Student");
        System.out.println("2. Add Students");
        System.out.println("3. Back");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Choose the Student query to perform: ");
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

}
class Company {
    int day,month,year,status;
    String Company_name,Role;
    double ctc,Cgpa_Criteria;
    public Company(String Cname,String Role,double ctc,double Cgpa_Criteria){
        this.Company_name=Cname;
        this.ctc=ctc;
        this.day=0;
        this.month=0;
        this.year=0;
        this.Role=Role;
        this.status=0;
        this.Cgpa_Criteria=Cgpa_Criteria;
    }
    public void Role_Update(String Role) {
        this.Role = Role;
        System.out.println("Role updated successfully!!!");
    }
    public void ctc_Update(double ctc) {
        this.ctc = ctc;
        System.out.println("CTC is updated successfully!!!");
    }
    public void CGPA_Update(double Cgpa_Criteria) {
        this.Cgpa_Criteria = Cgpa_Criteria;
        System.out.println("CGPA updated successfully!!!");
    }
    static ArrayList<Company> company_list=new ArrayList<Company>();
    public static void company_function(){
        System.out.println("--------------------------------------------------");
        System.out.println("1. Add Company and Details");
        System.out.println("2. Choose Company");
        System.out.println("3. Get Available Companies");
        System.out.println("4. Back");
        System.out.println("--------------------------------------------------");
        System.out.print("Choose the Company Query to perform: ");
        Scanner sc = new Scanner(System.in);
        int query=sc.nextInt();
        if(query==1){
            add_company();
        } else if (query==2) {
            choose_company();
        } else if (query==3) {
            get_available_companies();
        } else if (query==4) {
            Future_Builder.Application();
        }else {
            System.out.println("Wrong Input!!!");
            System.out.println(" ");
            company_function();
        }
    }
    public static void add_company(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter company name: ");
        String Company_name=sc.nextLine();
        System.out.print("Enter Role: ");
        String Role=sc.nextLine();
        System.out.print("Enter package: ");
        double ctc=sc.nextDouble();
        System.out.print("Enter CGPA Criteria: ");
        double Cgpa_Criteria= sc.nextDouble();
        Company company=new Company(Company_name,Role,ctc,Cgpa_Criteria);
        company_list.add(company);
        Collections.sort(Company.company_list, new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                return (int)o1.ctc - (int)o2.ctc;
            }
        });
        company_function();
    }
    public static void choose_company(){
        System.out.println("-------------------------Available Companies---------------------------");
        for (int i = 0; i < Company.company_list.size(); i++) {
            System.out.println(i+1+". "+Company.company_list.get(i).Company_name);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("Choose a company: ");
        int temp = sc.nextInt();
        int temp4 = temp - 1;
        int choice4 = 0;
        while (choice4 != 5) {
            System.out.println();
            System.out.println("-------------------Welcome "+Company.company_list.get(temp4).Company_name+" --------------------");
            System.out.println("1. Update Role");
            System.out.println("2. Update Package");
            System.out.println("3. Update CGPA Criteria");
            System.out.println("4. Register to Institute Drive");
            System.out.println("5. Back");
            choice4 = sc.nextInt();
            System.out.println();
            if (choice4 == 1) {
                System.out.print("Enter new Role to update: ");
                sc.nextLine();
                String role = sc.nextLine();
                Company.company_list.get(temp4).Role_Update(role);
                choose_company();
            } else if (choice4 == 2) {
                System.out.print("Enter new CTC to update: ");
                int ctc = sc.nextInt();
                Company.company_list.get(temp4).ctc_Update(ctc);
                choose_company();
            } else if (choice4 == 3) {
                System.out.print("Enter new CGPA to update: ");
                double cgpa = sc.nextDouble();
                Company.company_list.get(temp4).CGPA_Update(cgpa);
                choose_company();
            } else if (choice4 == 4) {
                if (Company.company_list.get(temp4).status == 0) {
                    System.out.print("Enter date of registration in (DD MM YYYY) format,(time is by default 11:59PM): ");
                    Company.company_list.get(temp4).day = sc.nextInt();
                    Company.company_list.get(temp4).month = sc.nextInt();
                    Company.company_list.get(temp4).year = sc.nextInt();
                    System.out.println();
                    if (Company.company_list.get(temp4).year >= Placement_Cell.p1.comp_opening_year && Company.company_list.get(temp4).year <= Placement_Cell.p1.comp_closing_year) {
                        if (Company.company_list.get(temp4).month >= Placement_Cell.p1.comp_opening_month && Company.company_list.get(temp4).month <= Placement_Cell.p1.comp_closing_month) {
                            if (Company.company_list.get(temp4).day >= Placement_Cell.p1.comp_opening_day && Company.company_list.get(temp4).day <= Placement_Cell.p1.comp_closing_day) {
                                System.out.println("Company registered successfully!!!");
                                Company.company_list.get(temp4).status = 1;
                                Placement_Cell.p1.reg_companies_count++;
                            } else
                                System.out.println("Registration is not Active/ or maybe closed!!!");
                                choose_company();
                        } else
                            System.out.println("Registration is not Active/ or maybe closed!!!");
                            choose_company();
                    } else
                        System.out.println("Registration is not Active/ or maybe closes!!!");
                        choose_company();
                } else
                    System.out.println("Company Already registered!!!");
                    choose_company();
            } else if (choice4==5) {
                company_function();
            }
        }
    }
    public static void get_available_companies(){
            for (int i=0;i<Company.company_list.size();i++){
                System.out.println();
                System.out.println((i+1)+". "+company_list.get(i).Company_name);
            }
            company_function();
    }
}
class Enter_As_Student {
    public static void credentials(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your Roll no.: ");
        int roll_no=sc.nextInt();
        Global.i = 0;
        int err=0;
        while (Add_Students.student_list.get(Global.i).Roll_no != roll_no) {
            Global.i++;
            err=1;
        }
        System.out.println("-------------- Welcome " + name + "!! -----------------");
        student_mode();
        if(err==0) {
            System.out.println("Wrong credentials!!");
            credentials();
        }
    }
    public static void student_mode(){
        Scanner sc =new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        System.out.println("1. Register for Placement Drive");
        System.out.println("2. Register for Company");
        System.out.println("3. Get All available companies");
        System.out.println("4. Get Current Status");
        System.out.println("5. Update CGPA");
        System.out.println("6. Accept offer");
        System.out.println("7. Reject offer");
        System.out.println("8. Back");
        System.out.println("----------------------------------------------------------");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        System.out.println("---------------------------------------------------------");
        if(choice==1){
            if (Add_Students.student_list.get((Global.i)).drive_status==0){
                System.out.println();
                System.out.print("Enter date of registration in (DD MM YYYY) format, (time is by default 11:59PM): ");
                Add_Students.student_list.get(Global.i).day = sc.nextInt();
                Add_Students.student_list.get(Global.i).month = sc.nextInt();
                Add_Students.student_list.get(Global.i).year = sc.nextInt();
                sc.nextLine();
                System.out.println();
                if (Add_Students.student_list.get(Global.i).year >=Placement_Cell.p1.stud_opening_year && Add_Students.student_list.get(Global.i).year <= Placement_Cell.p1.stud_closing_year) {
                    if (Add_Students.student_list.get(Global.i).month >= Placement_Cell.p1.stud_opening_month && Add_Students.student_list.get(Global.i).month <= Placement_Cell.p1.stud_closing_month) {
                        if (Add_Students.student_list.get(Global.i).day >= Placement_Cell.p1.stud_opening_day && Add_Students.student_list.get(Global.i).day <=Placement_Cell.p1.stud_closing_day) {
                            System.out.println("Student registered successfully!!!");
                            Add_Students.student_list.get(Global.i).drive_status = 1;
                            Placement_Cell.p1.reg_students_count++;
                        } else
                            System.out.println("Registration is not Active/ or maybe closed!!!");
                    } else
                        System.out.println("Registration is not Active/ or maybe closed!!!");
                } else
                    System.out.println("Registration is not Active/ or maybe closed!!!");
            }
            System.out.println(" "+"Registered for placement drive at IIITD!!!!");
            student_mode();
        }  else if (choice == 2) {
            int count = 0;
            int array[],temporary=0;
            array = new int[Company.company_list.size()];
            for (int k = 0; k < Company.company_list.size(); k++) {
                if (Company.company_list.get(k).Cgpa_Criteria <= Add_Students.student_list.get(k).CGPA&&Company.company_list.get(k).status==1) {
                    System.out.println();
                    System.out.println((count+1) + ") " + Company.company_list.get(k).Company_name);
                    array[count] = k;
                    temporary=k;
                    count++;
                }
            }
            if(Add_Students.student_list.get(Global.i).accepted==false|Add_Students.student_list.get(Global.i).ctc<=3*(Company.company_list.get(temporary).ctc)) {
                System.out.println();
                System.out.print("Choose any one of the above: ");
                int temp2 = sc.nextInt();
                sc.nextLine();
                Add_Students.student_list.get(Global.i).registerForCompany();
                System.out.println("Registered successfully!!!");
                Add_Students.student_list.get(Global.i).company_list.add(Company.company_list.get(array[temp2-1]));
            }
            else
                System.out.println("Not eligible for placement anymore!!!");
            student_mode();
        } else if (choice == 3) {
            for (int j = 0; j < Company.company_list.size(); j++) {
                System.out.println();
                System.out.println("Name  : " + Company.company_list.get(j).Company_name);
                System.out.println("CGPA  : " + Company.company_list.get(j).Cgpa_Criteria);
                System.out.println("CTC   : " + Company.company_list.get(j).ctc);
            }
            student_mode();
        } else if (choice == 4) {
            System.out.println();
            if (Add_Students.student_list.get(Global.i).registered_status == 1) {
                System.out.println("Student got offer!!!");
                for (int j = 0; j < Add_Students.student_list.get(Global.i).company_list.size(); j++) {
                    System.out.println();
                    System.out.println("Name  : " + Add_Students.student_list.get(Global.i).company_list.get(j).Company_name);
                    System.out.println("Role  : "+  Add_Students.student_list.get(Global.i).company_list.get(j).Role);
                    System.out.println("CGPA  : " + Add_Students.student_list.get(Global.i).company_list.get(j).Cgpa_Criteria);
                    System.out.println("CTC   : " + Add_Students.student_list.get(Global.i).company_list.get(j).ctc);
                }
            } else if (Add_Students.student_list.get(Global.i).blocked == true) {
                System.out.println("Student is Blocked");
            } else if (Add_Students.student_list.get(Global.i).status == 0) {
                System.out.println("Student didn't get any offer!!!");
            }
            student_mode();
        } else if (choice == 5) {
            System.out.println();
            System.out.print("Enter new CGPA: ");
            double cgpa = sc.nextDouble();
            Placement_Cell.update(cgpa);
            System.out.println("CGPA updated successfully!!!");
        } else if (choice == 6) {
            System.out.println();
            if (Add_Students.student_list.get(Global.i).reject != Add_Students.student_list.get(Global.i).company_list.size()) {
                System.out.println("Most recent offer is accepted!!!");
                Add_Students.student_list.get(Global.i).accepted = true;
                Add_Students.student_list.get(Global.i).ctc=Add_Students.student_list.get(Global.i).company_list.get(Add_Students.student_list.get(Global.i).company_list.size()-1).ctc;
                Add_Students.student_list.get(Global.i).Role=Add_Students.student_list.get(Global.i).company_list.get(Add_Students.student_list.get(Global.i).company_list.size()-1).Role;
            } else
                System.out.println("Student is Blocked!!!");
        } else if (choice == 7) {
            System.out.println();
            if (Add_Students.student_list.get(Global.i).reject != Add_Students.student_list.get(Global.i).company_list.size()) {
                System.out.println("Most recent offer is Rejected!!!");
            } else
                System.out.println("Student is Blocked!!!");
        } else if (choice==8) {
            Students.function();
        } else {
            System.out.println("Wrong Input!!!");
            student_mode();
        }
    }
}
class Add_Students {
    String name, branch,Role;
    int Roll_no,reject,registered_status,day,month,year,drive_status,status;
    boolean blocked, accepted;
    double CGPA,ctc;
    public Add_Students(String name, int Roll_no, double CGPA, String branch){
        this.ctc=0;
        this.accepted=false;
        this.blocked=false;
        this.drive_status=0;
        this.status=0;
        this.reject=0;
        this.name=name;
        this.Roll_no=Roll_no;
        this.CGPA=CGPA;
        this.registered_status=0;
        this.branch=branch;
        this.day=0;this.month=0;this.year=0;

    }
    public void registerForCompany() {
        if (this.registered_status != 1) {
            this.registered_status = 1;
        }
    }
    public void updateCgpa(double CGPA)
    {
        this.CGPA = CGPA;
    }
    static ArrayList<Add_Students> student_list=new ArrayList<Add_Students>();
    static ArrayList<Company> company_list=new ArrayList<Company>();
    public static void Student_function(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's name: ");
        String name=sc.nextLine();
        System.out.print("Enter  Roll no: ");
        int Roll_no= sc.nextInt();
        System.out.print("Enter CGPA: ");
        double CGPA=sc.nextDouble();
        System.out.print("Enter Branch: ");
        sc.nextLine();
        String branch=sc.nextLine();
        Add_Students student =new Add_Students(name, Roll_no, CGPA, branch);
        student_list.add(student);
        Students.function();

    }
}
public class Future_Builder {

    public static void main_menu(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Welcome to Future Builder");
        System.out.println("1. Enter the Application");
        System.out.println("2. Exit the Application");
        System.out.println("-----------------------------------------------------");
        System.out.print("Enter your choice: ");
        Scanner sc =new Scanner(System.in);
        int option=sc.nextInt();
        System.out.println(" ");
        if(option==1){
            Future_Builder.Application();
        } else if (option==2){
            System.out.println("Thanks for using FutureBuilder!!!");
            System.out.println("*************************************************");
            java.lang.System.exit(0);
        }
        else {
            System.out.println("Wrong Input!!");
            System.out.println(" ");
            main_menu();
        }
    }

    public static void Application() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Enter as Student Mode");
        System.out.println("2. Enter as Company Mode");
        System.out.println("3. Enter as Placement Cell Mode");
        System.out.println("4. Return to Main Application");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Choose the mode you want to Enter in: ");
        Scanner sc =new Scanner(System.in);
        int mode= sc.nextInt();
        System.out.println(" ");
        if (mode==1){
            Students.function();
        } else if (mode==2){
            Company.company_function();
        } else if (mode==3){
            Placement_Cell.placement_function();
        } else if (mode==4){
            main_menu();
        } else {
            System.out.println("Wrong Input");
            System.out.println(" ");
            Application();
        }
    }
    public static void main(String arg[]) {
        main_menu();
        }
    }
