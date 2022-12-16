package pairmatching.domain;

import java.util.Objects;
import pairmatching.domain.info.Course;
import pairmatching.domain.info.Level;

public class Pair {
    private final Crew crew;
    private final Course course;
    private final Level level;

    private Pair(String name, Course course, Level level) {
        this.crew = Crew.from(name);
        this.course = course;
        this.level = level;
    }

    public static Pair from(String name, Course course, Level level) {
        return new Pair(name, course, level);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Pair that = (Pair) o;
        return Objects.equals(crew, that.crew) && Objects.equals(course, that.course) && Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crew, course, level);
    }

}
