package Da;

import android.app.Activity;
import com.facebook.react.bridge.Promise;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PPRNBridge f1733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f1735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Promise f1736e;

    public /* synthetic */ b(PPRNBridge pPRNBridge, String str, Activity activity, Promise promise, int i7) {
        this.f1732a = i7;
        this.f1733b = pPRNBridge;
        this.f1734c = str;
        this.f1735d = activity;
        this.f1736e = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1732a) {
            case 0:
                PPRNBridge.showDatePickerByMode$lambda$31$lambda$30(this.f1733b, this.f1734c, this.f1735d, this.f1736e);
                break;
            case 1:
                PPRNBridge.showDatePicker$lambda$27$lambda$26(this.f1733b, this.f1734c, this.f1735d, this.f1736e);
                break;
            case 2:
                PPRNBridge.showCommonPopViewWithArray$lambda$23$lambda$22(this.f1733b, this.f1734c, this.f1735d, this.f1736e);
                break;
            default:
                PPRNBridge.showSingleColumnPopView$lambda$21$lambda$20(this.f1733b, this.f1734c, this.f1735d, this.f1736e);
                break;
        }
    }
}
