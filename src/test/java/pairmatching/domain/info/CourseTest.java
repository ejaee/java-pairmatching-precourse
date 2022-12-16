package pairmatching.domain.info;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CourseTest {

    @Test
    void values() {
        assertThat(Course.findBy("백엔드")).isEqualByComparingTo(Course.BACKEND);
        assertThat(Course.findBy("프론트엔드")).isEqualByComparingTo(Course.FRONTEND);
    }

}