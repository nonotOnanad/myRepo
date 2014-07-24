package com.sample.vdp.inter.impl;

import com.sample.vdp.inter.ComputerPart;
import com.sample.vdp.inter.ComputerPartVisitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
