package br.com.acessos.companie;

import java.util.ArrayList;

public enum Companies {
	COMPANYONE{
		private static ArrayList<String> workers = new ArrayList<>();
		
		public void addWorker(String worker) {
			workers.add(worker);
		}
		public ArrayList<String> showWorker(){
			return workers;
		}
	},
	COMPANYTWO{
		private static ArrayList<String> workers = new ArrayList<>();
		
		public void addWorker(String worker) {
			workers.add(worker);
		}
		public ArrayList<String> showWorker(){
			return workers;
		}
	},
	COMPANYTHREE{
		private static ArrayList<String> workers = new ArrayList<>();
		
		public void addWorker(String worker) {
			workers.add(worker);
		}
		public ArrayList<String> showWorker(){
			return workers;
		}
	};
	
	public abstract void addWorker(String worker);
	public abstract ArrayList<String> showWorker();
	
}
