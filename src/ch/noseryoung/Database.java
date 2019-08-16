package ch.noseryoung;

public class Database {
    public static Database instance;

    private Database(){}

    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    public void connectToDB(){
        System.out.println("Connecting...");
    }

    public void closeConnection(){
        System.out.println("Conecction closed.");
    }

    public void printHelloWorld(){
        System.out.println("Hello World");
    }
}
