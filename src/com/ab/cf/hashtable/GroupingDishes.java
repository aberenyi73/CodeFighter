/**
 * 
 */
package com.ab.cf.hashtable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author berenyia
 *
 */
public class GroupingDishes {

	public String[][] groupingDishes(String[][] dishes) {

		// ingredient to dish name map
		Hashtable<String, List<String>> ht = new Hashtable<>();
		for (String[] dish : dishes) {
			String dishName = dish[0];
			for (int i = 1; i < dish.length; i++) {
				String ingredient = dish[i];
				List<String> dishList = ht.get(ingredient);
				if (dishList == null) {
					dishList = new ArrayList<>();
					ht.put(ingredient, dishList);
				}
				dishList.add(dishName);
			}
		}

		// create arrays
		// find out how long the array should be
		Iterator<String> it1 = ht.keySet().iterator();
		int size = 0;
		while (it1.hasNext()) {
			String ingredient = it1.next();

			// get dishes
			List<String> dishList = ht.get(ingredient);
			if (dishList.size() > 1)
				size++;

		}

		String[][] answer = new String[size][];

		// sort ingredients
		SortedSet<String> ingredientSet = new TreeSet<>(ht.keySet());
		Iterator<String> it = ingredientSet.iterator();
		int ing = 0;
		while (it.hasNext()) {
			String ingredient = it.next();

			// get dishes
			List<String> dishList = ht.get(ingredient);
			if (dishList.size() <= 1)
				continue;

			// sort dishList
			dishList.sort(String.CASE_INSENSITIVE_ORDER);

			// add to array
			answer[ing] = new String[dishList.size() + 1];
			answer[ing][0] = ingredient;
			System.arraycopy(dishList.toArray(new String[dishList.size()]), 0, answer[ing], 1, dishList.size());

			ing++;
		}

		return answer;
	}
}
