package pairmatching.domain;

import java.util.Objects;

public class Crew {
    private final String name;

    private Crew(String name) {
        this.name = name;
    }

    public static Crew from(String name) {
        return new Crew(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Crew that = (Crew) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
