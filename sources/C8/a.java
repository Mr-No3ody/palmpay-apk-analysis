package C8;

import com.transsnet.mtn.sdk.ui.view.avloading.AVLoadingIndicatorView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AVLoadingIndicatorView f1244b;

    public /* synthetic */ a(AVLoadingIndicatorView aVLoadingIndicatorView, int i7) {
        this.f1243a = i7;
        this.f1244b = aVLoadingIndicatorView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1243a) {
            case 0:
                AVLoadingIndicatorView aVLoadingIndicatorView = this.f1244b;
                aVLoadingIndicatorView.f25744b = false;
                aVLoadingIndicatorView.f25743a = -1L;
                aVLoadingIndicatorView.setVisibility(8);
                break;
            default:
                AVLoadingIndicatorView aVLoadingIndicatorView2 = this.f1244b;
                aVLoadingIndicatorView2.f25745c = false;
                if (!aVLoadingIndicatorView2.f25746d) {
                    aVLoadingIndicatorView2.f25743a = System.currentTimeMillis();
                    aVLoadingIndicatorView2.setVisibility(0);
                }
                break;
        }
    }
}
