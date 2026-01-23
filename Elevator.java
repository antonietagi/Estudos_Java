class Elevator {
  private int currentFloor; //andar atual
  private int totalFloor; //total de andares
  private int capacityElevator; //capacidade max do elevador
  private int peopleAmount; //pessoas que estão dentro
  
  public Elevator(int totalFloor, int capacityElevator) {
    this.totalFloor = totalFloor;
    this.capacityElevator = capacityElevator;
    this.currentFloor = 0; //começa no térreo
    this.peopleAmount = 0; //pode ser definido dps
  }
  
  public void addPerson() {
    if (peopleAmount < capacityElevator) {
      peopleAmount++;
    } else {
      System.out.println("Elevador está cheio");
    }
  }
  
  public void removePerson() {
    if(peopleAmount > 0) {
      peopleAmount--;
    } else {
      System.out.println("Elevador vazio");
    }
  }
  
  public void goUpOneFloor() {
    if (currentFloor < totalFloor) {
      currentFloor++;
    } else {
      System.out.println("Chegou no último andar");
    }
  }
  
  public void goDownOneFloor() {
    if (currentFloor > 0) {
      currentFloor--;
    } 
  }
  
  public int getCurrentFloor() {
    return currentFloor;
  }
  
  public int getPeopleAmount() {
    return peopleAmount;
  }
}

public class Main {
  public static void main(String[] args) {
    Elevator elevator = new Elevator(12, 16);
    
    elevator.addPerson();
    elevator.addPerson();
    elevator.addPerson();
    elevator.addPerson();
    elevator.goUpOneFloor();
    elevator.goUpOneFloor();
    elevator.goUpOneFloor();
    elevator.goDownOneFloor();
  
    System.out.println("Andar Atual: " + elevator.getCurrentFloor());
    System.out.println("Total de Pessoas: " + elevator.getPeopleAmount());

    
  }
}
