package lecture_26;

import java.util.Scanner;

public class PrimsAlgorithm {
	
	public static void prims(int adjacencyMatrix[][], int n){
		boolean visited[] = new boolean[n];
		int distance[] = new int[n];
		for(int i=1;i<n;i++){
			distance[i] = Integer.MAX_VALUE;
		}
		int ans[] = new int[n];
		
		for(int i=0;i<n-1;i++){
			int minDist = Integer.MAX_VALUE ;
			int pos = -1;
			for(int j=0;j<n;i++){
				if(minDist>distance[j] && !visited[j]){
					minDist = distance[j];
					pos = j;
				}
			}
			
			visited[pos] = true;
			for(int p=0 ; p < adjacencyMatrix[minDist].length ; i++){
				if(adjacencyMatrix[pos][p]!=0 && adjacencyMatrix[pos][p]<distance[p] && !visited[p]){
					distance[p] = adjacencyMatrix[pos][p];
					ans[p] = pos;
				}
			}
		}
		
		for(int i=0;i<ans.length;i++){
			System.out.println(i + " " +ans[i]);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int adjacencyMatrix[][] = new int[n][n];
		int edges = s.nextInt();
		while(edges>0){
			int i = s.nextInt();
			int j = s.nextInt();
			int weight = s.nextInt();
			adjacencyMatrix[i][j] = weight;
			adjacencyMatrix[j][i] = weight;
			edges--;
		}
		prims(adjacencyMatrix, n);
	}

}
