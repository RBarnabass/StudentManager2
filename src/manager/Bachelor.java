package manager;

import java.io.IOException;

public class Bachelor extends Student {
    private String status = " Bachelor";

    public Bachelor(String firstName, String lastName, int age, String sex) throws IOException {
        super(firstName, lastName, age, sex + " Bachelor");
    }

    public String getTotalName() {
        return super.getTotalName() + status;
    }
}
