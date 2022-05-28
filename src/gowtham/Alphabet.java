package gowtham;

public class Alphabet {

	public static void main(String[] args) {
	char alp='8';
	if (alp>='A'&&alp<='Z') {
	System.out.println("Upper case");
	}
	else if(alp>='a'&&alp<='z') {
    System.out.println("Lowercase");
	}
	else if(alp>='0'&&alp<='9') {
		System.out.println("Number");
	}
	else {
		System.out.print("Special character");
	}
	}

}
