package p141j9;

import Ef.a;
import Ff.h;
import Wf.D;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeResultViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o9.C1900e;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
public final class J extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupResultActivityV2 f38378b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(TopupResultActivityV2 topupResultActivityV2, Continuation continuation) {
        super(2, continuation);
        this.f38378b = topupResultActivityV2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new J(this.f38378b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f38377a;
        if (i7 == 0) {
            g.M(obj);
            this.f38377a = 1;
            if (D.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        int i10 = TopupResultActivityV2.f26521k0;
        TopupResultActivityV2 topupResultActivityV2 = this.f38378b;
        AirTimeResultViewModel airTimeResultViewModel = (AirTimeResultViewModel) topupResultActivityV2.l();
        String str = topupResultActivityV2.f26541w;
        airTimeResultViewModel.getClass();
        f.s(airTimeResultViewModel, new C1900e(str, null), airTimeResultViewModel.f26611g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        return Unit.f38893a;
    }
}
