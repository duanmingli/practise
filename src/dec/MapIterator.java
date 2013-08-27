package dec;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * 
 * <p>
 * Title: map遍历测试类 /p>
 * 
 * <p>
 * Description: 示例 业务类
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2012
 * </p>
 * 
 * @author dml@2012-12-25
 * @version 1.0
 */

public class MapIterator {

	public static void main(String[] args) {
		String[] str = { "I love you", "You love him", "He loves her",
				"She loves me" };
		Map<Integer, String> m = new HashMap();
		for (int i = 0; i < str.length; i++) {
			m.put(i, str[i]);
		}
		System.out.println("下面是使用useKeySet()方法输出的结果：");
		useKeySet(m);
		System.out.println("下面是使用useEntrySet()方法输出的结果：");
		useEntrySet(m);
		System.out.println("下面是使用useValues()方法输出的结果：");
		useValues(m);
	}

	/**
	 * 1. 使用keySet遍历
	 * 
	 * Set java.util.Map.keySet()
	 * 
	 * Returns a Set view of the keys contained in this map. The set is backed
	 * by the map, so changes to the map are reflected in the set, and
	 * vice-versa. If the map is modified while an iteration over the set is in
	 * progress (except through the iterator's own remove operation), the
	 * results of the iteration are undefined. The set supports element removal,
	 * which removes the corresponding mapping from the map, via the
	 * Iterator.remove, Set.remove, removeAll, retainAll, and clear operations.
	 * It does not support the add or addAll operations.
	 * 
	 * Returns: a set view of the keys contained in this map
	 * 
	 * @param m
	 */
	public static void useKeySet(Map m) {
		Set s = m.keySet();
		Iterator it = s.iterator();
		int Key;
		String value;
		while (it.hasNext()) {
			Key = (Integer) it.next();
			value = (String) m.get(Key);
			System.out.println(Key + ":\t" + value);
		}
	}

	/**
	 * 2.使用entrySet遍历
	 * 
	 * Set java.util.Map.entrySet()
	 * 
	 * Returns a Set view of the mappings contained in this map. The set is
	 * backed by the map, so changes to the map are reflected in the set, and
	 * vice-versa. If the map is modified while an iteration over the set is in
	 * progress (except through the iterator's own remove operation, or through
	 * the setValue operation on a map entry returned by the iterator) the
	 * results of the iteration are undefined. The set supports element removal,
	 * which removes the corresponding mapping from the map, via the
	 * Iterator.remove, Set.remove, removeAll, retainAll and clear operations.
	 * It does not support the add or addAll operations.
	 * 
	 * Returns: a set view of the mappings contained in this map
	 * 
	 * @param m
	 */
	public static void useEntrySet(Map m) {
		Set s = m.entrySet();
		Iterator it = s.iterator();
		Map.Entry entry;
		int Key;
		String value;
		while (it.hasNext()) {
			entry = (Entry) it.next();
			System.out.println(entry.getKey() + ":\t" + entry.getValue());
		}
	}

	/**
	 * 3.使用values遍历
	 * 
	 * Collection<String> java.util.Map.values()
	 * 
	 * 
	 * Returns a Collection view of the values contained in this map. The
	 * collection is backed by the map, so changes to the map are reflected in
	 * the collection, and vice-versa. If the map is modified while an iteration
	 * over the collection is in progress (except through the iterator's own
	 * remove operation), the results of the iteration are undefined. The
	 * collection supports element removal, which removes the corresponding
	 * mapping from the map, via the Iterator.remove, Collection.remove,
	 * removeAll, retainAll and clear operations. It does not support the add or
	 * addAll operations.
	 * 
	 * Returns: a collection view of the values contained in this map
	 * 
	 * @param m
	 */
	public static void useValues(Map<Integer, String> m) {
		Collection c = m.values();
		Iterator it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
