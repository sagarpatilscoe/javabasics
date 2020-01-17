/**
 * 
 */
package com.jay.inheritance;

/**
 * @author spatil28
 *
 */
public class Rectangle implements Diagram,ColorfillInterface{

	/* (non-Javadoc)
	 * @see com.jay.inheritance.Diagram#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}

	/* (non-Javadoc)
	 * @see com.jay.inheritance.ColorfillInterface#fillcolour()
	 */
	@Override
	public void fillcolour() {
		System.out.println("Filling Red clour in Rectangle");
		
	}

}
