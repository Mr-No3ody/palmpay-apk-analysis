package Me;

import androidx.appcompat.widget.AppCompatTextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f6019a;

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        A a3;
        Bc.i iVar;
        A a10;
        WeakReference weakReference2 = this.f6019a;
        if (weakReference2 == null || ((A) weakReference2.get()) == null) {
            return;
        }
        WeakReference weakReference3 = this.f6019a;
        if ((weakReference3 != null && (a10 = (A) weakReference3.get()) != null && a10.f5936C) || (weakReference = this.f6019a) == null || (a3 = (A) weakReference.get()) == null || a3.f5936C || (iVar = a3.f5947v) == null) {
            return;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) iVar.f729g;
        Object tag = appCompatTextView.getTag();
        Long l5 = tag instanceof Long ? (Long) tag : null;
        long jLongValue = l5 != null ? l5.longValue() : 0L;
        x xVar = A.f5933L;
        appCompatTextView.setText(xVar.getExpireTime(jLongValue));
        long refreshTime = xVar.getRefreshTime(jLongValue);
        if (refreshTime > 0) {
            appCompatTextView.postDelayed(this, refreshTime);
        }
    }
}
