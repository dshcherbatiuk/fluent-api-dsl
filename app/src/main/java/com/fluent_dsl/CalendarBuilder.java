package com.fluent_dsl;

public class CalendarBuilder {
	private final Calendar calendar;

	public CalendarBuilder() {
		this.calendar = new Calendar();
	}

	public CalendarBuilder add(String name) {
		calendar.add(name);

		return this;
	}

	private Calendar.Event getCurrentEvent() {
		return calendar.getEvents().get(calendar.getEvents().size() - 1);
	}

	public CalendarBuilder on(int year, int month, int day) {
		getCurrentEvent().on(year, month, day);

		return this;
	}

	public CalendarBuilder from(String startTime) {
		getCurrentEvent().from(startTime);

		return this;
	}

	public CalendarBuilder to(String endTime) {
		getCurrentEvent().to(endTime);

		return this;
	}

	public CalendarBuilder at(String location) {
		getCurrentEvent().at(location);

		return this;
	}

	public Calendar build() {
		return calendar;
	}
}
