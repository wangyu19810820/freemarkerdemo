package com;

import com.wrap.Dictionary;
import com.wrap.ProductTypeEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by admin on 2017/9/1.
 */
@Controller
@RequestMapping("/Demo")
public class DemoController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("list");
        mv.addObject("list", Arrays.asList("a", "b", "c"));
        return mv;
    }

    @RequestMapping("audit_warning")
    public ModelAndView auditWarning() {
        ModelAndView mv = new ModelAndView("audit_warning");
        ProductModel p1 = new ProductModel("1", "双黄连口服液", new Date(new Date().getTime()));
        ProductModel p2 = new ProductModel("2", "慢支喘康速", new Date(new Date().getTime() - 1000 * 60 * 60 * 25));
        ProductModel p3 = new ProductModel("3", "六味地黄丸", new Date(new Date().getTime() - 1000 * 60 * 60 * 49));
        ProductModel p4 = new ProductModel("4", "丽珠得乐冲剂", new Date(new Date().getTime() - 1000 * 60 * 60 * 73));
        mv.addObject("productList", Arrays.asList(p1, p2, p3, p4));
        return mv;
    }

    @RequestMapping("enum_demo")
    public ModelAndView enumDemo() {
        ModelAndView mv = new ModelAndView("enum_demo");
        ProductModel p1 = new ProductModel("1", "头孢氨卡胶囊", new Date(new Date().getTime()));
        p1.setType(ProductTypeEnum.ANTIBIOTIC);
        ProductModel p2 = new ProductModel("2", "速效救心丸", new Date(new Date().getTime() - 1000 * 60 * 60 * 25));
        p2.setType(ProductTypeEnum.CARDIOVASCULAR);
        ProductModel p3 = new ProductModel("3", "健胃消食片", new Date(new Date().getTime() - 1000 * 60 * 60 * 49));
        p3.setType(ProductTypeEnum.DIGESTIVE);
        mv.addObject("productList", Arrays.asList(p1, p2, p3));
        return mv;
    }

    @RequestMapping("adapter_obj")
    public ModelAndView adapterObj() {
        ModelAndView mv = new ModelAndView("adapter_obj");
        mv.addObject("data1", new Dictionary("送审状态", 1));
        mv.addObject("data2", new Dictionary("审核状态", 2));
        return mv;
    }

    @RequestMapping("case_direc")
    public ModelAndView caseDirec() {
        ModelAndView mv = new ModelAndView("case_direc");
        return mv;
    }

}
