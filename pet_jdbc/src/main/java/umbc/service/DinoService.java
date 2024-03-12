package umbc.service;

import umbc.model.Dinosaur;

public interface DinoService {
    
   Dinosaur getDino(int dinoId);

   Dinosaur addDino(Dinosaur dino);

   Dinosaur updateDino(Dinosaur dino);

   void deleteDino(int id);
}