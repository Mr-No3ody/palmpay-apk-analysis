package androidx.work.impl.workers;

import Ef.a;
import F1.b;
import V0.A;
import V0.B;
import V0.C;
import V0.C0692k;
import V0.C0697p;
import V0.C0704x;
import V0.C0705y;
import Wf.AbstractC0774s;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import X0.e;
import X0.f;
import X0.m;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.executor.g;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.k;
import androidx.work.impl.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "X0/a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({c.f39801b})
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,168:1\n29#2:169\n19#2:170\n19#2:171\n19#2:172\n*S KotlinDebug\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n*L\n65#1:169\n75#1:170\n78#1:171\n87#1:172\n*E\n"})
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WorkerParameters f18743g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f18743g = workerParameters;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(ConstraintTrackingWorker constraintTrackingWorker, B b7, b bVar, k kVar, Ff.c cVar) {
        X0.c cVar2;
        constraintTrackingWorker.getClass();
        if (cVar instanceof X0.c) {
            cVar2 = (X0.c) cVar;
            int i7 = cVar2.f10932c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                cVar2.f10932c = i7 - Integer.MIN_VALUE;
            } else {
                cVar2 = new X0.c(constraintTrackingWorker, cVar);
            }
        } else {
            cVar2 = new X0.c(constraintTrackingWorker, cVar);
        }
        Object objD = cVar2.f10930a;
        a aVar = a.f2423a;
        int i10 = cVar2.f10932c;
        if (i10 == 0) {
            g.M(objD);
            e eVar = new e(b7, bVar, kVar, null);
            cVar2.f10932c = 1;
            objD = AbstractC0777v.d(eVar, cVar2);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(objD);
        }
        Intrinsics.checkNotNullExpressionValue(objD, "delegate: ListenableWork….cancel()\n        }\n    }");
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object e(ConstraintTrackingWorker constraintTrackingWorker, Ff.c cVar) {
        f fVar;
        B b7;
        ConstraintTrackingWorker constraintTrackingWorker2;
        int i7;
        WorkerParameters workerParameters = constraintTrackingWorker.f18743g;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f10949e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f10949e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(constraintTrackingWorker, cVar);
            }
        } else {
            fVar = new f(constraintTrackingWorker, cVar);
        }
        f fVar2 = fVar;
        Object objS = fVar2.f10947c;
        a aVar = a.f2423a;
        int i11 = fVar2.f10949e;
        if (i11 == 0) {
            g.M(objS);
            WorkerParameters workerParameters2 = constraintTrackingWorker.f9857b;
            String strA = workerParameters2.f18346b.a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (strA == null || strA.length() == 0) {
                C.c().a(m.f10965a, "No worker to delegate to.");
                C0704x c0704x = new C0704x();
                Intrinsics.checkNotNullExpressionValue(c0704x, "failure()");
                return c0704x;
            }
            Context applicationContext = constraintTrackingWorker.f9856a;
            s sVarG = s.g(applicationContext);
            Intrinsics.checkNotNullExpressionValue(sVarG, "getInstance(applicationContext)");
            WorkSpecDao workSpecDaoH = sVarG.f18677d.h();
            String string = workerParameters2.f18345a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            k workSpec = workSpecDaoH.getWorkSpec(string);
            if (workSpec == null) {
                C0704x c0704x2 = new C0704x();
                Intrinsics.checkNotNullExpressionValue(c0704x2, "failure()");
                return c0704x2;
            }
            androidx.work.impl.constraints.trackers.k kVar = sVarG.f18684k;
            Intrinsics.checkNotNullExpressionValue(kVar, "workManagerImpl.trackers");
            b bVar = new b(kVar);
            if (!bVar.g(workSpec)) {
                String str = m.f10965a;
                C.c().getClass();
                C0705y c0705y = new C0705y();
                Intrinsics.checkNotNullExpressionValue(c0705y, "retry()");
                return c0705y;
            }
            String str2 = m.f10965a;
            C.c().getClass();
            try {
                C0697p c0697p = workerParameters2.f18350f;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                B bA = c0697p.a(applicationContext, strA, workerParameters);
                androidx.camera.core.impl.utils.executor.f fVar3 = workerParameters.f18349e.f18730d;
                Intrinsics.checkNotNullExpressionValue(fVar3, "workerParameters.taskExecutor.mainThreadExecutor");
                try {
                    AbstractC0774s abstractC0774sH = AbstractC0780y.h(fVar3);
                    b7 = bA;
                    try {
                        X0.g gVar = new X0.g(constraintTrackingWorker, b7, bVar, workSpec, null);
                        fVar2.f10945a = constraintTrackingWorker;
                        fVar2.f10946b = b7;
                        fVar2.f10949e = 1;
                        objS = AbstractC0780y.s(abstractC0774sH, gVar, fVar2);
                        if (objS == aVar) {
                            return aVar;
                        }
                        constraintTrackingWorker2 = constraintTrackingWorker;
                        return (A) objS;
                    } catch (CancellationException e10) {
                        e = e10;
                        constraintTrackingWorker2 = constraintTrackingWorker;
                    }
                } catch (CancellationException e11) {
                    e = e11;
                    b7 = bA;
                }
            } catch (Throwable unused) {
                String str3 = m.f10965a;
                C.c().getClass();
                sVarG.f18676c.getClass();
                C0704x c0704x3 = new C0704x();
                Intrinsics.checkNotNullExpressionValue(c0704x3, "failure()");
                return c0704x3;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            B b10 = fVar2.f10946b;
            ConstraintTrackingWorker constraintTrackingWorker3 = fVar2.f10945a;
            try {
                g.M(objS);
                b7 = b10;
                constraintTrackingWorker2 = constraintTrackingWorker3;
                try {
                    return (A) objS;
                } catch (CancellationException e12) {
                    e = e12;
                }
            } catch (CancellationException e13) {
                e = e13;
                b7 = b10;
                constraintTrackingWorker2 = constraintTrackingWorker3;
            }
        }
        if (constraintTrackingWorker2.f9858c.get() != -256 || (e instanceof X0.a)) {
            if (Build.VERSION.SDK_INT < 31) {
                i7 = -512;
            } else {
                AtomicInteger atomicInteger = constraintTrackingWorker2.f9858c;
                if (atomicInteger.get() != -256) {
                    i7 = atomicInteger.get();
                } else {
                    if (!(e instanceof X0.a)) {
                        throw new IllegalStateException("Unreachable");
                    }
                    i7 = ((X0.a) e).f10927a;
                }
            }
            b7.f9858c.compareAndSet(-256, i7);
        }
        if (!(e instanceof X0.a)) {
            throw e;
        }
        C0705y c0705y2 = new C0705y();
        Intrinsics.checkNotNullExpressionValue(c0705y2, "{\n            // there a…throw cancelled\n        }");
        return c0705y2;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(C0692k c0692k) {
        Executor backgroundExecutor = this.f9857b.f18347c;
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        return AbstractC0780y.s(AbstractC0780y.h(backgroundExecutor), new X0.b(this, null), c0692k);
    }
}
