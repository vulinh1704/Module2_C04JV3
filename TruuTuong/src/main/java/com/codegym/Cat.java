package com.codegym;

public abstract class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}


class Tom extends Cat {
    public Tom(String name) {
        super(name);
    }

    @Override
    public void go() {

    }

    @Override
    public String eat() {
        return "";
    }
}

// Khi 1 class kế thừa 1 abstract class thì sẽ phải triển khai
// các abstract method của lớp cha