import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {
        Object x = 123;
        Object y = 1235;
        String smth = "docker exec -it kafka-monitor bash -c 'find /kafka-monitor/log/1924F-10402/InterfaceStateChange/ -type f -name \"*payload.json\" \\-exec sh -c '\\''echo \"--- {} ---\"; cat \"{}\"; echo'\\'' \\;'";

        String str = "something --- 812839 ---- something more";
        String str1 = "smth ";
        String str2;

        String str3 = "Rares are mere";
        String[] strArr = str.split("----");

        System.out.println(Arrays.toString(strArr));


    }
}
