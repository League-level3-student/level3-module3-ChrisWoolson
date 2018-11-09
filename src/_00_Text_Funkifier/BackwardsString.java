package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String ret = "";
		for (int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			ret += c;
		}
		System.out.println(ret);
		return ret;
	}

}
