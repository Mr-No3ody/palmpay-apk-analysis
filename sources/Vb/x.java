package Vb;

import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransactionResultHeaderModel f10328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(long j6, TransactionResultHeaderModel transactionResultHeaderModel, Continuation continuation) {
        super(2, continuation);
        this.f10327b = j6;
        this.f10328c = transactionResultHeaderModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        x xVar = new x(this.f10327b, this.f10328c, continuation);
        xVar.f10326a = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f10326a;
        TransactionResultHeaderModel transactionResultHeaderModel = this.f10328c;
        org.chromium.support_lib_boundary.util.b.r(coroutineScope, this.f10327b, new u(transactionResultHeaderModel, 4), new v(transactionResultHeaderModel, null), new w(transactionResultHeaderModel, null), 6);
        return Unit.f38893a;
    }
}
