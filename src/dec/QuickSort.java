package dec;

/**
 * 
 * 
 * <p>Title: 快速排序 /p>
 *
 * <p>Description: 示例 业务类</p>
 *
 * <p>Copyright: Copyright (c) 2012</p>
 *
 *
 * @author dml@2012-12-6
 * @version 1.0
 */
public abstract class QuickSort {
	protected abstract int partition(int sortArray[], int low, int high);
	public abstract void sort(int low, int high);
	public abstract void display();
}
