/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochila;

/**
 *
 * @author pasb2
 */
public class Elemento 
{
	private int peso;
	private int beneficio;
	
	public Elemento(int peso, int beneficio)
	{
		this.peso = peso;
		this.beneficio = beneficio;
	}

	public int getPeso() 
	{
		return peso;
	}

	public void setPeso(int peso) 
	{
		this.peso = peso;
	}

	public int getBeneficio() 
	{
		return beneficio;
	}

	public void setBeneficio(int beneficio) 
	{
		this.beneficio = beneficio;
	}

	

	
	
	@Override
    public String toString(){
        return "Peso:"+peso+","+" beneficio:"+beneficio; // el cual sirve para retornar el peso y el beneficio que otorga el elemento
    }
}
