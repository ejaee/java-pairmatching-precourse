package pairmatching.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pairmatching.domain.info.Course;
import pairmatching.domain.info.Level;

class PairMatchingTest {
    private List<Crew> crewList1 = Arrays.asList(Crew.from("a"), Crew.from("A"));
    private List<Crew> crewList2 = Arrays.asList(Crew.from("c"), Crew.from("C"));
    private Course course;
    private Level level;

    // given
    @BeforeEach
    void setUp() {
        crewList1 = Arrays.asList(Crew.from("a"), Crew.from("A"));
        crewList2 = Arrays.asList(Crew.from("c"), Crew.from("C"));
        course = Course.BACKEND;
        level = Level.LEVEL1;
    }

    @Test
    void create() {

        // when
        Pair pair1 = Pair.from(crewList1, course, level);
        Pair pair2 = Pair.from(crewList2, course, level);
        PairMatching pairMatching = PairMatching.from(Arrays.asList(pair1, pair2));

        // then
        assertThat(pairMatching).isNotNull();
    }

    @Test
    void testEquals() {

        // when
        Pair pair1 = Pair.from(crewList1, course, level);
        Pair pair2 = Pair.from(crewList2, course, level);
        PairMatching pairMatching = PairMatching.from(Arrays.asList(pair1, pair2));

        // then
        assertThat(pairMatching).isEqualTo(PairMatching.from(Arrays.asList(pair1, pair2)));
    }
}