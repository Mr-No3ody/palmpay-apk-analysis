package Fe;

import com.transsnet.palmpay.core.base.BaseApplication;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Fe.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0266n extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f2795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0266n(I i7, Continuation continuation) {
        super(2, continuation);
        this.f2795a = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0266n(this.f2795a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0266n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        long versionCode = BaseApplication.get().getVersionCode();
        String strR = androidx.camera.core.impl.utils.executor.g.r();
        Intrinsics.checkNotNullExpressionValue(strR, "getLastUploadAppVersionKey(...)");
        if (p059e1.a.E(0L, strR) >= versionCode) {
            return Unit.f38893a;
        }
        boolean z3 = I.f2735f;
        I i7 = this.f2795a;
        J3.a.D(i7, i7.f27351a, new C0265m(versionCode, null), new C0264l(versionCode, 0), new Ab.B(23), false, false);
        return Unit.f38893a;
    }
}
