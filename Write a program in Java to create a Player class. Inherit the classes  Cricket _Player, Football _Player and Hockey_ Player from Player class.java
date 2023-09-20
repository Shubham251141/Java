//2)	Write a program in Java to create a Player class. Inherit the classes  Cricket _Player, Football _Player and Hockey_ Player from Player class

class Player {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Cricket_Player extends Player {
    private String battingStyle;

    public Cricket_Player(String name, int age, String battingStyle) {
        super(name, age);
        this.battingStyle = battingStyle;
    }

    public void displayCricketDetails() {
        super.displayDetails();
        System.out.println("Batting Style: " + battingStyle);
    }
}

class Football_Player extends Player {
    private String position;

    public Football_Player(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public void displayFootballDetails() {
        super.displayDetails();
        System.out.println("Position: " + position);
    }
}

class Hockey_Player extends Player {
    private String position;

    public Hockey_Player(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public void displayHockeyDetails() {
        super.displayDetails();
        System.out.println("Position: " + position);
    }
}

public class javabasics {
    public static void main(String[] args) {
        Cricket_Player cricketPlayer = new Cricket_Player("Sachin", 45, "Right-handed");
        Football_Player footballPlayer = new Football_Player("Messi", 34, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Dhyan Chand", 112, "Forward");

        System.out.println("Cricket Player Details:");
        cricketPlayer.displayCricketDetails();

        System.out.println("\nFootball Player Details:");
        footballPlayer.displayFootballDetails();

        System.out.println("\nHockey Player Details:");
        hockeyPlayer.displayHockeyDetails();
    }
}
