package p232p6;

import Ef.a;
import Ff.h;
import android.app.Activity;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.liveness.LiveID$ILiveIDListener;
import com.palmpay.lib.liveness.model.AuthenticationRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f41206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AuthenticationRequest f41207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LiveID$ILiveIDListener f41208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f41209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Activity activity, AuthenticationRequest authenticationRequest, LiveID$ILiveIDListener liveID$ILiveIDListener, D d2, Continuation continuation) {
        super(2, continuation);
        this.f41206b = activity;
        this.f41207c = authenticationRequest;
        this.f41208d = liveID$ILiveIDListener;
        this.f41209e = d2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        LiveID$ILiveIDListener liveID$ILiveIDListener = this.f41208d;
        D d2 = this.f41209e;
        return new f(this.f41206b, this.f41207c, liveID$ILiveIDListener, d2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41205a;
        if (i7 == 0) {
            g.M(obj);
            p pVar = p.f41234a;
            int i10 = this.f41209e.f38949a;
            this.f41205a = 1;
            if (p.a(this.f41206b, this.f41207c, this.f41208d, i10, this) == aVar) {
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
