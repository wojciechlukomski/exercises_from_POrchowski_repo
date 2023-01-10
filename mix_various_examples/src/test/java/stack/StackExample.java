package stack;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class StackExample {
    
    @Test
    public void shouldPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Wojtek");
        stack.push("Zuza");
        stack.push("Maja");
        stack.push("Dorota");
        stack.push("Zbyszek");
        stack.push("Antek");
        
        Assertions.assertThat(stack.size());
    }
    
    @Test
    public void shouldPeak(){ // funkcja ktora tylko podglada dane, nie zdejmuje ich ze stosu!
        Stack <String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
    
        String peek1 = stack.peek();
        String peek2 = stack.peek();
        
        Assertions.assertThat(peek1).isEqualTo("4");
        Assertions.assertThat(peek2).isEqualTo("4");
        
    }
    
    @Test
    public void shouldPop(){
        Stack <String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
    
        String pop1 = stack.pop();
        String pop2 = stack.pop();
        String pop3 = stack.pop();
        
        Assertions.assertThat(pop1).isEqualTo("3");
        Assertions.assertThat(pop2).isEqualTo("2");
        Assertions.assertThat(pop3).isEqualTo("1");
        
    }
    @Test
    public void shouldSearch(){ //kolejnosc jest liczona od 1 od najwyzej polozonego elemntu na stosie , czyli od gory
        Stack <String> stack = new Stack<>();
        stack.push("1"); //3
        stack.push("2"); //2
        stack.push("3"); //1
    
        int search = stack.search("1");
        Assertions.assertThat(search).isEqualTo(3);
    }
    
    @Test
    public void shouldIndexOf(){ //kolejnosc jest normnalnie liczona od 0 od pierwszego dodanego elementu
        Stack <String> stack = new Stack<>();
        stack.push("1"); //0
        stack.push("2"); //1
        stack.push("3"); //2
        
        int indexOf = stack.indexOf("1");
        Assertions.assertThat(indexOf).isEqualTo(0);
    }
    
    @Test
    public void shouldIterate(){
        Stack <String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
    
        Iterator <String> it = stack.iterator();
        
        while (it.hasNext()){
            String item= it.next();
            System.out.println(item);
        }
        
        while (!stack.isEmpty()){ // odwrotna iteracja/ czyli pokazuje pokolei jak lezy na stosie
            System.out.println(stack.pop());
        }
        
    }
    
    @Test
    public void shopuldStream() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        stack.stream().forEach(System.out::println);
    
        List <Integer> list = stack.stream().collect(Collectors.toList());  // convertuje stack do listy
        
        stack.removeIf(element -> element > 2);
        stack.stream().forEach(System.out::println);
    
        int[] toArray = stack.stream().mapToInt(element -> element).toArray();
        System.out.println(Arrays.toString(toArray));
    }
}
