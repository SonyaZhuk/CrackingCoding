package leetcode.medium;

import java.util.Iterator;

/**
 * {@link <a href="https://leetcode.com/problems/peeking-iterator/">284. Peeking Iterator</a>}.
 */
public class PeekingIterator implements Iterator<Integer> {
    private Integer next;
    private boolean done = false;
    private Iterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        if (iterator == null)
            throw new UnsupportedOperationException();

        this.iterator = iterator;
        this.next = this.iterator.next();
    }

    public Integer peek() {
        return this.next;
    }

    @Override
    public boolean hasNext() {
        return !done;
    }

    @Override
    public Integer next() {
        Integer result = next;
        if (iterator.hasNext()) {
            next = iterator.next();
        } else {
            next = null;
            done = true;
        }
        return result;
    }
}
