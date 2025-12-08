public class Robot {
    private String modelName;
    private int batteryLevel;
    private String status;

    public Robot(String mn, int  bl, String s){
        this.modelName=mn;
        this.batteryLevel=bl;
        this.status=s;
    }
    public String getModelName(){
        return this.modelName;
    }
    public int getBatteryLevel(){
        return this.batteryLevel;
    }
    public String getStatus(){
        return this.status;
    }
    public void setModelName(String ModelN){
        this.modelName=ModelN;
    }
    public void setBatteryLevel(int BL) {
        this.batteryLevel=BL;
    }
    public void setStatus(String status){
        this.status=status;
    }

    public void displayRobotInfo(){
        System.out.println("Robot's model name: " + getModelName() + " Robot's battery level: " + getBatteryLevel() + " Robot's status: " + getStatus());
    }
    public boolean isBatteryEnough(int RequiredAmount){
        if(batteryLevel>=RequiredAmount){
            return true;
        }
        else {
            return false;
        }
    }
    public int consumeBattery(int amount){
        if(batteryLevel>=amount && amount>0) {
                batteryLevel -= amount;
        }
        return batteryLevel;
    }
    public int chargeBattery(int amount) {
        if (amount > 0) {
            batteryLevel += amount;
        }
        if (batteryLevel == 100) {
            setStatus("Active");
        }
        else {
            setStatus("Charging");
        }
        return batteryLevel;
    }
    public void performTask(Task t) {
        System.out.println(modelName + " is attempting the task. " + t.getTaskName());
        if (getStatus() == "Charging") {
            System.out.println("Failed");
            return;
        }
        if (isBatteryEnough(t.getEnergyCost())) {
            consumeBattery(t.getEnergyCost());
            System.out.println("Robot has completed the task: " + t.getTaskName() + " Completed. ");
        } else {
            System.out.println("Not enough battery.");
        }
        TaskBatch batch = new TaskBatch();
    }
       public void performTaskBatch(TaskBatch batch){
            if(batch.getTaskCount()==0){
                System.out.println("Batch is empty.");
                return;
            }

            int totalCost = batch.getTotalEnergyCost();

            if(!isBatteryEnough(totalCost)){
                System.out.println("Not enough Battery.");
                return;
            }
            System.out.println("Processing");

           Task[] tasks = batch.getTasks();

            for(int i = 0;i<batch.getTaskCount();i++){
                performTask(tasks[i]);
                displayRobotInfo();
            }
        }
    }

