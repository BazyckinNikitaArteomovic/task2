

public class SoftwareDevelopmentBuilder extends BuilderBase {
    @Override
    public BuilderBase includeTasks(String task) {
        projectDetails.assignTasks(task);
        return this;
    }

    @Override
    public BuilderBase defineDeadline(String deadline) {
        projectDetails.setDueDate(deadline);
        return this;
    }

    @Override
    public BuilderBase designateManager(String manager) {
        projectDetails.assignManager(manager);
        return this;
    }
}
