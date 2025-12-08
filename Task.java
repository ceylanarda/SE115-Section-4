public class Task {
    private String taskName;
    private int energyCost;     //amount of battery required.

    public Task(String tn, int ec) {
        this.taskName = tn;
        this.energyCost = ec;
    }

        public String getTaskName() {
            return this.taskName;
    }
        public int getEnergyCost(){
            return this.energyCost;
        }
        public void describeTask(){
            System.out.println("Task name: " + taskName + " Energy cost: " + energyCost);
        }
}
