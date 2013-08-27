package dec;

/**
 * 
 * 
 * <p>
 * Title: try_catch_finally测试代码 /p>
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
 * @author dml@2012-12-4
 * @version 1.0
 */
public class TestTryCatchFinaly {

	public static void main(String[] args) {
		System.out.println("test1返回结果：" + new TestTryCatchFinaly().test1());
		
		System.out.println("-------------");
		System.out.println("test2返回结果:" + new TestTryCatchFinaly().test2());
		
		System.out.println("-------------");
		System.out.println("test3返回结果:" + new TestTryCatchFinaly().test3());

	}

	 int test1() {
		int x = 1;
		try {
			System.out.println("try打印：" + x);
			return x;
			// 这句编译不通过
			// System.out.println("try打印：" + x);
		} finally {
			++x;
			System.out.println("finally打印：" + x);
		}
	}

	public int test2() {
		try {
			return 1;
		} finally {
			return 2;
		}
	}

	int test3() {
		try {
			return func1();
		}

		finally {
			return func2();
		}
	}

	int func1() {
		System.out.println("func1被执行");
		return 1;
	}

	int func2() {
		System.out.println("func2被执行");
		return 2;
	}
}
