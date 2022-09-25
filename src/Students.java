import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Global{
        public static int i;

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
                System.out.println("Role is updated successfully!!!");
        }

        public double get_ctc(){
                return this.ctc;
        }
        public void ctc_Update(int ctc) {
                this.ctc = ctc;
                System.out.println("CTC is updated successfully!!!");
        }

        public void CGPA_Update(double Cgpa_Criteria) {
                this.Cgpa_Criteria = Cgpa_Criteria;
                System.out.println("CGPA is updated successfully!!!");

        }

        public static ArrayList<Company> company_list=new ArrayList<>();
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
                        //int option2=sc.nextInt();
                        choice4 = sc.nextInt();
                        System.out.println();
                        if (choice4 == 1) {
                                System.out.print("Enter new role to update: ");
                                sc.nextLine();
                                String role = sc.nextLine();
                                Company.company_list.get(temp4).Role_Update(role);
                        } else if (choice4 == 2) {
                                System.out.print("Enter new CTC to update: ");
                                int ctc = sc.nextInt();
                                Company.company_list.get(temp4).ctc_Update(ctc);
                        } else if (choice4 == 3) {
                                System.out.print("Enter new CGPA to update: ");
                                double cgpa = sc.nextDouble();
                                Company.company_list.get(temp4).CGPA_Update(cgpa);
                        } else if (choice4 == 4) {
                                if (Company.company_list.get(temp4).status == 0) {
                                        System.out.print("Enter date of registration(dd mm yy): ");
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
                                                                System.out.println("Registration is not Active!!!");
                                                } else
                                                        System.out.println("Registration is not Active!!!");
                                        } else
                                                System.out.println("Registration is not Active!!!");
                                } else
                                        System.out.println("Already registered!!!");
                        } else if (choice4==5) {
                                company_function();

                        }

                }






        /*if(option2==1){
            company_list.indexOf(index-1).Role=sc.nextLine();
        } else if (option2==2) {
            comp_name.Package=sc.nextDouble();
        } else if (option2==3) {
            comp_name.CGPA_criteria=sc.nextDouble()

        } else if (option2==4) {
            ////////////////Register for institute drive
        } else if (option2==5) {
            company_function();

        } else{
            System.out.println("Wrong input!!!");
            choose_company();
        }

         */



        }

        public static void get_available_companies(){

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
                        err=0;
                }
                System.out.println("-------------- Welcome " + name + "!! -----------------");
                student_mode();
                if(err!=0) {
                        System.out.println("Wrong credentials!!");
                        credentials();
                }
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
                        if (Add_Students.student_list.get((Global.i)).drive_status==0){

                                System.out.println();
                                System.out.print("Enter date of registration(dd mm yy): ");
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
                                                        System.out.println("Registration is not Active!!!");
                                        } else
                                                System.out.println("Registration is not Active!!!");

                                } else
                                        System.out.println("Registration is not Active!!!");


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
                } else if (choice == 3) {
                        for (int j = 0; j < Company.company_list.size(); j++) {
                               // if (Add_Students.student_list.get(Global.i).CGPA>=Company.company_list.get(Global.i).)
                                System.out.println();
                                System.out.println("Name  : " + Company.company_list.get(j).Company_name);
                                System.out.println("CGPA  : " + Company.company_list.get(j).Cgpa_Criteria);
                                System.out.println("CTC   : " + Company.company_list.get(j).ctc);
                        }
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
                } else if (choice == 5) {
                        System.out.println();
                        System.out.print("Enter new CGPA: ");
                        double cgpa = sc.nextFloat();
                        Add_Students.student_list.get(Global.i).updateCgpa(cgpa);
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

                /* else if (choice==2) {
                        System.out.print("Enter the name of company you wanna register: ");
                        String reg=sc.nextLine();

                        System.out.println("Successfully registered for "+"Role at "+reg+"!!!");
                        student_mode();

                } else if (choice==3) {
                        Company.get_available_companies();

                } else if (choice==4) {


                } else if (choice==5) {

                } else if (choice==6) {

                } else if (choice==7) {

                } else if (choice==8) {

                }else {
                        System.out.println("Wrong Input");
                        System.out.println(" ");
                        student_mode();
                }*/


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


        static ArrayList<Add_Students> student_list=new ArrayList<>();
        static ArrayList<Company> company_list=new ArrayList<>();
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
