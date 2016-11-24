package pl.javastart;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorLambdaExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Kasia", "Ania", "Zosia", "Bartek");
		//sortowanie aldabetyczne z uwzgl�dnieniem wielko�ci liter
		Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));
		//metoda dorEach od Jav8 8 daje mo�liwo�ci jak p�tla for-each
		//oczekuje argumentu typu java.util.function.Consumer, czyli
		// (arg) -> void
		names.forEach(arg -> System.out.println(arg));
	}
}
