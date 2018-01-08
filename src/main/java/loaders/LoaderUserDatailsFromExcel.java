package loaders;

import entity.User;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoaderUserDatailsFromExcel {

    public static User loadFromExcel(String file) throws FileNotFoundException, IOException {
        User user = null;

        XSSFWorkbook wb  = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheet("UserInfo");
        for (int i = 0; i < sheet.getLastRowNum()+1;) {
            XSSFRow row = sheet.getRow(i);

            try{
                String mail = row.getCell(0).getStringCellValue();
                String password = row.getCell(1).getStringCellValue();
                user = new User(mail,password);
                i++;
            }
            catch(NullPointerException e){
                break;
            }
        }
        System.out.println(user.toString());
        wb.close();
        return user;

    }

}
