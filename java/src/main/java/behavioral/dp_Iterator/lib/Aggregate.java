package behavioral.dp_Iterator.lib;

/**
 * @author archmagece
 * @since 2017-01-11 22
 *
 * jdk11: Iterable
 */
public interface Aggregate<T> {
	Iterator<T> iterator();
	T get(int idx);
	int size();
}
