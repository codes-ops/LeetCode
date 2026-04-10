class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr = new double[2];

        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.8) + 32;
        arr[0] = kelvin;
        arr[1] = fahrenheit;
        return arr;
        
    }
}