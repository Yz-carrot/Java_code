package salary;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		// TODO: 给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { new SalaryIncome(7500), new RoyaltyIncome(12000) };
		System.out.println(totalTax(incomes));
	}
	public static double totalTax(Income...income){
		double total = 0;
		// TODO:
		for(Income incomes:income){
			total=total+incomes.getTax();
		}
		return total;
	}

}
