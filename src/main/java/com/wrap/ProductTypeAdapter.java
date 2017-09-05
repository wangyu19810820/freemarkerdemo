package com.wrap;

import freemarker.template.*;

/**
 * Created by admin on 2017/9/5.
 */
public class ProductTypeAdapter extends WrappingTemplateModel
        implements TemplateScalarModel, AdapterTemplateModel {

    private final ProductTypeEnum productTypeEnum;

    public ProductTypeAdapter(ProductTypeEnum productTypeEnum, ObjectWrapper ow) {
        super(ow);
        this.productTypeEnum = productTypeEnum;
    }

    @Override
    public Object getAdaptedObject(Class aClass) {
        return productTypeEnum;
    }

    @Override
    public String getAsString() throws TemplateModelException {
        return productTypeEnum.toString();
    }
}
