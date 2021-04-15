import java.io.*;
import java.nio.channels.FileChannel;




public class NIO {

    public static void fileCopy(File in, File out )
            throws IOException
    {
        FileChannel inChannel = new FileInputStream( in ).getChannel();
        FileChannel outChannel = new FileOutputStream( out ).getChannel();
        try
        {
//          inChannel.transferTo(0, inChannel.size(), outChannel);      // original -- apparently has trouble copying large files on Windows

            // magic number for Windows, 64Mb - 32Kb)
            int maxCount = (64 * 1024 * 1024) - (32 * 1024);
            long size = inChannel.size();
            long position = 0;
            while ( position < size )
            {
                position += inChannel.transferTo( position, maxCount, outChannel );
            }
        }
        finally
        {
            if ( inChannel != null )
            {
                inChannel.close();
            }
            if ( outChannel != null )
            {
                outChannel.close();
            }
        }
    }
//HTTP Proxy setting in Java
//System.getProperties().put("http.proxyHost", "someProxyURL");
//System.getProperties().put("http.proxyPort", "someProxyPort");
//System.getProperties().put("http.proxyUser", "someUserName");
//System.getProperties().put("http.proxyPassword", "somePassword");

//Appending content to file in Java

    Jaxenter out = null;
try {
        out = new Jaxenter (new FileWriter(”filename”, true));
        out.write(”aString”);
    } catch (IOException e) {
        // error processing code
    } finally {
        if (out != null) {
            out.close();
        }
    }
}
