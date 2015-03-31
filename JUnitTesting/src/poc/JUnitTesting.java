package poc;

import jdbc.DatabaseConnection;

public class JUnitTesting {
	
	public int testInt(int i) {
		int j;
		if(i == 10) {
			j=0;
			j=0;
		} else if(i==5 ) {
			j=1;
		} else {
			j =-1;
		}
		return j;
	}
	public int testMock(int i) {
		DatabaseConnection con = new DatabaseConnection();
		return con.getData(i);
	}

}
