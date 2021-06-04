package jdklinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Base {

    public static void main(String[] args) {

        Employee shyam = new Employee("Shyam", "Khan", 1);
        Employee sanjeev = new Employee("Sanjeev", "Singh", 2);
        Employee ram = new Employee("Ram", "Kumar", 3);
        Employee sita = new Employee("Sita", "Dev", 4);
        Employee amar = new Employee("Amar", "Singh", 5);

        LinkedList<Employee> empList = new LinkedList<>();
        empList.addFirst(shyam);
        empList.addFirst(sanjeev);
        empList.addFirst(ram);
        empList.addFirst(sita);
        empList.addFirst(amar);

        Iterator<Employee> iter = empList.iterator();
        System.out.println("HEAD ->");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<==>");
        }
        System.out.println("null");

        // for(Employee employee:empList){
        //     System.out.println(employee);
        // }

    }

}
