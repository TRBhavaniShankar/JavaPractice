import java.util.ArrayList;
import java.util.List;

public class DesignPattern {
    public static void main(String[] args) {

        List<String> list =  new ArrayList<String>();
        list.add("empid");
        DataBase db = new DataBase();
        db.table("employee");
        db.where("emplPhone", "=", "xxxx");
        db.select(list);

        System.out.println("Query: "+db.get());
    }
}


 class DataBase{

    private String query = "";
    private String tableName = "";
    private String select = "";
    private String where = "";

    public void table(String tableName) {
        this.tableName = tableName;
    }

    public void select(List<String> selection) {
        this.select = "select " ;
        for (String string : selection) {
            this.select += string + ", ";
        }
        
    }

    public void where(String wherePara, String whereCond, String whereVal){
        this.where = " where " + wherePara+whereCond+whereVal;
    }

    public String get(){
        return this.select+" from " + this.tableName + this.where+";";
    }

}