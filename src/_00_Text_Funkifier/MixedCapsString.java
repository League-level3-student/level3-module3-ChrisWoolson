package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String ret = "";
		for (int i = 0; i < s.length(); i++) {
			if (i%2 == 1) {
				char x = s.charAt(i);
				char z = Character.toUpperCase(x);
				ret += z;
			}else {
				char y = s.charAt(i);
				char a = Character.toLowerCase(y);
				ret += a;
						
			}
		}
		System.out.println(ret);
		return ret;
	}

}
