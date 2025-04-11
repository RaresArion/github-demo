package Section5.Ex1;

public class Ex1Cls extends Ex1Intf{

    private int nr;

    public Ex1Cls (int nr) {
        this.nr = nr;
        super.checkNumbers(this);
    }

    public int getNr() {
        return this.nr;
    }
}
