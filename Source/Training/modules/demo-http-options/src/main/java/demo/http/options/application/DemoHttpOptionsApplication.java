package demo.http.options.application;

import java.util.Set;
import java.util.HashSet;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import demo.http.options.resource.StudentResource;

import org.osgi.service.component.annotations.Component;

@Component(
    property = {
        "osgi.jaxrs.application.base=/studentapi",
        "osgi.jaxrs.name=StudentAPI.Rest"
    },
    service = Application.class
)
@ApplicationPath("/api")
public class DemoHttpOptionsApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(StudentResource.class);
        return classes;
    }
}
