package log;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;





import javax.inject.Named;

@Named
@RequestScoped

public class Item implements Serializable {

    private boolean status;
    private String name; 

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}