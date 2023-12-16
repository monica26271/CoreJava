package com.practice.kodnest;

public class Laptop {
	private String processorName;
	private String memorySize;
	


	public Laptop(String processorName, String memorySize) {
		
		this.processorName = processorName;
		this.memorySize = memorySize;
	}

	
	public String getProcessorName() {
		return processorName;
	}

	
	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	public String getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(String memorySize) {
		this.memorySize = memorySize;
	}
	
	
	
	


}
