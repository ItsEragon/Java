import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       String name = "Tony Stark";

       System.out.println(name.length());

        charAt
       for (int i=0; i<name.length(); i++) {
           System.out.println(name.charAt(i));
       }

       String s1 = "Tony";
       String s2 = "Tony";

       if (s1.compareTo(s2) ==0) {
           System.out.println("Strings are equal");
       } else {
           System.out.println("Strings are not equal");
       }

       String s1 = "My name is Tony";
       String s2 = "Tony Stark";
       String name = s2.substring(0,4);
       System.out.println(name);

//        1. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

       System.out.print("Array size: ");
       int size = sc.nextInt();

       String arr[] = new String[size];

       int totLength = 0;

       for (int i=0; i<size; i++) {
           System.out.print("Enter: ");
           arr[i] = sc.next();
           totLength+= arr[i].length();
       }
       System.out.println(totLength);

        /* 2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
        Example :
        original = “eabcdef’ ; result = “iabcdif”
        Original = “xyz” ; result = “xyz” */

       System.out.print("Enter a string: ");
       String str = sc.next();
       String result = "";

       for (int i=0; i<str.length(); i++) {
           if (str.charAt(i) == 'e') {
               result += "i";
           } else {
               result += str.charAt(i);
           }
       }
       System.out.println(result);

        /* 3. Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example :
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/

        System.out.print("Enter email: ");
        String email = sc.next();

        String name = "";

        for (int i=0; i<email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                name += email.charAt(i);
            }
        }
        System.out.println(name);

    }
}
