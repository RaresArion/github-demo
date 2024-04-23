package Testing.T3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Detachament<Units> peasents = new Detachament<>("");
//        Detachament<Units> footDet = new Detachament<>("m2");
//
//
//        footDet.addToDetach(3, "m2");
//        //footDet.printDetach();
//
//
//        peasents.addToDetach(4, "");
//        //peasents.printDetach();
//
//
//        System.out.print("\nBefore the fight Peasents vs Foot Men ");
//        footDet.printDetachDetailed();
//        peasents.printDetachDetailed();
//        // pNr >= fNr*2
//        if(peasents.getList().size() >=  footDet.getList().size() * 2) {
//            peasents.fightPvsF(footDet.getList());
//        } else {
//            footDet.fightPvsFTest(peasents);
//            peasents.getList().clear();
//        }
//        System.out.print("\nAfter the fight Peasents vs Foot Men ");
//        footDet.printDetachDetailed();
//        peasents.printDetachDetailed();



        // TRYING SOMETHING DIFFERENT

        Detachament<Peasents> p1 = new Detachament<>("");
        Detachament<FootMen>  f1 = new Detachament<>("m2");

        // adding soldiers of each type
        p1.addToDetach(8, "");
        f1.addToDetach(3, "m2");

        // print detachment:
        p1.printDetachDetailed();
        f1.printDetachDetailed();

        if(p1.getList().size() >=  f1.getList().size() * 2) {
            System.out.println("Main if = True");
            p1.fightPvsFTest(f1);
            f1.getList().clear();
        } else {
            System.out.println("Main if = False");
            f1.fightPvsFTest(p1);
            p1.getList().clear();
        }

        System.out.println("After the fight");
        p1.printDetachDetailed();
        f1.printDetachDetailed();

        }

    }

