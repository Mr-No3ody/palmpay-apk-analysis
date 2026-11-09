package androidx.webkit.internal;

import androidx.webkit.OutcomeReceiverCompat;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class g implements PrefetchOperationCallbackBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OutcomeReceiverCompat f18300a;

    public g(OutcomeReceiverCompat outcomeReceiverCompat) {
        this.f18300a = outcomeReceiverCompat;
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public final void onFailure(int i7, String str, int i10) {
        OutcomeReceiverCompat outcomeReceiverCompat = this.f18300a;
        if (i7 == 1) {
            outcomeReceiverCompat.onError(new androidx.webkit.d(str));
        } else {
            outcomeReceiverCompat.onError(new androidx.webkit.c(str));
        }
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public final void onSuccess() {
        this.f18300a.onResult(null);
    }
}
