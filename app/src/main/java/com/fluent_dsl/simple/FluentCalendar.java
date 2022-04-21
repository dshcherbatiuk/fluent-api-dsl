package com.fluent_dsl.simple;

import com.fluent_dsl.FluentCalendarBuilder;

public class FluentCalendar {

	private final FluentCalendarBuilder calendarBuilder;

	private final FluentCalendarState0 state0;
	private final FluentCalendarState1 state1;
	private final FluentCalendarState2 state2;
	private final FluentCalendarState3 state3;
	private final FluentCalendarState4 state4;

	public FluentCalendar() {
		this.calendarBuilder = new FluentCalendarBuilder();

		this.state0 = new FluentCalendarState0(this, this.calendarBuilder);
		this.state1 = new FluentCalendarState1(this, this.calendarBuilder);
		this.state2 = new FluentCalendarState2(this, this.calendarBuilder);
		this.state3 = new FluentCalendarState3(this, this.calendarBuilder);
		this.state4 = new FluentCalendarState4(this, this.calendarBuilder);
	}

	public final FluentCalendarState0 add(String name) {
		calendarBuilder.add(name);

		return getState0();
	}

	FluentCalendarState0 getState0() {
		return this.state0;
	}

	FluentCalendarState1 getState1() {
		return this.state1;
	}

	FluentCalendarState2 getState2() {
		return this.state2;
	}

	FluentCalendarState3 getState3() {
		return this.state3;
	}

	FluentCalendarState4 getState4() {
		return this.state4;
	}
}