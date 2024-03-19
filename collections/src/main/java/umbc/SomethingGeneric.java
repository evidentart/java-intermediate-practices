package umbc;

public class SomethingGeneric<T> {

  private T value;

  public SomethingGeneric(T value) {
    this.value = value;
  }
  
  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

}
