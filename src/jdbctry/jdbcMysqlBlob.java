package jdbctry;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;

public class jdbcMysqlBlob implements Blob {

	@Override
	public long length() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte[] getBytes(long pos, int length) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getBinaryStream() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long position(byte[] pattern, long start) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long position(Blob pattern, long start) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBytes(long pos, byte[] bytes) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBytes(long pos, byte[] bytes, int offset, int len) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OutputStream setBinaryStream(long pos) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void truncate(long len) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void free() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InputStream getBinaryStream(long pos, long length) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
