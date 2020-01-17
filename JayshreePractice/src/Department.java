/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class Department {
	
    private int deptid;
    private String deptName;
    
    /**
	 * 
	 */
	public Department() {
		// TODO Auto-generated constructor stub
	}
    Department(int deptId,String depName){
    	
    	this.deptid=deptId;
    	this.deptName=depName;
    }
  public void setDepid(int deptid) {
	  this.deptid=deptid;
  }
  public int getDeptid() {
	  return this.deptid;
  }
  public void setDeptName(String deptName) {
	  this.deptName=deptName;
	  
  }
  public String getDeptName() {
	  return this.deptName;
  }
    

}
