public class BmiService {
    public double calculate(double weight, double height) {
        if (weight < 0 || height < 0) weight = 0;
        return weight / (height * height);
    }
}
