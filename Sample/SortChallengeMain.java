import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Sort Challenge Main Class
public class SortChallengeMain {
	
	public static int menu;
	static SortChallenge scc = new SortChallengeConcrete();

	@SuppressWarnings({ "resource" })
	public static void sortNumbers() {

		Scanner scanner;
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Enter the numbers for sorting. Type any key other than number keys and hit <enter> to complete your input.");
		scanner = new Scanner(System.in);
        List<Integer> arrList = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            arrList.add(scanner.nextInt());
        }

        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
        	arr[i] = arrList.get(i);
        }

		System.out.println("Type 'desc' and hit <enter> for sorting in descending order. Otherwise the default order is ascending.");
        scanner = new Scanner(System.in);
		String asc = scanner.next();

		boolean order = true;
		if (asc.equals("desc")) {
			order = false;
		}
		
		int[] arr1 = scc.simpleSort(arr, order);
		for (int i : arr1) {
			numbers.add(Integer.valueOf(i));
		}
		
		System.out.println(numbers);
	}
	
	@SuppressWarnings({ "resource" })
	public static void getSortFrequency() {

		Scanner scanner;
		System.out.println("Enter numbers. Type any key other than number keys and hit <enter> to complete your input.");
		scanner = new Scanner(System.in);
        List<Integer> arrList = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            arrList.add(scanner.nextInt());
        }

        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
        	arr[i] = arrList.get(i);
        }
		
		scc.printSortedFrequency(arr);
	}

	@SuppressWarnings({ "resource" })
	public static void getNumberOfUniqueValues() {

		Scanner scanner;
		System.out.println("Enter numbers. Type any key other than number keys and hit <enter> to complete your input.");
		scanner = new Scanner(System.in);
        List<Integer> arrList = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            arrList.add(scanner.nextInt());
        }

        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
        	arr[i] = arrList.get(i);
        }

		int NumOfUniqValues = scc.numberOfUniqueValues(arr);
		System.out.println("Number of Unique Values is " + NumOfUniqValues);
	}

	@SuppressWarnings("resource")
	public static int menu()
    {
		System.out.println("**** Number Sorting Functions ****");
        System.out.println("Choose one option from following : ");
        System.out.println("1) Simple Sort");
        System.out.println("2) Print Sorted Frequency");
        System.out.println("3) Print Number Of Unique Values");
        System.out.println("4) Exit");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    public static void main(String[] args)
    {
        while(menu != 4)
        {
            System.out.println();
            menu = menu();
            switch (menu)
            {
                case 1:
                    sortNumbers();
                    break;
                case 2:
                	getSortFrequency();
                    break;
                case 3:
                	getNumberOfUniqueValues();
                    break;
                case 4:
                    break;
            }
        }
    }    
}
