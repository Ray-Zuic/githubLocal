package com.gao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<E> {
	E mapper(ResultSet rs) throws SQLException;
}
