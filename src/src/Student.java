public class Student {
    private static int idBase = 0;
    private int id;
    private String name;
    private String surname;
    private String taskSt = "";


    public Student(String name, String surname) {
        idBase++;
        this.id = idBase;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTaskSt() {
        return taskSt;
    }

    public void setTaskSt(String taskSt) {
        this.taskSt = taskSt;
    }
}