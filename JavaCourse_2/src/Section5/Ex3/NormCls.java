package Section5.Ex3;

public class NormCls implements IntfCls {

    @Override
    public String printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0)
            return "Invalid Value";

        int megaBytes = kiloBytes / ONE_BIT;
        int remainedKB = kiloBytes % ONE_BIT;

        return String.format("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remainedKB);
    }
}
