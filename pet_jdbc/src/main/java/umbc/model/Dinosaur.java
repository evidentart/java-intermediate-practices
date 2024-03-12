package umbc.model;

public class Dinosaur {
  int dinoId;
  String dinoName;
  String dinoType;
  boolean canFly;
  
  public Dinosaur() {
  }

  public Dinosaur(String dinoName, String dinoType, boolean canFly) {
    this.dinoName = dinoName;
    this.dinoType = dinoType;
    this.canFly = canFly;
  }

  public Dinosaur(int dinoId, String dinoName, String dinoType, boolean canFly) {
    this.dinoId = dinoId;
    this.dinoName = dinoName;
    this.dinoType = dinoType;
    this.canFly = canFly;
  }

  public int getDinoId() {
    return dinoId;
  }

  public void setDinoId(int dinoId) {
    this.dinoId = dinoId;
  }

  public String getDinoName() {
    return dinoName;
  }

  public void setDinoName(String dinoName) {
    this.dinoName = dinoName;
  }

  public String getDinoType() {
    return dinoType;
  }

  public void setDinoType(String dinoType) {
    this.dinoType = dinoType;
  }

  public boolean canFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + dinoId;
    result = prime * result + ((dinoName == null) ? 0 : dinoName.hashCode());
    result = prime * result + ((dinoType == null) ? 0 : dinoType.hashCode());
    result = prime * result + (canFly ? 1231 : 1237);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Dinosaur other = (Dinosaur) obj;
    if (dinoId != other.dinoId)
        return false;
    if (dinoName == null) {
        if (other.dinoName != null)
            return false;
    } else if (!dinoName.equals(other.dinoName))
        return false;
    if (dinoType == null) {
        if (other.dinoType != null)
            return false;
    } else if (!dinoType.equals(other.dinoType))
        return false;
    if (canFly != other.canFly)
        return false;
    return true;
  }

  @Override
  public String toString() {
    return "Dinosaur [dinoId=" + dinoId + ", dinoName=" + dinoName + ", dinoType=" + dinoType + ", can_fly="
            + canFly + "]";
  }
}
