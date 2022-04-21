package com.fluent_dsl;

import static com.google.common.base.Charsets.UTF_8;
import com.google.common.io.Files;
import static com.google.common.truth.Truth.assertThat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class CalendarTest {

	private Gson gson;
	private String expectedResult;

	@BeforeEach
	void setUp() throws IOException {
		this.gson = new GsonBuilder().setPrettyPrinting().create();
		this.expectedResult = Files.toString(new File("src/test/resources/test.json"), UTF_8);
	}

	@Test
	void expectedAssignEventUsingCalendar() throws IOException {
		final Calendar calendar = new Calendar();
		calendar.add("DSL tutorial")
				.on(2022, 04, 22)
				.from("18:00")
				.to("19:00")
				.at("Microsoft Teams");

		calendar.add("Making use of Patterns")
				.on(2022, 05, 30)
				.from("18:00")
				.to("19:00")
				.at("Microsoft Teams");

		assertThat(gson.toJson(calendar)).isEqualTo(expectedResult);
	}

	@Test
	void expectedAssignEventUsingCalendarBuilder() {
		final Calendar calendar = new CalendarBuilder()
				.add("DSL tutorial")
				.on(2022, 04, 22)
				.from("18:00")
				.to("19:00")
				.at("Microsoft Teams")
				.add("Making use of Patterns")
				.on(2022, 05, 30)
				.from("18:00")
				.to("19:00")
				.at("Microsoft Teams")
				.build();

		assertThat(gson.toJson(calendar)).isEqualTo(expectedResult);
	}

	@Test
	void expectedAssignEventUsingManualFluentCalendar() {
		final Calendar calendar = new com.fluent_dsl.simple.FluentCalendar()
				.add("DSL tutorial")
				.on(2022, 04, 22)
				.from("18:00")
				.to("19:00")
				.at("Microsoft Teams")
				.add("Making use of Patterns")
				.on(2022, 05, 30)
				.from("18:00")
				.to("19:00")
				.at("Microsoft Teams")
				.end();

		assertThat(gson.toJson(calendar)).isEqualTo(expectedResult);
	}

	@Test
	void expectedAssignEventUsingFluentCalendar() {
		final Calendar calendar = new com.fluent_dsl.FluentCalendar()
				.add("DSL tutorial")
				.on(2022, 04, 22)
				.from("18:00")
				.to("19:00")
				.at("Microsoft Teams")
				.add("Making use of Patterns")
				.on(2022, 05, 30)
				.from("18:00")
				.to("19:00")
				.at("Microsoft Teams")
				.end();

		assertThat(gson.toJson(calendar)).isEqualTo(expectedResult);
	}
}