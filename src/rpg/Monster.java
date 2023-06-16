// 2023-05-19 1.week6
package rpg;

public class Monster {
    
    public Monster() {
        this.name = "ゴブリン";
        this.hp = 10;
        this.mp = 0;
        this.attackPower = 3;
        this.defencePower = 2;
    }

    // field (property)
    public String name;
    public String job;
    public int hp;
    public int mp;
    public int lrevel;
    public int exp;
    public int attackPower;
    public int defencePower;

    public void attack(Character character) {
        int damage = this.attackPower - character.defencePower;
        // ダメージが 0より大きい場合は、相手のHPを減らす
        if(damage > 0) character.hp -= damage;
    }

}
