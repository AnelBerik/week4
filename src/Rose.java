public class Rose extends Flower {
    public Rose(){}
    @Override
    public String getJobName() {
        return null;
    }

    @Override
    public void doJob() {
        System.out.println("Build a House");
    }
}
