package Search_String_Maximum_Length;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input random String:");
        String string = scanner.nextLine();
        System.out.println(SortString(RemoveDuplicate(string)));



    }
    public static boolean CheckDuplicate(String string, char c){
        for (int i = 0; i<string.length(); i++){
            if(string.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    public static String RemoveDuplicate(String string){
         String newString = "";
        for (int i=0; i<string.length(); i++){
             if(!CheckDuplicate(newString, string.charAt(i))){
                 newString+= string.charAt(i);
             } else break;
         }
         return newString;
    }

    public static String SortString(String string){
        char[] list = string.toCharArray();
        for (int i=0; i<list.length-1; i++){
            if(list[i] > list[i+1]){
                char item = list[i];
                list[i] = list[i+1];
                list[i+1] = item;
            }
        }
        return Arrays.toString(list);
    }
}

