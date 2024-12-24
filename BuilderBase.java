
public abstract class BuilderBase {
    protected ProjectDetails projectDetails;

    public BuilderBase() {
        projectDetails = new ProjectDetails();
    }

    public ProjectDetails getProjectDetails() {
        return projectDetails;
    }

    public abstract BuilderBase includeTasks(String task);
    public abstract BuilderBase defineDeadline(String deadline);
    public abstract BuilderBase designateManager(String manager);
}

