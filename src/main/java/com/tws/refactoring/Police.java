package com.tws.refactoring;

class Police {
    boolean checkDriver(Driver driver) {
        return driver.getAge() >= 18;
    }
}
