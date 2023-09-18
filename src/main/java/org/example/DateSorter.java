package org.example;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DateSorter {
	/**
	 * The implementation of this method should sort dates.
	 * The output should be in the following order:
	 * Dates with an 'r' in the month,
	 * sorted ascending (first to last),
	 * then dates without an 'r' in the month,
	 * sorted descending (last to first).
	 * For example, October dates would come before May dates,
	 * because October has an 'r' in it.
	 * thus: (2005-07-01, 2005-01-02, 2005-01-01, 2005-05-03)
	 * would sort to
	 * (2005-01-01, 2005-01-02, 2005-07-01, 2005-05-03)
	 *
	 * @param unsortedDates - an unsorted list of dates
	 * @return the collection of dates now sorted as per the spec
	 */
	private final CharSequence CHAR_R = "r";

	public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
		if (unsortedDates == null) {
			return null;
		}
		List<LocalDate> datesWithR = unsortedDates.stream()
				.filter(date -> date != null && date.getMonth()
						.name()
						.toLowerCase()
						.contains(CHAR_R))
				.sorted()
				.collect(Collectors.toList());

		return unsortedDates.stream()
				.filter(date -> date != null && !datesWithR.contains(date))
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toCollection(() -> datesWithR));
	}
}
