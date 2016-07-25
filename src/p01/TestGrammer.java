package p01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestGrammer {

	public static void main(String[] args) {
		String regEx = "[\\u4e00-\\u9fa5]";
		Pattern p = Pattern.compile(regEx);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("a.txt"))));
			String str = br.readLine();
			while(str !=null){
				Matcher m = p.matcher(str);
				if(str.startsWith("msgstr") && !m.find()){
					System.out.println(str);
					System.out.println();
				}
//				if(str.startsWith("msgstr"))
//					System.out.println(str);
				str = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	



}
