package pairmatching.domain.info;

import java.util.Objects;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private final String name;

    Course(final String name) {
        this.name = name;
    }

    public static Course findBy(String name) {
        for (Course course : Course.values()) {
            if (Objects.equals(course.name, name)) {
                return course;
            }
        }
        return null;
    }
}
