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
public class Principal 
{

	public static void main(String[] args) 
	{
		Elemento[] elementos = {
	            new Elemento(2, 4),
	            new Elemento(1, 2),
	            new Elemento(4, 1),  // (peso,beneficio)
	            new Elemento(1, 1),
	            new Elemento(8, 2)
	        };
	 
	        Mochila m_base = new Mochila(15, elementos.length);
	        Mochila m_opt = new Mochila(15, elementos.length);
	 
	        llenarMochila(m_base, elementos, false, m_opt);
	 
	        System.out.println(m_opt);
	}
	
	public static void llenarMochila(Mochila m_base, Elemento[] elementos, boolean llena, Mochila m_opt) 
	{
		 
	      //si esta llena, comprobar
	      if (llena) 
	      {
	          //compruebo si tiene mas beneficio que otra
	          if (m_base.getBeneficio() > m_opt.getBeneficio())  //caso base
	          {
	 
	              Elemento[] elementosMochBase = m_base.getElementos();
	              m_opt.clear();
	 
	              //metemos los elementos
	              for (Elemento e : elementosMochBase) 
	              {
	                  if (e != null) 
	                  {
	                      m_opt.aniadirElemento(e);
	                  }
	 
	              }
	 
	          }
	 
	      } 
	      else 
	      { //la mochila esta llena
                  
                  
	          //Recorre los elementos
	          for (int i = 0; i < elementos.length; i++) 
	          {
	              //si existe el elemento
	              if (!m_base.existeElemento(elementos[i])) 
	              {
	                  //Si el peso de la mochila se supera, indicamos que esta llena
	                  if (m_base.getPesoMaximo() > m_base.getPeso() + elementos[i].getPeso())  // 15 kg > (2 kg + 4kg)
	                  {
	                      m_base.aniadirElemento(elementos[i]); //a�adimos
	                      llenarMochila(m_base, elementos, false, m_opt);      // la mochil todavia no esta llena                                          
	                      m_base.eliminarElemento(elementos[i]); // lo eliminamos
	                  } else 
	                  {
	                      llenarMochila(m_base, elementos, true, m_opt);
	                  }
	 
	              }
	 
	          }
	 
	      }
	 
	  }

        
        
        
}   