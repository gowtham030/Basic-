package gowtham;

public class Find_largenumber {

	public static void main(String[] args) {
	int mark=88;
	if (mark>=0&&mark<=39) {
		System.out.println("Grade'F'");
	}
	else if (mark>=40&&mark<59) {
		System.out.println("Grade'E'");
	}
	else if(mark>=60&&mark<69) {
		System.out.println("Grade'D'");
	}
	else if(mark>=70&&mark<79) {
		System.out.println("Grade'c'");
	}
	else if(mark>=80&&mark<89) {
		System.out.println("Grade'B'");
	}
	else if (mark>=90&&mark<99) {
		System.out.println("Grade'A'");
	}
	else {
		System.out.println("Invalidmark");
	}
	}
}
