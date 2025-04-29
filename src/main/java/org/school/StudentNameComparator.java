package org.school;

/**
 * Comparator to sort students alphabetically by name
 */

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    /**
     * Custom comparator to compate students one to other
     * @param s1 the first object to be compared.
     * @param s2 the second object to be compared.
     * @return
     */

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName()); //compare alphabetically first string to second string
    }
}
