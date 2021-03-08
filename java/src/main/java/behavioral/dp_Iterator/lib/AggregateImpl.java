package behavioral.dp_Iterator.lib;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-14 18
 *
 * jdk11: Collection
 */
@Slf4j
public class AggregateImpl<T> implements Aggregate<T> {

	private final T[] elements;

	public AggregateImpl(T ... elements){
		this.elements = elements;
	}

	@Override
	public Iterator<T> iterator() {
		return new IteratorImpl<>(this);
	}

	@Override
	public T get(int idx) {
		return elements[idx];
	}

	@Override
	public int size() {
		return elements.length;
	}

}
