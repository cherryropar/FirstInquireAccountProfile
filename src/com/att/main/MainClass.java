package com.att.main;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<>();
		list.add("neha");
		
		
		  Logger logger=Logger.getLogger(MainClass.class.getName());
		try {
			JAXBContext jax=JAXBContext.newInstance("com.att");
			Marshaller marshaller;
			marshaller = jax.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
		

	}

}
