package com.ots.dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static String getProperty(String key)
	{
		Properties pro=new Properties();
		
		try {
			pro.load(new FileInputStream(new File("./Configuration/config.properties")));
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("couldn't located to file in config dir");
		}
		catch (IOException e)
		{
			System.out.println("couldn't read to file in config dir");
		}
		String value=pro.getProperty(key);
		
		return value;
	}

}
