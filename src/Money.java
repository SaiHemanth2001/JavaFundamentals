import java.math.BigDecimal;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Money {
	public static void main(String[] args) {
		Double d = 1d;
		for (int i = 0; i < 10; i++) {
			d += 0.1;
			System.out.println(d);
		}
		BigDecimal total = new BigDecimal(1);
		for (int i = 0; i < 10; i++) {
			total = total.add(new BigDecimal("0.1"));
			System.out.println(total);

		}
	}

}
