package Singleton;

public class Database {
	private static Database dbInstance = new Database();
	private Database() {
		System.out.println("Database connection create");
	}
	public static Database getDatabaseInstance() {
//		return dbInstance;
		if(dbInstance == null) {
			synchronized(Database.class) {
				if(dbInstance == null) {
					dbInstance = new Database();
				}
			}
		}
		return dbInstance;
	}

}
