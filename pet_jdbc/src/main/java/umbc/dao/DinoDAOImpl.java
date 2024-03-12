package umbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import umbc.model.Dinosaur;
import umbc.util.ConnectionUtility;

public class DinoDAOImpl implements DinoDAO {

  @Override
  public Dinosaur getDino(int dinoId) {
     
      Dinosaur dino = new Dinosaur();

      // interact with database
      // 1. get a connection
      // 2. create a statement
      // 3. execute query
      // 4. process results
      // 5. close connection

      // get and close connection
      try (Connection connection = ConnectionUtility.getConnection()) {

          //create a statement
          String sql = "SELECT * FROM dino WHERE dino_id = ?;";
          PreparedStatement ps = connection.prepareStatement(sql);

          ps.setInt(1, dinoId);

          // execute query
          ResultSet rs = ps.executeQuery();

          // process results
          while(rs.next()) {
              int id = rs.getInt("dino_id");
              String name = rs.getString("dino_name");
              String type = rs.getString("dino_type");
              boolean canFly = rs.getBoolean("can_fly");

              dino = new Dinosaur(id, name, type, canFly);
          }
            
      } catch (SQLException ex) {
          ex.printStackTrace();
      }

      return dino;
    
  }

    @Override
  public Dinosaur addDino(Dinosaur dino) {
      try (Connection connection = ConnectionUtility.getConnection()){
            
          String sql = "insert into dino (dino_name, dino_type, can_fly ) values (?, ?, ?);" ;
          PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

          //write preparedStatement's setString and setInt methods here.
          preparedStatement.setString(1, dino.getDinoName());
          preparedStatement.setString(2, dino.getDinoType());
          preparedStatement.setBoolean(3, dino.canFly() );

          preparedStatement.executeUpdate();

          ResultSet pkeyResultSet = preparedStatement.getGeneratedKeys();
          if(pkeyResultSet.next()){
              int dinoId = (int) pkeyResultSet.getLong(1);
              return new Dinosaur(dinoId, dino.getDinoName(), dino.getDinoType(), dino.canFly());
          }
      }catch(SQLException e){
          System.out.println(e.getMessage());
      }
      return null;
    
  }

    @Override
  public Dinosaur updateDino(Dinosaur dino) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'updateDino'");
  }

    @Override
  public void deleteDino(int dinoId) {
        try (Connection connection = ConnectionUtility.getConnection()){
            
          String sql = "Delete from dino where dino_id = ?;" ;
          PreparedStatement preparedStatement = connection.prepareStatement(sql);

          //write preparedStatement's setString and setInt methods here.
          preparedStatement.setInt(1, dinoId);
            

          preparedStatement.executeUpdate();

            
      }catch(SQLException e){
          System.out.println(e.getMessage());
      }
  }
    
}