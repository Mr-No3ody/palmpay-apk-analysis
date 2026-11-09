package C6;

import android.media.Image;
import androidx.camera.core.ImageAnalysis$Analyzer;
import androidx.camera.core.ImageProxy;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetector;
import com.palmpay.lib.liveness.model.LiveIDException;
import com.palmpay.lib.liveness.result.LiveIDResult;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements ImageAnalysis$Analyzer, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f1162a;

    public /* synthetic */ c(v vVar) {
        this.f1162a = vVar;
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public void analyze(ImageProxy imageProxy) {
        v vVar = this.f1162a;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Image image = imageProxy.getImage();
        if (!vVar.f1222C || image == null) {
            imageProxy.close();
            return;
        }
        if (vVar.f1221B < 1) {
            vVar.f1221B = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - vVar.f1221B;
        InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, imageProxy.getImageInfo().getRotationDegrees());
        Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
        ((FaceDetector) vVar.f1226Q.getValue()).process(inputImageFromMediaImage).addOnSuccessListener(new A8.a(new q(vVar, jCurrentTimeMillis, imageProxy, inputImageFromMediaImage, 0), 17)).addOnFailureListener(new c(vVar)).addOnCompleteListener(new r(imageProxy, 0));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        g0 g0Var;
        Object value;
        Intrinsics.checkNotNullParameter(exception, "exception");
        p292t6.a.b("Error detecting faces");
        p232p6.p.f41245l.detectError();
        D6.f fVar = D6.f.f1631p;
        LiveIDResult.Error error = new LiveIDResult.Error(new LiveIDException(fVar.f1633a, fVar.f1634b, null, null, 12, null));
        v vVar = this.f1162a;
        vVar.t = error;
        do {
            g0Var = vVar.f1235o;
            value = g0Var.getValue();
        } while (!g0Var.compareAndSet(value, D6.i.a((D6.i) value, null, 0.0f, null, null, D6.g.f1637c, null, null, 79)));
    }
}
