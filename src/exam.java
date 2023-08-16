import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter employee details ");
        System.out.println("Enter employee first name ");
        String fName= scan.next();
        System.out.println("Enter employee last name");
        String lName= scan.next();
        System.out.println("Enter employee Id");
        int empId= scan.nextInt();
        System.out.println("Enter employee experience in decimal foramat");
        double empExp= scan.nextDouble();
        System.out.println("Enter employee quarterly goal in one line");
        scan.next();
        String goal= scan.nextLine();
        System.out.println("Enter if he /she qualifies for bonus,'y' or 'n'");
        char bonus=scan.next().charAt(0);
        System.out.println("Entered employee details as follows");
        System.out.println("Employee full name :"+fName+" "+lName);
        System.out.println("Employee Id :"+empId+ " Employee Experience : "+empExp);
        System.out.println("Employee goal :"+goal);
        System.out.println("Is he/she eligible for bonus :"+bonus);

    }
}
