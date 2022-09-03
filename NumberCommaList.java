package mypkg;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberCommaList {
	public static void main(String[] args) {

		String s = String.format("最小文字数指定：文字[%8S]整数[%8d]浮動小数点[%12f]",
                "FORMAT",12345,1234.5);
		System.out.println(s);
	
		String st = new String("98765432199.45");
		String test = String.format("浮動test[%s]",
				st);
		System.out.println(test);
		
		float ftest= Float.parseFloat("98765432199.45F");
		System.out.println(ftest);

		String t = String.format("浮動小数点[%,.2f]",
				ftest);
		System.out.println(t);
		
		NumberFormat nf = NumberFormat.getNumberInstance();
		String k = nf.format(Long.parseLong("98765432199"));
		System.out.println(k);
		
		Double df = Double.parseDouble("12398765432199.45321");
		DecimalFormat df3 = new DecimalFormat("###,###.00000000");
		String s3 = df3.format(df);
		System.out.println(s3);
	}
}
