package controller;

final public class resp {
   public double standardDeviation =0.0;
    public int maxValue;
    public int minValue;

    public resp(double SD, int maxValue, int minValue){
        this.maxValue=maxValue;
        this.minValue=minValue;
        this.standardDeviation=SD;
    }
}
