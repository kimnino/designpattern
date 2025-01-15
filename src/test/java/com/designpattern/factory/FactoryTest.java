package com.designpattern.factory;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class FactoryTest {

    @Test
    public void test() {


    }

    private Hamburger orderHamburger(String type) {
        HamburgerFactory factory = new HamburgerFactory();

        Hamburger hamburger = factory.createHamburger(type);

        hamburger.prepare();
        hamburger.cook();
        hamburger.wrap();

        return hamburger;
    }
}
