package ru.vish.log.db;

import ch.qos.logback.classic.db.DBAppender;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.DefaultDBNameResolver;
import ch.qos.logback.classic.spi.ILoggingEvent;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ScanLogAppender extends DBAppender {
    private static final DBNameResolver dbNameResolver = new DefaultDBNameResolver();
    private static final int TEST_1_COLUMN = 1;
    private static final int TEST_2_COLUMN = 2;

    @Override
    protected Method getGeneratedKeysMethod() {
        return super.getGeneratedKeysMethod();
    }

    @Override
    protected String getInsertSQL() {
        return SQLBuilder.buildInsertSQL(dbNameResolver);
    }

    @Override
    protected void subAppend(ILoggingEvent event, Connection connection, PreparedStatement insertStatement) throws Throwable {
        insertStatement.setString(TEST_1_COLUMN, (String) event.getArgumentArray()[0]);
        insertStatement.setString(TEST_2_COLUMN, (String) event.getArgumentArray()[1]);

        int updateCount = insertStatement.executeUpdate();
        if (updateCount != 1) {
            addWarn("Failed to insert loggingEvent");
        }
    }

    @Override
    protected void secondarySubAppend(ILoggingEvent eventObject, Connection connection, long eventId) {
    }
}
