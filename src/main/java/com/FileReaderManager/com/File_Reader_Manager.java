package com.FileReaderManager.com;

import java.io.IOException;

public class File_Reader_Manager {
	private File_Reader_Manager()
	{
		
	}
  public static File_Reader_Manager get_InstanceFR()
  {
	  File_Reader_Manager reader=new File_Reader_Manager();
	  return reader;
  }
  public ConfigurationReader_propertie get_InstanceCR() throws IOException
  {
	  ConfigurationReader_propertie helper=new ConfigurationReader_propertie();
	  return helper;
  }
}
