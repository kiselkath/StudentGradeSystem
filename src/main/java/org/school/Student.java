package org.school;

/**
* Student class that implements Comparable to sort naturally by GPA (desc - high to low)
 **/

public class Student implements Comparable<Student> {

    // Fields
    private final String name; //final means do not changes
    private final double gpa; //grade point average

    // Constructor
    public Student(String name, double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }

    /**
     * Natural ordering sort by GPA descending
     * @param other : other student comparing with
     * @return : int
     * <0 : this object less (x < y)
     * == : objects are equal (x = y)
     * >0 : this object more (x > y)
     */

    @Override
    public int compareTo(Student other) {
        /**
         * other.gpa before this.gpa to make desc
         * other.gpa  > this.gpa : Returns 1 -- ohter berfore this
         * other.gpa  == this.gpa: Return 0
         * other.gpa  < this.gpa : returns -1 -- this comes before other
         */
        return Double.compare(other.gpa, this.gpa); //DESC order
        //return Double.compare(other.gpa, this.gpa); //ASC order

    }

    @Override
    public String toString() {
        return name + "'s GPA: '" + gpa + "'";
    }
}
