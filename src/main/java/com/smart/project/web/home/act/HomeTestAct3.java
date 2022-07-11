package com.smart.project.web.home.act;

import com.smart.project.component.CommonCodeComponent;
import com.smart.project.component.data.CodeObject;
import com.smart.project.proc.Test;
import com.smart.project.util.CookieUtil;
import com.smart.project.web.home.vo.JoinVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Member;
import java.util.*;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeTestAct3 {

    /* 공통 영역*/
    @RequestMapping("/head")
    public String head(){
        return "fragment/head";
    }

    @RequestMapping("/login")
    public void login(){
    }

    /* 참고페이지*/
    @RequestMapping("/index")
    public void index(){
    }



    /* 사용자 페이지 */
    @RequestMapping("/main")
    public void main(){
    }

    @RequestMapping("/service")
    public void service(){
    }

    @RequestMapping("/upload")
    public void upload(){
    }

    @RequestMapping("/result")
    public void result(){
    }

    @RequestMapping("/join_edit")
    public void join_edit(){
    }

    @RequestMapping("/join")
    public void join(){
    }

    @RequestMapping("/community")
    public void community(){

    }

    @RequestMapping("/myList")
    public void myList(){
    }

    @RequestMapping("/shop_checkout")
    public void shop_checkout(){

    }

    @RequestMapping("/write")
    public void write(){

    }

    @RequestMapping("/write_view")
    public void write_view(){

    }
    @RequestMapping("/buttons")
    public void buttons(){

    }



    /* 관리자 페이지 - 대시보드 */

    @RequestMapping("/admin_member")
    public void admin_member(){

    }

    @RequestMapping("/admin_play")
    public void admin_play(){

    }

}
