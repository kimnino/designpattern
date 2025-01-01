package com.designpattern.strategy.example;

import com.designpattern.strategy.Duck;
import com.designpattern.strategy.FlyRocketPowered;
import com.designpattern.strategy.MallardDuck;
import com.designpattern.strategy.ModelDuck;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class ExampleStrategyTest {

    @Test
    void testStrategy() {
        Fruit apple = new Apple();
        Fruit melon = new Melon();

        apple.setHarvestStrategy(new TreeHarvest());
        melon.setHarvestStrategy(new FieldHarvest());
        apple.harvest();
        melon.harvest();

        // 만약에 멜론의 수확방법이 나무로 변경된다면
        melon.setHarvestStrategy(new TreeHarvest());
        melon.harvest();
    }
}
