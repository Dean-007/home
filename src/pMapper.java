import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class pMapper extends MapReduceBase implements Mapper<LongWritable,Text,Text,IntWritable> {
	static int count =0;
	private Text word = new Text();
	@Override
	public void map(LongWritable key, Text value,
			OutputCollector<Text, IntWritable> output, Reporter arg3)
			throws IOException {
		 
          String str = value.toString();
          StringTokenizer itr = new StringTokenizer(str," ");
        
          while(itr.hasMoreTokens())
        	  {
        	 // String token = itr.nextToken();
        	  word.set(itr.nextToken());
        	  
 			 output.collect(word, new IntWritable(1));
         
          
	}}
}




	