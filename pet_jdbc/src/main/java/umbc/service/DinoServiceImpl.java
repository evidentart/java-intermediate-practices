package umbc.service;

import umbc.dao.DinoDAO;
import umbc.model.Dinosaur;


public class DinoServiceImpl implements DinoService {

  DinoDAO dinoDAO;

  public DinoServiceImpl(DinoDAO dinoDAO) {
      this.dinoDAO = dinoDAO;
  }

  @Override
  public Dinosaur getDino(int dino_id) {
      return dinoDAO.getDino(dino_id);
  }

  @Override
  public Dinosaur addDino(Dinosaur dino) {
      return dinoDAO.addDino(dino);    
  }

  @Override
  public Dinosaur updateDino(Dinosaur dino) {
      return dinoDAO.updateDino(dino);
  }

  @Override
  public void deleteDino(int id) {
    dinoDAO.deleteDino(id);
  }
    
}