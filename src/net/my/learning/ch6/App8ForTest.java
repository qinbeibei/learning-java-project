package net.my.learning.ch6;

public class App8ForTest {

	public static void main(String[] args) {
		// Connection con = new Connection();
		Connection[] cons = ConnectionManager.getConnections();
		System.out.println(cons);
	}

}

class Connection {
	private Connection() {

	}

	public static Connection createConn() {
		return new Connection();
	}
}

class ConnectionManager {
	private static Connection[] cons;
	static {
		cons = new Connection[] { Connection.createConn(), Connection.createConn() };
	}

	public static Connection[] getConnections() {
		System.out.println("getConnections()");
		return cons;
	}
}
