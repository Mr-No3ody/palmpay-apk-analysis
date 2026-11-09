package p072eg;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import p015ag.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements SelectInstanceInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectInstanceInternal f36298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f36299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f36300c;

    public b(e eVar, SelectInstanceInternal selectInstanceInternal, Object obj) {
        this.f36300c = eVar;
        this.f36298a = selectInstanceInternal;
        this.f36299b = obj;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final void disposeOnCompletion(DisposableHandle disposableHandle) {
        this.f36298a.disposeOnCompletion(disposableHandle);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final CoroutineContext getContext() {
        return this.f36298a.getContext();
    }

    @Override // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(s sVar, int i7) {
        this.f36298a.invokeOnCancellation(sVar, i7);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final void selectInRegistrationPhase(Object obj) {
        e.f36303i.set(this.f36300c, this.f36299b);
        this.f36298a.selectInRegistrationPhase(obj);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final boolean trySelect(Object obj, Object obj2) {
        boolean zTrySelect = this.f36298a.trySelect(obj, obj2);
        if (zTrySelect) {
            e.f36303i.set(this.f36300c, this.f36299b);
        }
        return zTrySelect;
    }
}
