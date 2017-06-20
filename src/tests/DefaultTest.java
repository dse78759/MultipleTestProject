/**
 * 
 */
package tests;

/**
 * @author dedgar
 *
 */
public interface DefaultTest {

	public int add ( int a, int b);
	
	// my first default !
	default public int substract ( int a, int b) {
		return a;
	};
}
