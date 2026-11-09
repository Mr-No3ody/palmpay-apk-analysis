package androidx.camera.core.internal.utils;

import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.EnumC1007v;
import androidx.camera.core.impl.EnumC1009x;
import androidx.camera.core.impl.EnumC1011z;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    @Override // androidx.camera.core.internal.utils.a, androidx.camera.core.internal.utils.RingBuffer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void enqueue(ImageProxy imageProxy) {
        ImageInfo imageInfo = imageProxy.getImageInfo();
        CameraCaptureResult cameraCaptureResult = imageInfo instanceof androidx.camera.core.internal.c ? ((androidx.camera.core.internal.c) imageInfo).f14315a : null;
        if ((cameraCaptureResult.getAfState() == EnumC1009x.f14284f || cameraCaptureResult.getAfState() == EnumC1009x.f14282d) && cameraCaptureResult.getAeState() == EnumC1007v.f14268e && cameraCaptureResult.getAwbState() == EnumC1011z.f14302d) {
            super.enqueue(imageProxy);
        } else {
            this.f14360d.getClass();
            imageProxy.close();
        }
    }
}
