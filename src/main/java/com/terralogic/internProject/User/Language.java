package com.terralogic.internProject.User;

import java.util.HashSet;



public class Language {


    Language english ;
    Language telugu ;
    Language hindi ;

    HashSet<Language> languages ;

    public Language(Language english, Language telugu, Language hindi, HashSet<Language> languages) {
        this.english = english;
        this.telugu = telugu;
        this.hindi = hindi;
        this.languages = languages;

        this.languages.add(english) ;
        this.languages.add(telugu) ;
        this.languages.add(hindi) ;
    }


    public Language getEnglish() {
        return english;
    }

    public void setEnglish(Language english) {
        this.english = english;
    }

    public Language getTelugu() {
        return telugu;
    }

    public void setTelugu(Language telugu) {
        this.telugu = telugu;
    }

    public Language getHindi() {
        return hindi;
    }

    public void setHindi(Language hindi) {
        this.hindi = hindi;
    }

    public HashSet<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(HashSet<Language> languages) {
        this.languages = languages;
    }
}
