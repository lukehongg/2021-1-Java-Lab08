package edu.handong.csee.java.hw2.converters;
/**
 * AllConverter is executed when target measurement is all
 * it converts input measurement to all convertible units
 */
public class AllConverter {
    
    private double fValue;
    private String originalM;
    
    /**
     * 
     * @param fromValue is an input value with input unit
     * @return it returns this; and it automatically execute following 
     * function used in IntegratedConverter and this is called method chaining
     * in setFromValue, it sets fValue to fromValue which is a given double type
     * number with original measure. 
     */
    public AllConverter setFromValue(double fromValue){
        fValue = fromValue;
        return this;
    }
    /**
     * 
     * @param originalMeasure it provides original Measure and
     * in setOriginalMeasure function it sets originalM(field) to given original measure
     * @return this; for method chaining
     */
    public AllConverter setOriginalMeasure(String originalMeasure){
        originalM = originalMeasure;
        return this;
    }
    /**
     * in convertAndPrintOut function, it uses if to distinguish originalM (KM or TON)
     * and calls appropriate class to print all possible convertible outputs
     */
    public void convertAndPrintOut(){
        if(originalM.equals("KM")){
            KMToMConverter kmtom = new KMToMConverter();
            KMToMILEConverter kmtomile = new KMToMILEConverter();
            kmtom.setFromValue(fValue);
            kmtom.convert();
            kmtomile.setFromValue(fValue);
            kmtomile.convert();
            System.out.println(fValue + " " + originalM + " to " + kmtom.getConvertedValue()  + " M");
            System.out.println(fValue + " " + originalM + " to " + kmtomile.getConvertedValue()  + " MILE");
        }
        else if(originalM.equals("TON")){
            TONToKGConverter tontokg = new TONToKGConverter();
            TONToGConverter tontog = new TONToGConverter();
            tontokg.setFromValue(fValue);
            tontokg.convert();
            tontog.setFromValue(fValue);
            tontog.convert();
            System.out.println(fValue + " " + originalM + " to " + tontokg.getConvertedValue()  + " KG");
            System.out.println(fValue + " " + originalM + " to " + tontog.getConvertedValue()  + " G");
        }
        else System.out.println("AllConverter cannot support the measure!");
    }
}
