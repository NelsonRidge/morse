package morseConverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConverter {

    @Test
    public void testConvertMorseToM() {
        Converter converter = new Converter();
        String expected = "M";
        String testData = "--";
        String actual = converter.getText(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertMorseTo5() {
        Converter converter = new Converter();
        String expected = "5";
        String testData = "*****";
        String actual = converter.getText(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertMToMorse() {
        Converter converter = new Converter();
        String expected = "--";
        String testData = "M";
        String actual = converter.getMorse(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert1ToMorse() {
        Converter converter = new Converter();
        String expected = "*----";
        String testData = "1";
        String actual = converter.getMorse(testData);
        assertEquals(expected, actual);

    }

    @Test
    public void testConvertLowercaseAToMorse() {
        Converter converter = new Converter();
        String expected = "*-";
        String testData = "a";
        String actual = converter.getMorse(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertÅToMorse() {
        Converter converter = new Converter();
        String expected = "Invalid input. Please, enter valid text.";
        String testData = "Å";
        String actual = converter.getMorse(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertSixAsterisksToText() {
        Converter converter = new Converter();
        String expected = "Invalid input. Please, enter valid morse code.";
        String testData = "******";
        String actual = converter.getText(testData);
        assertEquals(expected, actual);

    }

    @Test
    public void testConvertEmptyInputToText() {
        Converter converter = new Converter();
        String expected = "Invalid input. Please, enter valid morse code.";
        String testData = "";
        String actual = converter.getText(testData);
        assertEquals(expected, actual);

    }

    @Test
    public void testConvertEmptyInputToMorse() {
        Converter converter = new Converter();
        String expected = "Invalid input. Please, enter valid text.";
        String testData = "";
        String actual = converter.getMorse(testData);
        assertEquals(expected, actual);
    }
}
