import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4Labs {
public static void main (String[] args) {
	
	
	
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i<10; i++) {
		if (i !=9) {
		sb.append(i + "-");
		} else {
			sb.append(i);
			System.out.println(sb);
			
		}
	}
		
		List<String> strings = new ArrayList<String>();
		strings.add("Tom");
		strings.add("Sammy");
		strings.add("John");
		strings.add("Grover");
		strings.add("Elmerfudd");
		
		
		Arrays.asList("Jacob", "Hannah", "Trevor");
	
	
		System.out.println(findShortestName(strings ));
		System.out.println(swapsies(strings));
		System.out.println(combineStrings(strings));
		
		List<String> searchResults = searchIt(strings, "a");
		for (String result : searchResults)
System.out.println(result);		

//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 15, 16, 25, 30, 46);

//List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers); 

//for (List<Integer> list : sortedNumbers) {
//	for (Integer number : list) {
//	System.out.println(number); 
	
//	System.out.println("Next List");
	
List<Integer> stringsLengths = calculateStringLengths(strings);
for (Integer i : stringsLengths) {
	System.out.println(i);
}

	
	Set<String> set = new HashSet<String>();
	set.add("Geese");
	set.add("Green");
	set.add("Jupiter");
	set.add("Neutrino");
	set.add("Wisteria");
	
	Set<Integer> integerSet = new HashSet<Integer>();
	integerSet.add(3);
	integerSet.add(8);
	integerSet.add(7);
	integerSet.add(31);

	Set<Integer> extractedEvens = extractEvens(integerSet);
	for (Integer number : extractedEvens) {
		System.out.println(number + "  -----------");
	}

	
	Map<String, String> dictionary = new HashMap<String, String>();
	dictionary.put("Apple", "Red, green or yellow fruit");
	dictionary.put("Banana", "yellow fruit");
	dictionary.put("Pear", "Not an apple or a banana");
	
	
	String value = lookupValue(dictionary, "Banana");
	System.out.println(value);
	
	

	
Set<String> startsWithJ = findAllThatStartWith (set, 'J');
for (String word : startsWithJ) {
	System.out.println(word);
}
List<String> resultList = convertSetToList(set);
for (String listString : resultList) {
	System.out.println(listString);
	}
}


List<String> trialWord = new ArrayList<String>();

Map<Character, Integer> count = countStartingLetters(trialWord);
public static List<String> convertSetToList(Set<String> set) {
	List<String> results = new ArrayList<String>();
	for (String string : set) {
		results.add(string);
	} return results;
}
		
	public static Map<Character, Integer> countStartingLetters(List<String> list) {
		Map<Character, Integer> results = new HashMap <Character, Integer>();
		for (String string : list) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c, 1);
			} else {
				results.put(c, results.get(c) + 1);
			}
		}
		
		return results;
	}
	
public static String lookupValue(Map<String, String> map, String string) {
	for (String key :map.keySet()) {
		if (key.equals(string)) {
			return map.get(key);
			
		}
	}
	return "";
}

public static Set<Integer> extractEvens(Set<Integer> set) {
	Set <Integer> results = new HashSet<Integer>();
	for (Integer number : set) {
		if (number % 2 == 0) {
			results.add(number);
		}
	} return results;
}


public static Set<String> findAllThatStartWith(Set<String> set, char c) {
	Set<String> result = new HashSet<String>();
	for (String string : set) {
		if (string.charAt(0) ==c) {
			result.add(string);
		}
	}
	
	return result;
	
}

public static List<Integer> calculateStringLengths(List<String> list) {
	List<Integer> lengths = new ArrayList<Integer>();
	for (String string : list) {
		lengths.add(string.length());
	}
	return lengths;
	
	
	
}
public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
	List<List<Integer>> results = new ArrayList<List<Integer>>();
	results.add(new ArrayList<Integer>());
	results.add(new ArrayList<Integer>());
	results.add(new ArrayList<Integer>());
	results.add(new ArrayList<Integer>());
	
	for (Integer number : list) {
		if (number % 2 == 0) {
			results.get(0).add(number);
		}
		if (number % 3 ==0) {
			results.get(1).add(number);
		}
		if (number % 5 == 0) {
			results.get(2).add(number);
		}
		if (number %2 != 0 && number % 3 !=0 && number %5 != 0) {
			results.get(3).add(number);
			
			
			
		}}
	
		return results;
	}
	

public static String findShortestName(List<String> list) {
	String shortest = list.get(0);
	for (String string : list) {
	if (string.length() < shortest.length()) {
		shortest = string;
		
	}
	}
	return shortest;
}

public static List<String> swapsies(List<String> list) {
	String temp = list.get(0);
	list.set(0, list.get(list.size()-1));
	list.set(list.size() - 1, temp);
	return list;
	
}

public static String combineStrings(List<String> strings) {
	StringBuilder result = new StringBuilder();
	for (String string : strings) {
		result.append(string + ", ");
	}
	return result.toString();
}
public static List<String> searchIt(List<String> list, String query) {
	List<String> results = new ArrayList<String>();
	for (String string : list) {
		if (string.contains(query)) {
			results.add(string);
			
		}
	}return results;
} 

}

