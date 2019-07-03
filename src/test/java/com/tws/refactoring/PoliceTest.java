package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PoliceTest {

    @Test
    void should_return_true_when_age_is_not_less_than_18() {
        Police police = new Police();

        Assertions.assertTrue(police.checkDriver(new Driver(19)));
    }

    @Test
    void should_return_true_when_age_equal_18() {
        Police police = new Police();

        Assertions.assertTrue(police.checkDriver(new Driver(18)));
    }

    @Test
    void should_return_false_when_age_is_less_than_18() {
        Police police = new Police();

        Assertions.assertFalse(police.checkDriver(new Driver(17)));
    }
}