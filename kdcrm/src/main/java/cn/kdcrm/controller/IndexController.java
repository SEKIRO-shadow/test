package cn.kdcrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @GetMapping("toIndex")
    @ResponseBody
    public String toIndex() {
        System.out.println("index.....");
        return "index";
    }

    @PostMapping("toIndex100")
    public String toIndex100() {
        System.out.println("toIndex100.....");
        return "index";
    }

    @RequestMapping("/toJson")
    @ResponseBody
    public Map toJson() {
        Map map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 23);
        map.put("id", 1);
        return map;
    }
}
