package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private final int id;
    private final int maxStudents;
    private int registeredStudents;
    private final String courseName;
    Professor professor;
    ExamRoom room;
    Student[] students;

    public Exam(final int id, final int maxStudents, final String courseName, Professor professor, ExamRoom room) {
        this.id = id;
        this. maxStudents = maxStudents;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[0];
    }

    private void expand() {
        /*
        * We need to copy the whole array every time... pretty expensive...
        *
        * (any better idea, students?)
        */
        students = Arrays.copyOf(students, students.length + 1);
    }

    public int getExamId() {
        return this.id;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public int getRegisteredStudents() {
        return this.registeredStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public ExamRoom getRoom() {
        return this.room;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(this.students, this.students.length);
    }

    public void registerStudent(Student student) {
        if(students.length<this.maxStudents) {
            expand();
            students[registeredStudents] = student; //uso il num di studenti gia iscritti come indice dell'array
            registeredStudents+=1;
        }
    }

    public String toString() {
        return "Exam [" 
        + "\ncourse= " + getCourseName()
        + "\nprofessor= " + getProfessor()
        + "\nroom= " + getRoom()
        + "\nfree seats= " + (getMaxStudents() - getRegisteredStudents())
        + "\nstudents= " + Arrays.toString(this.students)
        + "]";
    }
}
