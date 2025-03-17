package com.anmory.callpy;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 上午11:09
 */

public class Main {
    public static void main(String[] args) {
        try {
            // 替换以下路径为您的Conda环境路径和Python脚本路径
            String condaEnvName = "ultralytics"; // 替换为您的Conda环境名称
            String pythonScriptPath = "src/main/resources/static/predict.py";

            // 在Windows上，使用conda activate命令可能需要额外的步骤，如下所示
            // 在Linux或macOS上，命令会有所不同，请相应地修改
            ProcessBuilder pb = new ProcessBuilder(
                    "conda", "run", "-n", condaEnvName, "python", pythonScriptPath
            );
            pb.redirectErrorStream(true);

            // 启动进程
            Process process = pb.start();

            // 读取 Python 脚本的输出
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // 等待进程结束
            int exitCode = process.waitFor();
            System.out.println("Python 脚本执行完毕，退出码: " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
