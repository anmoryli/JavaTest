package com.anmory.springweb;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-18 下午9:44
 */

@RequestMapping("/request")
@RestController
public class RequestController {
    @RequestMapping("/r1")
    public String r1(String keyword) {
        return "接收参数" + keyword;
    }

    @RequestMapping("/login")
    public String login(String username, String password) {
        return "username" + username + ",password:" + password;
    }

    @RequestMapping("/r2")
    public String r2(Integer num) {
        return "num: " + num;
    }

    @RequestMapping("/r3")
    public String r3(UserInfo userInfo) {
        return "userInfo: " + userInfo.toString();
    }

    // 参数重命名
    @RequestMapping("/rename_param")
    public String r4(@RequestParam(value = "q",required = false)String keyword) {
        return "userInfo: " + keyword;
    }

    // 发送数组参数
    @RequestMapping("/send_arrays")
    public String r5(String[] arr) {
        return "info: " + Arrays.toString(arr);
    }

    // 发送集合参数
    @RequestMapping("/send_list")
    public String r6(@RequestParam List<Integer> list) {//需要加上注解
        return "info: " + list;
    }

    // 传递json
    @RequestMapping("/submit_json")
    public String r7(@RequestBody UserInfo userInfo) {
        System.out.println(userInfo.getName());
        return userInfo.toString();
    }

    // 获取url的参数
    @RequestMapping("/get_url_param/{id}/{name}")
    public String r8(@PathVariable() Integer id, @PathVariable() String name) {
        return "get id: " + id + '\n' +
                "get name: " + name;
    }

    // 上传文件
    @RequestMapping("/file_upload")
    public String fileupload(@RequestPart("f") MultipartFile file) throws IOException {// 重命名文件
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("D:\\Code\\Test\\test\\SpringWeb\\src\\main\\resources\\static\\" + file.getOriginalFilename()));
        return "SUCCESS";
    }
}
