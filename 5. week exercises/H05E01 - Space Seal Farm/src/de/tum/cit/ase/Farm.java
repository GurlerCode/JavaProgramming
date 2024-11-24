package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.List;

public class Farm {
	private List<Animal> animals;

	public Farm() {
		this.animals = new ArrayList<>();
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	// Feed all animals
	public void feedAllAnimals() {
		for (Animal animal : animals) {
			System.out.println(animal.messageOnFeed());
		}
	}

	// Sing the farm song
	public void singFarmSong() {
		for (Animal animal : animals) {
			singFarmSongVerse(animal);
		}
	}

	// Sing a verse for a specific animal
	private void singFarmSongVerse(Animal animal) {
		String animalType = animal.getClass().getSimpleName();
		String sound = animal.messageOnFeed();

		System.out.println("Old MacDonald had a farm");
		System.out.println("Ee i ee i o");
		System.out.println("And on his farm he had some " + animalType + "s");
		System.out.println("Ee i ee i oh");
		System.out.println("With a ");
		System.out.println(sound);
		System.out.println(sound);
		System.out.println("here, and a ");
		System.out.println(sound);
		System.out.println(sound);
		System.out.println("there.");
		System.out.println("Here a ");
		System.out.println(sound);
		System.out.println("There a ");
		System.out.println(sound);
		System.out.println("Everywhere a ");
		System.out.println(sound);
		System.out.println(sound);
		System.out.println("Old MacDonald had a farm");
		System.out.println("Ee i ee i o");
	}
}
