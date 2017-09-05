package com.wrap;

import com.wrap.MyAppObjectWrapper;
import freemarker.template.Configuration;
import freemarker.template.SimpleHash;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by admin on 2017/9/5.
 */
public class ObjectWrapperFreeMarkerView extends FreeMarkerView {

    @Override
    protected SimpleHash buildTemplateModel(Map<String, Object> model,
                                            HttpServletRequest request,
                                            HttpServletResponse response) {
        SimpleHash hash =  super.buildTemplateModel(model, request, response);
        hash.setObjectWrapper(new MyAppObjectWrapper(Configuration.getVersion()));
        return hash;
    }
}
