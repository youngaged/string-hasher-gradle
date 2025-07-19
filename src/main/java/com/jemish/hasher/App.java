package com.jemish.hasher;

import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java -jar string-hasher.jar <text>");
            return;
        }
        String input = args[0];
        String hash = DigestUtils.sha256Hex(input);
        System.out.println("SHA-256: " + hash);
    }
}