package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider 1
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\OpenCart_LoginData.xlsx";//taking xl file from testData
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
				
		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
	return logindata;//returning two dimension array
				
	}
	
	//DataProvider 2
	@DataProvider(name="registerData")
	public String [][] getRegData() throws IOException
	{
		String path=".\\testData\\OpenCart_RegisterData.xlsx";//taking xl file from testData
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
				
		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
	return logindata;//returning two dimension array
				
	}
	
	//DataProvider 3
	@DataProvider(name="ForgotPwdData")
	public String [][] getForgotPwdData() throws IOException
	{
		String path=".\\testData\\OpenCart_ForgotPwdData.xlsx";//taking xl file from testData
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
				
		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
	return logindata;//returning two dimension array
				
	}
	
	//DataProvider 4
	//DataProvider 3
		@DataProvider(name="SearchData")
		public String [][] getSearchData() throws IOException
		{
			String path=".\\testData\\OpenCart_SearchData.xlsx";//taking xl file from testData
			
			ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
			
			int totalrows=xlutil.getRowCount("Sheet1");	
			int totalcols=xlutil.getCellCount("Sheet1",1);
					
			String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
			
			for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
			{		
				for(int j=0;j<totalcols;j++)  //0    i is rows j is col
				{
					logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
				}
			}
		return logindata;//returning two dimension array
					
		}
}