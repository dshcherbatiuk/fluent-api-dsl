package com.fluent_dsl.simple;

import com.fluent_dsl.FluentCalendarBuilder;

public final class FluentCalendarState1 {
	private final FluentCalendar fluentCalendar;
	private FluentCalendarBuilder calendarBuilder;

	public FluentCalendarState1(FluentCalendar fluentCalendar, FluentCalendarBuilder calendarBuilder) {
		this.fluentCalendar = fluentCalendar;
		this.calendarBuilder = calendarBuilder;
	}

	public final FluentCalendarState2 from(String startTime) {
		calendarBuilder.from(startTime);

		return fluentCalendar.getState2();
	}
}