package ins.aiite.adacitin.pageexe;

import ins.aiite.adacitin.locators.SearchHotelLocators;
import ins.aiite.adacitin.locators.SelectHotelLocators;

public class SelectHotelExe extends SearchHotelExe{
	public static void radiobtn(){
		
		click(findElementBy(SelectHotelLocators.radiobtn));
		}
public static void continuebtn(){
		
		click(findElementBy(SelectHotelLocators.continueBtn));
		}
	

}
