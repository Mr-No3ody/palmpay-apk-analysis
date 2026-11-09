package M0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f5714f = new f(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f5717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5719e;

    public g(Context context, String str, d callback, boolean z3, boolean z8) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f5715a = context;
        this.f5716b = str;
        this.f5717c = callback;
        this.f5718d = z3;
        this.f5719e = z8;
    }
}
