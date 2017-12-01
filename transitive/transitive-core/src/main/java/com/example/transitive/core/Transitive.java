package com.example.transitive.core;

import com.example.composite.dependency.CompositeDependency;
import com.example.transitive.dependency.TransitiveDependency;

public class Transitive {

	private final TransitiveDependency transitiveDependency;
	private final CompositeDependency compositeDependency;

	public Transitive(TransitiveDependency transitiveDependency, CompositeDependency compositeDependency) {
		this.transitiveDependency = transitiveDependency;
		this.compositeDependency = compositeDependency;
	}

}
