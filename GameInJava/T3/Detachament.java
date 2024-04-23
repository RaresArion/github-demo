package Testing.T3;

import java.util.*;

public class Detachament<T extends Units> {

    private String mType;
    private int detCapacity;
    private List<Units> militaryDetachament = new ArrayList<>();

    public Detachament(String mType) {
        detachCapacity(mType);
    }

    private void detachCapacity (String mType) {
        switch (mType) {
            case "m1": detCapacity = 124;
                       break;
            case "m2": detCapacity = 124;
                       break;
            case "m3": detCapacity = 100;
                       break;
            case "m4": detCapacity = 89;
                       break;
            case "m5": detCapacity = 20;
                       break;
            default : detCapacity = 150;
        }
        //System.out.println(detCapacity);

    }
    int i = 0;
    public void addToDetach(T t) {
        if(militaryDetachament.size() <= detCapacity) {
                militaryDetachament.add(t);
        } else {
            System.out.println(i++ + " For a "+t.getClass().getSimpleName() + " maximum capacity is "+detCapacity);

        }
    }
    public void addToDetach(int nrOfSoldiers, String type) {
        for(int i = 0; i < nrOfSoldiers; i++){
            militaryDetachament.add(MilitaryUnits.getType(type));
            // System.out.println(i);
        }
    }


    public void printDetach() {
        System.out.println("This "+militaryDetachament.get(0).getClass().getSimpleName() + " unit has a number of "+militaryDetachament.size()+" brave soldiers");
    }

    public void printDetachDetailed() {
        if(militaryDetachament.size() > 0) {
            System.out.println("This "+militaryDetachament.get(0).getClass().getSimpleName() + " unit has a number of "+militaryDetachament.size()+" brave soldiers");
            for(Units u : militaryDetachament) {
                System.out.println(u);
            }
        } else {
            System.out.println("Nothing left of this unit of "+this.getClass().getSimpleName());
        }
    }




    public List<Units> getList() {
        return militaryDetachament;
    }

    public List<Units> removeFromDetach(List<? extends Units> l1, int remainedUnits) {
        List<Units> l2  = new ArrayList<>();
        for(int i = 0; i<remainedUnits; i++) {
            l2.add(l1.get(i));
        }
        return l2;
    }

    public List<Units> removeFromDetach2(int remainedUnits) {
        List<Units> l2  = new ArrayList<>();
        for(int i = 0; i<remainedUnits; i++) {
            this.getList().add(this.getList().get(i));
        }
        return l2;
    }

    public void fightPvsFTest(Detachament<? extends Units> det) {
        List<Units> looserDetach = det.getList();
        int loosersNr = det.getList().size();
        int winnersNr = this.getList().size();
        String loosers= det.getList().get(0).getClass().getSimpleName();
        String winners = this.getList().get(0).getClass().getSimpleName();
        System.out.println("Right before if from 'fightPvsFTest'\n"+loosers +": "+loosersNr + "\n"+winners + ": " + winnersNr+"\n");

        if(winnersNr >= loosersNr*2) {
            System.out.println("if = true");

            winnersNr = winnersNr - (loosersNr*2);
//            footMenNr = 0;
//            militaryDetachament = removeFromDetach(this.getList(), peasentsNr);

            System.out.println(loosersNr + " " + loosers + " remained and \n%d %s remained".formatted(winnersNr, winners));
        } else {
            System.out.println("if = false");

            loosersNr = loosersNr - (winnersNr/2);
            loosersNr = 0;
            militaryDetachament = removeFromDetach(this.getList(), winnersNr);

            System.out.println(loosersNr + " " + loosers + " remained and \n%d %s remained".formatted(winnersNr, winners));
        }
    }


//    public void fightPvsF(List<? extends Units> l1) {
//        int peasentsNr = l1.size();
//        int footMenNr = this.getList().size();
//        String peasents = l1.get(0).getClass().getSimpleName();
//        String footMen = this.getList().get(0).getClass().getSimpleName();
//        System.out.println("Right before if from 'fightPvsF'\n"+peasents +": "+peasentsNr + "\n"+footMen + ": " + footMenNr+"\n");
//
//        if(peasentsNr >= footMenNr*2) {
//            System.out.println("if = true");
//
//            peasentsNr = peasentsNr - (footMenNr*2);
//            footMenNr = 0;
//            militaryDetachament = removeFromDetach(this.getList(), peasentsNr);
//
//            System.out.println(peasentsNr + " " + peasents + " remained and \n%d %s remained".formatted(footMenNr, footMen));
//        } else {
//            System.out.println("if = false");
//
//            footMenNr = footMenNr - (peasentsNr/2);
//            peasentsNr = 0;
//            militaryDetachament = removeFromDetach(this.getList(), footMenNr);
//            //l1.getList();
//            //printDetach();
//            System.out.println(peasentsNr + " " + peasents + " remained and \n%d %s remained".formatted(footMenNr, footMen));
//        }
//    }

}
