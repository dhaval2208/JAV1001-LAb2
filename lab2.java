
// Student id :- #A00255187
// Student Name :- Bhimani Dhavalkumar Zaverbhai
// JAV-1001 - 50733 - App Development for Android - 202205 - 001s


import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class jav1001LAB2 {
    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);

//asking option from user for opration

        System.out.println("please choose one option");  
        System.out.println("1 :- search number");
        System.out.println("2 :- Average");
        System.out.println("3 :- Array reverse");
        System.out.println("4 :- Ceasar cipher");
        int choice = option.nextInt();


        switch (choice) {

            case 1:
            //asking total number for search number
                System.out.println("Enter the total number of value for search");
                int value = option.nextInt();
                int[] search = new int[value];
                for (int i = 0; i < value; i++) {
                    System.out.println("Enter the number" + i);
                    search[i] = option.nextInt();
                }
                System.out.println("Enter the numbers to be search");
                int count = option.nextInt();
                arraycontains(search, count);
                break;

            case 2:
            //asking total value for average
                System.out.println("Enter the total number of values for average");
                int digit = option.nextInt();
                int[] average = new int[digit];
                for (int i = 0; i < digit; i++) {
                    System.out.println("Enter the number" + i);
                    average[i] = option.nextInt();
                }
                arrayavg(average);
                break;

            case 3:
            //asking total number for array reversed
                System.out.println("Enter the total number of value to be reversed");
                int reversenumber = option.nextInt();
                int[] reverse = new int[reversenumber];
                for (int i = 0; i < reverse.length; i++) {
                    System.out.println("Enter the value" + i);
                    reverse[i] = option.nextInt();
                }
                arrayreverse(reverse, reversenumber);
                break;

            case 4:
            // asking string value for string encrypt
                System.out.println("Enter the name to be encrypt");
                String encrypt = option.next();
                System.out.println("Enter the number to be change");
                int changevalue = option.nextInt();
                String encryptedvalue = Ceaser_cipher(encrypt, changevalue);
                System.out.println("Encrypted name is  : " + encryptedvalue);
                break;
                default:
                System.out.println("choose the valid option");
        }
    }

    public static void arraycontains(int[] search, int count) {
        boolean test = false;
        //using loop for serch value
        for (int k = 0; k < search.length; k++) {
            //if user enter number is include array output is true
            if (count == search[k]) {
                test = true;
            }
        }
        //System.out.println(test);
    }

    public static void arrayavg(int[] average) {
        // sum value is zero
        float sum = 0;
        // The loop will run until the user input the value
        for (int j = 0; j < average.length; j++) {
            // it will sum up all the value
            sum += average[j];
        }
        // its logic of avrage find sum devide number of value 
        float avg = (sum / average.length);
        System.out.println(" Average of numbers is : " + avg);
    }

    public static void arrayreverse(int[] reverse, int reversenumber) {
        int[] updatedarray = new int[reversenumber];
        int j = reversenumber;
        // the loop will run until the last value
        for (int i = 0; i < reversenumber; i++) {
            updatedarray[j - 1] = reverse[i];
            j = j - 1;
        }
        System.out.println("The reverse number is");
        for (int m = 0; m < reversenumber; m++) {
            System.out.println(updatedarray[m] + " ");
        }
    }

    public static String Ceaser_cipher(String encrypt, int changevalue) {
        String encryptedvalue = "";
        char name;
        //the loop will run until the last letter
                for (int i = 0; i < encrypt.length(); i++) {
            name = encrypt.charAt(i);

            if (name >= 'a' && name <= 'z') {
                name = (char) (name + changevalue);
                if (name > 'z') {
                    name = (char) (name + 'a' - 'z' - 1);
                }
                encryptedvalue = encryptedvalue + name;
            } else if (name >= 'A' && name <= 'Z') {
                name = (char) (name + changevalue);

                if (name > 'z') {
                    name = (char) (name + 'A' - 'z' - 1);
                }
                encryptedvalue = encryptedvalue + name;
            } else {
                encryptedvalue = encryptedvalue + name;
            }
        }
        return encryptedvalue;
    }

}