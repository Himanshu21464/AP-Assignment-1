import javax.lang.model.type.NullType;
import java.util.*;

public class Future_Builder {
    public static int function(){
        System.out.println("1. Enter as Student");
        System.out.println("2. Add Students");
        System.out.println("3. Back");
        System.out.println("Choose the Student query to perform: ");
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        return q;
    }
    public static void Application() {
        System.out.println("1. Enter as Student Mode");
        System.out.println("2. Enter as Company Mode");
        System.out.println("3. Enter as Placement Cell Mode");
        System.out.println("4. Return to Main Application");
        System.out.print("Choose the mode you want to Enter in: ");
        Scanner sc =new Scanner(System.in);
        int mode= sc.nextInt();
        if (mode==1){
            int query=function();
            if(query==1){
                Enter_As_Student.main();
            } else if (query==2) {
                Add_Students.main();
            } else if (query==3) {
                Application();
            }  else{
                System.out.println("Wrong Input!!");

            }

        } else if (mode==2){
            Company.main();

        } else if (mode==3){
            Placement_Cell.main();

        } else if (mode==4){
            //main();
        } else {
            System.out.println("Wrong Input");

        }

    }

        public static void main(String arg[]) {
        System.out.println("Welcome to Future Builder");
        System.out.println("1. Enter the Application");
        System.out.println("2. Exit the Application");
        System.out.print("Enter your choice: ");
        Scanner sc =new Scanner(System.in);
        int option=sc.nextInt();
        if(option==1){
            Future_Builder.Application();
        } else if (option==2){
            System.out.println("Thanks for using FutureBuilder!!!");
            java.lang.System.exit(0);
        }
        else {
            System.out.println("Wrong Input");
            }

        }
    }
