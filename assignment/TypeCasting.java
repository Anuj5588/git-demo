
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//imlicit,widening,small-big,automatic
		byte roomn_no=112;
		int RoomNo=roomn_no;
		System.out.println(RoomNo);
		short salary=20000;
		int $salary=salary;
		System.out.println($salary);
		byte num=66;
		short newnum=num;
		System.out.println(newnum);
				
		//narrowing, Small-Big,explicit,manual
		int age=29;
		byte newage=(byte)age;
		System.out.println(newage);
		double pi=3.14159;
		float newpi=(float)pi;
		System.out.println(newpi);
				

	}

}
