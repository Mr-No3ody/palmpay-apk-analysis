package p364y6;

import B6.T;
import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.S;
import p355xf.C2127f;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelfieCaptureActivity f44114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SelfieCaptureActivity selfieCaptureActivity, Continuation continuation) {
        super(2, continuation);
        this.f44114b = selfieCaptureActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new w(this.f44114b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((w) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
        return a.f2423a;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44113a;
        if (i7 == 0) {
            g.M(obj);
            int i10 = SelfieCaptureActivity.f23859v;
            SelfieCaptureActivity selfieCaptureActivity = this.f44114b;
            S s3 = selfieCaptureActivity.h().t;
            T t = new T(selfieCaptureActivity, 5);
            this.f44113a = 1;
            if (s3.f39102a.collect(t, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        throw new C2127f();
    }
}
