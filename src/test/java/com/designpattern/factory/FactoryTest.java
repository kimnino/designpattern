package com.designpattern.factory;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class FactoryTest {

    @Test
    public void test() {

        HamburgerStore seoulBurger = new SeoulHamburgerStore();
        HamburgerStore busanBurger = new BusanHamburgerStore();

        Hamburger hamburger = seoulBurger.orderHamburger("chicken");
        System.out.println("첫 번째 주문한" + hamburger.getName() + "\n");

        hamburger = busanBurger.orderHamburger("shrimp");
        System.out.println("두 번째 주문한" + hamburger.getName() + "\n");
    }


}
