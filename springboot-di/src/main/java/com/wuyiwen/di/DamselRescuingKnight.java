package com.wuyiwen.di;

public class DamselRescuingKnight {

    private Quest quest;

    public DamselRescuingKnight(){
        quest = new RescueDamselQuest();
    }

    public void embarkOnQuest(){
        quest.embark();
    }


    public static void main(String[] args) {
        DamselRescuingKnight damselRescuingKnight = new DamselRescuingKnight();
        damselRescuingKnight.embarkOnQuest();
    }
}
