import javax.lang.model.type.NullType;
import java.util.*;

public class Future_Builder {
    public static void main_menu(){
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
            System.out.println("Wrong Input!!");
            main_menu();
        }
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
            Students.function();
        } else if (mode==2){
            Company.company_function();

        } else if (mode==3){
            Placement_Cell.placement_function();

        } else if (mode==4){
            main_menu();
        } else {
            System.out.println("Wrong Input");
            Application();
        }

    }


        public static void main(String arg[]) {
        main_menu();


        }
    }
