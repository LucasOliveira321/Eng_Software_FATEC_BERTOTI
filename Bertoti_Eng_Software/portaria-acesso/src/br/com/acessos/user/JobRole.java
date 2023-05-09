package br.com.acessos.user;

import java.util.ArrayList;

import br.com.acessos.areas.Areas;

public enum JobRole {
	ANALYST{
		public ArrayList<String> getPermissions() {
			ArrayList<String> permissions = new ArrayList<>();
			permissions.add(Areas.DESK.toString());
			permissions.add(Areas.RESTAURANT.toString());
			return permissions;
		}
	},
	DEVELOPER{
		public ArrayList<String> getPermissions() {
			ArrayList<String> permissions = new ArrayList<>();
			permissions.add(Areas.DESK.toString());
			permissions.add(Areas.RESTAURANT.toString());
			return permissions;
		}
	},
	MANAGER{
		public ArrayList<String> getPermissions() {
			ArrayList<String> permissions = new ArrayList<>();
			permissions.add(Areas.DESK.toString());
			permissions.add(Areas.RESTAURANT.toString());
			permissions.add(Areas.OPERATIONS.toString());
			permissions.add(Areas.WAREHOUSE.toString());
			return permissions;
		}
	},
	OPERATOR{
		public ArrayList<String> getPermissions() {
			ArrayList<String> permissions = new ArrayList<>();
			permissions.add(Areas.RESTAURANT.toString());
			permissions.add(Areas.OPERATIONS.toString());
			return permissions;
		}
	},
	STOCKIST{
		public ArrayList<String> getPermissions() {
			ArrayList<String> permissions = new ArrayList<>();
			permissions.add(Areas.WAREHOUSE.toString());
			permissions.add(Areas.OPERATIONS.toString());
			permissions.add(Areas.RESTAURANT.toString());
			return permissions;
		}
	};
	
	public abstract ArrayList<String> getPermissions();

}
