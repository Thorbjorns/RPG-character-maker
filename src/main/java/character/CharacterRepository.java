package character;

import weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

public class CharacterRepository {
    private List<Character> characters = new ArrayList<>();

    Character addCharacter(String name, int age, Race race, Weapon weapon){
        Character character = new Character(name,age,race,weapon);
        characters.add(character);
        return character;
    }

    List<Character> showAllCharacters(){
        for (Character character : characters) {
            System.out.println(character);
        }
        return characters;
    }

    Character chooseCharacter(int indexNumber){
        Character character = characters.get(indexNumber);
        System.out.println(character);
        return character;
    }




}
