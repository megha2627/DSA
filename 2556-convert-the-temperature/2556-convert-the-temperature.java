class Solution {
    public double[] convertTemperature(double celsius) {
        double[] s=new double[2];
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        s[0]=Kelvin;
        s[1]=Fahrenheit;
        return s;
        
    }
}