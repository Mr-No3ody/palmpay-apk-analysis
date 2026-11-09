package p348x6;

import D3.a;
import android.graphics.PointF;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceLandmark;
import com.palmpay.lib.liveness.task.IDetectionTask;
import kotlin.jvm.internal.Intrinsics;
import p232p6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements IDetectionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43648a;

    static {
        new h(null);
    }

    public i(String threshold) {
        float f10;
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        try {
            f10 = Float.parseFloat(threshold);
        } catch (NumberFormatException unused) {
            f10 = 0.3f;
        }
        this.f43648a = f10;
    }

    @Override // com.palmpay.lib.liveness.task.IDetectionTask
    public final boolean process(Face face2) {
        FaceLandmark landmark;
        PointF position;
        FaceLandmark landmark2;
        PointF position2;
        FaceLandmark landmark3;
        PointF position3;
        Intrinsics.checkNotNullParameter(face2, "face");
        p.f41245l.mouthOpen();
        if (a.o(face2) && (landmark = face2.getLandmark(5)) != null && (position = landmark.getPosition()) != null && (landmark2 = face2.getLandmark(11)) != null && (position2 = landmark2.getPosition()) != null && (landmark3 = face2.getLandmark(0)) != null && (position3 = landmark3.getPosition()) != null) {
            float f10 = position.x - position2.x;
            float f11 = position.y - position2.y;
            float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            float f12 = position3.x;
            float f13 = position.x;
            float f14 = position3.y;
            float f15 = position.y;
            float f16 = position2.x;
            float f17 = f16 - f13;
            float f18 = position2.y;
            float f19 = f18 - f15;
            float f20 = (((f14 - f15) * f19) + ((f12 - f13) * f17)) / ((f19 * f19) + (f17 * f17));
            if (f20 >= 0.0f && (f13 != f16 || f15 != f18)) {
                if (f20 > 1.0f) {
                    f15 = f18;
                    f13 = f16;
                } else {
                    f13 += f17 * f20;
                    f15 += f20 * f19;
                }
            }
            float f21 = f12 - f13;
            float f22 = f14 - f15;
            float fSqrt2 = ((float) Math.sqrt((f22 * f22) + (f21 * f21))) / fSqrt;
            int i7 = p292t6.a.f42345a;
            p292t6.a.a("mouth ratio: " + fSqrt2);
            if (fSqrt2 > this.f43648a) {
                return true;
            }
        }
        return false;
    }

    @Override // com.palmpay.lib.liveness.task.IDetectionTask
    public final void start() {
    }
}
