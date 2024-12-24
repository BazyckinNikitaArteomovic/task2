

public class ProjectManager {
    private BuilderBase builder;

    public void setBuilder(BuilderBase builder) {
        this.builder = builder;
    }

    public ProjectDetails createStandardProject() {
        return builder.includeTasks("Task 1").defineDeadline("31.09.2024").designateManager("Андрей").getProjectDetails();
    }

    public ProjectDetails createManagerProject() {
        return builder.includeTasks("Task 2").defineDeadline("10.08.2024").designateManager("Антон").getProjectDetails();
    }
}
