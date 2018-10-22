import java.util.Scanner;

public class MealRecieptProject 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.println("Welcome to the tax and tip calculator.");
		System.out.println("Please press enter to continue...");
		user.nextLine();
		
		System.out.println("Please enter the name of your appetizer: ");
		String app = user.nextLine();
		System.out.println("Please enter the cost of your appetizer: ");
		String appCost = user.nextLine();
		
		System.out.println("Please enter the name of your entree: ");
		String ent = user.nextLine();
		System.out.println("Please enter the cost of your entree: ");
		String entCost = user.nextLine();
		
		System.out.println("Please enter the name of your dessert: ");
		String des = user.nextLine();
		System.out.println("Please enter the cost of your dessert: ");
		String desCost = user.nextLine();
		
		System.out.println("Please enter the name of your drink: ");
		String dri = user.nextLine();
		System.out.println("Please enter the cost of your drink: ");
		String driCost = user.nextLine();
		
		System.out.println("Please enter the percentage you would like to tip(as a decimal): ");
		String tip = user.nextLine();
		
		double appC = Double.parseDouble(appCost);
		double entC = Double.parseDouble(entCost);
		double desC = Double.parseDouble(desCost);
		double driC = Double.parseDouble(driCost);
		double tipC = Double.parseDouble(tip);
		
		double sub = appC + entC + desC + driC;
		double tipA = sub * tipC;
		
		double tax = 0.06 * sub;
		
		System.out.println("Item          Price");
		System.out.println(app + "         " + appCost);
		System.out.println(ent + "         " + entCost);
		System.out.println(des + "         " + desCost);
		System.out.println(dri + "         " + driCost);
		System.out.println();
		System.out.println("Subtotal         " + sub);
		System.out.println("Tax         " + tax);
		System.out.println("Tip " + tipC * 100 + "%         " + tipA);
		System.out.println("Total         " + (sub + tipA + tax));
	}

}
