# # -*- coding: utf-8 -*-
# from ultralytics import YOLO
# import numpy as np
# import jsonify
# import time
# import json
#
# # Load a model
# # model = YOLO("yolov8n-cls.pt")  # load an official model
# model = YOLO("D:/ultralytics-8.2.98/learning4/runs/classify/train/weights/best.pt")  # load a custom model
#
# # Predict with the model
# results = model("D:/ultralytics-8.2.98/learning4/planet/川贝母/0E0F5CA9D8057479.jpg", show=True)  # predict on an image
# # results = model("https://img1.iplant.cn/image2/236/2293667FC8A64BC9.jpg", show=True)  # predict on an image
#
# names_dict = results[0].names
# probs = results[0].probs.data.tolist()
#
# result = {
#     "prediction": names_dict[np.argmax(probs)]
# }
#
# print(names_dict[np.argmax(probs)])
#
# json_result = json.dumps(result, ensure_ascii=False)
# print(json_result)

# -*- coding: utf-8 -*-
from ultralytics import YOLO
import numpy as np
import jsonify
import time
import json

def predict():
    # Load a model
    # model = YOLO("yolov8n-cls.pt")  # load an official model
    model = YOLO("D:/ultralytics-8.2.98/learning4/runs/classify/train/weights/best.pt")  # load a custom model

    # Predict with the model
    results = model("D:/ultralytics-8.2.98/learning4/planet/川贝母/0E0F5CA9D8057479.jpg", show=True)  # predict on an image
    # results = model("https://img1.iplant.cn/image2/236/2293667FC8A64BC9.jpg", show=True)  # predict on an image
    # 获取结果
    names_dict = results[0].names
    probs = results[0].probs.data.tolist()
    # 将结果转换为字典并序列化为JSON字符串
    result_dict = {
        "names": names_dict,
        "probs": probs
    }
    result_json = json.dumps(result_dict)

    # 打印JSON字符串到标准输出
    print(result_json)

# 调用predict函数
predict()

    # result = {
    #     "prediction": names_dict[np.argmax(probs)]
    # }
    #
    # print(names_dict[np.argmax(probs)])
    #
    # json_result = json.dumps(result, ensure_ascii=False)
    # print(json_result)