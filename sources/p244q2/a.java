package p244q2;

import androidx.camera.video.u;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f41447a = G.g(new Pair("mkv", "video/x-matroska"), new Pair("glb", "model/gltf-binary"));

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    public static final String a(String path) {
        String strSubstring;
        Locale locale;
        String strQ;
        Intrinsics.checkNotNullParameter(path, "path");
        int iH = StringsKt.H(path, '.', 0, 6);
        if (iH < 0 || iH == path.length() - 1) {
            strSubstring = null;
        } else {
            strSubstring = path.substring(iH + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        if (strSubstring == null || (strQ = u.q((locale = Locale.US), "US", strSubstring, locale, "toLowerCase(...)")) == null) {
            return null;
        }
        String mimeTypeFromExtension = (String) b.f41450c.get(strQ);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = b.f41448a.getMimeTypeFromExtension(strQ);
        }
        return mimeTypeFromExtension == null ? (String) f41447a.get(strQ) : mimeTypeFromExtension;
    }
}
