package p384zd;

import Ed.C0238s;
import Ef.a;
import Ff.h;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectBankForTransferViaUssdDialog f44681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f44682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialog, String str, Continuation continuation) {
        super(2, continuation);
        this.f44681b = selectBankForTransferViaUssdDialog;
        this.f44682c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f44681b, this.f44682c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44680a;
        if (i7 == 0) {
            g.M(obj);
            ArrayList arrayList = new ArrayList();
            String str = this.f44682c;
            SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialog = this.f44681b;
            T t = new T(new c(selectBankForTransferViaUssdDialog, arrayList, str, null));
            f fVar = I.f10809a;
            C1888u c1888u = new C1888u(X.n(t, p042cg.e.f19009c), new C0238s(3, null, 11));
            d dVar = new d(selectBankForTransferViaUssdDialog, null);
            this.f44680a = 1;
            if (X.g(c1888u, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
