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
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'updateDino'");
  }

  @Override
  public void deleteDino(int id) {
    dinoDAO.deleteDino(id);
  }
    
}