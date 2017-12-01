package com.example.composite.base;

import com.example.composite.dependency.CompositeDependency;
import com.example.transitive.core.Transitive;
import com.example.transitive.dependency.TransitiveDependency;

public class Base {

	private final Transitive transitive;
	private final CompositeDependency compositeDependency;

	public Base(Transitive transitive, CompositeDependency compositeDependency) {
		this.transitive = transitive;
		this.compositeDependency = compositeDependency;
	}

	public static void main(String[] args) {
		Base base = new Base(new Transitive(new TransitiveDependency(new CompositeDependency()), new CompositeDependency()), new CompositeDependency());
		System.out.println("base = " + base);
	}
}
