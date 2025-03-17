from ultralytics import YOLO
import numpy as np
import jsonify
import time
import json
import sys
import io


# 强制标准输出为UTF-8
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8', errors='replace')

# 1. 禁用YOLO的冗余输出（关键步骤）
YOLO.verbose = False  # 关闭模型加载/推理的日志[8](@ref)
def predict():
    # Load a model
    # model = YOLO("yolov8n-cls.pt")  # load an official model
    # model = YOLO("best.pt")  # load a custom model
    # 设置工作路径为当前
    model = YOLO("best.pt")  # load a custom model

    # results = model.predict("D:\\ultralytics-8.2.98\\learning4\\planet\\川贝母\\0A5D1144430BEBCD7521596FF5F7FDE8.jpg", max_det=1, conf=0.6, device='cuda', verbose=False)


    # Predict with the model
    results = model("D:\\ultralytics-8.2.98\\learning4\\planet\\川贝母\\0A5D1144430BEBCD7521596FF5F7FDE8.jpg",show=False, verbose=False)  # predict on an image
    # results = model("https://img1.iplant.cn/image2/236/2293667FC8A64BC9.jpg",show=True)  # predict on an image

    names_dict = results[0].names
    probs = results[0].probs.data.tolist()

    # 2. 提取结果并生成JSON
    prediction = names_dict[np.argmax(probs)]
    return prediction

if __name__ == '__main__':
    # 3. 直接打印JSON结果（唯一输出）
    print(predict(), flush=True)  # flush确保立即输出[7](@ref)