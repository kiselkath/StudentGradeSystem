package org.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Student App class used for simulation
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("==== Welcome Students ====");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex Garland", 4.4));
        students.add(new Student("S. Craig Zahler", 4.2));
        students.add(new Student("Yann Demange", 3.9));
        students.add(new Student("Christina Choe", 4.8));
        students.add(new Student("Tamara Jenkins", 4.0));

        System.out.println("ORIGINAL LIST:");
//        for (Student std : students) {
//            System.out.println(std);
//        }

        students.forEach(
                System.out::println //this is an analog for loop above
        );
        System.out.println();

        // For each "Student" in a list,
        // automatically pass it to a method "println()"
        // referred by '::' the 'System.out' object

        //                      Yana ><=? Ekaterina
//            * Yana.gpa  > Ekaterina.gpa : Returns 1 -- other before this
//            * Yana.gpa  == Ekaterina.gpa: Returns 0
//            * Yana.gpa  < Ekaterina.gpa : returns -1 -- this comes before other
//
//        int result = students.get(0).compareTo(students.get(1));
//        System.out.println(result);
//
//        Collections.sort(students);
//        System.out.println("SORTED BY GPA: (desc)");
//        students.forEach(System.out::println);

        /// Sort by name
        students.sort(new StudentNameComparator());
        System.out.println("STUDENT SORTED ALPHABETICALLY:");
        students.forEach(
                System.out::println //this is an analog for loop above
        );

        System.out.println("==== THANKS FOR ATTENTION ====");

    }
}
