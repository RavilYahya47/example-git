package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = getList(sc);


    }

    public static List<Integer> getList(Scanner sc){
        int size = sc.nextInt();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0 ; i<size ;i++){
            myList.add(sc.nextInt());
        }
        return myList;
    }
}
