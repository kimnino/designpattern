package com.designpattern.observer.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class ObserverTest {

    @Test
    void test() {

        Goods goods = new Goods();

        MartDisplay martDisplay = new MartDisplay(goods);
        CustomerPush customerPush = new CustomerPush(goods);

        goods.refreshGoods(1, "포카칩", 2000);
        goods.refreshGoods(1, "포카칩", 4000);
        goods.refreshGoods(2, "초코송이", 6000);

    }
}
