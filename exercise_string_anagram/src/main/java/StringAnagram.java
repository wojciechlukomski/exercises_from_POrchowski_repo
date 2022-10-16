import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class StringAnagram {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number of words: ");
        int x = in.nextInt();
        String[] collection = new String[x];
        
        System.out.println("Enter words: ");
        for (int i = 0; i < x; i++) {
            String y = in.next();
            collection[i] = y;
        }
        System.out.println(getGroupAnagrams(x, collection));
    }
    
    static String sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
    
    static int getGroupAnagrams(int numberOfWords, String[] collectionWords) {
        int i = 0;
        for (var item : collectionWords) {
            item = sortString(item);
            collectionWords[i] = item;
            i++;
        }
        Arrays.sort(collectionWords);
        System.out.println(Arrays.toString(collectionWords));
        
        Set<String> set = new HashSet<String>();
        set.addAll(Arrays.asList(collectionWords));
        return set.size();
    }
}
