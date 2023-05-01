
class ICICI extends RBI {
	public static double saving (float p, float t) {
		// interest in years so divide by 100
		double r = 0.07;
		double a = p * (1 + r * t);
		double si = a - p;
		return si;
	}
	public static double current (float p, float t) {
		// interest in years so divide by 100
		double r = 0.11;
		double ci = p * Math.pow(1+r, t) - p;
		return ci;
	}
}
