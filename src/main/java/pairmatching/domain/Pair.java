package pairmatching.domain;

import java.util.List;
import java.util.Objects;
import pairmatching.domain.info.Course;
import pairmatching.domain.info.Level;

public class Pair {
    private final List<Crew> crewList;
    private final Course course;
    private final Level level;

    private Pair(List<Crew> crewList, Course course, Level level) {
        this.crewList = crewList;
        this.course = course;
        this.level = level;
    }

    public static Pair from(List<Crew> crewList, Course course, Level level) {
        return new Pair(crewList, course, level);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Pair that = (Pair) o;
        return Objects.equals(crewList, that.crewList) && Objects.equals(course, that.course) && Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crewList, course, level);
    }

}
