package home_auto_api

import java.security.MessageDigest

class User {

    String name
    String username
    String password

    static constraints = {
        name                nullable: true, blank: false
        username            email: true,    blank: false, unique: true
        password            blank: false,   minSize: 8
    }

    def beforeInsert() {
        encodePassword()
    }

    protected void encodePassword() {
        def md = MessageDigest.getInstance("MD5");
        //Add password bytes to digest
        md.update(password.getBytes());
        //Get the hash's bytes
        byte[] bytes = md.digest();
        //This bytes[] has bytes in decimal format;
        //Convert it to hexadecimal format
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        //Get complete hashed password in hex format
        password = sb.toString();
    }
}
