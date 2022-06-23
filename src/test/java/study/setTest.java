package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class setTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {

        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

    }

    // Test Case 구현
    @Test
    void chkLength(){
        assertThat(String.valueOf(numbers.size())).contains(String.valueOf(numbers.size()));


    }

    @Test
    void contains중복() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }






}
