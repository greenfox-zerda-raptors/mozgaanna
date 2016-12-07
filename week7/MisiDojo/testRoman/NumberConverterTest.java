import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mozgaanna on 06/12/16.
 */
public class NumberConverterTest {
    @Test
    public void shouldReturnIFor1(){
        assertEquals("I", NumberConverter.arabicToRoman(1));
    }

    @Test
    public void shouldReturnIIFor2(){
        assertEquals("II", NumberConverter.arabicToRoman(2));
    }

    @Test
    public void shouldReturnIIIFor3(){
        assertEquals("III", NumberConverter.arabicToRoman(3));
    }

    @Test
    public void shouldReturnIVFor4(){
        assertEquals("IV", NumberConverter.arabicToRoman(4));
    }

    @Test
    public void shouldReturnVFor5(){
        assertEquals("V", NumberConverter.arabicToRoman(5));
    }

    @Test
    public void shouldReturnVIFor6(){
        assertEquals("VI", NumberConverter.arabicToRoman(6));
    }

    @Test
    public void shouldReturnVIIFor7(){
        assertEquals("VII", NumberConverter.arabicToRoman(7));
    }

    @Test
    public void shouldReturnIXFor9(){
        assertEquals("IX", NumberConverter.arabicToRoman(9));
    }

    @Test
    public void shouldReturnXFor10(){
        assertEquals("X", NumberConverter.arabicToRoman(10));
    }

    @Test
    public void shouldReturnXIFor11(){
        assertEquals("XI", NumberConverter.arabicToRoman(11));
    }

    @Test
    public void shouldReturnXIIFor12(){
        assertEquals("XII", NumberConverter.arabicToRoman(12));
    }

    @Test
    public void shouldReturnXIIIFor13(){
        assertEquals("XIII", NumberConverter.arabicToRoman(13));
    }

    @Test
    public void shouldReturnXLFor40(){
        assertEquals("XL", NumberConverter.arabicToRoman(40));
    }

    @Test
    public void shouldReturnXLFor50(){
        assertEquals("L", NumberConverter.arabicToRoman(50));
    }

    @Test
    public void shouldReturnXLIXFor49(){
        assertEquals("XLIX", NumberConverter.arabicToRoman(49));
    }

    @Test
    public void shouldReturnXXXVIIIFor38(){
        assertEquals("XXXVIII", NumberConverter.arabicToRoman(38));
    }

    @Test
    public void shouldReturnMFor100(){
        assertEquals("C", NumberConverter.arabicToRoman(100));
    }

    @Test
    public void shouldReturnMFor1000(){
        assertEquals("M", NumberConverter.arabicToRoman(1000));
    }
    @Test
    public void shouldReturnXCVIIIFor98(){
        assertEquals("XCVIII", NumberConverter.arabicToRoman(98));
    }
    @Test
    public void shouldReturnCXXXVIIFor137(){
        assertEquals("CXXXVII", NumberConverter.arabicToRoman(137));
    }

}
