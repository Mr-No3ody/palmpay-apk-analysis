package p111h5;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import p124i5.b;
import p152k5.e;
import p152k5.f;
import p198n5.h;
import p279s5.a;
import p279s5.d;
import p279s5.j;
import p279s5.k;
import p279s5.l;
import p279s5.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f37305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f37306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f37307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f37308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f37309k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f37310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f37311m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f37313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f37314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f37315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f37317s;
    public String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f37318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f37319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f37320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f37321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f37322y;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f37312n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37299a = "Android";

    public c() {
        k kVar = j.f42028a;
        if (TextUtils.isEmpty(kVar.f42030b)) {
            String str = Build.VERSION.RELEASE;
            kVar.f42030b = str == null ? p381za.c.UNKNOWN_PROCESS_NAME : str;
        }
        this.f37300b = kVar.f42030b;
        this.f37305g = b();
        this.f37309k = a.f42018a.x() != null ? "FOREGROUND" : "BACKGROUND";
        this.f37307i = p279s5.c.f42022a.d();
        this.f37308j = ((com.growingio.android.sdk.a) d.b().f42025b).f23184b;
    }

    public abstract d a();

    public abstract String b();

    public void c() {
        String string;
        long jCurrentTimeMillis = this.f37306h;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f37306h = jCurrentTimeMillis;
        k kVar = j.f42028a;
        boolean zIsEmpty = TextUtils.isEmpty(kVar.f42039k);
        Context context = kVar.f42029a;
        if (zIsEmpty) {
            f fVar = e.f38687a;
            String string2 = fVar.f38688a.getString("DEVICE_ID", "");
            kVar.f42039k = string2;
            if (TextUtils.isEmpty(string2)) {
                h.a("DeviceInfoProvider", "first time calculate deviceId", new Object[0]);
                if (TextUtils.isEmpty(kVar.f42036h)) {
                    kVar.f42036h = Settings.System.getString(context.getContentResolver(), "android_id");
                }
                String str = kVar.f42036h;
                if (TextUtils.isEmpty(str) || "9774d56d682e549c".equals(str)) {
                    kVar.b();
                    string = null;
                    if (!TextUtils.isEmpty(null)) {
                        Charset.forName(Constants.ENCODING);
                        throw null;
                    }
                } else {
                    string = UUID.nameUUIDFromBytes(str.getBytes(Charset.forName(Constants.ENCODING))).toString();
                }
                if (TextUtils.isEmpty(string)) {
                    string = UUID.randomUUID().toString();
                }
                if (string != null && string.length() != 0 && !TextUtils.isEmpty(string)) {
                    fVar.f38688a.putString("DEVICE_ID", string);
                }
                kVar.f42039k = string;
            }
        }
        this.f37301c = kVar.f42039k;
        f fVar2 = e.f38687a;
        this.f37304f = fVar2.f38688a.getString("SESSION_ID", "");
        n.f42043a.getClass();
        this.f37302d = fVar2.f38688a.getString("LOGIN_USER_KEY", "");
        this.f37303e = fVar2.f38688a.getString("LOGIN_USER_ID", "");
        String str2 = this.f37305g;
        p152k5.d dVar = fVar2.f38688a;
        long andAddLong = dVar.getAndAddLong("TYPE_GLOBAL", 1L, 1L);
        long andAddLong2 = dVar.getAndAddLong(str2, 1L, 1L);
        this.f37310l = andAddLong;
        this.f37311m = andAddLong2;
        Context applicationContext = com.growingio.android.sdk.d.a().getApplicationContext();
        b.a();
        this.f37313o = (String) p291t5.b.a(applicationContext).f10099d;
        b.a();
        if (kVar.f42034f <= 0) {
            kVar.f42034f = p291t5.b.b(context).heightPixels;
        }
        this.f37315q = kVar.f42034f;
        b.a();
        if (kVar.f42035g <= 0) {
            kVar.f42035g = p291t5.b.b(context).widthPixels;
        }
        this.f37316r = kVar.f42035g;
        b.a();
        boolean zIsEmpty2 = TextUtils.isEmpty(kVar.f42031c);
        String str3 = p381za.c.UNKNOWN_PROCESS_NAME;
        if (zIsEmpty2) {
            String str4 = Build.BRAND;
            if (str4 == null) {
                str4 = p381za.c.UNKNOWN_PROCESS_NAME;
            }
            kVar.f42031c = str4;
        }
        this.f37317s = kVar.f42031c;
        b.a();
        if (TextUtils.isEmpty(kVar.f42032d)) {
            String str5 = Build.MODEL;
            if (str5 != null) {
                str3 = str5;
            }
            kVar.f42032d = str3;
        }
        this.t = kVar.f42032d;
        b.a();
        this.f37318u = kVar.a();
        E2.a aVar = p279s5.c.f42022a;
        if (TextUtils.isEmpty((String) aVar.f2187f)) {
            aVar.f2187f = ((com.growingio.android.sdk.a) d.b().f42025b).f23185c;
        }
        this.f37314p = (String) aVar.f2187f;
        Context context2 = (Context) aVar.f2183b;
        if (TextUtils.isEmpty((String) aVar.f2185d)) {
            try {
                aVar.f2185d = context2.getPackageManager().getApplicationLabel(context2.getApplicationInfo()).toString();
            } catch (Exception e10) {
                h.b("AppInfoProvider", e10);
            }
        }
        this.f37319v = (String) aVar.f2185d;
        this.f37320w = aVar.c();
        l.f42040a.getClass();
        this.f37322y = "3.3.6";
        this.f37321x = Locale.getDefault().getLanguage();
    }
}
