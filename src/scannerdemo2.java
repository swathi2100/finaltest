import java.util.Scanner;

public class scannerdemo2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter name");
        String name=scan.next();
        System.out.println("please enter age");
        int age=scan.nextInt();
        System.out.println("please enter weight");
        double weight=scan.nextDouble();
        System.out.println("Enter gender 'm' or 'f'");
        char gender=scan.next().charAt(0);
        System.out.println("Details entered :");
        System.out.println("Name : "+name);
        System.out.println("Age : " +age);
        System.out.println("Weight :"+weight);
        System.out.println("Gender :"+gender);
    }
}
