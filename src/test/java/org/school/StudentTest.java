package org.school;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

    private List<Student> students;

    @BeforeEach
    void setUp(){
        students = new ArrayList<>();
        students.add(new Student("Bob", 2.8));
        students.add(new Student("Alice", 3.9));
        students.add(new Student("Diana", 4.0));
        students.add(new Student("Charlie", 3.5));
    }

    @Test
    @DisplayName("Students should sort by GPA descending")
    void testSortByGpa(){
        Collections.sort(students);
        assertEquals("Diana",students.get(0).getName() );
        assertEquals("Alice", students.get(1).getName());
        assertEquals("Charlie", students.get(2).getName());
        assertEquals("Bob", students.get(3).getName());
    }

    @Test
    @DisplayName("Students should sort by name alphabetically")
    void testSortByName(){
        students.sort(new StudentNameComparator());
        assertEquals("Alice", students.get(0).getName());
        assertEquals("Bob", students.get(1).getName());
        assertEquals("Charlie", students.get(2).getName());
        assertEquals("Diana", students.get(3).getName());
    }


}