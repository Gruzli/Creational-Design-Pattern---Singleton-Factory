package Singleton;

public class Main {
	public Main() {
		Database dbConnection1 = Database.getDatabaseInstance();
		Database dbConnection2 = Database.getDatabaseInstance();
	
		if(dbConnection1 == dbConnection2) {
			System.out.println("Data Sama");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
