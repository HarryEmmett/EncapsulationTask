package com.qa.community;

public class Runner {

	public static void main(String[] args) {
		
		EncapsulationTaskExample example = new EncapsulationTaskExample();
		
		example.setAge(27);
		example.setLongnumber(2.345934F);
		example.setName("Harry");
		example.setPassportid(5501092323424L);
		example.setPrice(79.99);
		
		System.out.println(example.getAge());
		System.out.println(example.getLongnumber());
		System.out.println(example.getName());
		System.out.println(example.getPassportid());
		System.out.println(example.getPrice());
		
		System.out.println(example);
		
		EncapsulationTaskExample example2 = new EncapsulationTaskExample();

		example2.setAge(24);
		example2.setLongnumber(45.3234234F);
		example2.setName("Henry");
		example2.setPassportid(43234985239L);
		example2.setPrice(29.99);
		
		System.out.println(example2.getAge());
		System.out.println(example2.getLongnumber());
		System.out.println(example2.getName());
		System.out.println(example2.getPassportid());
		System.out.println(example2.getPrice());
		
		System.out.println(example2);
		
	}
	
}
