package com.logic.build.javaCodingInterviewQuestions;

import java.util.HashMap;

public class Balanced_Parentheses {

	public static void main(String[] args) {

		String s = "{[()()]}";

		System.out.println(checkBalancedParentheses(s));

	}

	private static boolean checkBalancedParentheses(String s) {

		char[] charArray = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : charArray) {

			switch (c) {

			case '{':
				if (map.containsKey('{')) {
					int integer = map.get('{');
					map.put('{', ++integer);
				} else {
					map.put('{', 1);
				}
				break;

			case '[':
				if (map.containsKey('[')) {
					int integer = map.get('[');
					map.put('[', ++integer);
				} else {
					map.put('[', 1);
				}
				break;
			case '(':

				if (map.containsKey('(')) {
					int integer = map.get('(');
					map.put('(', ++integer);
				} else {
					map.put('(', 1);
				}
				break;
			case '}':
				if (map.containsKey('}')) {
					int integer = map.get('}');
					map.put('}', ++integer);
				} else {
					map.put('}', 1);
				}
				break;
			case ']':
				if (map.containsKey(']')) {
					int integer = map.get(']');
					map.put(']', ++integer);
				} else {
					map.put(']', 1);
				}
				break;
			case ')':

				if (map.containsKey(')')) {
					int integer = map.get(')');
					map.put(')', ++integer);
				} else {
					map.put(')', 1);
				}
				break;

			}
		}

		boolean res = false;
		if (map.get('{').equals(map.get('}')) && map.get('[').equals(map.get(']'))
				&& map.get('(').equals(map.get(')'))) {
			res = true;
		}
		return res;
	}

}
