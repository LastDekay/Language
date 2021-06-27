class Language{
  
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;
  
  Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }

  //getters and setters
  public void setName(String name){
    this.name = name;
  }
  
  public void setNumSpeakers(int numSpeakers){
    this.numSpeakers = numSpeakers;
  }

  public void setRegionsSpoken(String regionsSpoken){
    this.regionsSpoken = regionsSpoken;
  }

  public void setWordOrder(String wordOrder){
    this.wordOrder = wordOrder;
  }

  public String getName(){
    return name;
  }

  public int getNumSpeakers(){
    return numSpeakers;
  }

  public String getRegionsSpoken(){
    return regionsSpoken;
  }

  public String getWordOrder(){
    return wordOrder;
  }

  public void getInfo(){
    System.out.println(getName() + " is spoken by " + getNumSpeakers() + " people mainly in " + getRegionsSpoken() + ".\nThe language follows the word order:" + getWordOrder() +".");
  }


  public static void main(String[] args){
    Language testLang = new Language("TestLang",100,"Test Land","SVO");
    Language kiche = new Mayan("Ki'che''",2330000);
    Language choni = new SinoTibetan("Choni",150000);
    kiche.getInfo();
    choni.getInfo();
  }
}
