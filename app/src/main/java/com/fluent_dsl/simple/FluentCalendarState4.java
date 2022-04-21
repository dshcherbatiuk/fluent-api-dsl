package com.fluent_dsl.simple;

import com.fluent_dsl.Calendar;
import com.fluent_dsl.FluentCalendarBuilder;

public final class FluentCalendarState4 {
	private final FluentCalendar fluentCalendar;
	private FluentCalendarBuilder calendarBuilder;

	public FluentCalendarState4(FluentCalendar fluentCalendar, FluentCalendarBuilder calendarBuilder) {
		this.fluentCalendar = fluentCalendar;
		this.calendarBuilder = calendarBuilder;
	}

	public Calendar end() {
		return calendarBuilder.end();
	}

	public final FluentCalendarState0 add(String name) {
		calendarBuilder.add(name);

		return fluentCalendar.getState0();
	}
}