package umbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;

import umbc.dao.DinoDAO;

import umbc.model.Dinosaur;
import umbc.service.DinoService;
import umbc.service.DinoServiceImpl;


public class DinoServiceTest {

  @InjectMocks
  Dinosaur dino;
  private DinoDAO dinoDAO;
  private DinoService dinoService;

  @BeforeEach
  public void setUp() {
    dinoDAO = mock(DinoDAO.class);
    dinoService = new DinoServiceImpl(dinoDAO);

  }

  @AfterEach
  public void tearDown() {
    dinoDAO = null;
  }

  
  @Test
  public void testGetDino() {
    // Arrange
    int dinoId = 1;
    Dinosaur expectedDino = new Dinosaur(1, "dinoName", "dinoType", false);
    
    when(dinoDAO.getDino(dinoId)).thenReturn(expectedDino);

    // Act
    Dinosaur actualDino = dinoService.getDino(dinoId);

    // Assert
    assertEquals(expectedDino, actualDino);
    verify(dinoDAO, times(1)).getDino(dinoId);
    
  }

  @Test
  public void testAddDino() {
    // Arrange
    Dinosaur expectedDino = new Dinosaur(1, "dinoName", "dinoType", false);
    when(dinoDAO.addDino(expectedDino)).thenReturn(expectedDino);

    // Act
    Dinosaur addedDino = dinoService.addDino(dino);

    // Assert
    assertEquals(dino, addedDino);
    verify(dinoDAO, times(1)).addDino(dino);
  }

  @Test
  public void testUpdateDino() {
    // Arrange
    Dinosaur dino = new Dinosaur(1, "T-Rex", "Carnivore", false);
    when(dinoDAO.updateDino(dino)).thenReturn(dino);

    // Act
    Dinosaur updatedDino = dinoService.updateDino(dino);

    // Assert
    assertEquals(dino, updatedDino);
    verify(dinoDAO, times(1)).updateDino(dino);
  }

  @Test
  public void testDeleteDino() {
    // Arrange
    int dinoId = 1;
   
    // Act
    dinoService.deleteDino(dinoId);

    // Assert
    verify(dinoDAO, times(1)).deleteDino(dinoId);

  }



}