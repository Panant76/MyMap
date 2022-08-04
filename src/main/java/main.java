import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String, String> engrus = createEngRus();

        for (Map.Entry<String, String> entry : engrus.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            System.out.println(entry.getValue());
        }
    }
    public static Map<Character, String> getMapEng() {
        Map<Character, String> eng = new HashMap<>();
        eng.put('A', "apple");
        eng.put('B', "ball");
        eng.put('C', "cat");
        eng.put('D', "doll");
        eng.put('E', "elephant");
        eng.put('F', "fat");
        eng.put('G', "goat");
        eng.put('H', "hat");
        eng.put('I', "ice-cream");
        eng.put('J', "jam");
        eng.put('K', "kite");
        eng.put('L', "lamb");
        eng.put('M', "mouse");
        eng.put('N', "nine");
        eng.put('O', "orange");
        eng.put('P', "pine");
        eng.put('Q', "queen");
        eng.put('R', "rain");
        eng.put('S', "star");
        eng.put('T', "train");
        eng.put('U', "unicorn");
        eng.put('V', "van");
        eng.put('W', "watch");
        eng.put('X', "box");
        eng.put('Y', "yelow");
        eng.put('Z', "zoo");
        return eng;
    }
    public static Map<Character, String> getMapRus() {
        Map<Character, String> rus = new HashMap<>();
        rus.put('A', "яблоко");
        rus.put('B', "мяч");
        rus.put('C', "кот");
        rus.put('D', "кукла");
        rus.put('E', "слон");
        rus.put('F', "толстый");
        rus.put('G', "козленок");
        rus.put('H', "шляпа");
        rus.put('I', "мороженое");
        rus.put('J', "джем");
        rus.put('K', "змей");
        rus.put('L', "ягненок");
        rus.put('M', "мышь");
        rus.put('N', "девять");
        rus.put('O', "апельсин");
        rus.put('P', "сосна");
        rus.put('Q', "королева");
        rus.put('R', "дождь");
        rus.put('S', "звезда");
        rus.put('T', "поезд");
        rus.put('U', "единорог");
        rus.put('V', "вагон");
        rus.put('W', "часы");
        rus.put('X', "коробка");
        rus.put('Y', "желтый");
        rus.put('Z', "зоопарк");
        return rus;
    }
    public static Map<String, String> createEngRus() {
        Map<String, String> engrus = new HashMap<>();
        Map<Character, String> eng = getMapEng();
        Map<Character, String> rus = getMapRus();

        for (Map.Entry<Character, String> entry : rus.entrySet()) {
            String str = eng.get(entry.getKey());
            engrus.put(str, entry.getValue());
        }
        return engrus;
    }
}

