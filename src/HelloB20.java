public class HelloB20 {
    public static void main(String[] args) {
        System.out.println("Hello Rakhat");
        // add this code
        int year = 2020;
        if(year % 4 == 0 && year % 100 == 0) {
            System.out.println("It's a Leap year");
        } // under this line from the GitHub
        else if(year % 400 == 0) {
            System.out.println("it is a leap year");
        } else {
             System.out.println("this is not a leap year");
         }
        System.out.println("You are awesome!!!");
    }
}
