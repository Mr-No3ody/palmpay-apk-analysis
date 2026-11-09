package hc;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.databundle.ui.view.ModelDataBundleHighlyRecommendItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f37375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelDataBundleHighlyRecommendItem f37376b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Throwable th, Continuation continuation, ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem) {
        super(2, continuation);
        this.f37375a = th;
        this.f37376b = modelDataBundleHighlyRecommendItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f37375a, continuation, this.f37376b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        org.chromium.support_lib_boundary.util.b.W(this.f37375a);
        int i7 = ModelDataBundleHighlyRecommendItem.f31780B;
        this.f37376b.e(null);
        return Unit.f38893a;
    }
}
