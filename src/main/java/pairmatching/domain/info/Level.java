package pairmatching.domain.info;

import java.util.Objects;

public enum Level {
    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private final String name;

    Level(final String name) {
        this.name = name;
    }

    public static Level findBy(String name) {
        for (Level level : Level.values()) {
            if (Objects.equals(level.name, name)) {
                return level;
            }
        }
        return null;
    }
}
