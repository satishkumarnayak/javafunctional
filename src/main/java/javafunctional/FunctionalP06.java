package javafunctional;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionalP06 {

	public static void main(String[] args) {

		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));

	Map<Integer, List<Course>> collect = courses.stream().collect(Collectors.groupingBy(Course::getReviewScore));	
//	Map<Integer, List<Course>> collect = courses.stream().filter(course -> course.getReviewScore() >= 95).collect(Collectors.groupingBy((course) -> course.getReviewScore()));
	System.out.println(collect);
	//	courses.stream().max(Comparator.comparing(Course::getReviewScore)).ifPresent(course -> System.out.println(course));
	//	courses.stream().sorted(Comparator.comparing(Course::getNoOfStudents).thenComparing(Comparator.comparing(Course::getName))).forEach(System.out::println);
	//	courses.stream().sorted(Comparator.comparing(Course::getNoOfStudents)).forEach(System.out::println);
	//	courses.stream().sorted(Comparator.comparing(Course::getNoOfStudents).reversed()).forEach(System.out::println);
	//	courses.stream().sorted((course1, course2) -> course2.getName().compareTo(course1.getName())).forEach(System.out::println);
		
		
		// System.out.println(courses);

		// System.out.println(courses.stream().allMatch(course ->
		// course.getReviewScore() > 95));
		// System.out.println(courses.stream().noneMatch(course ->
		// course.getReviewScore() > 95));
		// System.out.println(courses.stream().anyMatch(course ->
		// course.getReviewScore() > 95));
	}

}

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}

}
