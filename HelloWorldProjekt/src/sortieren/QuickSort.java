package sortieren;

public class QuickSort {

	static int[] zahlen = { 4, 2, 5, 9, 6, 10, 9, 7 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i : zahlen)
			System.out.println(i);

		
		quicksort(0, zahlen.length - 1);
		for (int i : zahlen)
			System.out.println(i);

	}

	static void quicksort(int links, int rechts) {

		if (links < rechts) {

			int teiler = teile(links, rechts);

			quicksort(links, teiler - 1);

			quicksort(teiler + 1, rechts);
			
			

		}
	}

	private static int teile(int links, int rechts) {
		int i = links;
		int j = rechts - 1;
		int pivot = zahlen[rechts];

		do {
			while (links < rechts - 1 && links < zahlen[rechts]) {
				i = i + 1;
			}

			while (rechts - 1 > links && rechts - 1 >= zahlen[rechts]) {
				j = j - 1;

			}

			if (links > rechts) {
				int help = zahlen[i];
				zahlen[i] = zahlen[rechts];
				zahlen[rechts] = help;

			}

		} while (i < j);
		if (zahlen[i] > pivot) {
			int help = zahlen[i];
			zahlen[i] = zahlen[pivot];
			zahlen[pivot] = help;

			

		}
		return i;

	}

}
