package com.example.transitive.dependency;

import com.example.composite.dependency.CompositeDependency;

public class TransitiveDependency {
	private final CompositeDependency compositeDependency;

	public TransitiveDependency(CompositeDependency compositeDependency) {
		this.compositeDependency = compositeDependency;
	}
}
