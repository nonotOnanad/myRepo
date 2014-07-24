package com.sample.vdp.runner;

import com.sample.vdp.inter.ComputerPart;
import com.sample.vdp.inter.impl.Computer;
import com.sample.vdp.inter.impl.ComputerPartDisplayVisitor;

public class Runner {

	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
