package Hb;

import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f3794a;

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        TextView textView;
        WeakReference weakReference2 = this.f3794a;
        if (weakReference2 != null) {
            if ((weakReference2 != null ? (TextView) weakReference2.get() : null) == null || (weakReference = this.f3794a) == null || (textView = (TextView) weakReference.get()) == null) {
                return;
            }
            Object tag = textView.getTag();
            Long l5 = tag instanceof Long ? (Long) tag : null;
            long jLongValue = l5 != null ? l5.longValue() : 0L;
            C c6 = E.f3795g;
            textView.setText(c6.getExpireTime(textView.getContext(), jLongValue));
            long refreshTime = c6.getRefreshTime(jLongValue);
            if (refreshTime > 0) {
                textView.postDelayed(this, refreshTime);
            }
        }
    }
}
