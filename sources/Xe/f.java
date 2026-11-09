package Xe;

import android.content.Context;
import java.net.CookieManager;
import java.net.CookiePolicy;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p342wf.c f11211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p342wf.a f11212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f11213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f11214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CookieManager f11215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final top.zibin.luban.io.a f11216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final retrofit2.adapter.rxjava2.d f11217j;

    public f(e eVar) {
        Context context = (Context) eVar.f11205c;
        this.f11208a = context;
        this.f11209b = eVar.f11203a;
        this.f11210c = eVar.f11204b;
        this.f11211d = null;
        this.f11211d = new p342wf.c();
        this.f11212e = p002a.a.f11814c;
        this.f11213f = (d) eVar.f11206d;
        this.f11214g = (d) eVar.f11207e;
        this.f11215h = new CookieManager(new p014af.c(context), CookiePolicy.ACCEPT_ALL);
        this.f11216i = null;
        this.f11216i = new top.zibin.luban.io.a(context);
        this.f11217j = new retrofit2.adapter.rxjava2.d(2);
    }
}
