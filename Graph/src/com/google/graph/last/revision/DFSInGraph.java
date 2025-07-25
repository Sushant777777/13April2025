package com.google.graph.last.revision;

import java.util.ArrayList;

public class DFSInGraph {

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

		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));

		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));

		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));

		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));

		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));

		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));

		graph[6].add(new Edge(6, 5));
	}

	public static void main(String[] args) {
		ArrayList<Edge> graph[] = new ArrayList[7];
		boolean visited[] = new boolean[7];
		createGraph(graph);
		dfs(graph, 0, visited);
	}

	private static void dfs(ArrayList<Edge>[] graph, int current, boolean[] visited) {
		System.out.print(current + " ");

		visited[current] = true;

		for (int i = 0; i < graph[current].size(); i++) {
			Edge edge = graph[current].get(i);
			if (visited[edge.det] == false)
				dfs(graph, edge.det, visited);
		}

	}
}
