

public class Main {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();

        SoftwareDevelopmentBuilder softwareBuilder = new SoftwareDevelopmentBuilder();
        projectManager.setBuilder(softwareBuilder);
        ProjectDetails softwareProject = projectManager.createStandardProject();
        System.out.println(softwareProject);

        BuilderForMarketingProject marketingBuilder = new BuilderForMarketingProject();
        projectManager.setBuilder(marketingBuilder);
        ProjectDetails marketingProject = projectManager.createManagerProject();
        System.out.println(marketingProject);
    }
}
