package nov;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 * 
 * <p>
 * Title: 定时任务测试代码 /p>
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
 * @author dml@2012-11-29
 * @version 1.0
 */
public class TimerTest extends TimerTask {
	/**
	 * 此计时器任务要执行的操作。
	 */
	public void run() {
		Date executeTime = new Date(this.scheduledExecutionTime());
		System.out.println("本次任务执行的时间是" + executeTime);
	}
	
	  public static void main(String[] args) {
          Timer timer = new Timer();
          TimerTask task = new TimerTest();
          timer.schedule(task, 500L, 1000L);
  }
}
