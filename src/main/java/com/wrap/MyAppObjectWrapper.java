package com.wrap;

import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import freemarker.template.Version;

/**
 * Created by admin on 2017/8/23.
 */
public class MyAppObjectWrapper extends DefaultObjectWrapper {

    public MyAppObjectWrapper(Version version) {
        super(version);
    }

    @Override
    protected TemplateModel handleUnknownType(Object obj)
            throws TemplateModelException {
        if (obj instanceof ProductTypeEnum) {
            return new ProductTypeAdapter((ProductTypeEnum)obj, this);
        }
        if (obj instanceof Dictionary) {
            return new DictionaryAdapter((Dictionary)obj, this);
        }
        return super.handleUnknownType(obj);
    }
}
