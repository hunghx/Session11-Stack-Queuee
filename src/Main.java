import ra.GenericQueue;
import ra.Student;
import ra.StudentNameComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Stack<String> stringStack = new Stack<>();
//        stringStack.push("Hùng");
//        stringStack.push("Nam");
//        stringStack.push("Khánh");
//        stringStack.push("Bình");
//        stringStack.push("Hiếu");
//        System.out.println(stringStack);

        // lấy ra phần tuwr đầu tiên
//        System.out.println(stringStack.peek());
//        while (!stringStack.empty()){
//            System.out.println(stringStack.pop());
//        }

        // đảo ngược chuỗi
//        String str =  new Scanner(System.in).nextLine();
//        String strReverse = "";
//        Stack<Character> listChar = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            listChar.push(str.charAt(i));
//        }
//        while (!listChar.empty()){
//            strReverse += listChar.pop();
//        }
//        System.out.println(strReverse);

        // Queue
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Đi học");
        queue.offer("Đi ngủ");
        queue.offer("Đi chơi");
        System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        // GenenicQueue
        GenericQueue<String> queues = new GenericQueue<>();
        queues.offer("Hùng");
        queues.offer("Nam");
        queues.offer("Bình");
        System.out.println(queues.poll());
        System.out.println(queues.poll());
        System.out.println(queues.poll());


        // Sắp xếp(name / age)
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,22,"Hùng"));
        students.add(new Student(2,19,"Nam"));
        students.add(new Student(3,24,"Khánh"));
        students.add(new Student(4,17,"Hiếu"));
        students.add(new Student(5,20,"Đức"));
//        StudentNameComparator studentNameComparator = new StudentNameComparator();
        students.sort(Comparator.comparing(Student::getName));
        Collections.sort(students);
        System.out.println(students);


        // Đảo ngược số dùng Stack
        // Nhập và 1 số  123456
        Integer number =  new Scanner(System.in).nextInt();
        String str = number.toString();
        String strReverse = "";
        Stack<Character> listChar = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            listChar.push(str.charAt(i));
        }
        while (!listChar.empty()){
            strReverse += listChar.pop();
        }
        int reverseNumber = Integer.parseInt(strReverse);
        System.out.println(reverseNumber);
        // output : in ra số đảo ngược : 654321
    }
}