package morseConverter;

import java.util.HashMap;

public class Converter {

    private HashMap<String, String> morseToText;
    private HashMap<String, String> textToMorse;

    public Converter() {

        morseToText = new HashMap<>();
        textToMorse = new HashMap<>();

        morseToText.put("*-", "A");
        morseToText.put("-***", "B");
        morseToText.put("-*-*", "C");
        morseToText.put("-**", "D");
        morseToText.put("*", "E");
        morseToText.put("**-*", "F");
        morseToText.put("--*", "G");
        morseToText.put("****", "H");
        morseToText.put("**", "I");
        morseToText.put("*---", "J");
        morseToText.put("-*-", "K");
        morseToText.put("*-**", "L");
        morseToText.put("--", "M");
        morseToText.put("-*", "N");
        morseToText.put("---", "O");
        morseToText.put("*--*", "P");
        morseToText.put("--*-", "Q");
        morseToText.put("*-*", "R");
        morseToText.put("***", "S");
        morseToText.put("-", "T");
        morseToText.put("**-", "U");
        morseToText.put("***-", "V");
        morseToText.put("*--", "W");
        morseToText.put("-**-", "X");
        morseToText.put("-*--", "Y");
        morseToText.put("--**", "Z");
        morseToText.put("*----", "1");
        morseToText.put("**---", "2");
        morseToText.put("***--", "3");
        morseToText.put("****-", "4");
        morseToText.put("*****", "5");
        morseToText.put("-****", "6");
        morseToText.put("--***", "7");
        morseToText.put("---**", "8");
        morseToText.put("----*", "9");
        morseToText.put("-----", "0");
        morseToText.put("*-*-*-", ".");
        morseToText.put("--**--", ",");
        morseToText.put("**--**", "?");

        textToMorse.put("A", "*-");
        textToMorse.put("B", "-***");
        textToMorse.put("C", "-*-*");
        textToMorse.put("D", "-**");
        textToMorse.put("E", "*");
        textToMorse.put("F", "**-*");
        textToMorse.put("G", "--*");
        textToMorse.put("H", "****");
        textToMorse.put("I", "**");
        textToMorse.put("J", "**");
        textToMorse.put("K", "-*-");
        textToMorse.put("L", "*-**");
        textToMorse.put("M", "--");
        textToMorse.put("N", "-*");
        textToMorse.put("O", "---");
        textToMorse.put("P", "*--*");
        textToMorse.put("Q", "--*-");
        textToMorse.put("R", "*-*");
        textToMorse.put("S", "***");
        textToMorse.put("T", "-");
        textToMorse.put("U", "**-");
        textToMorse.put("V", "***-");
        textToMorse.put("W", "*--");
        textToMorse.put("X", "-**-");
        textToMorse.put("Y", "-*--");
        textToMorse.put("Z", "--**");
        textToMorse.put("1", "*----");
        textToMorse.put("2", "**---");
        textToMorse.put("3", "***--");
        textToMorse.put("4", "****-");
        textToMorse.put("5", "*****");
        textToMorse.put("6", "-****");
        textToMorse.put("7", "--***");
        textToMorse.put("8", "---**");
        textToMorse.put("9", "----*");
        textToMorse.put("0", "-----");
        textToMorse.put(".", "*-*-*-");
        textToMorse.put(",", "--**--");
        textToMorse.put("?", "**--**");

    }

    public String getText(String morse) {
        if (morseToText.get(morse) != null) {
            return morseToText.get(morse);
        } else {
            return "Invalid input. Please, enter valid morse code.";
        }

    }

    public String getMorse(String text) {
        String upperCaseInput = text.toUpperCase();
        if (textToMorse.get(upperCaseInput) != null) {
            return textToMorse.get(upperCaseInput);
        } else {
            return "Invalid input. Please, enter valid text.";
        }

    }

}



