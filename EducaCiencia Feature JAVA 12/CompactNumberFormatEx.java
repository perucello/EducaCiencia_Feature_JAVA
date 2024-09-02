import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberFormat nf = CompactNumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.LONG);
		
		System.out.println(nf.format(50000));

	}

}
