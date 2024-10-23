import javax.swing.*;

public class Bmi {

    double weight;
    double hight;
    double bmi;

    public Bmi(double weight, double hight) {
        this.weight = weight;
        this.hight = hight;
    }
    public double bmiBerechnung() {
        bmi = weight / (hight*hight) * 10000;
        return bmi;
    }
    public String kategorie() {
        if (bmi <= 18.5) {
            return "untergewichtig!";
        } else if (bmi <= 25) {
            return "normalgewichtig!";
        } else if (bmi <= 30) {
            return "normalgewichtig!";
        } else {
            return "fettleibig!";
        }
    }

    public static void main(String[] args) {

        double eingabeWeight = Double.parseDouble(JOptionPane.showInputDialog("Bitte Gewicht in KG eingeben: "));
        double eingabeHeight = Double.parseDouble(JOptionPane.showInputDialog("Bitte Grösse in CM eingeben: "));

        Bmi bmiUser = new Bmi(eingabeWeight, eingabeHeight);
        double a = bmiUser.bmiBerechnung();
        String b = bmiUser.kategorie();
        System.out.println("\nMit einem BMI von " + String.format("%.2f", bmiUser.bmiBerechnung()) + " sind Sie in der Kategorie " + b);
    }
}