package X7;

import N8.q0;
import android.content.Context;
import androidx.camera.video.u;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.text.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11052a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f11053b = new LinkedHashMap();

    public final int a(Context context, String str, String str2) {
        if (str.length() == 0) {
            return -1;
        }
        Locale locale = Locale.ROOT;
        String strK = y.k(u.q(locale, "ROOT", str, locale, "toLowerCase(...)"), "-", "_");
        String strY = q0.y(str2, "/", strK);
        synchronized (this) {
            LinkedHashMap linkedHashMap = f11053b;
            Integer num = (Integer) linkedHashMap.get(strY);
            if (num != null) {
                return num.intValue();
            }
            int identifier = context.getResources().getIdentifier(strK, str2, context.getPackageName());
            linkedHashMap.put(strY, Integer.valueOf(identifier));
            return identifier;
        }
    }
}
