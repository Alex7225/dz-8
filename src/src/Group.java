import java.util.ArrayList;

public class Group {
    private Student leader;
    private ArrayList<Student> studentList = new ArrayList<>();
    private String taskGr;

    public Student getLeader() {
        return leader;
    }

    public Group(String name, String surname, String taskGr) {
        this.leader = new Student(name, surname);
        this.taskGr = taskGr;
    }

    public void changeLeader(String name, String surename) {
        this.leader.setName(name);
        this.leader.setSurname(surename);


    }

    public void addStudent(String name, String surname) {
        this.studentList.add(new Student(name, surname));
    }

    public void changeStudent(int id, String name, String surename) {
        if (id < getStudentList().size() + 2) {
            for (Student el : getStudentList()) {
                if (el.getId() == id) {
                    el.setName(name);
                    el.setSurname(surename);
                }

            }
        } else System.out.println("No id Student in this list!");
    }

    public void removeStudent(int id) {
        if (id < getStudentList().size() + 1) {
            for (Student el : getStudentList()) {
                if (el.getId() == id) {
                    studentList.remove(el);
                }

            }
        } else System.out.println("No id Student in this list!");
    }

    public void setTaskDone(int id) {
        if (id < getStudentList().size() + 2) {
            for (Student el : getStudentList()) {
                if (el.getId() == id) {
                    el.setTaskSt("DONE");
                }

            }
        } else System.out.println("No id Student in this list!");
    }


    public ArrayList<Student> getStudentList() {
        return studentList;
    }


    public String getTaskGr() {
        return taskGr;
    }


}
