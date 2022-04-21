package com.fluent_dsl.simple;

import com.fluent_dsl.FluentCalendarBuilder;

public final class FluentCalendarState3 {
	private final FluentCalendar fluentCalendar;
	private FluentCalendarBuilder calendarBuilder;

	public FluentCalendarState3(FluentCalendar fluentCalendar, FluentCalendarBuilder calendarBuilder) {
		this.fluentCalendar = fluentCalendar;
		this.calendarBuilder = calendarBuilder;
	}

	public final FluentCalendarState4 at(String location) {
		calendarBuilder.at(location);

		return fluentCalendar.getState4();
	}
}