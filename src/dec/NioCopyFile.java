package dec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 
 * 
 * <p>
 * Title:  nio测试(二)文件读取、输入输出
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
 * @author dml@2012-12-21
 * @version 1.0
 */
public class NioCopyFile {
	public static void main(String[] args) throws Exception {
		String infile = "D:\\test.sql";
		String outfile = "D:\\test.txt";
		// 获取源文件和目标文件的输入输出流
		FileInputStream fin = new FileInputStream(infile);
		FileOutputStream fout = new FileOutputStream(outfile);
		// 获取输入输出通道
		FileChannel fcin = fin.getChannel();
		FileChannel fcout = fout.getChannel();
		// 创建缓冲区，分配1024字节
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		while (true) {
			// clear方法重设缓冲区，使它可以接受读入的数据
			buffer.clear();
			// 从输入通道中将数据读到缓冲区
			int r = fcin.read(buffer);
			System.out.println(buffer);
			// read方法返回读取的字节数，可能为零，如果该通道已到达流的末尾，则返回-1
			if (r == -1) {
				break;
			}
			// flip方法让缓冲区可以将新读入的数据写入另一个通道，将缓存字节数组的指针设置为数组的开始序列即数组下标0
			buffer.flip();
			// 从输出通道中将数据写入缓冲区
			fcout.write(buffer);
		}
	}
}
