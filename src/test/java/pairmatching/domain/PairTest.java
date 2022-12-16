package pairmatching.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import pairmatching.domain.info.Course;
import pairmatching.domain.info.Level;

class PairTest {

    @Test
    void create() {
        // given
        final List<Crew> crewList = Arrays.asList(Crew.from("ejae"), Crew.from("amanda"));
        final Course course = Course.BACKEND;
        final Level level = Level.LEVEL1;

        // when
        Pair pair = Pair.from(crewList, course, level);

        // then
        assertThat(pair).isNotNull();
    }

    @Test
    void testEquals() {
        // given
        final List<Crew> crewList = Arrays.asList(Crew.from("ejae"), Crew.from("amanda"));
        final Course course = Course.BACKEND;
        final Level level = Level.LEVEL1;

        // when
        Pair pair = Pair.from(crewList, course, level);

        // then
        assertThat(pair).isEqualTo(Pair.from(crewList, course, level));
    }
}