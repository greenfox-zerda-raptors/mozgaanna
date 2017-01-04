package dictionary;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by mozgaanna on 22/12/16.
 */
@Getter
@Setter
@ToString
@DatabaseTable(tableName = "Dictionary")
public class DictWord {

    @DatabaseField(id = true)
    int id;
    @DatabaseField
    String hun;
    @DatabaseField
    String eng;

    public DictWord(int id, String hun, String eng){
        this.id = id;
        this.hun = hun;
        this.eng = eng;
    }

    public DictWord(){
        // ORMLite needs a no-arg constructor!!!!!!!
    }




}
