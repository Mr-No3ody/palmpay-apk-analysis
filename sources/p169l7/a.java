package p169l7;

import android.graphics.Bitmap;
import com.palmpay.lib.scanplus.view.ScanView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScanView f39277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f39278c;

    public /* synthetic */ a(ScanView scanView, Bitmap bitmap, int i7) {
        this.f39276a = i7;
        this.f39277b = scanView;
        this.f39278c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39276a) {
            case 0:
                this.f39277b.setLineBitmap(this.f39278c);
                break;
            default:
                this.f39277b.setTrailingBitmap(this.f39278c);
                break;
        }
    }
}
