/**
 * 
 */
package Polymorphism;

/**
 * @author oxane
 *
 */
public class Holder {
	
	public static void main(String[] args) {
		Set mySet  = new Set();
		Set myRulerSet  = new Ruler();
		Set myPencilSet = new Pencil();
		
		 mySet.usage();
		 myPencilSet.usage();
		 myRulerSet.usage();
		
	
	}

}
