package com.jemish.hasher;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.apache.commons.codec.digest.DigestUtils;

public class AppTest {
    @Test
    public void testHashLength() {
        String hash = DigestUtils.sha256Hex("hello");
        assertEquals(64, hash.length());
    }
}