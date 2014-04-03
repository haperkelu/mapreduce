/**   
* @Title: CustomMapper.java 
* @Package com.pieli.bigdata.mapreduce 
* @Description: TODO
* @author Pie.Li   
* @date 2014-4-1 上午9:23:29 
* @version V1.0   
*/
package com.pieli.bigdata.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

/**
 * @author Pie.Li
 *
 */



public class CustomMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {

	public void map(LongWritable key, Text value,
			OutputCollector<Text, IntWritable> collect, Reporter reporter)
			throws IOException {
		
		String line = value.toString().trim();
		String[] tokens = line.split("\\s+");
		if(tokens == null || tokens.length != 2){
			return;
		}
		int intValue = 0;
		try {
			intValue = Integer.parseInt(tokens[0]);
		} catch (NumberFormatException e) {
			return;
		}
		collect.collect(new Text(String.valueOf(intValue)), new IntWritable(Integer.parseInt(tokens[1])));
	}	
	
}