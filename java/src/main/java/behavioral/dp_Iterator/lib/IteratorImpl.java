package behavioral.dp_Iterator.lib;

import behavioral.dp_Iterator.lib.Aggregate;
import behavioral.dp_Iterator.lib.Iterator;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author archmagece
 * @since 2017-01-14 18
 */
@Slf4j
public class IteratorImpl<T> implements Iterator<T> {

	private final Aggregate<T> aggregate;
	private final AtomicInteger aint = new AtomicInteger(0);

	public IteratorImpl(Aggregate<T> aggregate){
		this.aggregate = aggregate;
	}

	@Override
	public boolean hasNext() {
		return aint.intValue() < aggregate.size();
	}

	@Override
	public T next() {
		return aggregate.get(aint.getAndIncrement());
	}
}
