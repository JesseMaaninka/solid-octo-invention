package fi.arcada.codechallenge;

public class Statistics {
    public static double calcMean(double[] array) {
        double sum = 0;
        double arrayMean = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        arrayMean = sum / array.length;
        return arrayMean;
    }
}
