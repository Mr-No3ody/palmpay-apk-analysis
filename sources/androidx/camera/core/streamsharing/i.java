package androidx.camera.core.streamsharing;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.EnumC1006u;
import androidx.camera.core.impl.EnumC1007v;
import androidx.camera.core.impl.EnumC1008w;
import androidx.camera.core.impl.EnumC1009x;
import androidx.camera.core.impl.EnumC1010y;
import androidx.camera.core.impl.EnumC1011z;
import androidx.camera.core.impl.O0;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMTNLoginActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOneLoopActivity;

/* JADX INFO: loaded from: classes.dex */
public final class i implements CameraCaptureResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14504c;

    public i(CameraCaptureResult cameraCaptureResult, O0 o10, long j6) {
        this.f14503b = cameraCaptureResult;
        this.f14504c = o10;
        this.f14502a = j6;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1006u getAeMode() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.f14503b;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeMode() : EnumC1006u.f14132a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1007v getAeState() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.f14503b;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeState() : EnumC1007v.f14264a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1008w getAfMode() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.f14503b;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfMode() : EnumC1008w.f14274a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1009x getAfState() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.f14503b;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfState() : EnumC1009x.f14279a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1010y getAwbMode() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.f14503b;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbMode() : EnumC1010y.f14287a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1011z getAwbState() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.f14503b;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbState() : EnumC1011z.f14299a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public A getFlashState() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.f14503b;
        return cameraCaptureResult != null ? cameraCaptureResult.getFlashState() : A.f13828a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public O0 getTagBundle() {
        return (O0) this.f14504c;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        CameraCaptureResult cameraCaptureResult = (CameraCaptureResult) this.f14503b;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getTimestamp();
        }
        long j6 = this.f14502a;
        if (j6 != -1) {
            return j6;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    public i(OcMTNLoginActivity ocMTNLoginActivity) {
        this.f14504c = ocMTNLoginActivity;
        this.f14503b = new Handler(Looper.getMainLooper());
    }

    public i(OcOneLoopActivity ocOneLoopActivity) {
        this.f14504c = ocOneLoopActivity;
        this.f14503b = new Handler(Looper.getMainLooper());
    }
}
