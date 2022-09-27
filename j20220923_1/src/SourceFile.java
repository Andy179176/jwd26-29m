import java.util.List;

public abstract class SourceFile {
    public static final List<String> list=List.of(
            "qwer",
            "3456",
            "6789");

    public static List<String> getList(){
        return readListFromServer();
    }
    static public List<String> readListFromFile(){
        List<String> list=List.of(
                "qwer",
                "3456",
                "6789");
        return list;
    }

    static public List<String> readListFromServer(){
        List<String> list=List.of(
                "qwer",
                "3456",
                "6789");
        return list;
    }


}
