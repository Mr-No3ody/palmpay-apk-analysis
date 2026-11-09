package Ce;

import Wf.AbstractC0780y;
import android.content.Context;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ce.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0180w extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragmentHomeTab f1540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180w(HomeFragmentHomeTab homeFragmentHomeTab, Context context, Continuation continuation) {
        super(2, continuation);
        this.f1540b = homeFragmentHomeTab;
        this.f1541c = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0180w(this.f1540b, this.f1541c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0180w) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1539a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            p042cg.f fVar = Wf.I.f10809a;
            p042cg.e eVar = p042cg.e.f19009c;
            C0179v c0179v = new C0179v(this.f1541c, null);
            this.f1539a = 1;
            obj = AbstractC0780y.s(eVar, c0179v, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        String str = (String) obj;
        if (str != null) {
            HomeFragmentHomeTab homeFragmentHomeTab = this.f1540b;
            if (homeFragmentHomeTab.isResumed() && ((C1212w) homeFragmentHomeTab.getViewLifecycleOwner().getLifecycle()).f17478d.a(EnumC1204n.f17464e)) {
                Fe.I i10 = (Fe.I) homeFragmentHomeTab.f27328i;
                if (i10 != null) {
                    i10.queryClipboardMatchInfo(str);
                }
                return Unit.f38893a;
            }
        }
        return Unit.f38893a;
    }
}
