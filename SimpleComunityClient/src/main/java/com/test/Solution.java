package com.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Solution {
	
	static int[] counts(int[] nums, int[] maxes) {
        int[] answer = new int[maxes.length];
        int answrLn = 0;
        
        Arrays.sort(nums);
        
		for(int m : maxes){
			if(nums[nums.length-1] < m){
				answer[answrLn++] = nums.length;
			}else{
	            for(int n = 0; n < nums.length; n++){
					if(nums[n] > m){
						answer[answrLn++] = n;
						break;
					}
				}
			}
		}
		
		return answer;
    }
	
	
    public static void main(String[] args) throws Exception{
    	String str = "maze";
    	URL url = new URL("http://www.omdbapi.com/?s=" + str);
    	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type","application/json");
        InputStream is = connection.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(rd);
        rd.close();

        Object object = jsonObject.get("totalResults");
        if(object != null){
        	System.out.println(object);
        }else{
        	System.out.println(0);
        }
    }
	
}
