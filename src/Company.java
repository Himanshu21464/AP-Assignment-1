import java.util.Scanner;

class Company {
    String Company_name;
    String Role;
    double pkg;
    double Cgpa_Criteria;
    String date_time;


    public Company(){
    }

    public static void company_function(){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        Company company=new Company();
        company.Company_name=sc.nextLine();
        company.Role=sc.nextLine();
        company.pkg=sc.nextDouble();
        company.Cgpa_Criteria= sc.nextDouble();
        company.date_time=sc.nextLine();
    }

}
