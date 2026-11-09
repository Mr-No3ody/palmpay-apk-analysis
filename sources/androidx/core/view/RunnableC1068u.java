package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: androidx.core.view.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1068u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f16291b;

    public /* synthetic */ RunnableC1068u(View view, int i7) {
        this.f16290a = i7;
        this.f16291b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16290a) {
            case 0:
                View view = this.f16291b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                this.f16291b.requestLayout();
                break;
        }
    }
}
