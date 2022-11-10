import util.AppConfig;

public class Main {
    public static void main(String[] args) {
        System.out.println(AppConfig.get("file.work_dir"));
        System.out.println(AppConfig.get("file.extensio", "qwertyui"));

    }
}

/*

        key - String
        text - String



 */