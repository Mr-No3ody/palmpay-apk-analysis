package com.transsnet.palmpay.custom_view.dialog;

import com.transsnet.palmpay.custom_view.CircleProgressView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f31313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31315c;

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.f31313a;
        SuccessFailDialog successFailDialog = weakReference != null ? (SuccessFailDialog) weakReference.get() : null;
        if (successFailDialog == null) {
            return;
        }
        this.f31314b++;
        CircleProgressView circleProgressView = successFailDialog.mProgressBar;
        int i7 = this.f31315c;
        if (circleProgressView != null) {
            successFailDialog.mProgressBar.b(this.f31314b, i7);
        }
        if (successFailDialog.mTvCountDown != null) {
            successFailDialog.mTvCountDown.setText(String.valueOf(i7 - this.f31314b));
        }
        if (this.f31314b < i7) {
            successFailDialog.startCountDown(1000L);
        } else if (successFailDialog.isShowing()) {
            successFailDialog.dismiss();
        }
    }
}
