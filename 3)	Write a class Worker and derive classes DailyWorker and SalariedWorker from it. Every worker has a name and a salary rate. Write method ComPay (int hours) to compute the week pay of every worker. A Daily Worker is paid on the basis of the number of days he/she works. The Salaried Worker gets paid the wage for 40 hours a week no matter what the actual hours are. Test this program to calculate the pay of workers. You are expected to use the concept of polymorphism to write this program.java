//3)	Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate. Write method ComPay (int hours) to compute the week pay of every worker. A Daily Worker is paid on the basis of the number of days he/she works. The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism to write this program
class Worker {
    private String name;
    private double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return hours * salaryRate;
    }

    public String getName() {
        return name;
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int daysWorked) {
        // Daily workers are paid based on the number of days worked
        return daysWorked * super.computePay(8); // Assuming 8 hours per day
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        // Salaried workers are paid for 40 hours a week, regardless of actual hours worked
        return super.computePay(40);
    }
}

public class javabasics {
    public static void main(String[] args) {
        DailyWorker dailyWorker = new DailyWorker("Shubham", 10.0);
        SalariedWorker salariedWorker = new SalariedWorker("Sahil", 15.0);

        int daysWorked = 5; // Shubham worked for 5 days
        int hoursWorked = 45; // Sahil worked for 45 hours

        double ShubhamPay = dailyWorker.computePay(daysWorked);
        double SahilPay = salariedWorker.computePay(hoursWorked);

        System.out.println("Weekly pay for " + dailyWorker.getName() + ": $" + ShubhamPay);
        System.out.println("Weekly pay for " + salariedWorker.getName() + ": $" + SahilPay);
    }
}
