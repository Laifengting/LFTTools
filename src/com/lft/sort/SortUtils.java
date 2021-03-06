package com.lft.sort;

public class SortUtils {
	//【1. 冒泡排序】
	
	/**
	 * byte 型数组【冒泡排序】
	 * 占 8 位
	 * @param a byte 型数组
	 * @return byte 型数组
	 */
	public static byte[] bubbleSort(byte[] a) {
		byte temp;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					flag = true;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}
		return a;
	}
	
	/**
	 * char 型数组【冒泡排序】
	 * 占 16 位
	 * @param a char 型数组
	 * @return char 型数组
	 */
	public static char[] bubbleSort(char[] a) {
		char temp;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					flag = true;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}
		return a;
	}
	
	/**
	 * short 型数组【冒泡排序】
	 * 占 16 位
	 * @param a short 型数组
	 * @return short 型数组
	 */
	public static short[] bubbleSort(short[] a) {
		short temp;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					flag = true;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}
		return a;
	}
	
	/**
	 * int 型数组【冒泡排序】
	 * 占 32 位
	 * @param a int 型数组
	 * @return int 型数组
	 */
	public static int[] bubbleSort(int[] a) {
		int temp;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					flag = true;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}
		return a;
	}
	
	/**
	 * long 型数组【冒泡排序】
	 * 占 64 位
	 * @param a long 型数组
	 * @return long 型数组
	 */
	public static long[] bubbleSort(long[] a) {
		long temp;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					flag = true;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}
		return a;
	}
	
	/**
	 * float 型数组【冒泡排序】
	 * 占 32 位
	 * @param a float 型数组
	 * @return float 型数组
	 */
	public static float[] bubbleSort(float[] a) {
		float temp;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					flag = true;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}
		return a;
	}
	
	/**
	 * double 型数组【冒泡排序】
	 * 占 64 位
	 * @param a double 型数组
	 * @return double 型数组
	 */
	public static double[] bubbleSort(double[] a) {
		double temp;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					flag = true;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}
		return a;
	}
	
	//【2. 选择排序】
	
	/**
	 * byte 型数组【选择排序】
	 * 占 8 位
	 * @param a byte 型数组
	 * @return byte 型数组
	 */
	public static byte[] selectionSort(byte[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			byte min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					minIndex = j;
					min = a[j];
				}
			}
			if (minIndex != i) {
				a[minIndex] = a[i];
				a[i] = min;
			}
		}
		return a;
	}
	
	/**
	 * char 型数组【选择排序】
	 * 占 16 位
	 * @param a char 型数组
	 * @return char 型数组
	 */
	public static char[] selectionSort(char[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			char min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					minIndex = j;
					min = a[j];
				}
			}
			if (minIndex != i) {
				a[minIndex] = a[i];
				a[i] = min;
			}
		}
		return a;
	}
	
	/**
	 * short 型数组【选择排序】
	 * 占 16 位
	 * @param a short 型数组
	 * @return short 型数组
	 */
	public static short[] selectionSort(short[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			short min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					minIndex = j;
					min = a[j];
				}
			}
			if (minIndex != i) {
				a[minIndex] = a[i];
				a[i] = min;
			}
		}
		return a;
	}
	
	/**
	 * int 型数组【选择排序】
	 * 占 32 位
	 * @param a int 型数组
	 * @return int 型数组
	 */
	public static int[] selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			int min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					minIndex = j;
					min = a[j];
				}
			}
			if (minIndex != i) {
				a[minIndex] = a[i];
				a[i] = min;
			}
		}
		return a;
	}
	
	/**
	 * long 型数组【选择排序】
	 * 占 64 位
	 * @param a long 型数组
	 * @return long 型数组
	 */
	public static long[] selectionSort(long[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			long min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					minIndex = j;
					min = a[j];
				}
			}
			if (minIndex != i) {
				a[minIndex] = a[i];
				a[i] = min;
			}
		}
		return a;
	}
	
	/**
	 * float 型数组【选择排序】
	 * 占 32 位
	 * @param a float 型数组
	 * @return float 型数组
	 */
	public static float[] selectionSort(float[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			float min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					minIndex = j;
					min = a[j];
				}
			}
			if (minIndex != i) {
				a[minIndex] = a[i];
				a[i] = min;
			}
		}
		return a;
	}
	
	/**
	 * double 型数组【选择排序】
	 * 占 64 位
	 * @param a double 型数组
	 * @return double 型数组
	 */
	public static double[] selectionSort(double[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			double min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					minIndex = j;
					min = a[j];
				}
			}
			if (minIndex != i) {
				a[minIndex] = a[i];
				a[i] = min;
			}
		}
		return a;
	}
	
	//【3. 插入排序】
	
	/**
	 * byte 型数组【插入排序】
	 * 占 8 位
	 * @param a byte 型数组
	 * @return byte 型数组
	 */
	public static byte[] insertSort(byte[] a) {
		byte insertValue;
		int insertIndex;
		for (int i = 1; i < a.length; i++) {
			insertValue = a[i];
			insertIndex = i - 1;
			while (insertIndex <= 0 && a[insertIndex] > insertValue) {
				a[insertIndex + 1] = a[insertIndex];
				insertIndex--;
			}
			// if (insertIndex + 1 == i) { // 不要这个判断，加了耗时，耗内存。
			a[insertIndex + 1] = insertValue;
			// }
		}
		return a;
	}
	
	/**
	 * char 型数组【插入排序】
	 * 占 16 位
	 * @param a char 型数组
	 * @return char 型数组
	 */
	public static char[] insertSort(char[] a) {
		char insertValue;
		int insertIndex;
		for (int i = 1; i < a.length; i++) {
			insertValue = a[i];
			insertIndex = i - 1;
			while (insertIndex <= 0 && a[insertIndex] > insertValue) {
				a[insertIndex + 1] = a[insertIndex];
				insertIndex--;
			}
			a[insertIndex + 1] = insertValue;
		}
		return a;
	}
	
	/**
	 * short 型数组【插入排序】
	 * 占 16 位
	 * @param a short 型数组
	 * @return short 型数组
	 */
	public static short[] insertSort(short[] a) {
		short insertValue;
		int insertIndex;
		for (int i = 1; i < a.length; i++) {
			insertValue = a[i];
			insertIndex = i - 1;
			while (insertIndex <= 0 && a[insertIndex] > insertValue) {
				a[insertIndex + 1] = a[insertIndex];
				insertIndex--;
			}
			a[insertIndex + 1] = insertValue;
		}
		return a;
	}
	
	/**
	 * int 型数组【插入排序】
	 * 占 32 位
	 * @param a int 型数组
	 * @return int 型数组
	 */
	public static int[] insertSort(int[] a) {
		int insertValue;
		int insertIndex;
		for (int i = 1; i < a.length; i++) {
			insertValue = a[i];
			insertIndex = i - 1;
			while (insertIndex <= 0 && a[insertIndex] > insertValue) {
				a[insertIndex + 1] = a[insertIndex];
				insertIndex--;
			}
			a[insertIndex + 1] = insertValue;
		}
		return a;
	}
	
	/**
	 * long 型数组【插入排序】
	 * 占 64 位
	 * @param a long 型数组
	 * @return long 型数组
	 */
	public static long[] insertSort(long[] a) {
		long insertValue;
		int insertIndex;
		for (int i = 1; i < a.length; i++) {
			insertValue = a[i];
			insertIndex = i - 1;
			while (insertIndex <= 0 && a[insertIndex] > insertValue) {
				a[insertIndex + 1] = a[insertIndex];
				insertIndex--;
			}
			if (insertIndex + 1 == i) {
				a[insertIndex + 1] = insertValue;
			}
		}
		return a;
	}
	
	/**
	 * float 型数组【插入排序】
	 * 占 32 位
	 * @param a float 型数组
	 * @return float 型数组
	 */
	public static float[] insertSort(float[] a) {
		float insertValue;
		int insertIndex;
		for (int i = 1; i < a.length; i++) {
			insertValue = a[i];
			insertIndex = i - 1;
			while (insertIndex <= 0 && a[insertIndex] > insertValue) {
				a[insertIndex + 1] = a[insertIndex];
				insertIndex--;
			}
			a[insertIndex + 1] = insertValue;
		}
		return a;
	}
	
	/**
	 * double 型数组【插入排序】
	 * 占 64 位
	 * @param a double 型数组
	 * @return double 型数组
	 */
	public static double[] insertSort(double[] a) {
		double insertValue;
		int insertIndex;
		for (int i = 1; i < a.length; i++) {
			insertValue = a[i];
			insertIndex = i - 1;
			while (insertIndex >= 0 && a[insertIndex] > insertValue) {
				a[insertIndex + 1] = a[insertIndex];
				insertIndex--;
			}
			a[insertIndex + 1] = insertValue;
		}
		return a;
	}
	
	//【4. 希尔排序】
	
	/**
	 * byte 型数组【希尔排序】
	 * 占 8 位
	 * @param a byte 型数组
	 * @return byte 型数组
	 */
	public static byte[] sheelSort(byte[] a) {
		// 【移位式】
		byte temp;
		for (int gap = a.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < a.length; i++) {
				int j = i;
				temp = a[j];
				if (a[j] < a[j - gap]) {
					while (j - gap >= 0 && temp < a[j - gap]) {
						// 移动
						a[j] = a[j - gap];
						j -= gap;
					}
					// 退出while 循环时就给temp找到插入的位置
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	/**
	 * char 型数组【希尔排序】
	 * 占 16 位
	 * @param a char 型数组
	 * @return char 型数组
	 */
	public static char[] sheelSort(char[] a) {
		// 【移位式】
		char temp;
		for (int gap = a.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < a.length; i++) {
				int j = i;
				temp = a[j];
				if (a[j] < a[j - gap]) {
					while (j - gap >= 0 && temp < a[j - gap]) {
						// 移动
						a[j] = a[j - gap];
						j -= gap;
					}
					// 退出while 循环时就给temp找到插入的位置
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	/**
	 * short 型数组【希尔排序】
	 * 占 16 位
	 * @param a short 型数组
	 * @return short 型数组
	 */
	public static short[] sheelSort(short[] a) {
		// 【移位式】
		short temp;
		for (int gap = a.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < a.length; i++) {
				int j = i;
				temp = a[j];
				if (a[j] < a[j - gap]) {
					while (j - gap >= 0 && temp < a[j - gap]) {
						// 移动
						a[j] = a[j - gap];
						j -= gap;
					}
					// 退出while 循环时就给temp找到插入的位置
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	/**
	 * int 型数组【希尔排序】
	 * 占 32 位
	 * @param a int 型数组
	 * @return int 型数组
	 */
	public static int[] sheelSort(int[] a) {
		// 【移位式】
		int temp;
		for (int gap = a.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < a.length; i++) {
				int j = i;
				temp = a[j];
				if (a[j] < a[j - gap]) {
					while (j - gap >= 0 && temp < a[j - gap]) {
						// 移动
						a[j] = a[j - gap];
						j -= gap;
					}
					// 退出while 循环时就给temp找到插入的位置
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	/**
	 * long 型数组【希尔排序】
	 * 占 64 位
	 * @param a long 型数组
	 * @return long 型数组
	 */
	public static long[] sheelSort(long[] a) {
		// 【移位式】
		long temp;
		for (int gap = a.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < a.length; i++) {
				int j = i;
				temp = a[j];
				if (a[j] < a[j - gap]) {
					while (j - gap >= 0 && temp < a[j - gap]) {
						// 移动
						a[j] = a[j - gap];
						j -= gap;
					}
					// 退出while 循环时就给temp找到插入的位置
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	/**
	 * float 型数组【希尔排序】
	 * 占 32 位
	 * @param a float 型数组
	 * @return float 型数组
	 */
	public static float[] sheelSort(float[] a) {
		// 【移位式】
		float temp;
		for (int gap = a.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < a.length; i++) {
				int j = i;
				temp = a[j];
				if (a[j] < a[j - gap]) {
					while (j - gap >= 0 && temp < a[j - gap]) {
						// 移动
						a[j] = a[j - gap];
						j -= gap;
					}
					// 退出while 循环时就给temp找到插入的位置
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	/**
	 * double 型数组【希尔排序】
	 * 占 64 位
	 * @param a double 型数组
	 * @return double 型数组
	 */
	public static double[] sheelSort(double[] a) {
		// 【移位式】
		double temp;
		for (int gap = a.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < a.length; i++) {
				int j = i;
				temp = a[j];
				if (a[j] < a[j - gap]) {
					while (j - gap >= 0 && temp < a[j - gap]) {
						// 移动
						a[j] = a[j - gap];
						j -= gap;
					}
					// 退出while 循环时就给temp找到插入的位置
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	//【5. 快速排序】
	
	/**
	 * byte 型数组【快速排序】
	 * 占 8 位
	 * @param a byte 型数组
	 * @return byte 型数组
	 */
	public static byte[] quickSort(byte[] a, int left, int right) {
		byte pivot = a[(right + left) / 2], temp;
		int l = left;
		int r = right;
		while (l < r) {
			while (a[l] < pivot) {
				l += 1;
			}
			while (a[r] > pivot) {
				r -= 1;
			}
			if (l >= r) {
				break;
			}
			temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			
			if (a[l] == pivot) {
				r -= 1;
			}
			if (a[r] == pivot) {
				l += 1;
			}
		}
		if (l == r) {
			l += 1;
			r -= 1;
		}
		if (left < r) {
			quickSort(a, left, r);
		}
		if (right > l) {
			quickSort(a, l, right);
		}
		return a;
	}
	
	/**
	 * char 型数组【快速排序】
	 * 占 16 位
	 * @param a char 型数组
	 * @return char 型数组
	 */
	public static char[] quickSort(char[] a, int left, int right) {
		char pivot = a[(right + left) / 2], temp;
		int l = left;
		int r = right;
		while (l < r) {
			while (a[l] < pivot) {
				l += 1;
			}
			while (a[r] > pivot) {
				r -= 1;
			}
			if (l >= r) {
				break;
			}
			temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			
			if (a[l] == pivot) {
				r -= 1;
			}
			if (a[r] == pivot) {
				l += 1;
			}
		}
		if (l == r) {
			l += 1;
			r -= 1;
		}
		if (left < r) {
			quickSort(a, left, r);
		}
		if (right > l) {
			quickSort(a, l, right);
		}
		return a;
	}
	
	/**
	 * short 型数组【快速排序】
	 * 占 16 位
	 * @param a short 型数组
	 * @return short 型数组
	 */
	public static short[] quickSort(short[] a, int left, int right) {
		short pivot = a[(right + left) / 2], temp;
		int l = left;
		int r = right;
		while (l < r) {
			while (a[l] < pivot) {
				l += 1;
			}
			while (a[r] > pivot) {
				r -= 1;
			}
			if (l >= r) {
				break;
			}
			temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			
			if (a[l] == pivot) {
				r -= 1;
			}
			if (a[r] == pivot) {
				l += 1;
			}
		}
		if (l == r) {
			l += 1;
			r -= 1;
		}
		if (left < r) {
			quickSort(a, left, r);
		}
		if (right > l) {
			quickSort(a, l, right);
		}
		return a;
	}
	
	/**
	 * int 型数组【快速排序】
	 * 占 32 位
	 * @param a int 型数组
	 * @return int 型数组
	 */
	public static int[] quickSort(int[] a, int left, int right) {
		int pivot = a[(right + left) / 2], temp;
		int l = left;
		int r = right;
		while (l < r) {
			while (a[l] < pivot) {
				l += 1;
			}
			while (a[r] > pivot) {
				r -= 1;
			}
			if (l >= r) {
				break;
			}
			temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			
			if (a[l] == pivot) {
				r -= 1;
			}
			if (a[r] == pivot) {
				l += 1;
			}
		}
		if (l == r) {
			l += 1;
			r -= 1;
		}
		if (left < r) {
			quickSort(a, left, r);
		}
		if (right > l) {
			quickSort(a, l, right);
		}
		return a;
	}
	
	/**
	 * long 型数组【快速排序】
	 * 占 64 位
	 * @param a long 型数组
	 * @return long 型数组
	 */
	public static long[] quickSort(long[] a, int left, int right) {
		long pivot = a[(right + left) / 2], temp;
		int l = left;
		int r = right;
		while (l < r) {
			while (a[l] < pivot) {
				l += 1;
			}
			while (a[r] > pivot) {
				r -= 1;
			}
			if (l >= r) {
				break;
			}
			temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			
			if (a[l] == pivot) {
				r -= 1;
			}
			if (a[r] == pivot) {
				l += 1;
			}
		}
		if (l == r) {
			l += 1;
			r -= 1;
		}
		if (left < r) {
			quickSort(a, left, r);
		}
		if (right > l) {
			quickSort(a, l, right);
		}
		return a;
	}
	
	/**
	 * float 型数组【快速排序】
	 * 占 32 位
	 * @param a float 型数组
	 * @return float 型数组
	 */
	public static float[] quickSort(float[] a, int left, int right) {
		float pivot = a[(right + left) / 2], temp;
		int l = left;
		int r = right;
		while (l < r) {
			while (a[l] < pivot) {
				l += 1;
			}
			while (a[r] > pivot) {
				r -= 1;
			}
			if (l >= r) {
				break;
			}
			temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			
			if (a[l] == pivot) {
				r -= 1;
			}
			if (a[r] == pivot) {
				l += 1;
			}
		}
		if (l == r) {
			l += 1;
			r -= 1;
		}
		if (left < r) {
			quickSort(a, left, r);
		}
		if (right > l) {
			quickSort(a, l, right);
		}
		return a;
	}
	
	/**
	 * double 型数组【快速排序】
	 * 占 64 位
	 * @param a double 型数组
	 * @return double 型数组
	 */
	public static double[] quickSort(double[] a, int left, int right) {
		double pivot = a[(right + left) / 2], temp;
		int l = left;
		int r = right;
		while (l < r) {
			while (a[l] < pivot) {
				l += 1;
			}
			while (a[r] > pivot) {
				r -= 1;
			}
			if (l >= r) {
				break;
			}
			temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			
			if (a[l] == pivot) {
				r -= 1;
			}
			if (a[r] == pivot) {
				l += 1;
			}
		}
		if (l == r) {
			l += 1;
			r -= 1;
		}
		if (left < r) {
			quickSort(a, left, r);
		}
		if (right > l) {
			quickSort(a, l, right);
		}
		return a;
	}
	
	//【6. 归并排序】
	
	/**
	 * byte 型数组【归并排序】
	 * 占 8 位
	 * @param a byte 型数组
	 * @return byte 型数组
	 */
	public static byte[] mergeSort(byte[] a, int left, int right, byte[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			// 向左递归进行分解
			mergeSort(a, left, mid, temp);
			// 向右递归进行分解
			mergeSort(a, mid + 1, right, temp);
			// 合并
			merge(a, left, mid, right, temp);
		}
		return a;
	}
	
	/**
	 * 合并的方法
	 * @param a     排序的原始数组
	 * @param left  左边有序序列的初始索引
	 * @param mid   中间索引
	 * @param right 右边索引
	 * @param temp  中转数组
	 * @return 合并排序好的有序序列
	 */
	public static byte[] merge(byte[] a, int left, int mid, int right, byte[] temp) {
		
		// 初始化 l 左边有序序列的初始索引
		int l = left;
		// 初始化 r 右边有序序列的初始索引
		int r = mid + 1;
		// 初始化 指向 temp 数组的索引
		int tempIndex = 0;
		// 1. 先把左右两边（有序）的数据按照规则填充到 temp 数组
		// 直到左右两边的有序序列，有一边处理完成为止。
		while (l <= mid && r <= right) {
			// 如果左边的小于等于右边的，将左边的复制到 temp[tempIndex]上。然后 左边右移一位，tempIndex 也右移一位。
			if (a[l] <= a[r]) {
				temp[tempIndex] = a[l];
				tempIndex++;
				l++;
			}
			// 如果右边的大于左边的，将右边的复制到 temp[tempIndex]上。然后 右边右移一位，tempIndex 也右移一位。
			else {
				temp[tempIndex] = a[r];
				tempIndex++;
				r++;
			}
		}
		
		// 2. 交另外一边的依次复制到 temp 数组中。
		// 左边没有复制完。
		while (l <= mid) {
			temp[tempIndex] = a[l];
			tempIndex++;
			l++;
		}
		// 右边没有复制完。
		while (r <= right) {
			temp[tempIndex] = a[r];
			tempIndex++;
			r++;
		}
		
		// 3. 再将 temp 数组复制给原始数组。注意：每次都拷贝所有的。
		tempIndex = 0;
		int tempLeft = left;
		// System.out.println("tempLeft: " + tempLeft + "  right: " + right);
		while (tempLeft <= right) {
			a[tempLeft] = temp[tempIndex];
			tempIndex++;
			tempLeft++;
		}
		return a;
	}
	
	/**
	 * char 型数组【快速排序】
	 * 占 16 位
	 * @param a char 型数组
	 * @return char 型数组
	 */
	public static char[] mergeSort(char[] a, int left, int right, char[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			// 向左递归进行分解
			mergeSort(a, left, mid, temp);
			// 向右递归进行分解
			mergeSort(a, mid + 1, right, temp);
			// 合并
			merge(a, left, mid, right, temp);
		}
		return a;
	}
	
	/**
	 * 合并的方法
	 * @param a     排序的原始数组
	 * @param left  左边有序序列的初始索引
	 * @param mid   中间索引
	 * @param right 右边索引
	 * @param temp  中转数组
	 * @return 合并排序好的有序序列
	 */
	public static char[] merge(char[] a, int left, int mid, int right, char[] temp) {
		
		// 初始化 l 左边有序序列的初始索引
		int l = left;
		// 初始化 r 右边有序序列的初始索引
		int r = mid + 1;
		// 初始化 指向 temp 数组的索引
		int tempIndex = 0;
		// 1. 先把左右两边（有序）的数据按照规则填充到 temp 数组
		// 直到左右两边的有序序列，有一边处理完成为止。
		while (l <= mid && r <= right) {
			// 如果左边的小于等于右边的，将左边的复制到 temp[tempIndex]上。然后 左边右移一位，tempIndex 也右移一位。
			if (a[l] <= a[r]) {
				temp[tempIndex] = a[l];
				tempIndex++;
				l++;
			}
			// 如果右边的大于左边的，将右边的复制到 temp[tempIndex]上。然后 右边右移一位，tempIndex 也右移一位。
			else {
				temp[tempIndex] = a[r];
				tempIndex++;
				r++;
			}
		}
		
		// 2. 交另外一边的依次复制到 temp 数组中。
		// 左边没有复制完。
		while (l <= mid) {
			temp[tempIndex] = a[l];
			tempIndex++;
			l++;
		}
		// 右边没有复制完。
		while (r <= right) {
			temp[tempIndex] = a[r];
			tempIndex++;
			r++;
		}
		
		// 3. 再将 temp 数组复制给原始数组。注意：每次都拷贝所有的。
		tempIndex = 0;
		int tempLeft = left;
		// System.out.println("tempLeft: " + tempLeft + "  right: " + right);
		while (tempLeft <= right) {
			a[tempLeft] = temp[tempIndex];
			tempIndex++;
			tempLeft++;
		}
		return a;
	}
	
	/**
	 * short 型数组【快速排序】
	 * 占 16 位
	 * @param a short 型数组
	 * @return short 型数组
	 */
	public static short[] mergeSort(short[] a, int left, int right, short[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			// 向左递归进行分解
			mergeSort(a, left, mid, temp);
			// 向右递归进行分解
			mergeSort(a, mid + 1, right, temp);
			// 合并
			merge(a, left, mid, right, temp);
		}
		return a;
	}
	
	/**
	 * 合并的方法
	 * @param a     排序的原始数组
	 * @param left  左边有序序列的初始索引
	 * @param mid   中间索引
	 * @param right 右边索引
	 * @param temp  中转数组
	 * @return 合并排序好的有序序列
	 */
	public static short[] merge(short[] a, int left, int mid, int right, short[] temp) {
		
		// 初始化 l 左边有序序列的初始索引
		int l = left;
		// 初始化 r 右边有序序列的初始索引
		int r = mid + 1;
		// 初始化 指向 temp 数组的索引
		int tempIndex = 0;
		// 1. 先把左右两边（有序）的数据按照规则填充到 temp 数组
		// 直到左右两边的有序序列，有一边处理完成为止。
		while (l <= mid && r <= right) {
			// 如果左边的小于等于右边的，将左边的复制到 temp[tempIndex]上。然后 左边右移一位，tempIndex 也右移一位。
			if (a[l] <= a[r]) {
				temp[tempIndex] = a[l];
				tempIndex++;
				l++;
			}
			// 如果右边的大于左边的，将右边的复制到 temp[tempIndex]上。然后 右边右移一位，tempIndex 也右移一位。
			else {
				temp[tempIndex] = a[r];
				tempIndex++;
				r++;
			}
		}
		
		// 2. 交另外一边的依次复制到 temp 数组中。
		// 左边没有复制完。
		while (l <= mid) {
			temp[tempIndex] = a[l];
			tempIndex++;
			l++;
		}
		// 右边没有复制完。
		while (r <= right) {
			temp[tempIndex] = a[r];
			tempIndex++;
			r++;
		}
		
		// 3. 再将 temp 数组复制给原始数组。注意：每次都拷贝所有的。
		tempIndex = 0;
		int tempLeft = left;
		// System.out.println("tempLeft: " + tempLeft + "  right: " + right);
		while (tempLeft <= right) {
			a[tempLeft] = temp[tempIndex];
			tempIndex++;
			tempLeft++;
		}
		return a;
	}
	
	/**
	 * int 型数组【快速排序】
	 * 占 32 位
	 * @param a int 型数组
	 * @return int 型数组
	 */
	public static int[] mergeSort(int[] a, int left, int right, int[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			// 向左递归进行分解
			mergeSort(a, left, mid, temp);
			// 向右递归进行分解
			mergeSort(a, mid + 1, right, temp);
			// 合并
			merge(a, left, mid, right, temp);
		}
		return a;
	}
	
	/**
	 * 合并的方法
	 * @param a     排序的原始数组
	 * @param left  左边有序序列的初始索引
	 * @param mid   中间索引
	 * @param right 右边索引
	 * @param temp  中转数组
	 * @return 合并排序好的有序序列
	 */
	public static int[] merge(int[] a, int left, int mid, int right, int[] temp) {
		
		// 初始化 l 左边有序序列的初始索引
		int l = left;
		// 初始化 r 右边有序序列的初始索引
		int r = mid + 1;
		// 初始化 指向 temp 数组的索引
		int tempIndex = 0;
		// 1. 先把左右两边（有序）的数据按照规则填充到 temp 数组
		// 直到左右两边的有序序列，有一边处理完成为止。
		while (l <= mid && r <= right) {
			// 如果左边的小于等于右边的，将左边的复制到 temp[tempIndex]上。然后 左边右移一位，tempIndex 也右移一位。
			if (a[l] <= a[r]) {
				temp[tempIndex] = a[l];
				tempIndex++;
				l++;
			}
			// 如果右边的大于左边的，将右边的复制到 temp[tempIndex]上。然后 右边右移一位，tempIndex 也右移一位。
			else {
				temp[tempIndex] = a[r];
				tempIndex++;
				r++;
			}
		}
		
		// 2. 交另外一边的依次复制到 temp 数组中。
		// 左边没有复制完。
		while (l <= mid) {
			temp[tempIndex] = a[l];
			tempIndex++;
			l++;
		}
		// 右边没有复制完。
		while (r <= right) {
			temp[tempIndex] = a[r];
			tempIndex++;
			r++;
		}
		
		// 3. 再将 temp 数组复制给原始数组。注意：每次都拷贝所有的。
		tempIndex = 0;
		int tempLeft = left;
		// System.out.println("tempLeft: " + tempLeft + "  right: " + right);
		while (tempLeft <= right) {
			a[tempLeft] = temp[tempIndex];
			tempIndex++;
			tempLeft++;
		}
		return a;
	}
	
	/**
	 * long 型数组【快速排序】
	 * 占 64 位
	 * @param a long 型数组
	 * @return long 型数组
	 */
	public static long[] mergeSort(long[] a, int left, int right, long[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			// 向左递归进行分解
			mergeSort(a, left, mid, temp);
			// 向右递归进行分解
			mergeSort(a, mid + 1, right, temp);
			// 合并
			merge(a, left, mid, right, temp);
		}
		return a;
	}
	
	/**
	 * 合并的方法
	 * @param a     排序的原始数组
	 * @param left  左边有序序列的初始索引
	 * @param mid   中间索引
	 * @param right 右边索引
	 * @param temp  中转数组
	 * @return 合并排序好的有序序列
	 */
	public static long[] merge(long[] a, int left, int mid, int right, long[] temp) {
		
		// 初始化 l 左边有序序列的初始索引
		int l = left;
		// 初始化 r 右边有序序列的初始索引
		int r = mid + 1;
		// 初始化 指向 temp 数组的索引
		int tempIndex = 0;
		// 1. 先把左右两边（有序）的数据按照规则填充到 temp 数组
		// 直到左右两边的有序序列，有一边处理完成为止。
		while (l <= mid && r <= right) {
			// 如果左边的小于等于右边的，将左边的复制到 temp[tempIndex]上。然后 左边右移一位，tempIndex 也右移一位。
			if (a[l] <= a[r]) {
				temp[tempIndex] = a[l];
				tempIndex++;
				l++;
			}
			// 如果右边的大于左边的，将右边的复制到 temp[tempIndex]上。然后 右边右移一位，tempIndex 也右移一位。
			else {
				temp[tempIndex] = a[r];
				tempIndex++;
				r++;
			}
		}
		
		// 2. 交另外一边的依次复制到 temp 数组中。
		// 左边没有复制完。
		while (l <= mid) {
			temp[tempIndex] = a[l];
			tempIndex++;
			l++;
		}
		// 右边没有复制完。
		while (r <= right) {
			temp[tempIndex] = a[r];
			tempIndex++;
			r++;
		}
		
		// 3. 再将 temp 数组复制给原始数组。注意：每次都拷贝所有的。
		tempIndex = 0;
		int tempLeft = left;
		// System.out.println("tempLeft: " + tempLeft + "  right: " + right);
		while (tempLeft <= right) {
			a[tempLeft] = temp[tempIndex];
			tempIndex++;
			tempLeft++;
		}
		return a;
	}
	
	/**
	 * float 型数组【快速排序】
	 * 占 32 位
	 * @param a float 型数组
	 * @return float 型数组
	 */
	public static float[] mergeSort(float[] a, int left, int right, float[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			// 向左递归进行分解
			mergeSort(a, left, mid, temp);
			// 向右递归进行分解
			mergeSort(a, mid + 1, right, temp);
			// 合并
			merge(a, left, mid, right, temp);
		}
		return a;
	}
	
	/**
	 * 合并的方法
	 * @param a     排序的原始数组
	 * @param left  左边有序序列的初始索引
	 * @param mid   中间索引
	 * @param right 右边索引
	 * @param temp  中转数组
	 * @return 合并排序好的有序序列
	 */
	public static float[] merge(float[] a, int left, int mid, int right, float[] temp) {
		
		// 初始化 l 左边有序序列的初始索引
		int l = left;
		// 初始化 r 右边有序序列的初始索引
		int r = mid + 1;
		// 初始化 指向 temp 数组的索引
		int tempIndex = 0;
		// 1. 先把左右两边（有序）的数据按照规则填充到 temp 数组
		// 直到左右两边的有序序列，有一边处理完成为止。
		while (l <= mid && r <= right) {
			// 如果左边的小于等于右边的，将左边的复制到 temp[tempIndex]上。然后 左边右移一位，tempIndex 也右移一位。
			if (a[l] <= a[r]) {
				temp[tempIndex] = a[l];
				tempIndex++;
				l++;
			}
			// 如果右边的大于左边的，将右边的复制到 temp[tempIndex]上。然后 右边右移一位，tempIndex 也右移一位。
			else {
				temp[tempIndex] = a[r];
				tempIndex++;
				r++;
			}
		}
		
		// 2. 交另外一边的依次复制到 temp 数组中。
		// 左边没有复制完。
		while (l <= mid) {
			temp[tempIndex] = a[l];
			tempIndex++;
			l++;
		}
		// 右边没有复制完。
		while (r <= right) {
			temp[tempIndex] = a[r];
			tempIndex++;
			r++;
		}
		
		// 3. 再将 temp 数组复制给原始数组。注意：每次都拷贝所有的。
		tempIndex = 0;
		int tempLeft = left;
		// System.out.println("tempLeft: " + tempLeft + "  right: " + right);
		while (tempLeft <= right) {
			a[tempLeft] = temp[tempIndex];
			tempIndex++;
			tempLeft++;
		}
		return a;
	}
	
	/**
	 * double 型数组【快速排序】
	 * 占 64 位
	 * @param a double 型数组
	 * @return double 型数组
	 */
	public static double[] mergeSort(double[] a, int left, int right, double[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			// 向左递归进行分解
			mergeSort(a, left, mid, temp);
			// 向右递归进行分解
			mergeSort(a, mid + 1, right, temp);
			// 合并
			merge(a, left, mid, right, temp);
		}
		return a;
	}
	
	/**
	 * 合并的方法
	 * @param a     排序的原始数组
	 * @param left  左边有序序列的初始索引
	 * @param mid   中间索引
	 * @param right 右边索引
	 * @param temp  中转数组
	 * @return 合并排序好的有序序列
	 */
	public static double[] merge(double[] a, int left, int mid, int right, double[] temp) {
		
		// 初始化 l 左边有序序列的初始索引
		int l = left;
		// 初始化 r 右边有序序列的初始索引
		int r = mid + 1;
		// 初始化 指向 temp 数组的索引
		int tempIndex = 0;
		// 1. 先把左右两边（有序）的数据按照规则填充到 temp 数组
		// 直到左右两边的有序序列，有一边处理完成为止。
		while (l <= mid && r <= right) {
			// 如果左边的小于等于右边的，将左边的复制到 temp[tempIndex]上。然后 左边右移一位，tempIndex 也右移一位。
			if (a[l] <= a[r]) {
				temp[tempIndex] = a[l];
				tempIndex++;
				l++;
			}
			// 如果右边的大于左边的，将右边的复制到 temp[tempIndex]上。然后 右边右移一位，tempIndex 也右移一位。
			else {
				temp[tempIndex] = a[r];
				tempIndex++;
				r++;
			}
		}
		
		// 2. 交另外一边的依次复制到 temp 数组中。
		// 左边没有复制完。
		while (l <= mid) {
			temp[tempIndex] = a[l];
			tempIndex++;
			l++;
		}
		// 右边没有复制完。
		while (r <= right) {
			temp[tempIndex] = a[r];
			tempIndex++;
			r++;
		}
		
		// 3. 再将 temp 数组复制给原始数组。注意：每次都拷贝所有的。
		tempIndex = 0;
		int tempLeft = left;
		// System.out.println("tempLeft: " + tempLeft + "  right: " + right);
		while (tempLeft <= right) {
			a[tempLeft] = temp[tempIndex];
			tempIndex++;
			tempLeft++;
		}
		return a;
	}
	
}
