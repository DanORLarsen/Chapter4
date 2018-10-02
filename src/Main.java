import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
            System.out.println("Enter length from Center to a vertex.");
/*
        double r = sc.nextDouble();
        System.out.println(r);
        double s = 2*r*Math.sin(Math.PI/5.);
        System.out.println(s);

        double area = (5*Math.pow(s,2.))/(4*Math.tan(Math.PI/5));

        System.out.printf("The area of the Pentagon is " + "%4.2f", area);
 */
/*
        System.out.println("Opgave 4.2");
        System.out.println("Enter  latitude and longitude for point 1 (x, y)");
        double x1 = Math.toRadians(sc.nextDouble());
        System.out.println(x1);
        double y1 = Math.toRadians(sc.nextDouble());
        System.out.println("Enter  latitude and longitude for point 2 (x, y)");
        double x2 = Math.toRadians(sc.nextDouble());
        double y2 = Math.toRadians(sc.nextDouble());
        double distance = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
        System.out.println("The distance between the to points is " + distance + " KM"); */
/*
        System.out.println("Opgave 4.5");
        System.out.println("Enter number of sides and length of the side");
        double n = sc.nextDouble();
        double s = sc.nextDouble();

        double area = (n * (Math.pow(s,2)))/(4*(Math.tan(Math.PI/n)));
        System.out.println(area); //Endnu en gang giver det ikke samme resultat, tror jeg ikke kan finde udaf at bruge Math, virker dog i opgaven over^^.

*/
/*
        double x1,y1,x2,y2,x3,y3;
        System.out.println("opgave 4.6");
        System.out.println("Enter value for radius");
        double radius = 40;
        double angle1 = Math.toRadians(Math.random()*360);
        double angle2 = Math.toRadians(Math.random()*360);
        double angle3 = Math.toRadians(Math.random()*360);
        x1 = radius*Math.cos(angle1);
        y1 = radius*Math.sin(angle1);
        x2 = radius*Math.cos(angle2);
        y2 = radius*Math.sin(angle2);
        x3 = radius*Math.cos(angle3);
        y3 = radius*Math.sin(angle3);

        System.out.println("First point " + x1 + "," + y1);
        System.out.println("Second point " + x2 + "," + y2);
        System.out.println("Third point " + x3 + "," + y3);
*/
/*
        System.out.println("Opgave 4.8");
        System.out.print("Enter ASCII CODE: ");
        int code = sc.nextInt();
        System.out.println("ASCII CODE = " + (char)code);
        System.out.println();
        System.out.println("Opgave 4.9");
        System.out.println("Enter letter and receive UNICODE for it. : ");

        String chars = sc.next(); //Brugt chat at 0...
        System.out.println( "\\u" + Integer.toHexString(chars.charAt(0) | 0x10000).substring(1) );
        System.out.println('\u0045');

        System.out.println();
        System.out.println("Opgave 4.13");
        System.out.println("Write a letter");
        String letter = sc.next();
        char letter1 = letter.charAt(0);

        if (letter1 = 'A' letter1 =  'E',letter1 =  'I',letter1 =  'O',letter1 =  'u',letter1 =  'y',letter1 =  'æ',letter1 =  'ø', letter1 = 'å'); //Look below to fix
 */ /*
        System.out.println("Opgave 4.15");
        System.out.println("Enter letter");
        String letter = sc.next();
        if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B") || letter.equalsIgnoreCase("C")) {
            System.out.println("At key \"2\"");}

        if (letter.equalsIgnoreCase("D")|| letter.equalsIgnoreCase("E")||letter.equalsIgnoreCase("F")) {
            System.out.println("At key \"3\"");}

            else {
            System.out.println("invalid key or im too lazy");} */







    }
}
