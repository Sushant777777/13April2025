package com.google.graph.last.revision.part.two;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajusAlgo {
	static class Edge {
		int src;
		int det;

		public Edge(int src, int det) {
			super();
			this.src = src;
			this.det = det;
		}

	}

	public static void createGraph(ArrayList<Edge> graph[]) {

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		graph[0].add(new Edge(0, 2));
		graph[0].add(new Edge(0, 3));

		graph[1].add(new Edge(1, 0));

		graph[2].add(new Edge(2, 1));

		graph[3].add(new Edge(3, 4));

	}

	public static void kosarajuAlgo(ArrayList<Edge> graph[], int v) {

		Stack<Integer> stack = new Stack<Integer>();

		boolean vis[] = new boolean[v];

		for (int i = 0; i < v; i++) {
			if (!vis[i]) {
				topSort(graph, i, vis, stack);
			}
		}

		ArrayList<Edge> transpose[] = new ArrayList[v];

		for (int i = 0; i < graph.length; i++) {
			vis[i] = false;
			transpose[i] = new ArrayList<Edge>();
		}

		for (int i = 0; i < v; i++) {
			for (int j = 0; j < graph[i].size(); j++) {
				Edge edge = graph[i].get(j);
				transpose[edge.det].add(new Edge(edge.det, edge.src));
			}
		}

		while (!stack.isEmpty()) {
			int curr = stack.pop();
			if (!vis[curr]) {
				dfs(transpose, curr, vis);
				System.out.println();
			}

		}
	}

	private static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
		vis[curr] = true;
		System.out.print(curr + " ");
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge edge = graph[curr].get(i);
			if (!vis[edge.det]) {
				dfs(graph, edge.det, vis);
			}
		}
	}

	private static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack) {

		vis[curr] = true;

		for (int i = 0; i < graph[curr].size(); i++) {
			Edge edge = graph[curr].get(i);
			if (!vis[edge.det]) {
				topSort(graph, edge.det, vis, stack);
			}
		}

		stack.push(curr);

	}

	public static void main(String[] args) {
		int V = 5;
		ArrayList<Edge> graph[] = new ArrayList[V];

		createGraph(graph);

		kosarajuAlgo(graph, V);
	}
}
