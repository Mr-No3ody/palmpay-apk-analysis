package Ce;

import Pa.AbstractC0508e;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1409b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.f1408a = context;
        this.f1409b = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C(this.f1408a, this.f1409b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Regex regex = AbstractC0508e.f7078a;
        Context context = this.f1408a;
        Intrinsics.e(context);
        return Boolean.valueOf(Intrinsics.c(AbstractC0508e.c(context), this.f1409b));
    }
}
