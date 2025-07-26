package com.jemish.hasher;

// Import Apache Commons Codec library for hashing functions .. //
import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {
        // Check if at least one argument is passed
        if (args.length < 1) {
            System.out.println("Usage: java -jar string-hasher.jar <text>");
            return;
        }
        // Retrieve the first command-line argument
        String input = args[0];
        String hash = DigestUtils.sha256Hex(input);
        System.out.println("SHA-256: " + hash);
    }
}
