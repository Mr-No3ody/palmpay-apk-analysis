package p348x6;

import com.google.mlkit.vision.face.Face;
import com.palmpay.lib.liveness.task.IDetectionTask;
import kotlin.jvm.internal.Intrinsics;
import p232p6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements IDetectionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43639a;

    public a(String threshold) {
        float f10;
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        try {
            f10 = Float.parseFloat(threshold);
        } catch (NumberFormatException unused) {
            f10 = 0.5f;
        }
        this.f43639a = f10;
    }

    @Override // com.palmpay.lib.liveness.task.IDetectionTask
    public final boolean process(Face face2) {
        Intrinsics.checkNotNullParameter(face2, "face");
        p.f41245l.blink();
        Float leftEyeOpenProbability = face2.getLeftEyeOpenProbability();
        Float rightEyeOpenProbability = face2.getRightEyeOpenProbability();
        int i7 = p292t6.a.f42345a;
        p292t6.a.a("leftEyeOpenProb: " + leftEyeOpenProbability + ", rightEyeOpenProb: " + rightEyeOpenProbability);
        boolean z3 = false;
        if (leftEyeOpenProbability != null && rightEyeOpenProbability != null) {
            float fFloatValue = leftEyeOpenProbability.floatValue();
            float f10 = this.f43639a;
            if (fFloatValue < f10 || rightEyeOpenProbability.floatValue() < f10) {
                z3 = true;
            }
        }
        p292t6.a.a("isBlink: " + z3);
        return z3;
    }

    @Override // com.palmpay.lib.liveness.task.IDetectionTask
    public final void start() {
    }
}
