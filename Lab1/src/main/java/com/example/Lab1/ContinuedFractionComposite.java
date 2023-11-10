package com.example.Lab1;
import java.util.ArrayList;
import java.util.List;


public class ContinuedFractionComposite implements FractionComponent{

    private final List<FractionComponent> components = new ArrayList<>();

    public void addComponent(FractionComponent component) {
        components.add(component);
    }

    @Override
    public void print() {
        System.out.print("(");

        for (int i = 0; i < components.size(); i++) {
            components.get(i).print();

            if (i < components.size() - 1) {
                System.out.print(" + 1/(");
            }
        }

        for (int i = 0; i < components.size() - 1; i++) {
            System.out.print(")");
        }

        System.out.print(")");
    }
}
