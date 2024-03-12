package umbc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import umbc.model.Dinosaur;
import umbc.service.DinoService;
import io.javalin.Javalin;
import io.javalin.http.Context;

public class RobosaurController {
    
  DinoService dinoService;

  public RobosaurController(DinoService dinoService) {
    this.dinoService = dinoService;
  }

    public Javalin startAPI() {

      // Demo lambda = number -> {
      //     System.out.println("Doing Something " + number);
      // };

      // lambda.doSomething(10);

      Javalin app = Javalin.create();

      //Dinosaur endpoints
      app.get("/dinos/{id}", ctx -> {

          String id = ctx.pathParam("id");
          try {
                
              int dinoId = Integer.parseInt(id);
              Dinosaur dino = dinoService.getDino(dinoId);
              ctx.json(dino);

          } catch(NumberFormatException ex) {
              ctx.status(400);
          }
      });
        
      app.post("/dinos", this::addDino);
      app.delete("dinos/{id}", this::deleteDino);
      app.start(8080);
      return app;
    }

  private void addDino(Context ctx) throws JsonProcessingException {
      ObjectMapper mapper = new ObjectMapper();

      Dinosaur dino = mapper.readValue(ctx.body(), Dinosaur.class);
      Dinosaur addedDino = dinoService.addDino(dino);

      if(addedDino.equals(null)) {
          ctx.status(400);
      } else {
          ctx.json(mapper.writeValueAsString(addedDino));
      }

    }

  private void deleteDino(Context ctx) {
      String id = ctx.pathParam("id");
        
      try {
          int dinoId = Integer.parseInt(id);
          dinoService.deleteDino(dinoId);
          ctx.status(200);

      } catch(NumberFormatException ex) {
          ctx.status(400);
      }
        
  } 
}
