public class Main {

    public static void main(String[] args) {

        Plant job1 = new Palm();


        job1.doJob();


        String jobName = job1.getJobName();

        System.out.println("Job Name 1= " + jobName);


        Plant job2 = new Rose();

        job2.doJob();

        String jobName2 = job2.getJobName();

        System.out.println("Job Name 2= " + jobName2);

    }
    }
