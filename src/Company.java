import java.util.ArrayList;
import java.util.Scanner;


class Company {
    int day,month,year,status;
    String Company_name,Role;
    double ctc,pkg,Cgpa_Criteria;

    public Company(String Cname,String Role,double pkg,double Cgpa_Criteria){
        this.Company_name=Cname;
        this.pkg=pkg;
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

    public double get_pkg(){
        return this.pkg;
    }
    public void pkg_Update(int ctc) {
        this.ctc = ctc;
        System.out.println("CTC is updated successfully!!!");
    }

    public void CGPA_Update(float Cgpa_Criteria) {
        this.Cgpa_Criteria = Cgpa_Criteria;
        System.out.println("CGPA is updated successfully!!!");

    }

    static ArrayList<Company> company_list=new ArrayList<>();
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
        double pkg=sc.nextDouble();
        System.out.print("Enter CGPA Criteria: ");
        double Cgpa_Criteria= sc.nextDouble();
        Company company=new Company(Company_name,Role,pkg,Cgpa_Criteria);
        company_list.add(company);
        company_function();



        //Add company to a companies list
        //company.date_time=sc.nextLine();
    }

    public static void choose_company(){
        System.out.println("-------------------------Available Companies---------------------------");
        int index=1;
        for(Company company: company_list){
            System.out.println(index+"." +company+" ");
            index++;
        }


        ////System.out.println("///////////// print company list /////");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();

        //// select company from company.obj list
        //temp=company_list.indexOf(index-1);
        System.out.println("-------------------Welcome "+company_list.indexOf(index-1) +"--------------------");
        System.out.println("1. Update Role");
        System.out.println("2. Update Package");
        System.out.println("3. Update CGPA Criteria");
        System.out.println("4. Register to Institute Drive");
        System.out.println("5. Back");
        int option2=sc.nextInt();
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
       // for (Company temp:company_list){

       // }

    }
}
