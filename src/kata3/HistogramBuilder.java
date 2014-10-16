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
public class HistogramBuilder <Type> {
    public Histogram<Type> build (Type[] types){
        Histogram<Type> result = new Histogram<>();
        for (Type type : types) {
            result.put(type, result.get(type)+1);
        }
        return result; 
    }
}
