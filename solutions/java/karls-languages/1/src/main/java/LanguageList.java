import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return this.languages.isEmpty();
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    public String firstLanguage() {
        return this.languages.get(0);
    }

    public int count() {
        return this.languages.size();
    }

    public boolean containsLanguage(String language) {
        int index = this.languages.indexOf(language);
        return index != -1? true : false;
    }

    public boolean isExciting() {
        boolean containsJava = this.containsLanguage("Java");
        boolean containsKotlin = this.containsLanguage("Kotlin");

        return containsJava || containsKotlin;
    }
}
