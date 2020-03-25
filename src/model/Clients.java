package model;
public class Clients {
	// atributes
	private String Name;
	private int Numregistration;
	private int Date;
	private int Type;
	private double Kilos;
	private double Totalvalue;
	// constants
	public static final double Normal=0;
	public static final double Silver=0.015;
	public static final double Gold=0.03;
	public static final double Platinum=0.05;
	//Relations
	private Load[] freight;
	//Methods
	public Client(String name,int numregistration,int date,int type,double kilos,double totalvalue){
		this.name=name;
		this.numregistration=numregistration;
		this.date=date;
		this.type=type;
		this.kilos=kilos;
		this.totalvalue=totalvalue;
		freight=new Load [];
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getNumregistration(){
		return numregistration;
	}
	public void setNumregistration(int numregistration){
		this.numregistration=numregistration;
	}
	public int getDate(){
		return date;
	}
	public void setDate(int date){
		this.date=date;
	}
	public int getType(){
		return type;
	}
	public void setType(int type){
		this.type=type;
	}
	public double getKilos(){
		return kilos;
	}
	public void setKilos(double kilos){
		this.kilos=kilos;
	}
	public double getTotalvalue(){
		return totalvalue;
	}
	public void setTotalvalue(){
		this.totalvalue=totalvalue;
	}
}	