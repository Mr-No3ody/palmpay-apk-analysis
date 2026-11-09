package p348x6;

import com.google.android.material.navigation.NavigationBarView;
import com.google.mlkit.vision.face.Face;
import com.palmpay.lib.liveness.model.ExtendFeature;
import com.palmpay.lib.liveness.net.ReasonTrack;
import com.palmpay.lib.liveness.task.IDetectionTask;
import kotlin.jvm.internal.Intrinsics;
import p232p6.p;
import r6.a;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements IDetectionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f43647b;

    static {
        new f(null);
    }

    public g() {
        Float f10;
        p pVar = p.f41234a;
        a aVar = p.f41237d;
        this.f43646a = (aVar == null || (f10 = aVar.f41580l) == null) ? 0.5f : f10.floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    @Override // com.palmpay.lib.liveness.task.IDetectionTask
    public final boolean process(Face face2) {
        boolean zO;
        ExtendFeature extendFeature;
        Intrinsics.checkNotNullParameter(face2, "face");
        ReasonTrack reasonTrack = p.f41245l;
        reasonTrack.holdOn();
        Float leftEyeOpenProbability = face2.getLeftEyeOpenProbability();
        Float rightEyeOpenProbability = face2.getRightEyeOpenProbability();
        if (leftEyeOpenProbability != null && rightEyeOpenProbability != null) {
            float fFloatValue = leftEyeOpenProbability.floatValue();
            float f10 = this.f43646a;
            if (fFloatValue < f10 || rightEyeOpenProbability.floatValue() < f10) {
                return false;
            }
        }
        a aVar = p.f41237d;
        String holdOnFacingDetect = (aVar == null || (extendFeature = aVar.f41587s) == null) ? null : extendFeature.getHoldOnFacingDetect();
        if (holdOnFacingDetect != null) {
            switch (holdOnFacingDetect.hashCode()) {
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    holdOnFacingDetect.equals("1");
                    zO = true;
                    break;
                case 50:
                    if (!holdOnFacingDetect.equals("2")) {
                        zO = true;
                    } else {
                        zO = D3.a.o(face2);
                    }
                    break;
                case 51:
                    if (!holdOnFacingDetect.equals("3")) {
                        zO = true;
                    } else if (System.currentTimeMillis() - this.f43647b >= 2000) {
                        reasonTrack.holdOnTimeOut(1);
                        zO = true;
                    } else {
                        zO = D3.a.o(face2);
                    }
                    break;
                default:
                    zO = true;
                    break;
            }
        } else {
            zO = true;
        }
        return zO && System.currentTimeMillis() - this.f43647b >= 1500;
    }

    @Override // com.palmpay.lib.liveness.task.IDetectionTask
    public final void start() {
        this.f43647b = System.currentTimeMillis();
    }
}
