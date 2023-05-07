public class Main {
    public static void main(String[] args) {
        
        Group grypa = new Group("Petro", "Kozachok", "Learn OOP");

        System.out.println("Starosta id = " + grypa.getLeader().getId() + ". Name: " + grypa.getLeader().getName() + ". Familia: " + grypa.getLeader().getSurname() + " Task: " + grypa.getTaskGr());

        grypa.changeLeader("Katya", "Kyluk");

        grypa.addStudent("Kola", "Gdjkf");
        grypa.addStudent("Oleg", "Lfhhs");
        grypa.addStudent("Olga", "Rovjd");
        grypa.addStudent("Alona", "Sfofj");
        grypa.addStudent("Alona", "Sfofj");

        grypa.changeStudent(5, "Ira", "Verxovod");

        grypa.setTaskDone(3);
        grypa.setTaskDone(5);
        grypa.removeStudent(6);

        for (Student el : grypa.getStudentList()) {
            System.out.println("Student id = " + el.getId() + ". Name: " + el.getName() + ". Familia: " + el.getSurname() + " Status Task: " + el.getTaskSt());
        }

        System.out.println("Starosta id = " + grypa.getLeader().getId() + ". Name: " + grypa.getLeader().getName() + ". Familia: " + grypa.getLeader().getSurname() + " Task: " + grypa.getTaskGr());

    }
}