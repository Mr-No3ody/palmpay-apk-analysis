package p169l7;

import com.facebook.react.bridge.ReadableMap;
import com.palmpay.lib.scanplus.view.ScanView;
import com.palmpay.rn.scan.ReactScanManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactScanManager f39280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReadableMap f39281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScanView f39282d;

    public /* synthetic */ b(ReactScanManager reactScanManager, ReadableMap readableMap, ScanView scanView, int i7) {
        this.f39279a = i7;
        this.f39280b = reactScanManager;
        this.f39281c = readableMap;
        this.f39282d = scanView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39279a) {
            case 0:
                this.f39280b.lambda$setTrailingBitmap$3(this.f39281c, this.f39282d);
                break;
            default:
                this.f39280b.lambda$setLineBitmap$1(this.f39281c, this.f39282d);
                break;
        }
    }
}
