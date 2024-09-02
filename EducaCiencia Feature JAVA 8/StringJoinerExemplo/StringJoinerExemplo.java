import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoinerExemplo {

	public static void main(String[] args) {
		String nomes = " João, Pedro, Maria, Ana, Paulo";
		
		StringTokenizer st = new StringTokenizer(nomes, ",");

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		/****************************************************/
		
		StringJoiner sj = new StringJoiner(", ");
		
		sj.add("João");
		sj.add("Pedro");
		sj.add("Maria");
		sj.add("Ana");
		sj.add("Paulo");
		
		System.out.println(sj);

	}

}
