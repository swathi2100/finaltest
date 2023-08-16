import java.util.Scanner;

public class scannerdemo3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter employee details");
        System.out.println("Enter employee firstname");
        String fName= scan.next();
        System.out.println("Enter employee lastname");
        String lName= scan.next();
        System.out.println("Enter employee id");
        int empId= scan.nextInt();
        System.out.println("Enter employee experience in decimal format");
        double empExp= scan.nextDouble();
        System.out.println("Enter employee quaterly goal in one line");
        scan.next();
        String gaol=scan.nextLine();
        System.out.println("Enter if he/she qualifies for bonus,'y' or 'n'");
        char bonus= scan.next().charAt(0);
        System.out.println("Entered employee details as follows :");
        System.out.println("Employee full name : "+fName+" "+lName);
        System.out.println("Employee Id :"+empId+ "Employee Experience :"+empExp);
        System.out.println("Employee goal :"+gaol);
        System.out.println("Is he /she eligible for bonus :"+bonus);
        System.out.println();

    }
}
