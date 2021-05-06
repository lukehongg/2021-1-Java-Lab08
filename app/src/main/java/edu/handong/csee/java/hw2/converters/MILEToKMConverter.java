package edu.handong.csee.java.hw2.converters;

/**
 * MILEToKMConverter is implements to Convertible(interface)
 * it has 2 fields and 3 methods
 * Each of them works to convert input value(MILE) to KM value
 */
public class MILEToKMConverter implements Convertible{
    private double fromV;
    private double convertedV;

    /**
     * setFromValue has a parameter which is a input value(MILE)
     * it sets fromV to input Value(double fromValue)
     * @param fromValue is original value and setFromValue set fromV to fromValue
     */
    public void setFromValue(double fromValue){
        fromV = fromValue;
    }
    /**
     * getConvertedValue has a return value of convertedV(KM)
     * After executing convert(), there is a converted value in convertedV field
     * and getConvertedvalue() returns convertedV(KM)
     * @return double convertedV(KM)
     */
    public double getConvertedValue(){
        return convertedV;
    }
    /**
     * convert() it literally converts MILE to KM by multiply by 1.6(MILE to KM)
     * and store the converted value in double convertedV
     */
    public void convert(){
        convertedV = fromV*1.6;
    }
}
