package p280s6;

import E.AbstractC0198c;
import android.content.Context;
import android.text.Html;
import androidx.appcompat.app.AbstractActivityC0837o;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p232p6.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f42045b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f42048e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LanguageManager$Companion f42044a = new LanguageManager$Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f42046c = "en";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f42047d = new LinkedHashMap();

    public static String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (f42048e == null) {
            int i7 = p292t6.a.f42345a;
            p292t6.a.b("LanguageManager.getString: ApplicationContext is null within Companion. Key: '" + key + "'. Language system may not be initialized.");
            return key;
        }
        LinkedHashMap linkedHashMap = f42047d;
        Map map = (Map) linkedHashMap.get(f42046c);
        String str = map != null ? (String) map.get(key) : null;
        if (str == null) {
            if (!Intrinsics.c(f42046c, "en")) {
                Map map2 = (Map) linkedHashMap.get("en");
                String str2 = map2 != null ? (String) map2.get(key) : null;
                if (str2 != null) {
                    int i10 = p292t6.a.f42345a;
                    p292t6.a.a("LanguageManager.getString: Key '" + key + "' found in fallback default locale 'en'.");
                }
                str = str2;
            }
            if (str == null) {
                int i11 = p292t6.a.f42345a;
                p292t6.a.c("LanguageManager.getString: Key '" + key + "' not found in '" + f42046c + "' or default fallback 'en'. Returning key itself.");
                return key;
            }
        }
        return str;
    }

    public static CharSequence b(AbstractActivityC0837o context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("smart_quit_msg", "key");
        String strA = a("smart_quit_msg");
        try {
            return Html.fromHtml(y.k(strA, "{themeColor}", AbstractC0198c.h(q.face_primary_color, context)), 0);
        } catch (Exception unused) {
            return strA;
        }
    }
}
