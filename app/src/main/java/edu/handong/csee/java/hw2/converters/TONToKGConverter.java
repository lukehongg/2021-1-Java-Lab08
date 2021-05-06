package edu.handong.csee.java.hw2.converters;

/**
 * TONToKGConverter is implements to Convertible(interface)
 * it has 2 fields and 3 methods
 * Each of them works to convert input value(TON) to KG value
 */
public class TONToKGConverter implements Convertible {
    private double fromV;
    private double convertedV;

    /**
     * setFromValue has a parameter which is a input value(TON)
     * it sets fromV to input Value(double fromValue)
     * @param fromValue is original value and setFromValue set fromV to fromValue
     */
    public void setFromValue(double fromValue){
        fromV = fromValue;
    }

    /**
     * getConvertedValue has a return value of convertedV(KG)
     * After executing convert(), there is a converted value in convertedV field
     * and getConvertedvalue() returns convertedV(KG)
     * @return double convertedV(KG)
     */
    public double getConvertedValue(){
        return convertedV;
    }
    /**
     * convert() it literally converts TON to KG by multiply by 1000
     * and store the converted value in double convertedV
     */
    public void convert(){
        convertedV = fromV*1000.0;
    }
}
