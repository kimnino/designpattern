package com.designpattern.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() { // 보일러가 비어있을때 돌아갑니다.
        empty = true;
        boiled = false;
    }

    public void fill() { // 보일러가 비어있을때 재료를 넣습니다.
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true; // 끓인 재료를 다음 단계로 넘겨서 보일러를 비운다.
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true; // 재료를 끓인다.
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
