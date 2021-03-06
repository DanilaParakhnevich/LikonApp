package by.parakhnevich.likon.config;

import by.parakhnevich.likon.Application;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                Application.class,
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}