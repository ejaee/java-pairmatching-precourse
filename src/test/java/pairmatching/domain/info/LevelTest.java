package pairmatching.domain.info;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LevelTest {
    @Test
    void values() {
        assertThat(Level.findBy("레벨1")).isEqualByComparingTo(Level.LEVEL1);
        assertThat(Level.findBy("레벨2")).isEqualByComparingTo(Level.LEVEL2);
        assertThat(Level.findBy("레벨3")).isEqualByComparingTo(Level.LEVEL3);
        assertThat(Level.findBy("레벨4")).isEqualByComparingTo(Level.LEVEL4);
        assertThat(Level.findBy("레벨5")).isEqualByComparingTo(Level.LEVEL5);
    }

}