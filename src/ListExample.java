package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = getList(sc);
        int queryCount = sc.nextInt();

        List<Integer> processedList = processQueries(sc, queryCount, list);
        String printList = processedList.toString();

        String result = printList
                .substring(1,printList.length()-1)
                .replace(",","");

        System.out.println(result);
    }

    public static List<Integer> processQueries(Scanner sc, int queryCount, List<Integer> myList) {
        for (int i = 0; i < queryCount; i++) {
            switch (sc.next()) {
                case "Insert" -> {
                    int index = sc.nextInt();
                    int element = sc.nextInt();
                    myList.add(index, element);
                }
                case "Delete" -> {
                    int index = sc.nextInt();
                    myList.remove(index);
                }
                default -> throw new RuntimeException("There is no such query");
            }
        }
        return myList;
    }

    public static List<Integer> getList(Scanner sc) {
        int size = sc.nextInt();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            myList.add(sc.nextInt());
        }
        return myList;
    }
}
