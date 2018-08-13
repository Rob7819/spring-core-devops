package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/21/16.
 */
@Component
@Profile("google-sql")
public class GoogleProfileSysOut {

    @Autowired
    public GoogleProfileSysOut(@Value("${guru.springframework.profile.message}") String msg) {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("##         GOOGLE SQL           ##");
        System.out.println(msg);
        System.out.println("##################################");
        System.out.println("##################################");
    }
}
