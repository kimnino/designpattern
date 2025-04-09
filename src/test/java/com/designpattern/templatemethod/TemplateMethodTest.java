package com.designpattern.templatemethod;

import com.designpattern.templatemethod.case3.CoffeeWithHook;
import com.designpattern.templatemethod.case3.TeaWithHook;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class TemplateMethodTest {

    @Test
    void testTemplateMethod() {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\n 홍차 준비 중 ...");
        teaWithHook.prepareRecipe("y");

        System.out.println("\n 커피 준비 중 ...");
        coffeeWithHook.prepareRecipe("n");
    }
}
