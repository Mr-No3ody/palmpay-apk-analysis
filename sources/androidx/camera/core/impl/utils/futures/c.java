package androidx.camera.core.impl.utils.futures;

import androidx.biometric.RunnableC0903g;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements CallbackToFutureAdapter$Resolver, SynchronizationGuard.CriticalSection, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14198d;

    public /* synthetic */ c(ConfigFetchHandler configFetchHandler, long j6, HashMap map) {
        this.f14195a = 3;
        this.f14198d = configFetchHandler;
        this.f14197c = j6;
        this.f14196b = map;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        switch (this.f14195a) {
            case 0:
                ListenableFuture listenableFuture = (ListenableFuture) this.f14198d;
                j.f(listenableFuture, kVar);
                if (!listenableFuture.isDone()) {
                    long j6 = this.f14197c;
                    final ScheduledFuture scheduledFutureSchedule = ((androidx.camera.core.impl.utils.executor.d) this.f14196b).schedule(new e(kVar, listenableFuture, j6), j6, TimeUnit.MILLISECONDS);
                    final int i7 = 0;
                    listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                            }
                        }
                    }, org.chromium.support_lib_boundary.util.b.u());
                }
                return "TimeoutFuture[" + listenableFuture + "]";
            default:
                androidx.concurrent.futures.m mVar = (androidx.concurrent.futures.m) this.f14198d;
                j.f(mVar, kVar);
                if (!mVar.f15066b.isDone()) {
                    final ScheduledFuture scheduledFutureSchedule2 = ((androidx.camera.core.impl.utils.executor.d) this.f14196b).schedule(new RunnableC0903g(17, kVar, mVar), this.f14197c, TimeUnit.MILLISECONDS);
                    final int i10 = 1;
                    mVar.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                            }
                        }
                    }, org.chromium.support_lib_boundary.util.b.u());
                }
                return "TimeoutFuture[" + mVar + "]";
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f14198d).lambda$logAndUpdateState$8((TransportContext) this.f14196b, this.f14197c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((ConfigFetchHandler) this.f14198d).lambda$fetch$0(this.f14197c, (HashMap) this.f14196b, task);
    }

    public /* synthetic */ c(Object obj, Object obj2, long j6, int i7) {
        this.f14195a = i7;
        this.f14198d = obj;
        this.f14196b = obj2;
        this.f14197c = j6;
    }
}
