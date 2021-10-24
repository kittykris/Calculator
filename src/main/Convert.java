package main;

public class Convert {

    private static final String[] roma = {"X", "IX", "V", "IV", "I"};
    private static final int[] arab = {10, 9, 5, 4, 1};

    public static String toRoman(int arabNumber) {
        StringBuilder romans = new StringBuilder("");
        while (arabNumber > 0) {
            while (arabNumber >= 100) {
                romans.append("C");
                arabNumber -= 100;
            }
            while (arabNumber >= 90) {
                romans.append("XC");
                arabNumber -= 90;
            }
            while (arabNumber >= 50) {
                romans.append("L");
                arabNumber -= 50;
            }
            while (arabNumber >= 40) {
                romans.append("XL");
                arabNumber -= 40;
            }
            while (arabNumber >= 10) {
                romans.append("X");
                arabNumber -= 10;
            }
            while (arabNumber >= 9) {
                romans.append("IX");
                arabNumber -= 9;
            }
            while (arabNumber >= 5) {
                romans.append("V");
                arabNumber -= 5;
            }
            while (arabNumber >= 4) {
                romans.append("IV");
                arabNumber -= 4;
            }
            while (arabNumber >= 1) {
                romans.append("I");
                arabNumber -= 1;
            }
        }
        return romans.toString();
    }


    public static int toArabic(String romanNumber) {
        int arabs = 0;
        for (int i = 0; i < arab.length; i++) {
            while (romanNumber.startsWith(roma[i])) {
                arabs += arab[i];
                romanNumber = romanNumber.substring(roma[i].length());
            }
        }
        return arabs;
    }
}
