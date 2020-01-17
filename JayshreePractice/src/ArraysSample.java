import java.util.Arrays;

/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class ArraysSample {

	public static void main(String[] args) {
		int[] i= new int[4] ;
		i[0]=23;
		i[1]=34;
		i[2]=45;
		i[3]=56;
	System.out.println(i[0]);
    for(int a: i) {
    	System.out.println();
    }
    
    copyArray();
    
    
    Employee[] emp=new Employee[3];
    Employee emp2=new Employee(23, "Jay", 50000, "Sci", 111);

    emp[0]= new Employee(23, "Jay", 50000, "Sci", 111);
    emp[1]= new Employee(24, "Sag", 50000, "bio", 123);
    emp[2]= new Employee(25, "Nil", 50000, "math", 124);
    for(Employee e:emp) {
    	e.printEmp();
    }
    
    Department[] dept=new Department[3];
    dept[0]=new Department();
    dept[0].setDepid(23);
    dept[1]=new Department();
    dept[1].setDepid(45);
    dept[2]=new Department();
    dept[2].setDepid(67);
    
    for(int j=0;j<dept.length;j++) {
    	System.out.println(dept[j].getDeptid());
    }
    
 
	}
	
public static void copyArray() {
	int[] i= new int[4];
	i[0]=12;
	i[1]=13;
	i[2]=14;
	i[3]=15;
	int j[]=Arrays.copyOf(i,10);//=new int[i.length];
	/*for(int e=0;e<i.length;e++) {
		j[e]=i[e];
		
	}
	for(int r=0;r<j.length;r++) {
		System.out.println(j[r]);
	}*/
	//j=i;
	for(int r=0;r<j.length;r++) {
		System.out.println(j[r]);
	}
	
}
}
