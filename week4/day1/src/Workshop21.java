/**
 * Created by mozgaanna on 07/11/16.
 */
public class Workshop21 {
    public static void main(String... args){

        StringBuilder sb = new StringBuilder("first third fourth");
        // Add "second" to the StringBuilder (sb) between the words "first" and "third"
        // Expected outpt: first second third fourth

        String txInsertBefore = "third";
        String txInsert = "second ";

        int i = sb.indexOf(txInsertBefore);

        //transfer it to Arraylist
        //transfer back

        System.out.println(i);

        sb.insert(i,txInsert);

        System.out.println(sb);


//        System.out.println(sb.toString());
    }
}
