package Gd;

import com.transsnet.palmpay.send_money.ui.view.TransferResultHeaderModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferResultHeaderModel f3357c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j6, TransferResultHeaderModel transferResultHeaderModel, Continuation continuation) {
        super(2, continuation);
        this.f3356b = j6;
        this.f3357c = transferResultHeaderModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f3356b, this.f3357c, continuation);
        lVar.f3355a = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f3355a;
        TransferResultHeaderModel transferResultHeaderModel = this.f3357c;
        org.chromium.support_lib_boundary.util.b.r(coroutineScope, this.f3356b, new i(transferResultHeaderModel, 5), new j(transferResultHeaderModel, null), new k(transferResultHeaderModel, null), 6);
        return Unit.f38893a;
    }
}
