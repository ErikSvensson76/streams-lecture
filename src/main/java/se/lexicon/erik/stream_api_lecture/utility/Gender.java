package se.lexicon.erik.stream_api_lecture.utility;

public enum Gender {
    MALE,FEMALE;

    public String toString(){
        return this.name().toLowerCase();
    }


}
