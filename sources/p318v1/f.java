package p318v1;

import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f43064a = Charset.forName("US-ASCII");

    static {
        Charset.forName(Constants.ENCODING);
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(u.k(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException(u.k(file2, "failed to delete file: "));
            }
        }
    }
}
