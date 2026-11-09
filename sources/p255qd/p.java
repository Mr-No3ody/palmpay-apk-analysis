package p255qd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f41510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f41511b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, F f10, Continuation continuation) {
        super(2, continuation);
        this.f41510a = sVar;
        this.f41511b = f10;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f41510a, this.f41511b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        QrcodeScanContract$IView qrcodeScanContract$IView = (QrcodeScanContract$IView) this.f41510a.f27351a;
        if (qrcodeScanContract$IView == null) {
            return null;
        }
        qrcodeScanContract$IView.showQrcodeResult((String) this.f41511b.f38951a);
        return Unit.f38893a;
    }
}
