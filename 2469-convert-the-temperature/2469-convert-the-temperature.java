class Solution {
    public double[] convertTemperature(double celsius) {
        // double d[] = new double[2];
        // d[0] = 273.15 + celsius;
        // d[1] = celsius * 1.80 + 32.00;
        // return d;
        return new double[]{celsius + 273.15, (celsius * 1.80) + 32.00};
    }
}