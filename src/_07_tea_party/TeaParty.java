package _07_tea_party;

public class TeaParty {

	public String welcome(String name, boolean isFemale, boolean knighted) {
		StringBuilder Peoples = new StringBuilder();
		Peoples.append("Hello ");
		
		if (isFemale) {
			Peoples.append("Ms. ");
		} else {
			if (knighted) {
				Peoples.append("Sir ");
			} else {
				Peoples.append("Mr. ");
			}
		}
		Peoples.append(name);
		return Peoples.toString();
		
		
		
		
		// "Hello Ms. Austen"
		// "Hello Mr. Orwell"
		// "Hello Sir Isaac Newton"
		
		//

	}

}
