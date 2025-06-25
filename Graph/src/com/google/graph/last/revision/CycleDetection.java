package com.google.graph.last.revision;

import java.util.ArrayList;

public class CycleDetection {
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

		graph[0].add(new Edge(0, 2));

		graph[1].add(new Edge(1, 0));

		graph[2].add(new Edge(2, 3));

		graph[3].add(new Edge(3, 0));

	}

	public static void main(String[] args) {

		ArrayList<Edge> graph[] = new ArrayList[4];
		boolean visited[] = new boolean[4];
		boolean cycleDetect[] = new boolean[4];

		createGraph(graph);

		for (int i = 0; i < 4; i++) {
			if (!visited[i]) {
				boolean cycle = isCycleDetected(graph, visited, cycleDetect, 0);
				if (cycle) {
					System.out.println(cycle);
					break;
				}
			}
		}

	}

	private static boolean isCycleDetected(ArrayList<Edge>[] graph, boolean[] visited, boolean[] cycleDetect,
			int current) {

		visited[current] = true;
		cycleDetect[current] = true;

		for (int i = 0; i < graph[current].size(); i++) {
			Edge edge = graph[current].get(i);

			if (cycleDetect[edge.det]) {
				return true;
			} else if (!visited[edge.det]) {
				if (isCycleDetected(graph, visited, cycleDetect, edge.det))
					return true;
			}
		}
		visited[current] = false;
		return false;
	}
}
