package academy.mindswap.to_do;

public class ToDo implements Comparable<ToDo> {
	private String description;
	private int priorityLevel;
	private ImportanceLevels importance;

	public ToDo(String description, int priorityLevel, String importance) {
		this.description = description;
		switch (priorityLevel) {
			case 2:
			case 3:
				this.priorityLevel = priorityLevel;
				break;
			case 1:
			default:
				this.priorityLevel = 1;
		}
		switch (importance.toLowerCase()) {

			case "medium":
				this.importance = ImportanceLevels.MEDIUM;
				break;
			case "high":
				this.importance = ImportanceLevels.HIGH;
				break;
			case "low":
			default:
				this.importance = ImportanceLevels.LOW;
				break;
		}
	}

	public String getDescription() {
		return description;
	}

	public int getPriorityLevel() {
		return priorityLevel;
	}

	@Override
	public int compareTo(ToDo o) {
		if ((this.importance.compareTo(o.importance)) == 0) {
			if (this.getPriorityLevel() > o.getPriorityLevel()) {
				return -1;
			}
			return 1;
		}
		return this.importance.compareTo(o.importance);
	}
}
