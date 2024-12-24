

public class ProjectDetails {
    private String taskList;
    private String dueDate;
    private String projectManager;

    public void assignTasks(String tasks) {
        this.taskList = tasks;
    }

    public void setDueDate(String deadline) {
        this.dueDate = deadline;
    }

    public void assignManager(String manager) {
        this.projectManager = manager;
    }

    @Override
    public String toString() {
        return "Детали проекта:" +
                " Задачи = " + taskList +
                ", Срок выполнения = " + dueDate +
                ", Менеджер = " + projectManager;
    }
}
