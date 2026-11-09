package Gg;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3435a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i referent, Object obj) {
        super(referent);
        Intrinsics.checkNotNullParameter(referent, "referent");
        this.f3435a = obj;
    }
}
