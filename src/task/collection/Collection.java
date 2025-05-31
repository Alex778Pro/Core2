package task.collection;

import java.util.*;

public class Collection {

    public int findMaxElement(List<Integer> list) {
        int maxCount = list.get(0);
        for (Integer num : list) {
            if (num > maxCount) {
                maxCount = num;
            }
        }
        return maxCount;
    }

    public List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> arraySet = new LinkedHashSet<>();
        arraySet.addAll(list);
        List<Integer> listRez = new ArrayList<>();
        listRez.addAll(arraySet);
        return listRez;
    }

    public List<Integer> sortDescending(List<Integer> list) {
        list.sort((a, b) -> b - a);
        return list;
    }

    public boolean containsElement(Set<Integer> set, int element) {
        return set.contains(element);
    }

    public Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>();
        for (Integer num : set1) {
            for (Integer num2 : set2) {
                if (num == num2) {
                    set3.add(num);
                }
            }
        }
        return set3;
    }

    public Set<Integer> removeCommonElements(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        for (Integer num : set1) {
            for (Integer num2 : set2) {
                if (num == num2) {
                    set3.remove(num);
                }
            }
        }
        return set3;
    }

    public boolean containsKey(Map<String, Integer> map, String key) {
        return map.containsKey(key);
    }

    public List<Integer> getValuesByKey(Map<String, List<Integer>> map, String key) {
        List<Integer> list = new ArrayList<>();
        list.addAll(map.get(key));
        return list;
    }

    public void removeEntriesByValue(Map<String, Integer> map, int value) {
        List<String> keysToRemove = new ArrayList<>(); // список ключей для удаления
        keysToRemove.addAll(map.keySet());

        for (String key : keysToRemove) {
            map.remove(key);
        }

    }

    public void addToQueue(Queue<Integer> queue, int element) {
        queue.add(element);
    }

    public Integer pollFromQueue(Queue<Integer> queue) {
        return queue.poll();
    }

    public boolean isQueueEmpty(Queue<Integer> queue) {
        return queue.isEmpty();
    }

    public void printOrdersWithMaxAmount(List<Order> orders) {
        int maxAmount = 0;
        for (Order o : orders) {
            if (maxAmount < o.getTotalAmount()) {
                maxAmount = o.getTotalAmount();
            }
        }
        System.out.println("Заказы с суммой " + maxAmount);
        for (Order o : orders) {
            if (maxAmount == o.getTotalAmount()) {
                System.out.println(o.getCustomer() + " Сумма: " + o.getTotalAmount());
            }
        }

    }

    public int getTotalAmountOfOrders(List<Order> orders) {
        int totalAmount = 0;
        for (Order o : orders) {
            totalAmount += o.getTotalAmount();
        }
        return totalAmount;
    }

    public void printIncompleteTasks(List<Task> tasks) {
        for (Task t : tasks) {
            if (!t.isCompleted()) {
                System.out.println("Незавершенная задача: " + t.getTitel());
            }
        }
    }


    public List<Task> getTasksByTitle(List<Task> tasks, String title) {
        List<Task> tasksSearch = new ArrayList<>();
        for (Task t : tasks) {
            if (title.equals(t.getTitel())) {
                tasksSearch.add(t);
            }
        }

        return tasksSearch;
    }

    public void printStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(String.format("Студент %s, возраст %d", s.getName(), s.getAge()));
        }

    }


    public List<Student> getStudentsOlderThan(List<Student> students, int age) {
        List<Student> studentSearch = new ArrayList<>();
        for (Student s : students) {
            if (s.getAge() > age) {
                studentSearch.add(s);
            }
        }
        return studentSearch;
    }

    public void printProductsWithZeroQuantity(List<Product> products) {
        System.out.println("Нет на складе");
        for (Product p : products) {
            if (p.getQuantity() == 0) {
                System.out.println(p.getName());
            }
        }

    }

    public int getTotalQuantityOfProducts(List<Product> products) {
        int countProducts = 0;
        for (Product p : products) {
            countProducts += p.getQuantity();
        }
        return countProducts;
    }

    public void printStudentsWithWorstAttendance(List<AttendanceStudent> students) {
        AttendanceStudent student = students.get(0);
        for (AttendanceStudent a : students) {
            if (Integer.parseInt(student.getAttendance()) > Integer.parseInt(a.getAttendance())) {
                student = a;
            }
        }
        System.out.println(student.toString());

    }

    public double getAverageAttendance(List<AttendanceStudent> students) {
        double countAttendance = 0.;

        for (AttendanceStudent a : students) {
            countAttendance += Double.parseDouble(a.getAttendance());
        }
        return countAttendance / students.size();
    }

}