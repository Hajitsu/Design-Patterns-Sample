package ir.hajitsu.strategy;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Hash implements HashStrategy {
    @Override
    public byte[] hash(String raw) {
        return DigestUtils.md5(raw);
    }
}
