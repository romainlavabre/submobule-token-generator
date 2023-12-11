package org.romainlavabre.tokengen;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

/**
 * @author Romain Lavabre <romainlavabre98@gmail.com>
 */
public class TokenGenerator {


    public static String generate() {
        return generate( 8 );
    }


    public static String generate( int length ) {
        return UUID.randomUUID()
                   .toString()
                   .replace( "-", "" )
                   .substring( 0, length );
    }


    /**
     * Generates a secure random code of the 4 character.
     *
     * @return a random code of the specified size
     */
    public static String generateSecureCode() {
        return generateSecureCode( 4 );
    }


    /**
     * Generates a secure random code of the specified size.
     *
     * @param size the size of the code to generate
     * @return a random code of the specified size
     */
    public static String generateSecureCode( int size ) {
        Random        rand  = new SecureRandom();
        StringBuilder token = new StringBuilder();

        while ( token.length() < size ) {
            token.append( rand.nextInt( 10 ) );
        }

        return token.toString();
    }
}
