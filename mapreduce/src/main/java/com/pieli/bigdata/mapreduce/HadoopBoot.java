/**   
* @Title: HadoopBoot.java 
* @Package com.pieli.bigdata.mapreduce 
* @Description: TODO
* @author Pie.Li   
* @date 2014-4-1 上午10:34:41 
* @version V1.0   
*/
package com.pieli.bigdata.mapreduce;

import java.io.IOException;
import java.util.Calendar;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.TextOutputFormat;

/**
 * @author Pie.Li
 *
 */
public class HadoopBoot {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		final String inputPath = "hdfs://localhost:9000/temp.txt";
		final String outputPath = "hdfs://localhost:9000/result" + Calendar.getInstance().getTimeInMillis();
		JobConf conf = new JobConf(HadoopBoot.class); 
		conf.setJobName("Max Number");
		FileInputFormat.addInputPath(conf, new Path(inputPath)); 
		FileOutputFormat.setOutputPath(conf, new Path(outputPath));
		
		conf.setOutputFormat(TextOutputFormat.class);
		conf.set("mapred.textoutputformat.separator", ",");
		conf.setMapperClass(CustomMapper.class); 
		conf.setReducerClass(CustomReducer.class);
		conf.setCombinerClass(CustomReducer.class);
		conf.setOutputKeyClass(Text.class); conf.setOutputValueClass(IntWritable.class);
		JobClient.runJob(conf);
		
	}

}
