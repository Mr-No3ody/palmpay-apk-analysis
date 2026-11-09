package p135j0;

import Wf.C0769m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f38015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0769m f38016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f38017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f38018d;

    public b0(Function2 transform, C0769m ack, w0 w0Var, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.f38015a = transform;
        this.f38016b = ack;
        this.f38017c = w0Var;
        this.f38018d = callerContext;
    }
}
