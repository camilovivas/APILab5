/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;
/**
*Description this class is of Poll
*/

public class Poll{
	private int serviceRendered;
	private int responseTime;
	private int costRelation;
	/**
	*Description this is the build of class Poll
	*@param serviceRendered the question 1
	*@param responseTime the question 2
	*@param costRelation the question 3
	*/
	
	public Poll(int serviceRendered, int responseTime, int costRelation){
		this.serviceRendered = serviceRendered;
		this.responseTime = responseTime;
		this.costRelation = costRelation;
	}
	public int getServiceRendered(){
		return serviceRendered;
	}
	public int getResponseTime(){
		return responseTime;
	}
	public int getCostRelation(){
		return costRelation;
	}
	
	
	
	
}