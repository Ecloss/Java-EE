package poi;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExportExcel03 {


    //public void exportInfo(){
    //    try {
    //
    //        String myId = getRequest().getParameter("myId");
    //
    //        MyOrder my = endOrderService.getMyOrderMyId(myId);	//订单信息
    //        List<MyOrderProductBean> mylist = endOrderService.getOrderInfos(myId); //订单产品详情
    //        if(my!=null || mylist!=null){
    //            //web对象
    //            HSSFWorkbook wb = new HSSFWorkbook();
    //
    //            //创建表头等
    //            HSSFSheet sheet = wb.createSheet(my.getOrder_title());
    //            //省略省略/....
    //
    //            //以下是关键
    //            HttpServletResponse response = ServletActionContext.getResponse();
    //            response.reset();
    //            OutputStream output = getRepsonse().getOutputStream();
    //            response.setHeader("Content-disposition", "attachment; filename=Info.xls");
    //            response.setContentType("application/msexcel");
    //            wb.write(output);
    //            output.close();
    //            System.out.println("成功创建excel文件");
    //        }
    //    }catch (Exception e) {
    //        e.printStackTrace();
    //    }


        public static void main(String[] args) {



    }

}
