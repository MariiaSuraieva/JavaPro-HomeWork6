package com.hillel.suraieva;

import static java.lang.Integer.parseInt;

public class ArrayValueCalculator {
    public static void main(String[] args) throws Exception {

        String[][] massiv = {{"2", "3", "1", "5"},
                {"7", "5", "3", "k"},
                {"3", "7", "4", "3"},
                {"2", "7", "6", "5"}};

        System.out.println(doCalc(massiv));


    }

    public static int doCalc(String[][] massiv) throws ArrayDataException {

        try {
            if (massiv.length != 4) throw new ArraySizeException();
            for (int i = 0; i < massiv.length; i++) {
                if (massiv.length != 4) throw new ArraySizeException();
                for (int j = 0; j < massiv[i].length; j++) {
                    if (massiv[i].length != 4) throw new ArraySizeException();
                }
            }
        } catch (ArraySizeException e) {
            System.out.println(e.toStr());
        }

        int sum = 0;
        int intMassiv;


        int stroka = 0;
        int stolbec = 0;
        try {
            for (int i = 0; i < massiv.length; i++) {
                for (int j = 0; j < massiv[i].length; j++) {
                    try {
                        stroka = i + 1;
                        stolbec = j + 1;
                        intMassiv = parseInt(massiv[i][j]);
                        sum += intMassiv;
                        if (Character.isDigit(intMassiv)) throw new NumberFormatException();

                    } catch (NumberFormatException e1) {

                        throw new ArrayDataException();
                    }
                }
            }


        } catch (ArrayDataException eData) {
            System.out.println(eData.toStr() + "строка - " + stroka + ", " + "столбец - " + stolbec);
            return 0;
        }
        return sum;
    }
}
