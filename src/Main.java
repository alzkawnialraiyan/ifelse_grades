import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Average of 5 subjects with grade
        System.out.println("Enter your grades in 5 subjects:");
        System.out.println("First subject:");
        int sub1 = read.nextInt();
        System.out.println("Second subject:");
        int sub2 = read.nextInt();
        System.out.println("Third subject:");
        int sub3 = read.nextInt();
        System.out.println("Forth subject:");
        int sub4 = read.nextInt();
        System.out.println("Fifth subject:");
        int sub5 = read.nextInt();

        int Average = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println(Average);
        if(Average >= 90 && Average <= 100) {
            System.out.println("Your average grade is A, " + Average);
        } else if (Average >= 70 && Average <= 80) {
            System.out.println("Your average grade is B, "+Average);
        } else if (Average >= 60 && Average <= 70) {
            System.out.println("Your average garde is C," +Average);
        } else if (Average >= 50 && Average <= 60) {
            System.out.println("Your average garde is D, "+Average);
        } else{
            System.out.println("Failed");
        }
    }
}