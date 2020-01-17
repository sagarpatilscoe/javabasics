/**
 * 
 */
package InnerClass;

import InnerClass.OuterClass.InnerClass;
import InnerClass.OuterClass.InnerStaticClass;

/**
 * @author spatil28
 *
 */
public class InnerClassMain {

	//OuterClass outerClass = new OuterClass();
   // OuterClass.InnerStaticClass staticInnerClass = new InnerStaticClass();
	//OuterClass.InnerStaticClass staticInnerClass1 = new OuterClass.InnerStaticClass();
	InnerStaticClass inStat = new InnerStaticClass();
	OuterClass outerClass1 = new OuterClass();
	InnerClass inClass = new OuterClass().new InnerClass();
	
}
