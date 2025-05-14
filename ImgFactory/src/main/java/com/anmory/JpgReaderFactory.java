package com.anmory;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-27 下午5:57
 */

public class JpgReaderFactory extends ImageReaderFactory{
    @Override
    public ImageReader getImageReader() {
        System.out.println("生产jpg阅读器");
        return new JpgReader();
    }
}
