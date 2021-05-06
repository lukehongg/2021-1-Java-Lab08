package edu.handong.csee.java.hw2.converters;

/**
 * KMToMConverter is implements to Convertible(interface)
 * it has 2 fields and 3 methods
 * Each of them works to convert input value(KM) to M(meter) value
 */
public class KMToMConverter implements Convertible{
    private double fromV;
    private double convertedV;

    /**
     * setFromValue has a parameter which is a input value(KM)
     * it sets fromV to input Value(double fromValue)
     * @param fromValue is original value and setFromValue set fromV to fromValue
     */
    public void setFromValue(double fromValue){
        fromV = fromValue;
    }
    /**
     * getConvertedValue has a return value of convertedV(M)
     * After executing convert(), there is a converted value in convertedV field
     * and getConvertedvalue() returns convertedV(M)
     * @return convertedV (M)
     */
    public double getConvertedValue(){
        return convertedV;
    }
    /**
     * convert() it literally converts KM to M by multiply by 1000(KM to M)
     * and store the converted value in double convertedV
     */
    public void convert(){
        convertedV = fromV*1000.0;
    }
}
