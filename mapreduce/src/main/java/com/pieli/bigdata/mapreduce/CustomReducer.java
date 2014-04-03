/**   
* @Title: CustomReducer.java 
* @Package com.pieli.bigdata.mapreduce 
* @Description: TODO
* @author Pie.Li   
* @date 2014-4-1 上午10:04:15 
* @version V1.0   
*/
package com.pieli.bigdata.mapreduce;

import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

/**
 * @author Pie.Li
 *
 */
public class CustomReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> {

	public void reduce(Text key, Iterator<IntWritable> values,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		
		int maxValue = 0;
		while(values.hasNext()){
			maxValue = Math.max(maxValue, values.next().get());
		}
		output.collect(key, new IntWritable(maxValue));
		
		
	}

}
