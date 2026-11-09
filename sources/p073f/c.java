package p073f;

import com.transsnet.mtn.sdk.config.Result;
import com.transsnet.mtn.sdk.util.MTNHandler;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static c f36332h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MTNHandler f36339g;

    public static c a() {
        if (f36332h == null) {
            f36332h = new c();
        }
        return f36332h;
    }

    public final void b(int i7, String str) {
        if (this.f36339g == null) {
            return;
        }
        Result result = new Result();
        result.msg = str;
        result.mtn_id = this.f36336d;
        result.resultCode = i7;
        this.f36339g.result(result);
        this.f36339g = null;
    }
}
