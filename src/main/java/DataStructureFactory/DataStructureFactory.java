package DataStructureFactory;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public class DataStructureFactory {
    JSONObject jsonObject;
    public DataStructureFactory(String path){
        try {
            jsonObject = (JSONObject) new JSONParser().parse(new FileReader(path));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public IAbstractFactory getAbstractFactory(){
        String type = (String) jsonObject.get("type");
        if (type.equals("unbounded")) {
            return new UnboundedDataStructureFactory();
        } else if (type.equals("bounded")) {
            return new BoundedDataStructureFactory( Integer.valueOf((String) jsonObject.get("length")));
        } else {
            return new UnboundedDataStructureFactory();
        }
    }
}
