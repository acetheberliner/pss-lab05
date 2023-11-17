package it.unibo.composition;

import java.util.Arrays;

public class Professor implements User {
    private static final String DOT = ".";
    private final int id;
    private final String name;
    private final String surname;
    private final String password;
    private String[] courses;

    public Professor (final int id, final String name, final String surname, final String password, final String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = Arrays.copyOf(courses, courses.length);
    }

    public void replaceCourse (String course, int index) {
        for(int i=0; i<index; i++){
            if(i==index) {
                this.courses[i] = course;
            }
        }
    }

    public void replaceAllCourses (String courseReplacement[]) {
        for(int i=0; i<courses.length; i++) {
            courses[i] = courseReplacement[i];
        }
    }

    public String toString(){
        return "Professor ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + "]";
    }

    public String[] getCourses() {
        return Arrays.copyOf(this.courses, this.courses.length);
    }

    public String getUsername() {
        return this.name + Professor.DOT + this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription(){
        return this.toString();
    }
}
