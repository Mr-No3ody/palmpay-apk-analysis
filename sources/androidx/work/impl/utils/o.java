package androidx.work.impl.utils;

import C0.G;
import V0.B;
import V0.C;
import V0.C0699s;
import android.content.Context;
import androidx.work.impl.K;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f18713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.model.k f18714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f18715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f18716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(B b7, androidx.work.impl.model.k kVar, r rVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.f18713b = b7;
        this.f18714c = kVar;
        this.f18715d = rVar;
        this.f18716e = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f18713b, this.f18714c, this.f18715d, this.f18716e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f18712a;
        B b7 = this.f18713b;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            androidx.concurrent.futures.m mVarA = b7.a();
            Intrinsics.checkNotNullExpressionValue(mVarA, "worker.getForegroundInfoAsync()");
            this.f18712a = 1;
            obj = K.a(mVarA, b7, this);
            if (obj != aVar) {
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        C0699s c0699s = (C0699s) obj;
        androidx.work.impl.model.k kVar = this.f18714c;
        if (c0699s == null) {
            throw new IllegalStateException(G.r(new StringBuilder("Worker was marked important ("), kVar.f18614c, ") but did not provide ForegroundInfo"));
        }
        int i10 = p.f18717a;
        C.c().getClass();
        ListenableFuture foregroundAsync = this.f18715d.setForegroundAsync(this.f18716e, b7.f9857b.f18345a, c0699s);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
        this.f18712a = 2;
        Object objH = G8.a.h(foregroundAsync, this);
        return objH == aVar ? aVar : objH;
    }
}
