package calculationWithMethod;

public class CalculationMethod {
	public int first;
	public int second;
	public String zn;
	public CalculationMethod(int i, int j, String znak) {
		first = i;
		second = j;
		zn = znak;
	}
	public int resultU () {
		return first * second;
	}
	public float resultD () {
		return first / second;
	}
	public int resultP () {
		return first + second;
	}
	public int resultM () {
		return first - second;
	}
}
