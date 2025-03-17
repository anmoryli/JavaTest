package com.anmory.py_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@RestController
public class test {
    public static void main(String[] args) {
        try {
            // 1. 定义Anaconda环境参数
            String condaPath = "D:\\miniconda3\\Scripts\\conda.exe"; // Windows示例
            String envName = "D:\\miniconda3\\envs\\ultralytics";
            String pythonScript = "src\\main\\resources\\static\\predict.py";

            // 2. 构建跨平台命令
            ProcessBuilder pb = new ProcessBuilder(
                    "cmd.exe", "/c",
                    condaPath + " run -p " + envName + " python " + pythonScript
            );

            // 合并标准输出和错误输出
            pb.redirectErrorStream(true);

            // 在ProcessBuilder中添加环境变量
            Map<String, String> env = pb.environment();
            env.put("PYTHONIOENCODING", "utf-8");  // 强制Python使用UTF-8输出
            env.put("CONDA_NO_PLUGINS", "true");   // 禁用Conda插件（解决报告生成错误）

            // 3. 启动进程并获取输出
            Process process = pb.start();

            // 4. 异步读取输出流（防止阻塞）
            new Thread(() -> {
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println("[PYTHON OUTPUT] " + line);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();

            // 5. 等待进程结束
            int exitCode = process.waitFor();
            System.out.println("Exit Code: " + exitCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}