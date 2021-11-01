package monster.character;

import java.util.Random;

import monster.Skill;
import monster.item.Armor;
import monster.item.HpPotion;
import monster.item.MpPotion;
import monster.item.Weapon;

public class Boss extends Monster {

    private double mp;
    private double maxMp;
    private Skill skill1;//기본 스킬
    private Skill skill2;//궁극기
    private Weapon weapon;//무기
    private Armor armor;//방어구



    public Boss(String name,
                double hp,
                double maxhp,
                double strength,
                double defense,
                int money,
                int exp,
                int level,
                String defaultAttackname,
                HpPotion hpPotion,
                MpPotion mpPotion,
                double mp,
                double maxMp,
                Skill skill1,
                Skill skill2,
                Weapon weapon,
                Armor armor) {
        super(name, hp, maxhp, strength, defense, money, exp, level, defaultAttackname, hpPotion, mpPotion);
        this.mp = mp;
        this.maxMp = maxMp;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.weapon = weapon;
        this.armor = armor;
    }
    @Override
    public int attack(Character target) {
        Random random = new Random();
        double percentage = 0.1 * (random.nextInt(3) + 8);//80~100%데미지
        int damage = 0;
        if(this.strength > target.getDefense()) {
            damage = (int) ((int) (this.strength - target.getDefense()) * percentage);
        }
        target.setHp(target.getHp() - damage);
        return damage;
    }

    public int useSkill(Skill skill, Character target) {
        Random random = new Random();
        double percentage = 0.1 * (random.nextInt(5) + 6);//60~100%데미지
        int damage = 0;
        if(skill.getDamage() > target.getDefense()) {
            damage = (int) (skill.getDamage() * percentage - target.getDefense());
        }
        target.setHp(target.getHp() - damage);
        return damage;
    }

    @Override
    public int dropItem(Player player) {
        Random random = new Random();
        int potionDropCount = (random.nextInt(5) + 1);
        double moneyDropPercentage = 0.1 * (random.nextInt(3) + 8);
        player.setMoney((int) (player.getMoney() + this.money * moneyDropPercentage));
        player.setExp(player.getExp() + this.getExp());
        for (int i = 0; i < potionDropCount; i++) {
            if (this.hpPotion.getName().equals("하급 hp포션")) {
            	player.getLowHpPotions().add(this.hpPotion);
            	player.getLowMpPotions().add(this.mpPotion);
            } else if (this.hpPotion.getName().equals("중급 hp포션")) {
            	player.getMidHpPotions().add(this.hpPotion);
            	player.getMidMpPotions().add(this.mpPotion);
            } else {
            	player.getHighHpPotions().add(this.hpPotion);
            	player.getHighMpPotions().add(this.mpPotion);
            }
        }
        return potionDropCount;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(double maxMp) {
        this.maxMp = maxMp;
    }

    public Skill getSkill1() {
        return skill1;
    }

    public void setSkill1(Skill skill1) {
        this.skill1 = skill1;
    }

    public Skill getSkill2() {
        return skill2;
    }

    public void setSkill2(Skill skill2) {
        this.skill2 = skill2;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

	
}
