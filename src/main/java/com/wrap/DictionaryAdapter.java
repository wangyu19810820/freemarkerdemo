package com.wrap;

import freemarker.template.*;

/**
 * Created by admin on 2017/9/5.
 */
public class DictionaryAdapter extends WrappingTemplateModel
        implements TemplateScalarModel, AdapterTemplateModel {

    private final Dictionary dictionary;

    public DictionaryAdapter(Dictionary dictionary, ObjectWrapper ow) {
        super(ow);
        this.dictionary = dictionary;
    }

    @Override
    public Object getAdaptedObject(Class aClass) {
        return dictionary;
    }

    @Override
    public String getAsString() throws TemplateModelException {
        return dictionary.getValue();
    }
}