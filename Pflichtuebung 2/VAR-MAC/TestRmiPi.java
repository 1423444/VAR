import java.rmi.Naming;
import java.rmi.Remote;

/**
 * Created by heart on 12.05.16.
 */
public class TestRmiPi {
    String name;
    Remote obj;
    static String[] bindings = java.rmi.Naming.list(name);

    public static void main(String[] args){

        -Djava.rmi.server.codebase="/Users/heart/IdeaProjects/VAR2_RMI/src/ComputePiServer.java";
        -Djava.security.policy=java.policy;
        ComputePiServerStartup localhost;

        -Djava.security.policy=

        grant{
            permission java.net.SocketPermission("*:1024-65535", "connect, accept");
        }
        Naming.rebind(name, obj);
        Remote object = Naming.lookup(name);
        Naming.unbind(name, obj);

    }
}
