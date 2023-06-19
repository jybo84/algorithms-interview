import java.util.List;
import java.util.ArrayList;
public class LessonChar {
    public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("максим");
    names.add("самвел");
    names.add("денис");
    for(int i = 0; i < names.size(); i++){
        for (int t = 0; t < names.get(i).length(); t++){
            if(names.get(i).charAt(t) == 'и'){
                System.out.println(names.get(i));
            }
        }
    }
    }
}



















       /* ArrayList<String> list = new ArrayList<>();
        list.add("Сила");
        list.add("Воля");
        list.add("Упорство");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j <list.get(i).length(); j++) {
                if (list.get(i).charAt(j) == 'л') {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}*/
