package p149k0;

import androidx.datastore.core.CorruptionHandler;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p135j0.C1767a;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CorruptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f38606a;

    public a(Function1 produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f38606a = produceNewData;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public final Object handleCorruption(C1767a c1767a, Continuation continuation) {
        return this.f38606a.invoke(c1767a);
    }
}
