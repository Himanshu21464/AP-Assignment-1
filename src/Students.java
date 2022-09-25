import java.util.ArrayList;
import java.util.Scanner;
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
class Enter_As_Student {
        public static void credentials(){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter your name: ");
                String name=sc.nextLine();
                System.out.print("Enter your Roll no.: ");
                int roll_no=sc.nextInt();
                int i = 0;
                while (Add_Students.student_list.get(i).Roll_no != roll_no) {
                        i++;
                }
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
                        ////Placement_Cell.student_registration();
                        System.out.println(" "+"Registered for placement drive at IIITD!!!!");
                        student_mode();


                } else if (choice==2) {
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
                }


        }
}
class Add_Students {
        String name, branch, status, drive_status;
        int Roll_no,reject,ctc,registered_status,day,month,year;
        boolean blocked, accepted;
        double CGPA;

        public Add_Students(String name, int Roll_no, double CGPA, String branch){
                this.ctc=0;
                this.accepted=false;
                this.blocked=false;
                this.drive_status=null;
                this.status=null;
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

        public void updateCgpa(float CGPA)
        {
                this.CGPA = CGPA;
        }
}

        static ArrayList<Add_Students> student_list=new ArrayList<>();
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
