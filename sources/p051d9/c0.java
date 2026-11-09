package p051d9;

import Ef.a;
import Ff.h;
import H8.f;
import android.content.Context;
import androidx.camera.core.impl.utils.executor.g;
import androidx.lifecycle.AbstractC1207q;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f35601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f35602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f35604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, d0 d0Var, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f35601b = context;
        this.f35602c = d0Var;
        this.f35603d = str;
        this.f35604e = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new c0(this.f35601b, this.f35602c, this.f35603d, this.f35604e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.f35600a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        f fVar = f.f3757a;
        SignUpContract.View view = (SignUpContract.View) this.f35602c.f27351a;
        AbstractC1207q coroutineScope = view != null ? view.getCoroutineScope() : null;
        String str = this.f35603d;
        if (str == null) {
            str = "";
        }
        String str2 = this.f35604e;
        if (str2 == null) {
            str2 = "";
        }
        this.f35600a = 1;
        Object objA = fVar.a(this.f35601b, coroutineScope, str, str2, this);
        return objA == aVar ? aVar : objA;
    }
}
