package com.directive;

import freemarker.core.Environment;
import freemarker.template.*;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

/**
 * Created by admin on 2017/8/22.
 */

public class CaseDirective implements TemplateDirectiveModel {
    public CaseDirective() {

    }
    @Override
    public void execute(Environment env, Map params, TemplateModel[] loopVars,
                        TemplateDirectiveBody body)
            throws TemplateException, IOException {
        SimpleScalar type = (SimpleScalar)params.get("type");
        boolean isUpper = "upper".equals(type.getAsString());
        if (body != null) {
            body.render(new CaseWrite(env.getOut(), isUpper));
        } else {
            throw new RuntimeException("missing body");
        }
    }
}

class CaseWrite extends Writer {
    private final Writer out;
    private final boolean isUpper;

    public CaseWrite(Writer out, boolean isUpper) {
        this.out = out;
        this.isUpper = isUpper;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        char[] tran = new char[len];
        for(int i = 0; i < len; i++) {
            if (isUpper)
                tran[i] = Character.toUpperCase(cbuf[off + i]);
            else
                tran[i] = Character.toLowerCase(cbuf[off + i]);
        }
        out.write(tran);
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }
}
