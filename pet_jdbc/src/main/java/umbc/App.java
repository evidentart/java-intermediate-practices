package umbc;

import umbc.controller.RobosaurController;
import umbc.dao.DinoDAO;
import umbc.dao.DinoDAOImpl;
import umbc.service.DinoService;
import umbc.service.DinoServiceImpl;
import io.javalin.Javalin;

public final class App {
    

   
    public static void main(String[] args) {

        DinoDAO dinoDAO = new DinoDAOImpl();
        DinoService dinoService = new DinoServiceImpl(dinoDAO);
        RobosaurController robosaurController = new RobosaurController(dinoService);

        Javalin app = robosaurController.startAPI();


    }
}