package test;

public class Human {
	private String idCard;
	private String name;
	private String sex;
	private int height;
	private int weight;
	//���������
	public void eat(){
		System.out.println(name+"�ڳԷ�");
	}
	public void sleep(){
		System.out.println(name+"˯��");
	}
	//�������Ϊ
	public Human(String idCard,String name,String sex,int height,int weight) {
		this.idCard=idCard;
		this.name=name;
		this.sex=sex;
		this.height=height;
		this.weight=weight;
	}
	//����Ĺ��췽��
	public void setName(String name){
		this.name=name;
	}
	
    public String getName(){
		return name;
	}
	//˽�����Ե����úͻ�ȡ����
	public void setSex(String sex) {
		if((sex.equals("��"))||(sex.equals("Ů"))){
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
			result="���֤�ų��Ȳ���18λ";
		}else{
			char ch=idCard.charAt(18);//�����֤�ŵ����һ���ַ���������ch
			if(ch!='x'){
				result="���֤�����һλ����Сдx";
			}else{
				for(int i=1;i<idCard.length();i++){
					char ch1=idCard.charAt(i);
					if((ch1<'0')||(ch1>'9')){
						result="���֤�ź�4λ�з������ַ�";
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
