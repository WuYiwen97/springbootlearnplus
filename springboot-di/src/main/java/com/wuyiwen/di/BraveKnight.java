package com.wuyiwen.di;

public class BraveKnight {
    private Quest quest;
    public BraveKnight(Quest quest){
        this.quest =quest;
    }
    public void embarkQuest(){
        quest.embark();
    }

    public static void main(String[] args) {
        new BraveKnight(new RescueDamselQuest()).embarkQuest();
    }
}
