package de.tum.cit.ase;

public class CharacterBlock {
    public static void main(String[] args) {
        int height = InputReader.readInt("Enter height: ");
        int width = InputReader.readInt("Enter width: ");

        // TODO: print the character block
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
