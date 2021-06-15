public class Person implements Fighter{

    // Поля персоны
    private String name;
    private int healthLevel;
    private int strengthLevel;
    private int agilityLevel;
    private int experienceLevel;
    private int gold;
    //Конструктор
    public Person(String name, int healthLevel, int strengthLevel, int agilityLevel, int experienceLevel, int gold) {
        this.name = name;
        this.healthLevel = healthLevel;
        this.strengthLevel = strengthLevel;
        this.agilityLevel = agilityLevel;
        this.experienceLevel = experienceLevel;
        this.gold = gold;
    }
    //Метод для ведения боя
    @Override
    public int attack() {
        if (agilityLevel * 3 > getRandomValue()) return strengthLevel;
        else return  0;
    }

    //Методы Персоны
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHealthLevel() {
        return healthLevel;
    }
    public void setHealthLevel(int healthPoints) {
        this.healthLevel = healthPoints;
    }

    public int getStrengthLevel() {
        return strengthLevel;
    }
    public void setStrengthLevel(int strength) {
        this.strengthLevel = strength;
    }

    public int getAgilityLevel() {
        return agilityLevel;
    }
    public void setAgilityLevel(int dexterity) { this.agilityLevel = dexterity; }

    public int getExperienceLevel() {
        return experienceLevel;
    }
    public void setExperienceLevel(int xp) {
        this.experienceLevel = xp;
    }

    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }

    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }



    //Переопределяем вывод в консоль, чтобы выводилось имя и очки здоровья
    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, healthLevel);
    }
}

