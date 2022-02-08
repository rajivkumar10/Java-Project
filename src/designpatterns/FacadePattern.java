package designpatterns;


class Connection {
    private String db;
    public Connection(String db) {
        this.db = db;
    }
    public String getDb() {
        return db;
    }
}
class MysqlHelper {
    public Connection getMysqlConnection() {
        return new Connection("mysql");
    }
    public void genearteHtmlReport(Connection connecton, String table) {
        System.out.println("Generated html report for db: " + connecton.getDb() + " for table: " + table);
    }
    public void geneartePDFReport(Connection connecton, String table) {
        System.out.println("Generated pdf report for db: " + connecton.getDb() + " for table: " + table);
    }
}

class OracleHelper {
    public Connection getOracleConnection() {
        return new Connection("oracle");
    }
    public void genearteHtmlReport(Connection connecton, String table) {
        System.out.println("Generated html report for db: " + connecton.getDb() + " for table: " + table);
    }
    public void geneartePDFReport(Connection connecton, String table) {
        System.out.println("Generated pdf report for db: " + connecton.getDb() + " for table: " + table);
    }
}

class HelperFacade {
    enum DBTypes{MYSQL, ORACLE;}
    enum ReportTypes{HTML, PDF;}

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection connection;
        switch (dbType) {
            case MYSQL:
                MysqlHelper mysqlHelper = new MysqlHelper();
                connection = mysqlHelper.getMysqlConnection();
                switch (reportType) {
                    case PDF:
                        mysqlHelper.geneartePDFReport(connection, tableName);
                        break;
                    case HTML:
                        mysqlHelper.genearteHtmlReport(connection, tableName);
                        break;
                }
                break;
            case ORACLE:
                OracleHelper oracleHelper = new OracleHelper();
                connection = oracleHelper.getOracleConnection();
                switch (reportType) {
                    case PDF:
                        oracleHelper.geneartePDFReport(connection, tableName);
                        break;
                    case HTML:
                        oracleHelper.genearteHtmlReport(connection, tableName);
                        break;
                }
                break;
        }
    }
}

public class FacadePattern {
    public static void main(String[] args) {
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, "ReportTable");
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, "ReportTable");
    }
}