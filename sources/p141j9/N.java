package p141j9;

import Ef.a;
import Ff.h;
import Rd.J;
import android.widget.TextView;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.custom_view.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TopupResultActivityV2 f38384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(TopupResultActivityV2 topupResultActivityV2, String str, Continuation continuation) {
        super(1, continuation);
        this.f38384a = topupResultActivityV2;
        this.f38385b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new N(this.f38384a, this.f38385b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((N) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        TextView orderStatusTv;
        a aVar = a.f2423a;
        g.M(obj);
        int i7 = TopupResultActivityV2.f26521k0;
        TopupResultActivityV2 topupResultActivityV2 = this.f38384a;
        J j6 = (J) topupResultActivityV2.f27334c;
        if (j6 != null && (orderStatusTv = j6.f8083b.getOrderStatusTv()) != null) {
            orderStatusTv.setText(topupResultActivityV2.getString(v.cv_processing));
        }
        J j10 = (J) topupResultActivityV2.f27334c;
        if (j10 != null) {
            j10.f8083b.h(this.f38385b);
        }
        return Unit.f38893a;
    }
}
