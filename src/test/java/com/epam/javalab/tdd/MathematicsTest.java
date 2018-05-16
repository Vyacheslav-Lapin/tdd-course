package com.epam.javalab.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class MathematicsTest {

    @ParameterizedTest
    @CsvSource({"1,2,3", "2,3,5"})
    @DisplayName("sum method works correctly")
    void sum(int x, int y, int z) {
        assertThat(Mathematics.sum(x,y), is(z));
    }
}