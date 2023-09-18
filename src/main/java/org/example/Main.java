package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		DateSorter dateSorter = new DateSorter();

		List<LocalDate> unsortedDates = new ArrayList<>();
		unsortedDates.add(LocalDate.of(2005, 7, 1));
		unsortedDates.add(LocalDate.of(2005, 1, 2));
		unsortedDates.add(LocalDate.of(2005, 1, 1));
		unsortedDates.add(LocalDate.of(2005, 5, 3));
		unsortedDates.add(null);

		Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

		System.out.println(sortedDates);
	}
}
