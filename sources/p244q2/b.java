package p244q2;

import android.webkit.MimeTypeMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Map;
import p213o2.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MimeTypeMap f41448a = MimeTypeMap.getSingleton();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f41449b = d.b(ClipboardModule.MIMETYPE_HEIF, "heif", ClipboardModule.MIMETYPE_HEIC, "heic");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f41450c = d.b("heif", ClipboardModule.MIMETYPE_HEIF, "heic", ClipboardModule.MIMETYPE_HEIC);
}
