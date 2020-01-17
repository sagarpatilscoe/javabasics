
public final class ImmutableClass {

	final private  Integer count;	
	private ImmutableClass(Integer x) {
		// TODO Auto-generated constructor stub
		count=x;
	}
	static  ImmutableClass create(Integer x) {
		return new ImmutableClass(x);
	}
     public Integer getCount() {
    	 return this.count;
     }

     public  final Integer getInstance(Integer x) {
    	
    	 return count;
     }
}

