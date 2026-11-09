package androidx.lifecycle;

import Wf.AbstractC0780y;
import Wf.C0765i;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class P extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.F f17376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.F f17377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CoroutineScope f17378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC1205o f17380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ EnumC1204n f17381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f17382g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Ff.h f17383i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(AbstractC1205o abstractC1205o, EnumC1204n enumC1204n, CoroutineScope coroutineScope, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f17380e = abstractC1205o;
        this.f17381f = enumC1204n;
        this.f17382g = coroutineScope;
        this.f17383i = (Ff.h) function2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        ?? r10 = this.f17383i;
        return new P(this.f17380e, this.f17381f, this.f17382g, r10, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kotlin.jvm.internal.F f10;
        Throwable th;
        kotlin.jvm.internal.F f11;
        Job job;
        LifecycleEventObserver lifecycleEventObserver;
        Job job2;
        LifecycleEventObserver lifecycleEventObserver2;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f17379d;
        AbstractC1205o abstractC1205o = this.f17380e;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = this.f17377b;
            f11 = this.f17376a;
            try {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                job2 = (Job) f11.f38951a;
                if (job2 != null) {
                    job2.cancel((CancellationException) null);
                }
                lifecycleEventObserver2 = (LifecycleEventObserver) f10.f38951a;
                if (lifecycleEventObserver2 != null) {
                    abstractC1205o.b(lifecycleEventObserver2);
                }
                return Unit.f38893a;
            } catch (Throwable th2) {
                th = th2;
                job = (Job) f11.f38951a;
                if (job != null) {
                    job.cancel((CancellationException) null);
                }
                lifecycleEventObserver = (LifecycleEventObserver) f10.f38951a;
                if (lifecycleEventObserver != null) {
                    throw th;
                }
                abstractC1205o.b(lifecycleEventObserver);
                throw th;
            }
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        if (((C1212w) abstractC1205o).f17478d == EnumC1204n.f17460a) {
            return Unit.f38893a;
        }
        final kotlin.jvm.internal.F f12 = new kotlin.jvm.internal.F();
        f10 = new kotlin.jvm.internal.F();
        try {
            EnumC1204n enumC1204n = this.f17381f;
            final CoroutineScope coroutineScope = this.f17382g;
            final ?? r11 = this.f17383i;
            this.f17376a = f12;
            this.f17377b = f10;
            this.f17378c = coroutineScope;
            this.f17379d = 1;
            final C0765i c0765i = new C0765i(1, Ef.f.b(this));
            c0765i.initCancellability();
            C1201k c1201k = EnumC1203m.Companion;
            final EnumC1203m enumC1203mUpTo = c1201k.upTo(enumC1204n);
            final EnumC1203m enumC1203mDownFrom = c1201k.downFrom(enumC1204n);
            final p072eg.e eVar = new p072eg.e();
            LifecycleEventObserver lifecycleEventObserver3 = new LifecycleEventObserver(f12, coroutineScope, enumC1203mDownFrom, c0765i, eVar, r11) { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.F f17392b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ CoroutineScope f17393c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ EnumC1203m f17394d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ C0765i f17395e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ p072eg.e f17396f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Ff.h f17397g;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f17397g = (Ff.h) r11;
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    kotlin.jvm.internal.F f13 = this.f17392b;
                    if (event == this.f17391a) {
                        f13.f38951a = AbstractC0780y.m(this.f17393c, null, null, new O(this.f17396f, this.f17397g, null), 3);
                        return;
                    }
                    if (event == this.f17394d) {
                        Job job3 = (Job) f13.f38951a;
                        if (job3 != null) {
                            job3.cancel((CancellationException) null);
                        }
                        f13.f38951a = null;
                    }
                    if (event == EnumC1203m.ON_DESTROY) {
                        p355xf.o oVar = p355xf.q.f43977a;
                        this.f17395e.resumeWith(Unit.f38893a);
                    }
                }
            };
            f10.f38951a = lifecycleEventObserver3;
            abstractC1205o.a(lifecycleEventObserver3);
            Object objM = c0765i.m();
            if (objM == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (objM == aVar) {
                return aVar;
            }
            f11 = f12;
            job2 = (Job) f11.f38951a;
            if (job2 != null) {
                job2.cancel((CancellationException) null);
            }
            lifecycleEventObserver2 = (LifecycleEventObserver) f10.f38951a;
            if (lifecycleEventObserver2 != null) {
                abstractC1205o.b(lifecycleEventObserver2);
            }
            return Unit.f38893a;
        } catch (Throwable th3) {
            th = th3;
            f11 = f12;
            job = (Job) f11.f38951a;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            lifecycleEventObserver = (LifecycleEventObserver) f10.f38951a;
            if (lifecycleEventObserver != null) {
                throw th;
            }
            abstractC1205o.b(lifecycleEventObserver);
            throw th;
        }
    }
}
