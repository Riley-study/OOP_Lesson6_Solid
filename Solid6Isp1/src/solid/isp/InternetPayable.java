package solid.isp;

import jdk.jshell.spi.ExecutionControl;

public interface InternetPayable extends Payable{
    void payPhoneNumber(int amount);
}
