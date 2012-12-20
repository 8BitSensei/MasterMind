package com.mastermind;

import java.io.Serializable;

public class Guess_harderx1 implements Serializable {
	int v1, v2, v3, v4, v5, v6, v7;
	
	public static GuessStatus c1, c2, c3, c4, c5, c6, c7;

	enum GuessStatus {
		V, X, S;
	}
}
