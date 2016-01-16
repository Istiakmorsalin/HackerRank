import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Permission;

class Calculate {
	BufferedReader br;
	Output output = new Output();

	Calculate() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	int getINTVal() throws NumberFormatException, IOException {
		int value = Integer.parseInt(br.readLine());
		if (value <= 0) {
			throwNumberFormatException();
		}
		return value;
	}

	double getDoubleVal() throws NumberFormatException, IOException {
		double value = Double.parseDouble(br.readLine());
		if (value <= 0) {
			throwNumberFormatException();
		}
		return value;
	}

	void throwNumberFormatException() {
		throw new NumberFormatException("All the values must be positive");
	}

	static Volume get_Vol() {
		return new Volume();
	}
}

class Volume {
	double main(int a) {
		return a * a * a;
	}

	double main(int l, int b, int h) {
		return l * b * h;
	}

	double main(double r) {
		return Math.PI * r * r * r * 2 / 3;
	}

	double main(double r, double h) {
		return Math.PI * r * r * h;
	}
}

class Output {
	void display(double volume) {
		System.out.printf("%.3f\n", volume);
	}
}

