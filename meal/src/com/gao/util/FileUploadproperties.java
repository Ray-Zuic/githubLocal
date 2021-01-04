package com.gao.util;

import java.util.HashMap;
import java.util.Map;

public class FileUploadproperties {
	
	private Map<String, String> properties = new HashMap<>();
	private FileUploadproperties() {
		
	}
	
	private static FileUploadproperties instance = new FileUploadproperties();
	
	public static FileUploadproperties getInstance() {
		return instance;
	}
	
	public void addProperty(String propertyName,String propertyValue) {
		properties.put(propertyName, propertyValue);
	}
	
	public String getProperty(String propertyName) {
		return properties.get(propertyName);
	}
}
