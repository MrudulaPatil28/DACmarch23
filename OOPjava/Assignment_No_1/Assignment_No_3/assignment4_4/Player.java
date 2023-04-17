package oopj.assignment4_4;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Player {
	String name;
	int age;
	String team;
	int score;
	void  play() {}	
	public String toString() {
		return String.format("%-25s%-3d%-25s%-4d", this.getName(),this.getAge(),this.getTeam(),this.getScore() );
	}
}