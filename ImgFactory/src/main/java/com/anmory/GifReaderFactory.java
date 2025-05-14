package com.anmory;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-27 下午5:56
 */

public class GifReaderFactory extends ImageReaderFactory{
    @Override
    public ImageReader getImageReader() {
        System.out.println("生产gif阅读器");
        return new GifReader();
    }
}
