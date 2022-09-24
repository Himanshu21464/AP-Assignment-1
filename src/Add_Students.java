import java.util.Scanner;

public class Add_Students {
        String name;
        int Roll_no;
        double CGPA;
        String Branch;
        public Add_Students(){
        }


    public static void main(){
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
