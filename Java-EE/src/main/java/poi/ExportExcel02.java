package poi;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *  Created  by Ecloss on 2018/7/12
 *  用程序的方法来导出数据
 */
public class ExportExcel02 {

    public static void main(String[] args) {

        //  web对象
        HSSFWorkbook wb = new HSSFWorkbook();
        //  创建表头等
        HSSFSheet sheet = wb.createSheet("test1");
        //  创建行
        HSSFRow row = sheet.createRow(1);

        //  创建列
        HSSFCell cell = row.createCell(0);

        HSSFCell cell2 = row.createCell(2);
        cell.setCellValue("嗯哼");
        cell2.setCellValue("我是要写入的值");
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 3));

        try {
            FileOutputStream output = new FileOutputStream("F:\\xiaobai1.xlsx");
            wb.write(output);
            output.flush();
            System.out.println("成功创建Excel文件");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
