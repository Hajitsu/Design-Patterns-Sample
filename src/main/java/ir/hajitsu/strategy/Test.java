package ir.hajitsu.strategy;

import org.apache.commons.codec.digest.DigestUtils;

public class Test {
    public static void main(String[] args) {
        SecureContent secureContent = new SecureContent("hajitsu");
        byte[] hashed = secureContent.hashContent(new MD5Hash());
        System.out.println(hashed);

        byte[] bytes = secureContent.hashContent(new HashStrategy() {
            @Override
            public byte[] hash(String raw) {
                return DigestUtils.sha512(raw);
            }
        });
        System.out.println(bytes);
    }
}
