import java.util.Scanner;

class Company {
    String Company_name;
    String Role;
    double pkg;
    double Cgpa_Criteria;
    //String date_time;


    public Company(){
    }


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
        Company company=new Company();
        System.out.print("Enter company name: ");
        company.Company_name=sc.nextLine();
        System.out.print("Enter Role: ");
        company.Role=sc.nextLine();
        System.out.print("Enter package: ");
        company.pkg=sc.nextDouble();
        System.out.print("Enter CGPA Criteria: ");
        company.Cgpa_Criteria= sc.nextDouble();

        //Add company to a companies list
        //company.date_time=sc.nextLine();
    }

    public static void choose_company(){
        System.out.println("-------------------------Available Companies---------------------------");
        System.out.println("///////////// print company list /////");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();

        //// select company from company.obj list
        String comp_name;
        System.out.println("-------------------Welcome "+"/////company name "+"--------------------");
        System.out.println("1. Update Role");
        System.out.println("2. Update Package");
        System.out.println("3. Update CGPA Criteria");
        System.out.println("4. Register to Institute Drive");
        System.out.println("5. Back");
        int option2=sc.nextInt();
        /*if(option2==1){
            comp_name.Role=sc.nextLine();
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
