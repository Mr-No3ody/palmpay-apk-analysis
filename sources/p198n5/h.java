package p198n5;

import com.growingio.android.sdk.track.log.ILogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f39848a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f39849b;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f39849b = concurrentHashMap;
        concurrentHashMap.put("Logcat", new f());
        concurrentHashMap.put("CacheLogger", new b());
    }

    public static void a(String str, String str2, Object... objArr) {
        Iterator it = f39849b.entrySet().iterator();
        while (it.hasNext()) {
            ((ILogger) ((Map.Entry) it.next()).getValue()).d(str, str2, objArr);
        }
    }

    public static void b(String str, Exception exc) {
        Iterator it = f39849b.entrySet().iterator();
        while (it.hasNext()) {
            ((ILogger) ((Map.Entry) it.next()).getValue()).e(str, exc);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        Iterator it = f39849b.entrySet().iterator();
        while (it.hasNext()) {
            ((ILogger) ((Map.Entry) it.next()).getValue()).e(str, str2, objArr);
        }
    }

    public static void d(String str, Throwable th, String str2, Object... objArr) {
        Iterator it = f39849b.entrySet().iterator();
        while (it.hasNext()) {
            ((ILogger) ((Map.Entry) it.next()).getValue()).e(str, th, str2, objArr);
        }
    }

    public static void e(String str, String str2, String str3) {
        try {
            if (str3.startsWith("{")) {
                str3 = new JSONObject(str3).toString(2).replace("\\/", "/");
            } else if (str3.startsWith("[")) {
                str3 = new JSONArray(str3).toString(2).replace("\\/", "/");
            }
        } catch (JSONException unused) {
        }
        StringBuilder sb2 = new StringBuilder("╔═══════════════════════════════════════════════════════════════════════════════════════");
        String str4 = f39848a;
        sb2.append(str4);
        for (String str5 : str3.split(str4)) {
            sb2.append("║ ");
            sb2.append(str5);
            sb2.append(str4);
        }
        sb2.append("╚═══════════════════════════════════════════════════════════════════════════════════════");
        a(str, str2 + str4 + sb2.toString(), new Object[0]);
    }
}
