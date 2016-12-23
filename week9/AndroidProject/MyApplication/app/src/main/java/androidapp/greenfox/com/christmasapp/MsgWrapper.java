package androidapp.greenfox.com.christmasapp;

import java.sql.SQLException;

/**
 * Created by mozgaanna on 23/12/16.
 */

public class MsgWrapper implements java.sql.Wrapper {
    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
