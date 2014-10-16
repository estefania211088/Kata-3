/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author usuario
 */
public class HistogramViewer <Type> {
    public void print (Histogram<Type> histogram){
        for (Type key : histogram.keySet()) {
            System.out.println(key + "-->" +histogram.get(key));
        }
    }    
}
