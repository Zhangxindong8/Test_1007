package test;

public class Human {
	private String idCard;
	private String name;
	private String sex;
	private int height;
	private int weight;
	//人类的特性
	public void eat(){
		System.out.println(name+"在吃饭");
	}
	public void sleep(){
		System.out.println(name+"睡觉");
	}
	//人类的行为
	public Human(String idCard,String name,String sex,int height,int weight) {
		this.idCard=idCard;
		this.name=name;
		this.sex=sex;
		this.height=height;
		this.weight=weight;
	}
	//人类的构造方法
	public void setName(String name){
		this.name=name;
	}
	
    public String getName(){
		return name;
	}
	//私有属性的设置和获取方法
	public void setSex(String sex) {
		if((sex.equals("男"))||(sex.equals("女"))){
			this.sex = sex;
		}
	}
	public String getSex() {
		return sex;
	}
	public void setIdCard(String idCard) {
		String str=checkIdCard(idCard);
		if(str.equals("")){
			this.idCard = idCard;
		}else{
			System.out.println(str);
		}
	}
	
	private String checkIdCard(String idCard){
		String result="";
		if(idCard.length()!=18){
			result="身份证号长度不是18位";
		}else{
			char ch=idCard.charAt(18);//将身份证号的最后一个字符赋给变量ch
			if(ch!='x'){
				result="身份证号最后一位不是小写x";
			}else{
				for(int i=1;i<idCard.length();i++){
					char ch1=idCard.charAt(i);
					if((ch1<'0')||(ch1>'9')){
						result="身份证号后4位有非数字字符";
						break;
					}
				}
			}
		}
		return result;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}

}
