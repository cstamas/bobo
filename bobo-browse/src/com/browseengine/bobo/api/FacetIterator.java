/**
 * Iterator to iterate over facets
 */
package com.browseengine.bobo.api;

import java.util.Iterator;

/**
 * @author nnarkhed
 *
 */
public abstract class FacetIterator implements Iterator<String>{

	public int count;
	public String facet;
	
	/**
	 * Moves the iteration to the next facet
	 * @return	 the next facet value
	 */
	public abstract String next();
	
    /**
     * Moves the iteration to the next facet whose hitcount >= minHits. returns null if there is no facet whose hitcount >= minHits.
     * Hence while using this method, it is useless to use hasNext() with it.
     * After the next() method returns null, calling it repeatedly would result in undefined behavior 
     * @return   The next facet value. It returns null if there is no facet whose hitcount >= minHits.
     */	
	public abstract String next(int minHits);
}
