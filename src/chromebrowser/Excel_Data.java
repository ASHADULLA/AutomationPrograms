package chromebrowser;

import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel_Data {

	public static void main(String[] args) throws Exception {
	//open excel file for reading
		File f=new File("myfile.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		
	//Open excel file for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
	
	//Data driven from 2nd row (index 1)
	// 1st row index is 0 have names of columns
		for(int i=1;i<nour;i++) //increment row wise
		{
			int x=Integer.parseInt(rsh.getCell(0,i).getContents()); //first column,first row
			int y=Integer.parseInt(rsh.getCell(1,i).getContents()); //second column, first row
			int z=x+y;
			Number n=new Number(2,i,z);
			wsh.addCell(n);
		}
		wwb.write();
		wwb.close();
		rwb.close();
	}

}
