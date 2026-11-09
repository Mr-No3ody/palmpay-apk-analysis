package p270rd;

import Ed.C0238s;
import Ef.a;
import Ff.h;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;
import p042cg.e;
import p042cg.f;

/* JADX INFO: renamed from: rd.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1982z extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectBankActivity f41786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1982z(SelectBankActivity selectBankActivity, String str, Continuation continuation) {
        super(2, continuation);
        this.f41786b = selectBankActivity;
        this.f41787c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1982z(this.f41786b, this.f41787c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1982z) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41785a;
        if (i7 == 0) {
            g.M(obj);
            ArrayList arrayList = new ArrayList();
            String str = this.f41787c;
            SelectBankActivity selectBankActivity = this.f41786b;
            T t = new T(new C1980x(selectBankActivity, str, arrayList, null));
            f fVar = I.f10809a;
            C1888u c1888u = new C1888u(X.n(t, e.f19009c), new C0238s(3, null, 6));
            C1981y c1981y = new C1981y(selectBankActivity, null);
            this.f41785a = 1;
            if (X.g(c1888u, c1981y, this) == aVar) {
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
