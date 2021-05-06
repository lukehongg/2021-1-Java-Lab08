package edu.handong.csee.java.hw2.converters;
/**
 * TONToGConverter is implements to Convertible(interface)
 * it has 2 fields and 3 methods
 * Each of them works to convert input value(TON) to G value
 */
public class TONToGConverter implements Convertible {
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
     * getConvertedValue has a return value of convertedV(G)
     * After executing convert(), there is a converted value in convertedV field
     * and getConvertedvalue() returns convertedV(G)
     * @return double convertedV(G)
     */
    public double getConvertedValue(){
        return convertedV;
    }
    /**
     * convert() it literally converts TON to KG by multiply by 1000*1000(TON to KG to G)
     * and store the converted value in double convertedV
     */
    public void convert(){
        convertedV = fromV*1000000.0;
    }
}
