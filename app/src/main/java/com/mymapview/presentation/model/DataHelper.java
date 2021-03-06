package com.mymapview.presentation.model;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataHelper {

    private DataHelper() {
    }

    public static byte[] convertToBytes(InputStream input) throws IOException {
        byte[] buffer = new byte[8192];
        int bytesRead;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        while ((bytesRead = input.read(buffer)) != -1) {
            output.write(buffer, 0, bytesRead);
        }
        return output.toByteArray();
    }
}
