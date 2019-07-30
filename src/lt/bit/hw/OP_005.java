package lt.bit.hw;

/**
 * LT Parašykite programą, kuri skaičiuoja pateikto kūno masę įvairiose planetose
 * (Marsas, Plutonas ir pan.).
 * 1 Newton ~ * 0.102kg; 1kg ~ / 9.81 Newton;
 * EN Write a program that calculates the mass of a given body on various planets
 * (Mars, Pluto, etc.).
 */

public class OP_005 {
    public static void main(String[] args) {
        double bodyMass = 120;

        double gravityMars = 3.7;
        double gravityPluto = 0.66;
        double gravityMoon = 1.62;
        double gravityEarth = 9.8;
        double gravityMercury = 3.7;
        double gravityVenus = 8.87;
        double gravityJupiter = 24.8;
        double gravitySaturn = 10.4;
        double gravityUranus = 8.87;
        double gravityNeptune = 10.15;
        double gravitySun = 274.0;

        double bodyMassMars = (bodyMass * gravityMars) / 9.81;
        double bodyMassPluto = (bodyMass * gravityPluto) / 9.81;
        double bodyMassMoon = (bodyMass * gravityMoon) / 9.81;
        double bodyMassEarth = (bodyMass * gravityEarth) / 9.81;
        double bodyMassMercury = (bodyMass * gravityMercury) / 9.81;
        double bodyMassVenus = (bodyMass * gravityVenus) / 9.81;
        double bodyMassJupiter = (bodyMass * gravityJupiter) / 9.81;
        double bodyMassSaturn = (bodyMass * gravitySaturn) / 9.81;
        double bodyMassUranus = (bodyMass * gravityUranus) / 9.81;
        double bodyMassNeptune = (bodyMass * gravityNeptune) / 9.81;
        double bodyMassSun = (bodyMass * gravitySun) / 9.81;


        System.out.println("Body mass on the Mars: " + bodyMass * gravityMars + " N ");
        System.out.println("Body mass on the Pluto: " + bodyMass * gravityPluto + " N ");
        System.out.println("Body mass on the Moon: " + bodyMass * gravityMoon + " N ");
        System.out.println("Body mass on the Earth: " + bodyMass * gravityEarth + " N ");
        System.out.println("Body mass on the Mercury: " + bodyMass * gravityMercury + " N ");
        System.out.println("Body mass on the Venus: " + bodyMass * gravityVenus + " N ");
        System.out.println("Body mass on the Jupiter: " + bodyMass * gravityJupiter + " N ");
        System.out.println("Body mass on the Saturn: " + bodyMass * gravitySaturn + " N ");
        System.out.println("Body mass on the Uranus: " + bodyMass * gravityUranus + " N ");
        System.out.println("Body mass on the Neptune: " + bodyMass * gravityNeptune + " N ");
        System.out.println("Body mass on the Sun: " + bodyMass * gravitySun + " N ");

        System.out.println("Mars: " + bodyMassMars + " kg ");
        System.out.format("%.2f\n", bodyMassMars);
        System.out.println("Pluto: " + bodyMassPluto + " kg ");
        System.out.format("%.2f\n", bodyMassPluto);
        System.out.println("Moon: " + bodyMassMoon + " kg ");
        System.out.format("%.2f\n", bodyMassMoon);
        System.out.println("Earth: " + bodyMassEarth + " kg ");
        System.out.format("%.2f\n", bodyMassEarth);
        System.out.println("Mercury: " + bodyMassMercury + " kg ");
        System.out.format("%.2f\n", bodyMassMercury);
        System.out.println("Venus: " + bodyMassVenus + " kg ");
        System.out.format("%.2f\n", bodyMassVenus);
        System.out.println("Jupiter: " + bodyMassJupiter + " kg ");
        System.out.format("%.2f\n", bodyMassJupiter);
        System.out.println("Saturn: " + bodyMassSaturn + " kg ");
        System.out.format("%.2f\n", bodyMassSaturn);
        System.out.println("Uranus: " + bodyMassUranus + " kg ");
        System.out.format("%.2f\n", bodyMassUranus);
        System.out.println("Neptune: " + bodyMassNeptune + " kg ");
        System.out.format("%.2f\n", bodyMassNeptune);
        System.out.println("Sun: " + bodyMassSun + " kg ");
        System.out.format("%.2f\n", bodyMassSun);
    }
}
