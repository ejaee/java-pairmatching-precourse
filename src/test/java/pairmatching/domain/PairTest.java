package pairmatching.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import pairmatching.domain.info.Course;
import pairmatching.domain.info.Level;

class PairTest {

    @Test
    void create() {
        // given
        final String name = "ejae";
        final Course course = Course.BACKEND;
        final Level level = Level.LEVEL1;

        // when
        Pair pair = Pair.from(name, course, level);

        // then
        assertThat(pair).isNotNull();
    }

    @Test
    void testEquals() {
        // given
        final String name = "ejae";
        final Course course = Course.BACKEND;
        final Level level = Level.LEVEL1;

        // when
        Pair pair = Pair.from(name, course, level);

        // then
        assertThat(pair).isEqualTo(Pair.from(name, course, level));
    }
}