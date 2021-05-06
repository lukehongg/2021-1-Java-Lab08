package edu.handong.csee.java.hw2.converters;
/**
 * Convertible is an interface
 * it implements other converter classes except for AllConverter
 */
public interface Convertible {
    /**
     * @param fromValue is a double type parameter which is an input value
     */
    public void setFromValue(double fromValue);
    /**
     * 
     * @return convertedvalue after executing convert function, it returns converted value
     */
    public double getConvertedValue();
    /**
     * it converts input unit value to converted unit value
     */
    public void convert();

}