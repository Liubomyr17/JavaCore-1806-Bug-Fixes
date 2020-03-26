package com.company;

/*
1806 Bug Fixes
Fix functionality as required.
The program should:
1. Copy all bytes of one file to another in one piece.
2. Close I / O streams.
Hint:
4 errors.

Requirements:
1. The program should use the classes FileInputStream and FileOutputStream.
2. The program should rewrite all the bytes of one file to another in one piece.

3. The streams FileInputStream and FileOutputStream must be closed. 4. Need to fix 4 errors.
 */

import java.io.FileInputStream;
import java.nio.Buffer;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("d:/data.txt");
        FileOutputStream outputStream = new FileOutputStream("d:/result.txt");
        if(inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }
        inputStream.close();
        outputStream.close();
    }
}
