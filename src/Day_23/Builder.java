package Day_23;

public class Builder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("ABC");
		sb.append("CDE");
		
		String content = sb.toString();
		System.out.println(content);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("I").append("love").append("java");
		sb2.delete(0, 2);
		
		String content2 = sb2.toString();
		System.out.println(content2);
		
		StringBuilder sb3 = new StringBuilder("I will start and get cetified");
		int i = sb3.indexOf("and");
		System.out.println(i);
		sb3.insert(i, "hard ");
		System.out.println(sb3);
		
		
		
		
		
		
	}

}
