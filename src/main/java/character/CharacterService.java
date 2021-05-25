package character;

import weapon.Weapon;

import java.util.List;

public class CharacterService {
    CharacterRepository characterRepository;

    public Character addCharacter(String name, int age, Race race, Weapon weapon){
        return characterRepository.addCharacter(name,age,race,weapon);
    }

    public List<Character> showAllCharacters(){
        return characterRepository.showAllCharacters();
    }

    public Character chooseCharacter(int number){
        return characterRepository.chooseCharacter(number);
    }
}
