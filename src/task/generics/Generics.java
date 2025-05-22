package task.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static <T> T getFirstElement(List<T> list) {

        if (list != null && !list.isEmpty()) {
            T t = list.get(0);
            return t;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public static <T> T getLastElement(List<T> list) {
        if (list != null && !list.isEmpty()) {
            T t = list.get(list.size() - 1);
            return t;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        if (list1 != null && list2 != null) {
            List<T> list3 = new ArrayList<>();
            for (T t : list1) {
                list3.add(t);
            }
            for (T t : list2) {
                list3.add(t);
            }
            return list3;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public static <T> List<T> getUniqueElements(List<T> list) {

        if (list != null) {
            List<T> listSet = new ArrayList<>();
            listSet.add(list.get(0));
            int j = 1;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) != listSet.get(j - 1)) {
                    listSet.add(list.get(i));
                    j++;
                }
            }
            return listSet;
        } else {
            System.out.println("ERROR");
            throw new IllegalArgumentException();
        }
    }
}
