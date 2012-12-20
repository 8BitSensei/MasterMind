package com.mastermind;

import java.io.Serializable;

public class Guess implements Serializable {
	int v1, v2, v3, v4;
	public GuessStatus c1, c2, c3, c4;

	enum GuessStatus {
		V, X, S;
	}
}
