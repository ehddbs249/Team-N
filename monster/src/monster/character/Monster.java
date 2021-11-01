package monster.character;

import monster.item.HpPotion;
import monster.item.MpPotion;
import java.util.Random;

public class Monster extends Character {

    protected HpPotion hpPotion;
    protected MpPotion mpPotion;

   public Monster(String name,double hp,double maxhp,double strength, double defense, int money, int exp, int level, String defaultAttackName, HpPotion hpPotion, MpPotion mpPotion) {
	   super(name, hp, maxhp, strength, defense, money, exp, level, defaultAttackName);
	   
       this.hpPotion = hpPotion;
       this.mpPotion = mpPotion;
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

    public int dropItem(Player player) {
        Random random = new Random();
        int potionDropCount = random.nextInt(5) + 1;
        double moneyDropPercentage = 0.1 * (random.nextInt(3) + 8);
        
        player.setMoney((int) (player.getMoney() + this.money * moneyDropPercentage));
        player.setExp((int)(player.getExp()+this.exp));
        for (int i = 0; i < potionDropCount; i++) {
        	
            if (this.hpPotion.getName().equals("작은체력물약")) {
                player.getLowHpPotions().add(this.hpPotion);
                player.getLowMpPotions().add(this.mpPotion);
            } else if (this.hpPotion.getName().equals("보통체력물약")) {
                player.getMidHpPotions().add(this.hpPotion);
                player.getMidMpPotions().add(this.mpPotion);
            } else {
                player.getHighHpPotions().add(this.hpPotion);
                player.getHighMpPotions().add(this.mpPotion);
            }
            
        }
        
        return potionDropCount;
    }

    
    public HpPotion getHpPotion() {
        return hpPotion;
    }

    
    public void setHpPotion(HpPotion hpPotion) {
        this.hpPotion = hpPotion;
    }

    
    public MpPotion getMpPotion() {
        return mpPotion;
    }

    
    public void setMpPotion(MpPotion mpPotion) {
        this.mpPotion = mpPotion;
    }

    

}