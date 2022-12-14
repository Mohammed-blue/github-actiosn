package tech.strategio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E01Test {
    @DisplayName("Contains Duplicate")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("arrayToBoolean")
    void arrayToBoolean(int[] values, Boolean result) {
        E01 exercise = new E01();
        boolean val = exercise.containsDuplicate(values);
        assertEquals(result, val);
    }
    private static Stream<Arguments> arrayToBoolean() {
        return Stream.of(
                Arguments.arguments(new int[] {1,2}, false),
                Arguments.arguments(new int[] {1,2,1}, true),
                Arguments.arguments(new int[] {1}, false),
                Arguments.arguments(new int[] {1}, false),
                Arguments.arguments(new int[] {1,2,3,4}, false),
                Arguments.arguments(new int[] {1,1,1,3,3,4,3,2,4,2}, true)
        );
    }
}
