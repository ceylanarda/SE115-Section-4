import java.util.Scanner;
public class FactoryDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Robot a1 = new Robot("Ard", 80, "Active");
        Robot a2 = new Robot("Cey", 40, "Active");
        a1.displayRobotInfo();
        a2.displayRobotInfo();
        Robot currentRobot = a1;
        System.out.println("Enter an amount of battery to consume: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Which robot? ");
        String action = sc.nextLine();
        switch (action) {
            case "a1":
                currentRobot = a1;
                break;
            case "a2":
                currentRobot = a2;
                break;
            default:
                System.out.println("No robot robot a1 is current");
                break;
        }
        currentRobot.consumeBattery(a);
        a1.displayRobotInfo();
        Task t1 = new Task("Task1",30);
        Task t2 = new Task("Task2" ,10);

        System.out.println("Enter a task name between t1 or t2: ");
        String task = sc.nextLine();

        switch (task){
            case "t1":
                t1.getEnergyCost();
                if(a1.isBatteryEnough(t1.getEnergyCost())){
                    System.out.println("You can do this task with robot a1, it will cost x" + t1.getEnergyCost()  +  " percent battery.");
                }
                else{
                    System.out.println("You don't have enough battery.");
                }
                break;
            case "t2":
                t2.getEnergyCost();
                if(a1.isBatteryEnough(t2.getEnergyCost())){
                    System.out.println("You can do this task. it will cost " + t2.getEnergyCost() + " percent battery.");
                }
                else {
                    System.out.println("You don't have enough battery.");
                }break;
        }
        a1.displayRobotInfo(); //Before task
        a1.performTask(t1);
        a1.displayRobotInfo(); //After task

        TaskBatch batch = new TaskBatch();

        batch.addTask(new Task("Reboot", 10));
        batch.addTask(new Task("Ordering", 15));
        batch.addTask(new Task("Packing", 20));

        batch.printBatchInfo();

        System.out.println("Total cost: " + batch.getTotalEnergyCost());

        a1.displayRobotInfo();
        a1.performTaskBatch(batch);
        a1.displayRobotInfo();
    }
}
