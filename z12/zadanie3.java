package pl.imiajd.kordowski;
import java.util.LinkedList;

public class zadanie3 {

    public static void main(String[] args) {
        LinkedList<String> nazwiska = new LinkedList<>();
        nazwiska.add("Adamowicz");
        nazwiska.add("Nowak");
        nazwiska.add("Dawidowski");
        nazwiska.add("Mucha");
        nazwiska.add("Abramski");
        nazwiska.add("Chmiel");
        System.out.println(nazwiska);
        odwroc(nazwiska);
        System.out.println(nazwiska);
    }

    public static void odwroc(LinkedList<String> lista){
        for(int i=0, j = lista.size()-1; i<j; i++){
            lista.add(i, lista.remove(j));
        }
    }
}
