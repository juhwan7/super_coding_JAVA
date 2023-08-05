package org.example.암호화_라이브러리;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import java.io.*;

public class FileEncryptionExample {
    public static void main(String[] args) throws IOException {
        String encryptedOutputFilePath = "encrypted_abc.txt";
        String decryptedOutputFilePath = "decrypted_abc.txt";

        final String PW = "12341234";
        final String ALGORITHM = "PBEWithMD5AndDES";
        final String SALT_GENERATOR = "someFixedSalt";

        // TODO: 위 정보를 이용해서 "encryptedOutputFilePath" 파일을 읽고 복호화 하영합니다.
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(PW);
        encryptor.setAlgorithm(ALGORITHM);

        String text = encryptor.decrypt(readTextFile(encryptedOutputFilePath));

        System.out.println("복호화되어 나온 text: "+text);


        System.out.println("Decryption completed successfully.");
    }

    private static String readTextFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
