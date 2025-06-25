package com.google.graph.last.revision;

import java.util.ArrayList;

public class CreateGraphNeibhourWeigth {

	public static class Edge {
		int src;
		int des;
		int wt;

		public Edge(int src, int des, int wt) {
			super();
			this.src = src;
			this.des = des;
			this.wt = wt;
		}

	}

	public static void main(String[] args) {
		ArrayList<Edge> graph[] = new ArrayList[4];

		createGraph(graph);

		printNeibhourWeigth(2, graph);
	}

	private static void printNeibhourWeigth(int index, ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph[index].size(); i++) {
			Edge edge = graph[index].get(i);
			System.out.println("Neibhour " + index + "--" + edge.des + " " + edge.wt);
		}
	}

	private static void createGraph(ArrayList<Edge>[] graph) {

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		graph[0].add(new Edge(0, 2, 2));

		graph[1].add(new Edge(1, 2, 10));
		graph[1].add(new Edge(1, 3, 0));

		graph[2].add(new Edge(2, 0, 2));
		graph[2].add(new Edge(2, 1, 10));
		graph[2].add(new Edge(2, 3, -1));

		graph[3].add(new Edge(3, 1, 0));
		graph[3].add(new Edge(3, 2, -1));

	}
}
