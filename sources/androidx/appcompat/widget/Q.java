package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends Y.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f12742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f12743d;

    public Q(V v3, int i7, int i10, WeakReference weakReference) {
        this.f12743d = v3;
        this.f12740a = i7;
        this.f12741b = i10;
        this.f12742c = weakReference;
    }

    @Override // Y.h
    public final void onFontRetrievalFailed(int i7) {
    }

    @Override // Y.h
    public final void onFontRetrieved(Typeface typeface) {
        int i7;
        if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f12740a) != -1) {
            typeface = U.a(typeface, i7, (this.f12741b & 2) != 0);
        }
        V v3 = this.f12743d;
        if (v3.f12844m) {
            v3.f12843l = typeface;
            TextView textView = (TextView) this.f12742c.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new F6.a(textView, typeface, v3.f12841j, 1));
                } else {
                    textView.setTypeface(typeface, v3.f12841j);
                }
            }
        }
    }
}
