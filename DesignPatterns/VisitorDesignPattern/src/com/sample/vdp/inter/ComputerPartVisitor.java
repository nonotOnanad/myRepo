package com.sample.vdp.inter;

import com.sample.vdp.inter.impl.Computer;
import com.sample.vdp.inter.impl.Keyboard;
import com.sample.vdp.inter.impl.Monitor;
import com.sample.vdp.inter.impl.Mouse;

public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
