package org.replicadb.manager;

public enum JdbcDrivers {
    MYSQL("com.mysql.cj.jdbc.Driver", "jdbc:mysql:"), POSTGRES("org.postgresql.Driver", "jdbc:postgresql:"),
    HSQLDB("org.hsqldb.jdbcDriver", "jdbc:hsqldb:"), ORACLE("oracle.jdbc.OracleDriver", "jdbc:oracle:"),
    SQLSERVER("com.microsoft.sqlserver.jdbc.SQLServerDriver", "jdbc:sqlserver:"),
    JTDS_SQLSERVER("net.sourceforge.jtds.jdbc.Driver", "jdbc:jtds:sqlserver:"),
    DB2("com.ibm.db2.jcc.DB2Driver", "jdbc:db2:"), NETEZZA("org.netezza.Driver", "jdbc:netezza:"),
    CUBRID("cubrid.jdbc.driver.CUBRIDDriver", "jdbc:cubrid:"), DENODO("com.denodo.vdp.jdbc.Driver", "jdbc:vdb:"),
    CSV(null, "file:"), KAFKA(null, "kafka:"), S3(null, "s3:");

    private final String driverClass;
    private final String schemePrefix;

    JdbcDrivers(String driverClass, String schemePrefix) {
        this.driverClass = driverClass;
        this.schemePrefix = schemePrefix;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public String getSchemePrefix() {
        return schemePrefix;
    }
}