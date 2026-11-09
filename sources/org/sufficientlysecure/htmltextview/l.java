package org.sufficientlysecure.htmltextview;

import U2.B;
import android.content.Context;
import android.os.SystemClock;
import androidx.camera.video.internal.encoder.TimeProvider;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.util.pool.FactoryPools$Factory;
import com.bumptech.glide.util.pool.FactoryPools$Resetter;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.QualityInfo;
import com.palmpay.lib.bridgewrapper.location.LocationBridge;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.rnbridge.bridge.AppInfoBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.PhotoUploadSyncBridge;
import com.transsnet.palmpay.core.util.MediaStoreHelper$showLoadingDialogInterface;
import com.transsnet.palmpay.credit.rnbridge.CreditFaceBridge;
import com.transsnet.palmpay.util.ActivityUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements FactoryPools$Resetter, MediaStoreHelper$showLoadingDialogInterface, TimeProvider, FactoryPools$Factory, IRouterProxy, ProgressiveJpegConfig, ResourceReleaser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41133a;

    public /* synthetic */ l(int i7) {
        this.f41133a = i7;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41133a) {
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

    @Override // com.bumptech.glide.util.pool.FactoryPools$Factory
    public Object create() {
        return new w();
    }

    @Override // com.facebook.imagepipeline.decoder.ProgressiveJpegConfig
    public boolean decodeProgressively() {
        return true;
    }

    @Override // com.facebook.imagepipeline.decoder.ProgressiveJpegConfig
    public int getNextScanNumberToDecode(int i7) {
        List list = Collections.EMPTY_LIST;
        if (list == null || list.isEmpty()) {
            return i7 + 1;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((Integer) list.get(i10)).intValue() > i7) {
                return ((Integer) list.get(i10)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.facebook.imagepipeline.decoder.ProgressiveJpegConfig
    public QualityInfo getQualityInfo(int i7) {
        boolean z3 = i7 >= 0;
        p109h3.g gVar = new p109h3.g();
        gVar.f37291a = i7;
        gVar.f37292b = z3;
        gVar.f37293c = false;
        return gVar;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f41133a) {
            case 5:
                return new LocationBridge();
            case 6:
                return new AppInfoBridge();
            case 7:
                return new PhotoUploadSyncBridge();
            default:
                return new CreditFaceBridge();
        }
    }

    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public long realtimeUs() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // com.facebook.common.references.ResourceReleaser
    public void release(Object obj) {
        try {
            p213o2.a.a((Closeable) obj);
        } catch (IOException unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.util.MediaStoreHelper$showLoadingDialogInterface
    public void showDialog(boolean z3) {
        if (ActivityUtils.getTopActivity() instanceof BaseActivity) {
            ((BaseActivity) ActivityUtils.getTopActivity()).showLoadingDialog(z3);
        }
    }

    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public long uptimeUs() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    @Override // com.transsnet.palmpay.core.util.MediaStoreHelper$showLoadingDialogInterface
    public void completed() {
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools$Resetter
    public void reset(Object obj) {
    }
}
