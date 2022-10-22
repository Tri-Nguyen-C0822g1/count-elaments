import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String string = "Tùng không thích tập thể dục, nên bụng Tùng Pự lắm";
        String list[] = string.split(" ");
        TreeMap<String, Integer> list1 = new TreeMap<>();

        for(int i = 0 ; i < list.length; i++){
            String key = list[i].toLowerCase();
            if(list1.get(key) == null){
                list1.put(key,1);
            } else {
                list1.put(key, (list1.get(key)) + 1);
            }
        }
        System.out.println(list1);
    }
}