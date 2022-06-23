package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitTest1(){
        assertThat("1,2".split(",")).contains("2","1");

    }

    @Test
    void splitTest2(){
        assertThat("1,2".split(",")).containsExactly("1", "2");
    }

    @Test
    void subString1(){
        String hello = "(1,2)";
        hello = hello.substring(1, (hello.length()-1));
        assertThat(hello.split(",")).contains("1","2");
    }

    @Test
    void subString1_1(){
        String inputData = "(1,2)";
        assertThat(inputData.substring(1,(inputData.length()-1)).split(",")).contains("1","2");
    }


    @Test
    @DisplayName("check overValue")
    void reqest3(){

        String data1 = "abc";
//
//        assertThat(
//                String.valueOf(data1.charAt(1))
//        ).contains("1");
        assertThatThrownBy(() -> {
          String.valueOf(data1.charAt(3));
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }




}
