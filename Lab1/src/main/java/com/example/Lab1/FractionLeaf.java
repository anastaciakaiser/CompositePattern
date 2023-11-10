package com.example.Lab1;

public class FractionLeaf implements FractionComponent{

    private final int value;

    public FractionLeaf(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
