package Lab3;

import java.util.HashMap;


public class ex5 {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(0, "Apple");
        myHashMap.put(1, "Banana");
        myHashMap.put(2, "Cherry");
        myHashMap.put(3, "Date");
        myHashMap.put(4, "Elderberry");
        myHashMap.put(5, "Fig");
        myHashMap.put(6, "Grape");
        myHashMap.put(7, "Honeydew");
        myHashMap.put(8, "Kiwi");
        myHashMap.put(9, "Lemon");

        for (int i = 0; i < myHashMap.size(); i++) {
            if (i > 5) {
                System.out.print(myHashMap.get(i) + " ");
            }

            if (i == 0) {
                String result = myHashMap.values().toString();
                System.out.println(result.substring(1, result.length() - 1));
            }
        }
    }

}
