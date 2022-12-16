package pairmatching.domain;

import java.util.List;
import java.util.Objects;

public class PairMatching {
    private final List<Pair> pairList;

    private PairMatching(List<Pair> pairList) {
        this.pairList = pairList;
    }

    public static PairMatching from(List<Pair> pairList) {
        return new PairMatching(pairList);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final PairMatching that = (PairMatching) o;
        return Objects.equals(pairList, that.pairList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pairList);
    }

}
