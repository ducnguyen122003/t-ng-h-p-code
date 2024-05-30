package singleton;


public class DatabaseSingleton {


    private static DatabaseSingleton instance;


    private DatabaseSingleton() {

        System.out.println("Connecting to the database...");
    }


    public static synchronized DatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseSingleton();
        }
        return instance;
    }


    public void executeQuery(String query) {

        System.out.println("Executing query: " + query);

        System.out.println("Query executed successfully.");
    }


    public static void main(String[] args) {

        DatabaseSingleton db = DatabaseSingleton.getInstance();
        db.executeQuery("SELECT * FROM users");

        
        DatabaseSingleton anotherDb = DatabaseSingleton.getInstance();
        System.out.println(db == anotherDb);
    }
}