package androidx.core.content;

import C0.G;
import android.net.Uri;
import androidx.camera.video.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements FileProvider$PathStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f16014b = new HashMap();

    public e(String str) {
        this.f16013a = str;
    }

    public static boolean a(String str, String str2) {
        String strAccess$000 = f.access$000(str);
        String strAccess$001 = f.access$000(str2);
        if (strAccess$000.equals(strAccess$001)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strAccess$001);
        sb2.append('/');
        return strAccess$000.startsWith(sb2.toString());
    }

    @Override // androidx.core.content.FileProvider$PathStrategy
    public final File getFileForUri(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f16014b.get(strDecode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (a(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException(u.k(file2, "Failed to resolve canonical path for "));
        }
    }

    @Override // androidx.core.content.FileProvider$PathStrategy
    public final Uri getUriForFile(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : this.f16014b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(G.o("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(this.f16013a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException(u.k(file, "Failed to resolve canonical path for "));
        }
    }
}
