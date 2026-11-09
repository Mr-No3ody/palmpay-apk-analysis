package androidx.work.impl.constraints;

import V0.C;
import Wf.AbstractC0774s;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18506a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(C.d("WorkConstraintsTracker"), "tagWithPrefix(\"WorkConstraintsTracker\")");
    }

    public static final t0 a(F1.b bVar, androidx.work.impl.model.k spec, AbstractC0774s dispatcher, OnConstraintsStateChangedListener listener) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return AbstractC0780y.m(AbstractC0777v.a(dispatcher), null, null, new l(bVar, spec, listener, null), 3);
    }
}
