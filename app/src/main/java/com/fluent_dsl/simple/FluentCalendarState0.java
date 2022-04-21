package com.fluent_dsl.simple;

import com.fluent_dsl.FluentCalendarBuilder;

public final class FluentCalendarState0 {
	private final FluentCalendar fluentCalendar;
	private FluentCalendarBuilder calendarBuilder;

	public FluentCalendarState0(FluentCalendar fluentCalendar, FluentCalendarBuilder calendarBuilder) {
		this.fluentCalendar = fluentCalendar;
		this.calendarBuilder = calendarBuilder;
	}

	public final FluentCalendarState1 on(int year, int month, int day) {
		calendarBuilder.on(year, month, day);

		return fluentCalendar.getState1();
	}
}