package p061e3;

import android.util.Log;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CloseableReference.LeakHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CloseableReferenceLeakTracker f35999a;

    public a(CloseableReferenceLeakTracker closeableReferenceLeakTracker) {
        this.f35999a = closeableReferenceLeakTracker;
    }

    @Override // com.facebook.common.references.CloseableReference.LeakHandler
    public final void reportLeak(p277s2.a aVar, Throwable th) {
        this.f35999a.trackCloseableReferenceLeak(aVar, th);
        Object objA = aVar.a();
        p229p2.a.x("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(aVar)), objA != null ? objA.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
    }

    @Override // com.facebook.common.references.CloseableReference.LeakHandler
    public final boolean requiresStacktrace() {
        return this.f35999a.isSet();
    }
}
