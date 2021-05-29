package craftsman;

import java.util.Scanner;

public class TriangleTraditional {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 3 integers which are sides of a triangle");

        System.out.print("A ? ");
        int a = keyboard.nextInt();

        System.out.print("B ? ");
        int b = keyboard.nextInt();

        System.out.print("C ? ");
        int c = keyboard.nextInt();
        int match = 0;

        System.out.println("Side A is "+ a);
        System.out.println("Side B is "+ b);
        System.out.println("Side C is "+ c);

        if ( a == b) {
            match += 1;
        }
        if ( a == c ){
            match += 2;
        }
        if ( c == b ){
            match += 3;
        }
        if (match == 0) {
            if ( (a+b) <= c){
                System.out.println("Not a triangle");
            }
            else if ( (a+c) <= b ){
                System.out.println("Not a triangle");
            }
            else {
                System.out.println("Triangle is Scalene");
            }
        }
        else if (match == 1) {
            if ((a+b) <= c){
                System.out.println("Not a triangle");
            }
            else {
                System.out.println("Triangle is Isosceles");
            }
        }
        else if (match == 2){
            if ((a+c) <= b){
                System.out.println("Not a triangle");
            }
            else {
                System.out.println("triangle is Isosceles");
            }
        }
        else if (match == 3){
            if ((b+c) <= a) {
                System.out.println("Not a triangle");
            }
            else {
                System.out.println("Triangle is Isosceles");
            }
        }
        else {
            System.out.println("Triangle is Equilateral");
        }
    }

}
