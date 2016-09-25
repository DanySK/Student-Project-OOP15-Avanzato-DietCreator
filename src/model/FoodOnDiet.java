package model;

import java.io.Serializable;

/** 
 * Classe FoodOnDiet, implementa Food e Serializable
 */
public class FoodOnDiet implements Food, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FoodValues food;
	private Integer quantity;
	private String name;
	
	private double carbs;
	private double fats;
	private double prots;
	private double fibers;
	private double totKcals;
	
	/**
     * Costruttore di FoodOnDiet
     * 
     * @param FoodValues
     *      l'alimento che rappresenta
     *      
     * @param int
     *      la quantit� da inserire in un pasto
     */
	public FoodOnDiet (FoodValues food, int quantity){
		this.food = food;
		this.quantity = quantity;
		this.name = food.getName();
		this.carbs = this.processCarbs();
		this.fats = this.processFats();
		this.prots = this.processProts();
		this.fibers = this.processFibers();
		this.totKcals = this.processTotKcals();
	}
	
	/**
     * calcola la quantit� di carboidrati in relazione alla quantit� di alimento
     * 
     * @return double
     *      quantit� di proteine
     */
	public double processCarbs(){
		return (food.getCarbs() * quantity) / 100;
	}
	
	/**
     * calcola la quantit� di grassi in relazione alla quantit� di alimento
     * 
     * @return double
     *      quantit� di grassi
     */
	public double processFats(){
		return (food.getFats() * quantity) / 100;
	}
	
	/**
     * calcola la quantit� di proteine in relazione alla quantit� di alimento
     * 
     * @return double
     *      quantit� di proteine
     */
	public double processProts(){
		return (food.getProts() * quantity) / 100;
	}
	
	/**
     * calcola la quantit� di fibre in relazione alla quantit� di alimento
     * 
     * @return double
     *      quantit� di fibre
     */
	public double processFibers(){
		return (food.getFibers() * quantity) / 100;
	}
	
	/**
     * metodo che calcola le calorie derivanti da carboidrati
     * 
     * @return double
     *      le calorie derivanti da carboidrati
     */
	@Override
	public double getCarbsKCals() {
		return (food.getCarbsKCals() * quantity) / 100;
	}
	
	/**
     * calcola le calorie derivanti dai grassi
     * 
     * @return double
     *      calorie derivanti dai grassi
     */

	@Override
	public double getFatsKCals() {
		return (food.getFatsKCals() * quantity) / 100;
	}
	
	/**
     * calcola le calorie derivanti dalle proteine
     * 
     * @return double
     *      calorie derivanti dalle proteine
     */
	@Override
	public double getProtsKCals() {
		return (food.getProtsKCals() * quantity) / 100;
	}
	
	/**
     * calcola le calorie totali
     * 
     * @return double
     *      calorie totali
     */
	@Override
	public double processTotKcals() {
		return getCarbsKCals() + getFatsKCals() + getProtsKCals();
	}
	
	/**
     * getter dei carboidrati
     * 
     * @return double
     *      quantit� di carboidrati
     */
	@Override
	public double getCarbs() {
		return this.carbs;
	}
	
	/**
     * getter dei grassi
     * 
     * @return double
     *      quantit� di grassi
     */
	@Override
	public double getFats() {
		return this.fats;
	}
	
	/**
     * getter delle proteine
     * 
     * @return double
     *      quantit� di proteine
     */
	@Override
	public double getProts() {
		return this.prots;
	}
	
	/**
     * getter delle fibre
     * 
     * @return double
     *      quantit� di fibre
     */
	@Override
	public double getFibers() {
		return this.fibers;
	}
	
	/**
     * getter delle calorie totali
     * 
     * @return double
     *      quantit� calorie totali
     */
	@Override
	public double getTotKcals() {
		return this.totKcals;
	}
	
	/**
     * getter del nome dell'alimento
     * 
     * @return String
     *      nome dell'alimento
     */
	public String getName(){
		return this.name;
	}
	
	/**
     * getter dela quantit� di alimento
     * 
     * @return Integer
     *      quantit� di alimento 
     */
	public Integer getQuantity(){
		return this.quantity;
	}
	
}
