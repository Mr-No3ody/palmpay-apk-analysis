package org.sufficientlysecure.htmltextview;

import U2.B;
import android.content.Context;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.ExposureState;
import com.didi.drouter.store.IRouterProxy;
import com.didi.drouter.utils.RouterLogger$ILogPrinter;
import com.palmpay.lib.bridgewrapper.video.VideoUploadBridge;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.rnbridge.bridge.PPhotoSaveBridge;
import com.transsnet.palmpay.core.util.MediaStoreHelper$showLoadingDialogInterface;
import com.transsnet.palmpay.credit.businessLoan.rnbridge.LocationServiceBridge;
import com.transsnet.palmpay.util.ActivityUtils;
import defpackage.CommonFileUploadBridge;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements MediaStoreHelper$showLoadingDialogInterface, ExposureState, IRouterProxy, RouterLogger$ILogPrinter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41130a;

    public /* synthetic */ i(int i7) {
        this.f41130a = i7;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41130a) {
            case 5:
                throw new B(11);
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // com.didi.drouter.utils.RouterLogger$ILogPrinter
    public void e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        return 0;
    }

    @Override // androidx.camera.core.ExposureState
    public Range getExposureCompensationRange() {
        return new Range(0, 0);
    }

    @Override // androidx.camera.core.ExposureState
    public Rational getExposureCompensationStep() {
        return Rational.ZERO;
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        return false;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f41130a) {
            case 5:
                return new CommonFileUploadBridge();
            case 6:
                return new VideoUploadBridge();
            case 7:
                return new PPhotoSaveBridge();
            default:
                return new LocationServiceBridge();
        }
    }

    @Override // com.transsnet.palmpay.core.util.MediaStoreHelper$showLoadingDialogInterface
    public void showDialog(boolean z3) {
        if (ActivityUtils.getTopActivity() instanceof BaseActivity) {
            ((BaseActivity) ActivityUtils.getTopActivity()).showLoadingDialog(z3);
        }
    }

    @Override // com.transsnet.palmpay.core.util.MediaStoreHelper$showLoadingDialogInterface
    public void completed() {
    }

    @Override // com.didi.drouter.utils.RouterLogger$ILogPrinter
    public void d(String str, String str2) {
    }

    @Override // com.didi.drouter.utils.RouterLogger$ILogPrinter
    public void w(String str, String str2) {
    }
}
