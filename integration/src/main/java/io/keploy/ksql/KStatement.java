package io.keploy.ksql;

import java.sql.*;

public class KStatement implements Statement {
    public Statement wrappedStatement;

    public KStatement(Statement st) {
        wrappedStatement = st;
    }

    public KStatement() {

    }

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
//        System.out.println("mocked execute Query !!");
        ResultSet _rs = wrappedStatement.executeQuery(sql);
        ResultSet krs = new KResultSet(_rs);
        return krs;
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        return wrappedStatement.executeUpdate(sql);
    }

    @Override
    public void close() throws SQLException {
        wrappedStatement.close();
    }

    @Override
    public int getMaxFieldSize() throws SQLException {
        return wrappedStatement.getMaxFieldSize();
    }

    @Override
    public void setMaxFieldSize(int max) throws SQLException {
        wrappedStatement.setMaxFieldSize(max);
    }

    @Override
    public int getMaxRows() throws SQLException {
        return wrappedStatement.getMaxRows();
    }

    @Override
    public void setMaxRows(int max) throws SQLException {
        wrappedStatement.setMaxRows(max);
    }

    @Override
    public void setEscapeProcessing(boolean enable) throws SQLException {
        wrappedStatement.setEscapeProcessing(enable);
    }

    @Override
    public int getQueryTimeout() throws SQLException {
        return wrappedStatement.getQueryTimeout();
    }

    @Override
    public void setQueryTimeout(int seconds) throws SQLException {
        wrappedStatement.setQueryTimeout(seconds);
    }

    @Override
    public void cancel() throws SQLException {
        wrappedStatement.cancel();
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return wrappedStatement.getWarnings();
    }

    @Override
    public void clearWarnings() throws SQLException {
        wrappedStatement.clearWarnings();
    }

    @Override
    public void setCursorName(String name) throws SQLException {
        wrappedStatement.setCursorName(name);
    }

    @Override
    public boolean execute(String sql) throws SQLException {
        return wrappedStatement.execute(sql);
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        return new KResultSet(wrappedStatement.getResultSet());
    }

    @Override
    public int getUpdateCount() throws SQLException {
        return wrappedStatement.getUpdateCount();
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        boolean gm = wrappedStatement.getMoreResults();
        return gm;
    }

    @Override
    public void setFetchDirection(int direction) throws SQLException {
        wrappedStatement.setFetchDirection(direction);
    }

    @Override
    public int getFetchDirection() throws SQLException {
        return wrappedStatement.getFetchDirection();
    }

    @Override
    public void setFetchSize(int rows) throws SQLException {
        wrappedStatement.setFetchDirection(rows);
    }

    @Override
    public int getFetchSize() throws SQLException {
        return wrappedStatement.getFetchSize();
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        return wrappedStatement.getResultSetConcurrency();
    }

    @Override
    public int getResultSetType() throws SQLException {
        return wrappedStatement.getResultSetType();
    }

    @Override
    public void addBatch(String sql) throws SQLException {
        wrappedStatement.addBatch(sql);
    }

    @Override
    public void clearBatch() throws SQLException {
        wrappedStatement.clearBatch();
    }

    @Override
    public int[] executeBatch() throws SQLException {
        return wrappedStatement.executeBatch();
    }

    @Override
    public Connection getConnection() throws SQLException {
        return new KConnection(wrappedStatement.getConnection());
    }

    @Override
    public boolean getMoreResults(int current) throws SQLException {
        return wrappedStatement.getMoreResults(current);
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        return new KResultSet(wrappedStatement.getGeneratedKeys());
    }

    @Override
    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return wrappedStatement.executeUpdate(sql, autoGeneratedKeys);
    }

    @Override
    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return wrappedStatement.executeUpdate(sql, columnIndexes);
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return wrappedStatement.executeUpdate(sql, columnNames);
    }

    @Override
    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        return wrappedStatement.execute(sql, autoGeneratedKeys);
    }

    @Override
    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        return wrappedStatement.execute(sql, columnIndexes);
    }

    @Override
    public boolean execute(String sql, String[] columnNames) throws SQLException {
        return wrappedStatement.execute(sql, columnNames);
    }

    @Override
    public int getResultSetHoldability() throws SQLException {
        return wrappedStatement.getResultSetHoldability();
    }

    @Override
    public boolean isClosed() throws SQLException {
        return wrappedStatement.isClosed();
    }

    @Override
    public void setPoolable(boolean poolable) throws SQLException {
        wrappedStatement.setPoolable(poolable);
    }

    @Override
    public boolean isPoolable() throws SQLException {
        return wrappedStatement.isPoolable();
    }

    @Override
    public void closeOnCompletion() throws SQLException {
        wrappedStatement.closeOnCompletion();
    }

    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        return wrappedStatement.isCloseOnCompletion();
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return wrappedStatement.unwrap(iface);
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return wrappedStatement.isWrapperFor(iface);
    }
}
