package jdbcUtil;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;


public class connectSQL implements Serializable {
	//�������ӱ���
	private static BasicDataSource ds;
	//��ȡ�����ļ�
	static {
		Properties properties=new Properties();
		try {
			properties.load(connectSQL.class.getClassLoader().getResourceAsStream("DB.properties"));
			String driverStr=properties.getProperty("driverStr");
			String connStr=properties.getProperty("connStr");
			String dbUserName=properties.getProperty("dbUserName");
			String dbPassword=properties.getProperty("dbPassword");
			String initsize=properties.getProperty("initsize");
			String maxsize=properties.getProperty("maxsize");
			ds=new BasicDataSource();
			ds.setDriverClassName(driverStr);
			ds.setUrl(connStr);
			ds.setUsername(dbUserName);
			ds.setPassword(dbPassword);
			ds.setInitialSize(new Integer(initsize));
			ds.setMaxActive(new Integer(maxsize));	
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("��ȡ�����ļ�ʧ��",e);
		}
	}
	//��������
	public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    
	//�ر�����
    public static void closeConnection(Connection conn){
        if(conn!=null){
            try {
            	conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("�黹����ʧ��",e);
            }
        }
    }
    
    //�ع�����
    public static void rollBack(Connection conn){
        if(conn!=null){
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("�ع�����ʧ�ܣ�",e);
            }
        }
    }

	

}
