package Section5.Ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        NormCls nC = new NormCls(true, 10);
//        nC.shouldWakeUp();

        List<NormCls> nCArr = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            nCArr.add(new NormCls((i % 2 == 0 ? true : false), i));
        }

        for (NormCls n : nCArr) {
            System.out.println(n.shouldWakeUp());
            System.out.println("=".repeat(30));
        }
    }
}
