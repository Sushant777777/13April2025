package com.google.graph.last.revision;

import java.util.ArrayList;

import com.google.graph.last.revision.TapologicalSort.Edge;

public class CycleWithUndirected {
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
		graph[0].add(new Edge(0, 4));

		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 2));
		//graph[1].add(new Edge(1, 4));

		graph[2].add(new Edge(2, 1));
		graph[2].add(new Edge(2, 3));

		graph[3].add(new Edge(3, 2));

		graph[4].add(new Edge(4, 0));
		//graph[4].add(new Edge(4, 1));
		graph[4].add(new Edge(4, 5));

		graph[5].add(new Edge(5, 4));
	}

	public static void main(String[] args) {
		ArrayList<Edge> graph[] = new ArrayList[6];
		boolean visited[] = new boolean[6];
		createGraph(graph);
		boolean unDirectedCycle = unDirectedCycle(graph, 0, visited, -1);
		System.out.println(unDirectedCycle);
	}

	public static boolean unDirectedCycle(ArrayList<Edge> graph[], int current, boolean visited[], int parent) {

		visited[current] = true;

		for (int i = 0; i < graph[current].size(); i++) {
			Edge edge = graph[current].get(i);

			if (visited[edge.det] && edge.det != parent) {
				return true;
			} else if (!visited[edge.det]) {
				if (unDirectedCycle(graph, edge.det, visited, current)) {
					return true;
				}
			}
		}

		return false;
	}
}
