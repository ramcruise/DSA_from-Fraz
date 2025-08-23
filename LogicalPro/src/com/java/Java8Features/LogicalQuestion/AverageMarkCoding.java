package com.java.Java8Features.LogicalQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageMarkCoding {

	public static void main(String[] args) {
		
		Map<String,List<Integer>> result = new HashMap<>();
		
		String[] input = {"1-english:45","2-english:45","3-hindi:60","4-hindi:90","5-math:90"};
		
		for(int i=0;i<input.length;i++) {
			int index = input[i].indexOf("-");
			String subAndMarksSubstring = input[i].substring(index+1);
			String[] subAndMarksArray = subAndMarksSubstring.split(":");
			
			if(result.containsKey(subAndMarksArray[0])) {
				List<Integer> list = result.get(subAndMarksArray[0]);
				list.add(Integer.parseInt(subAndMarksArray[1]));
			}else {
				List<Integer> list = new ArrayList<>();
				list.add(Integer.parseInt(subAndMarksArray[1]));
				result.put(subAndMarksArray[0], list);
				
			}
			
		}
		result.forEach((subject,markList) -> {
			double avg = markList.stream().mapToDouble(d -> d).average().orElse(0.0);
			
			System.out.println(subject + " Average "+avg);
		});
		
	}

}
