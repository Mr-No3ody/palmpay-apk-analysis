package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f39035a = new p();

    public p() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult p3 = (MatchResult) obj;
        Intrinsics.checkNotNullParameter(p3, "p0");
        return p3.next();
    }
}
