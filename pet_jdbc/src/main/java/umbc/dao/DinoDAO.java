package umbc.dao;

import umbc.model.Dinosaur;

public interface DinoDAO {
  
  Dinosaur getDino(int dinoId);
  Dinosaur addDino(Dinosaur dino);
  Dinosaur updateDino(Dinosaur dino);
  void deleteDino(int dinoId);

}
