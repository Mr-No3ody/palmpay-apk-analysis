package X6;

import android.content.Context;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f11025h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f11029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f11030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f11031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function2 f11032g;

    static {
        new l(null);
    }

    public m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11026a = context;
        this.f11028c = 1;
    }

    public final o a() {
        Context context = this.f11026a;
        Intrinsics.checkNotNullParameter(context, "context");
        o oVar = new o(context);
        oVar.f11005c = this.f11027b;
        oVar.f11037e = this.f11028c;
        oVar.f11039g = this.f11029d;
        oVar.f11038f = this.f11030e;
        oVar.f11040i = this.f11031f;
        oVar.f11041j = this.f11032g;
        return oVar;
    }
}
