package dictionary;


import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.table.TableUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.j256.ormlite.support.ConnectionSource;
import java.sql.SQLException;


import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
@Controller
public class DictApp {

	public static void main(String[] args) throws SQLException{
		SpringApplication.run(DictApp.class, args);

        String databaseUrl = "jdbc:mysql://localhost:3306/workshop02?user=root&password=sqlpassword";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, DictWord.class);

        

        Dao<DictWord, String> wordDao = DaoManager.createDao(connectionSource, DictWord.class);

        DictWord wordAlma = new DictWord(01, "alma", "apple");
        createDictWordIfNotExists(wordDao, wordAlma);
	}

	@RequestMapping("/dict")
	public String dictionary(){
		return "dictionary";
	}



    private static void createDictWordIfNotExists(Dao<DictWord, String> dictWordDao, DictWord word) throws SQLException {
        if(dictWordDao.queryForId(word.getHun()) == null) {
            dictWordDao.create(word);
        }
    }

}
