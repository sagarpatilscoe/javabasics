/**
 * 
 */
package InnerClass;

/**
 * @author spatil28
 *
 */
public class OuterClass {

	void show() {
		System.out.println("OuterClass");
	}
	static class InnerStaticClass {
		void show() {
			System.out.println("InnerStaticClass");
		}
	}
	class InnerClass{
		void show() {
			System.out.println("InnerClass");
		}
	}
	
}


