package Ce;

import Pa.AbstractC0508e;
import android.content.Context;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFragmentHomeTab f1398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f1399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(HomeFragmentHomeTab homeFragmentHomeTab, HomeActivity homeActivity, Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.f1398a = homeFragmentHomeTab;
        this.f1399b = homeActivity;
        this.f1400c = context;
        this.f1401d = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new A(this.f1398a, this.f1399b, this.f1400c, this.f1401d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        int i7 = HomeFragmentHomeTab.f35093A0;
        if (this.f1398a.A(this.f1399b)) {
            Regex regex = AbstractC0508e.f7078a;
            Context context = this.f1400c;
            Intrinsics.e(context);
            if (Intrinsics.c(AbstractC0508e.c(context), this.f1401d)) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
