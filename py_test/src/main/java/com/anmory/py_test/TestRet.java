package com.anmory.py_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-25 上午9:55
 */

@RestController
public class TestRet {
    @RequestMapping("/test")

    public String predict() {
        StringBuilder output = new StringBuilder();
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

            // 补充环境变量
            Map<String, String> env = pb.environment();
            env.put("PYTHONIOENCODING", "utf-8");
            env.put("PYTHONUTF8", "1");
            env.put("CONDA_NO_PLUGINS", "true");
            env.put("LANG", "en_US.UTF-8");  // 兼容Unix-like系统

            // 3. 启动进程并获取输出
            Process process = pb.start();

            // 4. 读取输出流（防止阻塞）
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
            String line;
            while ((line = reader.readLine()) != null) {
                // 替换可能的非法字符
                line = new String(line.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
                System.out.println("[PYTHON OUTPUT] " + line);
                output.append(line).append(System.lineSeparator());
            }

            // 关闭reader
            reader.close();

            // 5. 等待进程结束
            int exitCode = process.waitFor();
            System.out.println("Exit Code: " + exitCode);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();
    }

//    public static void main(String[] args) {
//        TestRet testRet = new TestRet();
//        String result = testRet.predict();
//        System.out.println("Predict Result:");
//        System.out.println(result);
//    }
}
