/**
 * Created by mozgaanna on 14/12/16.
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Workshop02 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://localhost:3306/workshop02?user=root&password=sqlpassword";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

//        Account accountCaptain = new Account("Captain America", "uejnsd632**234.");
//        createAccountIfNotExists(accountDao, account);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Captain America", "Iron Man", "Wolverine", "Hulk", "Loki"));
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("uejnsd632**234.", "fdghj", "ipokn644hr", "3qyjyu78", "43tjdtu9"));

        for(int i = 0; i < names.size(); i++) {
            createAccountIfNotExists(accountDao, new Account(names.get(i), passwords.get(i)));
        }

        QueryBuilder<Account, String> queryBuilder = accountDao.queryBuilder();
        queryBuilder.orderBy("name", true);


        PreparedQuery<Account> preparedQuery = queryBuilder.prepare();
        List<Account> accounts = accountDao.query(preparedQuery);

        for (Account account : accounts) {
            System.out.println(account.getName());
        }

//        account = accountDao.queryForId("Captain America");
//        System.out.println("Account: " + account.toString());
    }



    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}
