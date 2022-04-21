package com.fluent_dsl.simple;

import com.fluent_dsl.FluentCalendarBuilder;

public final class FluentCalendarState2 {
	private final FluentCalendar fluentCalendar;
	private FluentCalendarBuilder calendarBuilder;

	public FluentCalendarState2(FluentCalendar fluentCalendar, FluentCalendarBuilder calendarBuilder) {
		this.fluentCalendar = fluentCalendar;
		this.calendarBuilder = calendarBuilder;
	}

	public final FluentCalendarState3 to(String endTime) {
		calendarBuilder.to(endTime);

		return fluentCalendar.getState3();
	}
}