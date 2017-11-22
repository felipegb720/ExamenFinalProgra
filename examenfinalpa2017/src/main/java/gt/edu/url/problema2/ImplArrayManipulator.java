/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class ImplArrayManipulator <E> implements ArrayManipulator <E>  {

    @Override
    public int subsets(List<E> set ) {
        
         if (set.size() == 0) {
        
             List<List<E>> Result = new ArrayList<List<E>>();  // creo mi nueva lista para almacener permutaciones
        
        Result.add((List<E>) new ArrayList<Integer>());
        
        return Result;
    }

    List<List<Integer>> ReturnFinal = new ArrayList<List<Integer>>();

    Integer firstElement = (Integer) set.remove(0); // downcasting done to remote int from list with the index

    List<List<Integer>> recursiveReturn = listPermutations(set);
    
    for (List<Integer> li : recursiveReturn) {

        for (int index = 0; index <= li.size(); index++) {
            List<Integer> temp = new ArrayList<Integer>(li);
            temp.add(index, firstElement);
            ReturnFinal.add(temp);
        }

    }
    return ReturnFinal;
}

    private List<List<Integer>> listPermutations(List<E> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
        
}

        
    
    

