import java.io.*;
import java.nio.channels.FileChannel;




public class NIO {

    public static void fileCopy(File in, File out)
            throws IOException {
        FileChannel inChannel = new FileInputStream(in).getChannel();
        FileChannel outChannel = new FileOutputStream(out).getChannel();
        try {
//          inChannel.transferTo(0, inChannel.size(), outChannel);      // original -- apparently has trouble copying large files on Windows

            // magic number for Windows, 64Mb - 32Kb)
            int maxCount = (64 * 1024 * 1024) - (32 * 1024);
            long size = inChannel.size();
            long position = 0;
            while (position < size) {
                position += inChannel.transferTo(position, maxCount, outChannel);
            }
        } finally {
            if (inChannel != null) {
                inChannel.close();
            }
            if (outChannel != null) {
                outChannel.close();
            }
        }
    }
//HTTP Proxy setting in Java
//System.getProperties().put("http.proxyHost", "someProxyURL");
//System.getProperties().put("http.proxyPort", "someProxyPort");
//System.getProperties().put("http.proxyUser", "someUserName");
//System.getProperties().put("http.proxyPassword", "somePassword");

//Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structure?

    boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) { // Already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    // Reduce space usage by a factor of eight by using a bit vector.
    boolean isUniqueChar(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }


}




