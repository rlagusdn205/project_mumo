package com.kim.project.web;

import com.kim.project.config.auth.dto.LoginUser;
import com.kim.project.config.auth.dto.SessionUser;
import com.kim.project.service.posts.PostsService;
import com.kim.project.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

}