package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String rek = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' ) {
				rek += s.charAt(i);
			}
		}
		
		
		System.out.println(rek);
		return rek;
		
	}
	
	
}
