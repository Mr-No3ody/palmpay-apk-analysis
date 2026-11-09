package Qe;

import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AVLoadingIndicatorView f7849b;

    public /* synthetic */ a(AVLoadingIndicatorView aVLoadingIndicatorView, int i7) {
        this.f7848a = i7;
        this.f7849b = aVLoadingIndicatorView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7848a) {
            case 0:
                AVLoadingIndicatorView aVLoadingIndicatorView = this.f7849b;
                aVLoadingIndicatorView.f35416b = false;
                aVLoadingIndicatorView.f35415a = -1L;
                aVLoadingIndicatorView.setVisibility(8);
                break;
            default:
                AVLoadingIndicatorView aVLoadingIndicatorView2 = this.f7849b;
                aVLoadingIndicatorView2.f35417c = false;
                if (!aVLoadingIndicatorView2.f35418d) {
                    aVLoadingIndicatorView2.f35415a = System.currentTimeMillis();
                    aVLoadingIndicatorView2.setVisibility(0);
                }
                break;
        }
    }
}
