package com.method;

import freemarker.template.SimpleDate;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/9/5.
 */
public class AuditWarningFMethod implements TemplateMethodModelEx {

    @Override
    public Object exec(List arguments) throws TemplateModelException {
        if (arguments.size() != 1)
            throw new TemplateModelException("Wrong Argument");
        Date auditDate = ((SimpleDate)arguments.get(0)).getAsDate();
        LocalDate auditLocalDate = auditDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate nowLocalDate = LocalDate.now();
        Period p = Period.between(auditLocalDate, nowLocalDate);
        if (p.getDays() > 2) {
            return "送审已经两天以上";
        } else if (p.getDays() == 2) {
            return "送审已经两天";
        } else if (p.getDays() == 1) {
            return "送审已经一天";
        } else {
            return "";
        }
    }
}
