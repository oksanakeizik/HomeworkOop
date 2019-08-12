package lt.bit.hw.calculatorOP_024;

/** LT Naudojant objektinio programavimo principus realizuokite skaičiuotuvo programą.
 * Skaičiuotuvas turi mokėti atlikti paprastas aritmetines operacijas.
 * Duomenys nuskaitome iš komandinės eilutės.
 * EN Realize the calculator program using object-oriented programming principles.
 * The calculator must be able to perform simple arithmetic operations.
 * We retrieve data from the command line.
 */

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.getValues();
        calculator.result();
    }

}
