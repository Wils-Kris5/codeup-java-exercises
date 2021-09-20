package grades;

import java.util.ArrayList;


public class Student {
     private String name;
     private ArrayList<Double> grades;
//Constructor
public Student(String name) {
     this.name = name;
     this.grades = new ArrayList<>();
}
     // returns the student's name
     public String getName() {
          return name;
     }
     // adds the given grade to the grades property
     public void addGrade(double grade) {
        grades.add(grade);

     }

     // returns the average of the students grades
     public double getGradeAverage() {
          double sumTotal = 0;
                             // name of array called
          for(double grade : this.grades){
               sumTotal += grade;

          }
           return  sumTotal/grades.size();
     }

     public static void main(String[] args) {
          Student greg = new Student("Greg");
          greg.addGrade(99);
          greg.addGrade(89);
          greg.addGrade(79);
          System.out.println(greg.getGradeAverage());

     }

}
