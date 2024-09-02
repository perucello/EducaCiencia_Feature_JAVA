
public class TextBlocksEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "<html>\r\n" + 
				"   <head>\r\n" + 
				"	      <link href='/css/style.css' rel='stylesheet' />\r\n" + 
				"   </head>\r\n" + 
				"   <body>\r\n" + 
				"	      <h1>Hello World</h1>\r\n" + 
				"   </body>\r\n" + 
				"</html>";
		
		String text2 =  """
				<html>
				   <head>
				      <link href='/css/style.css' rel='stylesheet' />
				   </head>
				   <body>
				      <h1>Hello World</h1>
				   </body>
				</html>
				""";
		
		System.out.println(text2);

	}

}



