package dec;

/**
 * 
 * 
 * <p>
 * Title: 快速排序实现类 /p>
 * 
 * <p>
 * Description: 示例 业务类
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2012 
 * </p>
 * 
 * 
 * @author dml@2012-12-6
 * @version 1.0
 */
public class QuickSortImpl extends QuickSort {
	public int data[];

	/*
	 * (non-Javadoc)
	 * 
	 * @see dec.QuickSort#partition(int[], int, int)
	 */
	@Override
	protected int partition(int[] sortArray, int low, int high) {
		int key = sortArray[low];

		while (low < high) {
			while (low < high && sortArray[high] >= key)
				high--;
			sortArray[low] = sortArray[high];

			while (low < high && sortArray[low] <= key)
				low++;
			sortArray[high] = sortArray[low];
		}
		sortArray[low] = key;
		return low;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dec.QuickSort#sort(int, int)
	 */
	@Override
	public void sort(int low, int high) {
		if (low < high) {
			int result = partition(data, low, high);
			sort(low, result - 1);
			sort(result + 1, high);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dec.QuickSort#display()
	 */
	@Override
	public void display() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		QuickSortImpl qs = new QuickSortImpl();
		int data[] = { 14, 23, 2, 32, 54, 32, 58, 79, 39, 11 };
		qs.data = data;
		qs.sort(0, qs.data.length - 1);
		qs.display();
	}

}
