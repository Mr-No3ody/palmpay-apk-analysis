package androidx.work.impl.constraints;

import androidx.work.impl.constraints.controllers.ConstraintController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class k extends o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f18501a = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstraintController it = (ConstraintController) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String simpleName = it.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "it.javaClass.simpleName");
        return simpleName;
    }
}
