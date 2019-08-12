package lt.bit.hw.scannerOP_009;

import java.util.Scanner;

public class ScannerOP_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your body mass (kg): ");
        double bodyMass = scanner.nextDouble();
        double bodyMassMars = (bodyMass * 3.7) / 9.81;
        System.out.println("Mars (kg): ");
        System.out.format("%.2f\n", bodyMassMars);
        double bodyMassPluto = (bodyMass * 0.66) / 9.81;
        System.out.println("Pluto (kg): ");
        System.out.format("%.2f\n", bodyMassPluto);
        double bodyMassMoon = (bodyMass * 1.62) / 9.81;
        System.out.println("Moon (kg): ");
        System.out.format("%.2f\n", bodyMassMoon);
        double bodyMassEarth = (bodyMass * 9.8) / 9.81;
        System.out.println("Earth (kg): ");
        System.out.format("%.2f\n", bodyMassEarth);
        double bodyMassMercury = (bodyMass * 3.7) / 9.81;
        System.out.println("Mercury (kg): ");
        System.out.format("%.2f\n", bodyMassMercury);
        double bodyMassVenus = (bodyMass * 8.87) / 9.81;
        System.out.println("Venus (kg): ");
        System.out.format("%.2f\n", bodyMassVenus);
        double bodyMassJupiter = (bodyMass * 24.8) / 9.81;
        System.out.println("Jupiter (kg): ");
        System.out.format("%.2f\n", bodyMassJupiter);
        double bodyMassSaturn = (bodyMass * 10.4) / 9.81;
        System.out.println("Saturn (kg): ");
        System.out.format("%.2f\n", bodyMassSaturn);
        double bodyMassUranus = (bodyMass * 8.87) / 9.81;
        System.out.println("Uranus (kg):  ");
        System.out.format("%.2f\n", bodyMassUranus);
        double bodyMassNeptune = (bodyMass * 10.15) / 9.81;
        System.out.println("Neptune (kg): ");
        System.out.format("%.2f\n", bodyMassNeptune);
        double bodyMassSun = (bodyMass * 274.0) / 9.81;
        System.out.println("Sun (kg): ");
        System.out.format("%.2f\n", bodyMassSun);
    }
}
