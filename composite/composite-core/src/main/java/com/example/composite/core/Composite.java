package com.example.composite.core;

import com.example.composite.dependency.CompositeDependency;

public class Composite {

	private final CompositeDependency compositeDependency;

	public Composite(CompositeDependency compositeDependency) {
		this.compositeDependency = compositeDependency;
	}
}
