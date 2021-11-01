package monster.character;

public abstract class Character {
	
	protected String name;//�ɸ��� �̸�
	protected double hp;//���� ü��
	protected double maxHp;//�ִ� ü��
	protected double strength;//���ݷ�
	protected double defense;//����
	protected int money;
	protected int exp;
	protected int level;
	protected String defaultAttackName;//�⺻ ���� �̸�


	public Character(String name, double hp, double maxHp, double strength, double defense, int money, int exp, int level, String defaultAttackName) {
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
		this.strength = strength;
		this.defense = defense;
		this.money = money;
		this.exp = exp;
		this.level = level;
		this.defaultAttackName = defaultAttackName;
	}

	
	public abstract int attack(Character character);//��� �ɸ��� ����

	
	
	public String getName() {
		return name;
	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	
	
	public double getHp() {
		return hp;
	}
	

	public void setHp(double hp) {
		this.hp = hp;
	}

	
	public double getMaxHp() {
		return maxHp;
	}
	

	public void setMaxHp(double maxHp) {
		this.maxHp = maxHp;
	}
	

	public double getStrength() {
		return strength;
	}

	
	public void setStrength(double strength) {
		this.strength = strength;
	}

	
	public double getDefense() {
		return defense;
	}

	
	public void setDefense(double defense) {
		this.defense = defense;
	}

	
	public int getMoney() {
		return money;
	}

	
	public void setMoney(int money) {
		this.money = money;
	}

	
	public int getExp() {
		return exp;
	}

	
	public void setExp(int exp) {
		this.exp = exp;
	}
	

	public int getLevel() {
		return level;
	}

	
	public void setLevel(int level) {
		this.level = level;
	}

	
	public String getDefaultAttackName() {
		return defaultAttackName;
	}

	
	public void setDefaultAttackName(String defaultAttackName) {
		this.defaultAttackName = defaultAttackName;
	}
	
}
