package jdbctry;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class DriverJdbc implements Driver {

	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		String[] destino = url.split(":");
		if(destino[0].toLowerCase()!="jdbc" || destino.length <=2 || 
				destino[1].toLowerCase()!="csv") {
			return null; 
		}
		else {
			
		}
		
		//"jdbc:oracle:thin:@myhost:1521:orcl", "scott", "tiger"
		return null;
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
