/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue<Student> obj = new MyPriorityQueue<>();
        obj.add(new Student(1, "Ram"));
        obj.add(new Student(10, "Shyam"));
        obj.add(new Student(5, "Kartik"));
        obj.add(new Student(2, "Shashank"));
        System.out.println(obj);
    }
}
