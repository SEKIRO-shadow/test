package cn.kdcrm.controller;

import cn.kdcrm.pojo.SystemRole;
import cn.kdcrm.pojo.SystemUserinfo;
import cn.kdcrm.service.SystemRoleService;
import cn.kdcrm.service.SystemUserinfoService;
import cn.kdcrm.utils.ConfigUtil;
import cn.kdcrm.utils.LoginGroup;
import cn.kdcrm.utils.RedisConfig;
import cn.kdcrm.utils.UpdateGroup;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SystemUserInfoController {

    @Autowired
    SystemUserinfoService systemUserinfoService;

    @GetMapping("/testException")
    public String testException()
    {
        System.out.println(1/0);
        return "index";
    }
/*    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map<String,String> exceptionHandler(Exception ex)
    {
         Map<String,String>  map=new HashMap<>();
         map.put("code","100");
         map.put("msg",ex.getMessage());
        return map;
    }*/
/*    @ExceptionHandler(value = Exception.class)
    public ModelAndView exceptionHandler(Exception ex)
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("msg",ex);
        modelAndView.setViewName("error");
        return modelAndView;
    }*/

    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/redis")
    @ResponseBody
    public String redis()
    {
        System.out.println(redisTemplate);


        // PageInfo<SystemUserinfo> pageInfo=systemUserinfoService.selectAll(null,1,10);

        //  redisTemplate.opsForValue().set("pageInfo",pageInfo);

        System.out.println(redisTemplate.opsForValue().get("pageInfo"));
        //redisTemplate.opsForValue().set("pageInfo",pageInfo,10, TimeUnit.SECONDS);


        return "redis";
    }



    @GetMapping("/toLogin")
    public String toLogin()
    {

        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@Validated(value = {LoginGroup.class}) SystemUserinfo su, BindingResult bindingResult, HttpServletRequest request, Model model)
    {
        //?????????????????????
        System.out.println(bindingResult.hasErrors());
        if(bindingResult.hasErrors())
        {

            List<ObjectError> listError=bindingResult.getAllErrors();
            for(ObjectError objectError:listError)
            {
                Map<String,String> mapError=new HashMap<>();
                FieldError fieldError=(FieldError)objectError;
                System.out.println(fieldError.getField()+"\t"+objectError.getDefaultMessage());
                mapError.put(fieldError.getField(),objectError.getDefaultMessage());
                model.addAllAttributes(mapError);
                // request.setAttribute(fieldError.getField(),objectError.getDefaultMessage());
            }
            return  "login";
        }
        else {
            SystemUserinfo systemUserinfo = systemUserinfoService.login(su.getUserinfoLoginid(), su.getUserinfoPassword());
            if (systemUserinfo == null) {
                request.setAttribute("MSG", "????????????????????????");
                return "login";
            }
            return "redirect:selectAll";
        }
    }
    @GetMapping("/toUpdateUser")
    public String toUpdateUser(HttpServletRequest request,String uid)
    {
        SystemUserinfo systemUserinfo=systemUserinfoService.selectByPrimaryKey(uid);
        List<SystemRole> listRole=systemRoleService.selectAll();

        request.setAttribute("listRole",listRole);
        request.setAttribute("systemUserinfo",systemUserinfo);
        return "updateUser";
    }
    @PostMapping("/doUpdateUser")
    public String doUpdateUser(@Validated(value = {UpdateGroup.class})  SystemUserinfo systemUserinfo, BindingResult bindingResult, Model model, HttpServletRequest request)
    {

        if(bindingResult.hasErrors())
        {

            List<SystemRole> listRole=systemRoleService.selectAll();
            request.setAttribute("listRole",listRole);

            List<ObjectError> listError=bindingResult.getAllErrors();
            for(ObjectError objectError:listError)
            {
                Map<String,String> mapError=new HashMap<>();
                FieldError fieldError=(FieldError)objectError;
                //System.out.println(fieldError.getField()+"\t"+objectError.getDefaultMessage());
                mapError.put(fieldError.getField(),objectError.getDefaultMessage());
                model.addAllAttributes(mapError);
                // request.setAttribute(fieldError.getField(),objectError.getDefaultMessage());
            }
            return  "updateUser";
        }else {
            int r = systemUserinfoService.updateByPrimaryKey(systemUserinfo);
            if (r > 0) {
                return "redirect:/selectAll";
            } else {
                request.setAttribute("msg", "????????????");
                return "updateUser";
            }
        }

    }
    @GetMapping("/delUser")
    public String delUser(HttpServletRequest request,String uid)
    {
        int r=systemUserinfoService.deleteByPrimaryKey(uid);

        return "redirect:/selectAll";


    }


    @Autowired
    SystemRoleService systemRoleService;

    /**
     * ??????????????????????????????
     * @param request
     * @return
     */
    @GetMapping("/toAddUser")
    public String toAddUser(HttpServletRequest request)
    {
        List<SystemRole> listRole=systemRoleService.selectAll();

        request.setAttribute("listRole",listRole);

        return "addUser";
    }

    /**
     * ????????????????????????
     * @param request
     * @param systemUserinfo
     * @return
     */
    @PostMapping("/doSaveUser")
    public String doSaveUser(HttpServletRequest request,SystemUserinfo systemUserinfo)
    {
        int r=systemUserinfoService.insert(systemUserinfo);
        return "redirect:/selectAll";
    }

    @RequestMapping("/selectAll")
    public String selectAll(SystemUserinfo systemUserinfo,HttpServletRequest request,@RequestParam(name = "pageNum",defaultValue = "1") int pageNum,@RequestParam(name = "pageSize",defaultValue = "5") int pageSize)
    {
        //System.out.println("systemUserinfo???"+systemUserinfo);

        PageInfo<SystemUserinfo> pageInfo=systemUserinfoService.selectAll(systemUserinfo,pageNum,pageSize);
/*        System.out.println("????????????"+pageInfo.getPageNum());
        System.out.println("????????????????????????"+pageInfo.getPageSize());
        System.out.println("?????????????????????"+pageInfo.getSize());
        System.out.println("???????????????"+pageInfo.getTotal());
        System.out.println("????????????"+pageInfo.getPages());
        System.out.println("?????????:"+pageInfo.getList());
        System.out.println("?????????:"+pageInfo.getNavigateFirstPage());
        System.out.println("?????????:"+pageInfo.getPrePage());
        System.out.println("?????????:"+pageInfo.getNextPage());
        System.out.println("????????????:"+pageInfo.getNavigateLastPage());
        System.out.println("?????????????????????"+pageInfo.isIsFirstPage());
        System.out.println("????????????????????????"+pageInfo.isIsLastPage());
        System.out.println("?????????????????????"+pageInfo.isHasPreviousPage());
        System.out.println("?????????????????????"+pageInfo.isHasNextPage());
        System.out.println("???????????????"+pageInfo.getNavigatePages());
        System.out.println("??????????????????"+ Arrays.toString(pageInfo.getNavigatepageNums()));*/
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("systemUserinfo",systemUserinfo);

        List<SystemRole> listRole=systemRoleService.selectAll();

        request.setAttribute("listRole",listRole);

        return "list";
    }


}
