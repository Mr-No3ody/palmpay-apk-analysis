package p077f4;

import Og.b;
import com.palmpay.lib.bridgewrapper.photo.upload.a;
import com.transsnet.palmpay.managemoney.ui.view.c;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1948p;
import okhttp3.S;
import okhttp3.U;
import okhttp3.W;
import p093g4.d;
import p093g4.e;
import p093g4.g;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f36389b = new h(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f36390c = C2131j.b(new c(6));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f36391d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f36392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f36393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f36394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f36395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f36396i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f36397a;

    public l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(W.HTTP_2);
        arrayList.add(W.HTTP_1_1);
        S s3 = new S();
        h hVar = f36389b;
        s3.f40625k = hVar.setCacheSize();
        s3.d(arrayList);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        C1948p connectionPool = new C1948p(10, 5L);
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        s3.f40616b = connectionPool;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        s3.b(30L, timeUnit2);
        s3.e(30L, timeUnit2);
        s3.f(30L, timeUnit2);
        s3.a(new e());
        if (!f36391d || hVar.isLogOn()) {
            s3.a(new j());
        }
        b bVar = new b(new a(29));
        Og.a level = Og.a.f6845b;
        Intrinsics.checkNotNullParameter(level, "level");
        bVar.f6851c = level;
        s3.a(bVar);
        s3.a(new p093g4.b());
        s3.a(new i());
        s3.a(new k());
        s3.a(new g());
        s3.a(new d());
        U u6 = new U(s3);
        this.f36397a = u6;
        u6.f40653a.g(20);
        hVar.initLog(u6);
    }
}
