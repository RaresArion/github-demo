package Section7;

public class ComplexNumber {

    private double real; // real nr
    private double imaginary; // imaginary nr

    public ComplexNumber (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add (ComplexNumber cmpNr) {
        this.real += cmpNr.real;
        this.imaginary += cmpNr.imaginary;
    }

    public void subtract (double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract (ComplexNumber cmpNr) {
        this.real -= cmpNr.real;
        this.imaginary -= cmpNr.imaginary;
    }
}
