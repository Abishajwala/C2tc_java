package staticprogram;

public class employee {
	static String companyName = "NSK";
	private String name;
	int id;
public employee(String name,int id)
{
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "employee [name=" + name + ", id=" + id + "]";
}	

}
