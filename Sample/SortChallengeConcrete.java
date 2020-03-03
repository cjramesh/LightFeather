import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortChallengeConcrete implements SortChallenge {

	@Override
	public int[] simpleSort(int[] list, boolean ascending) {
		int[] arr;
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i : list) {
			numbers.add(Integer.valueOf(i));
		}
		if (ascending) {
			Collections.sort(numbers);
		}
		else {
			Collections.sort(numbers, Collections.reverseOrder());
		}	
		arr = numbers.stream()
				 .mapToInt(Integer::intValue)
				 .toArray();
		return arr;
	}

	@Override
	public void printSortedFrequency(int[] list) {
		LinkedHashMap<Integer, Integer> lkhmp = new LinkedHashMap<>();
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i : list) {
			numbers.add(Integer.valueOf(i));
		}
		Collections.sort(numbers);

		// Traverse through array elements and 
        // count frequencies 
		for (int i = 0; i < numbers.size(); i++) 
        { 
            if (lkhmp.containsKey(numbers.get(i)))  
            { 
            	lkhmp.put(numbers.get(i), lkhmp.get(numbers.get(i)) + 1); 
            }  
            else
            { 
            	lkhmp.put(numbers.get(i), 1); 
            } 
        }

		// Traverse through map and print frequencies 
        for (Map.Entry<Integer, Integer> entry : lkhmp.entrySet()) 
        { 
        	int freq = entry.getValue();
        	String timeStr = "times";
        	if (freq < 2) {
        		timeStr = "time";
        	}
            System.out.println(entry.getKey() + " appears " + freq + " " + timeStr); 
        }		
	}

	@Override
	public int numberOfUniqueValues(int[] list) {
		LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i : list) {
			numbers.add(Integer.valueOf(i));
		}
		Collections.sort(numbers);

		// Traverse through array elements and 
        // count frequencies 
		for (int i = 0; i < numbers.size(); i++) 
        { 
            if (mp.containsKey(numbers.get(i)))  
            { 
                mp.put(numbers.get(i), mp.get(numbers.get(i)) + 1); 
            }  
            else
            { 
                mp.put(numbers.get(i), 1); 
            } 
        }		
		return mp.entrySet().size();
	}
}
