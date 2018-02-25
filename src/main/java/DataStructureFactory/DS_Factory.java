package DataStructureFactory;

import Queue.AQueue;
import Queue.IQueue;
import Queue.LQueue;
import Stack.AStack;
import Stack.IStack;
import Stack.LStack;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public class DS_Factory {
    JSONObject jsonObject;
    public DS_Factory(String path){
        try {
            jsonObject = (JSONObject) new JSONParser().parse(new FileReader(path));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

  public IStack getStack(){
        String type = (String) jsonObject.get("stack");
      if (type.equals("unbounded")) {
          return new LStack();
      } else if (type.equals("bounded")) {
          return new AStack( Integer.valueOf((String) jsonObject.get("length")));
      } else {
          return new LStack();
      }
  }

  public IQueue getQueue(){
      String type = (String) jsonObject.get("queue");
      if(type.equals("unbounded")){
          return new LQueue();
      }else if(type.equals("bounded")){
          return new AQueue(Integer.valueOf((String) jsonObject.get("length")));
      }else {
          return new LQueue();
      }
  }
}
