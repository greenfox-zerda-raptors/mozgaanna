import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mozgaanna on 16/11/16.
 */
public class ToDo  {
    boolean completionState;
    String name;

    public ToDo(){
    }

    public ToDo(String name, boolean completionState){
        this.name = name;
        this.completionState = completionState;
    }

    public ToDo(String name){
        this(name, false);
    }

    public void complete(){
        completionState = true;
    }


    @Override
    public String toString(){
        return name;
    }















}
