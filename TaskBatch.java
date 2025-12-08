public class TaskBatch {
    private Task[] tasks;
    private int taskCount;

    public TaskBatch(){
        this.tasks = new Task[5];
        this.taskCount=0;
    }
    public void addTask(Task t){
        if(taskCount>5){
            tasks[taskCount]=t;
            taskCount++;
        }
        else {
            System.out.println("Batch is full.");
        }
    }
    public int getTotalEnergyCost(){
        if(taskCount==0){
            System.out.println("Batch is empty.");
            return 0;
        }
        int total = 0;
        for(int i =0;i<taskCount;i++){
            total += tasks[i].getEnergyCost();
        }
        return total;
    }
    public Task[] getTasks(){
        if(taskCount==0){
            System.out.println("No tasks.");
        }
        return tasks;
    }
    public void printBatchInfo(){
        if(taskCount==0){
            System.out.println("Batch is empty.");
            return;
        }
        System.out.println("Batch Info: ");
        for(int i = 0;i<taskCount;i++){
            tasks[i].describeTask();
        }
    }
    public int getTaskCount(){
        return taskCount;
    }
}
