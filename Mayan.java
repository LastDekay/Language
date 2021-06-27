class Mayan extends Language{
  Mayan(String name, int numSpeakers){
    super(name,numSpeakers,"Central America","Verb-Object-Subject");
  }

  @Override
  public void getInfo(){
    System.out.println(getName() + " is spoken by " + getNumSpeakers() + " people mainly in " + getRegionsSpoken() + ".\nThe language follows the word order:" + getWordOrder() +".");
    System.out.println("Fun fact: "+ name +" is an ergative language.");
  }
}
