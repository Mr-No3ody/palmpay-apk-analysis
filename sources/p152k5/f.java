package p152k5;

import E2.a;
import android.content.Context;
import com.growingio.android.sdk.d;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f38688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f38689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f38690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38691d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f38692e = 0;

    public f() {
        Context applicationContext = d.a().getApplicationContext();
        this.f38690c = applicationContext;
        this.f38688a = new d(applicationContext);
        this.f38689b = new a(applicationContext, f.class.getName());
    }

    public final void a(String str) throws Throwable {
        HashMap map = new HashMap();
        map.put("LOGIN_USER_ID", str);
        map.put("LOGIN_USER_KEY", null);
        this.f38688a.putMultiString(map);
    }
}
