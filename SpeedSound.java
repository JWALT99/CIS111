import java.util.Scanner;
public class SpeedSound {
    public static void main(String[] args) {

        double time; 

        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the distance the sound will travel.");
        double distance = input.nextInt(); 
        
        System.out.println("Air, water, or steel?");
        String medium = input.next();

        if(medium.equals("air")){ 
            time = distance / 1100;
            System.out.println("It will take " + time + " seconds " + "to travel " + distance);
        }
        else if(medium.equals("water")) {
            time = distance / 4900;
            System.out.println("It will take " + time + " seconds" + "to travel " + distance);
        }
        else if(medium.equals("steel")) {
            time = distance / 16400;
            System.out.println("It will take " + time + " seconds" + "to travel " + distance);
        }

    }
}
