package p061e3;

import Q2.a;
import kotlin.jvm.internal.Intrinsics;
import p045d3.g;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f36082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f36087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36088g;

    public p(l configBuilder) {
        Intrinsics.checkNotNullParameter(configBuilder, "configBuilder");
        a aVar = new a(2);
        Intrinsics.checkNotNullExpressionValue(aVar, "of(...)");
        this.f36082a = aVar;
        this.f36083b = true;
        this.f36084c = true;
        this.f36085d = 20;
        this.f36086e = 30;
        this.f36087f = new g(10);
    }
}
