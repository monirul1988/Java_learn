package Learn;

public class encap {
	
	
	private int emp_id;
	
	private String id;
	
	public String getid() {
		return id;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	
	
	public void setid(String id)
	{
		this.id=id;
	}
	

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}





	

	public static void main(String[] args) {
	
		
		encap e=new encap();
	      e.setEmp_id(123); 
		  e.setid("test");
		  
		  
		  System.out.println(e.getEmp_id());
		  System.out.println(e.getid());
	} 

}
