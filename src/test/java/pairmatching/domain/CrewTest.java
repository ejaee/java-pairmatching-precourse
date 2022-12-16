package pairmatching.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CrewTest {

    @Test
    void create() {
        // given
        final String name = "ejae";

        // when
        Crew crew = Crew.from(name);

        // then
        assertThat(crew).isNotNull();
    }

    @Test
    void testEquals() {
        // given
        final String name = "ejae";

        // when
        Crew crew = Crew.from(name);

        // then
        assertThat(crew).isEqualTo(Crew.from(name));
    }

}