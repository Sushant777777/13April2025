package com.google.graph.revision;

import java.util.ArrayList;

public class AllPathSourceToTarget {

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

	private static void pathToTarget(ArrayList<Edge> graph[], boolean visited[], int current, String path, int target) {

		if (current == target) {
			System.out.println(path);
			return;
		}

		for (int i = 0; i < graph[current].size(); i++) {
			Edge edge = graph[current].get(i);
			if (visited[edge.det] == false) {
				visited[current] = true;
				pathToTarget(graph, visited, edge.det, path + edge.det, target);
				visited[current] = false;
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Edge> graph[] = new ArrayList[7];
		boolean visited[] = new boolean[7];
		createGraph(graph);
		int src = 0;
		pathToTarget(graph, visited, src, "0", 5);
	}
}
