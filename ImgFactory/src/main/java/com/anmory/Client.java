package com.anmory;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-27 下午6:15
 */

public class Client {
    public static void main(String[] args) {
        ImageReaderFactory imageReaderFactory1 = new GifReaderFactory();
        ImageReaderFactory imageReaderFactory2 = new JpgReaderFactory();

        imageReaderFactory1.getImageReader().readImg();
        imageReaderFactory2.getImageReader().readImg();
    }
}
