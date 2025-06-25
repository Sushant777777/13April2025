package com.google.graph.last.revision;

import java.util.ArrayList;
import java.util.Stack;

public class TapologicalSort {
	static class Edge {
		int src;
		int det;
		// int wt;

		public Edge(int src, int det) {
			super();
			this.src = src;
			this.det = det;
			// this.wt = wt;
		}

	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		graph[2].add(new Edge(2, 3));

		graph[3].add(new Edge(3, 1));

		graph[4].add(new Edge(4, 0));
		graph[4].add(new Edge(4, 1));

		graph[5].add(new Edge(5, 0));
		graph[5].add(new Edge(5, 2));

	}

	public static void main(String[] args) {
		ArrayList<Edge> graph[] = new ArrayList[6];
		createGraph(graph);
		topSort(graph, 6);
	}

	public static void topSortUtil(ArrayList<Edge> graph[], int current, boolean vis[], Stack<Integer> stack) {

		vis[current] = true;

		for (int i = 0; i < graph[current].size(); i++) {
			Edge edge = graph[current].get(i);

			if (!vis[edge.det]) {
				topSortUtil(graph, edge.det, vis, stack);
			}
		}

		stack.push(current);
	}

	public static void topSort(ArrayList<Edge> graph[], int v) {
		boolean vis[] = new boolean[v];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < v; i++) {
			if (!vis[i]) {
				topSortUtil(graph, i, vis, stack);
			}
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
