package day36_staticClassMembers;

public class Countable {
	
	int instanceCount;
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}

}
