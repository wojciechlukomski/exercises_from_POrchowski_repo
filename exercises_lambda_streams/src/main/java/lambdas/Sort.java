package lambdas;

import java.util.*;

public class Sort {
//    Napisz program, który pobierze o użytkownika cztery łańcuchy znaków, które umieścisz w liście.
//    Następnie posortuj tę listę używając metody List.sort.
//    Użyj wyrażenia lambda, które posortuje łańcuchy znaków malejąco po długości.
    
    public static void main(String[] args) {
        userInput();
    }
    
    public static List<String> userInput() {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 4 words (seperate by enter): ");
        
        for(int i= 0; i < 4; i++){
            stringList.add(scanner.nextLine());
        }
        stringList.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(stringList);
        
        return stringList;
    }
}
