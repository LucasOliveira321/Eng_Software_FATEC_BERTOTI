package user;

import java.util.ArrayList;

import areas.Areas;

public enum JobRole {
	ANALYST{
		public ArrayList<String> getPermissions() {
			ArrayList<String> permissions = new ArrayList<>();
			permissions.add(Areas.DESK.getArea());
			permissions.add(Areas.RESTAURANT.getArea());
			return permissions;
		}
	},
	DEVELOPER{
		public ArrayList<String> getPermissions() {
			ArrayList<String> permissions = new ArrayList<>();
			permissions.add(Areas.DESK.getArea());
			permissions.add(Areas.RESTAURANT.getArea());
			return permissions;
		}
	},
	MANAGER{
		public ArrayList<String> getPermissions() {
			ArrayList<String> permissions = new ArrayList<>();
			permissions.add(Areas.DESK.getArea());
			permissions.add(Areas.RESTAURANT.getArea());
			permissions.add(Areas.OPERATIONS.getArea());
			permissions.add(Areas.WAREHOUSE.getArea());
			return permissions;
		}
	},
	OPERATOR{
		public ArrayList<String> getPermissions() {
			ArrayList<String> permissions = new ArrayList<>();
			permissions.add(Areas.RESTAURANT.getArea());
			permissions.add(Areas.OPERATIONS.getArea());
			return permissions;
		}
	},
	STOCKIST{
		public ArrayList<String> getPermissions() {
			ArrayList<String> permissions = new ArrayList<>();
			permissions.add(Areas.WAREHOUSE.getArea());
			permissions.add(Areas.OPERATIONS.getArea());
			permissions.add(Areas.RESTAURANT.getArea());
			return permissions;
		}
	};
	
	public abstract ArrayList<String> getPermissions();

}
