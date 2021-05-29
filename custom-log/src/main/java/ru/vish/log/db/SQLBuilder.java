package ru.vish.log.db;

import ch.qos.logback.classic.db.names.DBNameResolver;
import ru.vish.log.db.names.ColumnName;
import ru.vish.log.db.names.TableName;

public class SQLBuilder {
    static String buildInsertSQL(DBNameResolver dbNameResolver) {
        StringBuilder sqlBuilder = new StringBuilder("INSERT INTO ");
        sqlBuilder.append(dbNameResolver.getTableName(TableName.SCAN_LOG_ORDERS)).append(" (");
        sqlBuilder.append(dbNameResolver.getColumnName(ColumnName.TEST_1_COLUMN)).append(", ");
        sqlBuilder.append(dbNameResolver.getColumnName(ColumnName.TEST_2_COLUMN)).append(") ");
        sqlBuilder.append("VALUES (?, ?)");
        return sqlBuilder.toString();
    }
}
