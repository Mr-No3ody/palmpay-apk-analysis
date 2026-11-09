package p364y6;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.V;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelfieCaptureActivity f44116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SelfieCaptureActivity selfieCaptureActivity, Continuation continuation) {
        super(2, continuation);
        this.f44116b = selfieCaptureActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new x(this.f44116b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44115a;
        if (i7 == 0) {
            g.M(obj);
            EnumC1204n enumC1204n = EnumC1204n.f17463d;
            SelfieCaptureActivity selfieCaptureActivity = this.f44116b;
            w wVar = new w(selfieCaptureActivity, null);
            this.f44115a = 1;
            if (V.j(selfieCaptureActivity, enumC1204n, wVar, this) == aVar) {
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
