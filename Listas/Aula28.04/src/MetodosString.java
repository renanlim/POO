import java.util.List;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "A casa e bonita";
		String k[] = a.split("bo");
		String j[] = a.split(" ");
		System.out.println(k.length);
		System.out.println(j.length);
//		List u = Utils.getList();
//		double somaSal = 0, mediaSal = 0, sal;
//		int id;
		
		for(int i = 0; i < j.length; i++) {
			//System.out.println(k[i]);
			System.out.println(j[i]);
//			String x = (String)u.get(i);
//			String func[] = x.split("#");
//			sal = Double.parseDouble(func[2]);
//			id = Integer.parseInt(func[1]);
//			somaSal+= sal;
//			mediaSal = somaSal/ u.size();

		}
//		System.out.println(mediaSal);
		
		
		
//		String a = "a casa bonita";
//		String f = " ";
//		char u[] = a.toCharArray();
//		
//		for(int i = 0; i < u.length; i++) {
//			if(u[i] == 'a') {
//				f = f + "4";
//			}else {
//				f = f + u[i];
//			}
//		}
//		System.out.println(f);

	}

}
