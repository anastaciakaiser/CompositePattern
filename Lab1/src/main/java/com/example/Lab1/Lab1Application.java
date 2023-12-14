package com.example.Lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Lab1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);

		int[] coefs = {6, 6, 6, 6, 7, 3};
		System.out.print(Arrays.toString(coefs));

		ContinuedFractionComposite continuedFraction = generateMassiveContinuedFraction(coefs);

		System.out.println(" = ");
		continuedFraction.print();
	}

	private static ContinuedFractionComposite generateMassiveContinuedFraction(int[] coefs) {
		ContinuedFractionComposite continuedFraction = new ContinuedFractionComposite();

		for (int value : coefs) {
			continuedFraction.addComponent(new FractionLeaf(value));
		}

		return continuedFraction;
	}
}
