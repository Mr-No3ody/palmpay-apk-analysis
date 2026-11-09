package D6;

import C6.q;
import C6.r;
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
import p232p6.p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements OnFailureListener, ImageAnalysis$Analyzer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1660a;

    public /* synthetic */ j(m mVar) {
        this.f1660a = mVar;
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public void analyze(ImageProxy imageProxy) {
        m mVar = this.f1660a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Image image = imageProxy.getImage();
        if (!mVar.f1672H || image == null) {
            imageProxy.close();
            return;
        }
        if (mVar.f1671C < 1) {
            mVar.f1671C = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - mVar.f1671C;
        InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, imageProxy.getImageInfo().getRotationDegrees());
        Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
        ((FaceDetector) mVar.f1674M.getValue()).process(inputImageFromMediaImage).addOnSuccessListener(new A8.a(new q(mVar, jCurrentTimeMillis, imageProxy, inputImageFromMediaImage, 1), 27)).addOnFailureListener(new j(mVar)).addOnCompleteListener(new r(imageProxy, 2));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        g0 g0Var;
        Object value;
        Intrinsics.checkNotNullParameter(exception, "exception");
        p292t6.a.b("Error detecting faces");
        p.f41245l.detectError();
        f fVar = f.f1631p;
        LiveIDResult.Error error = new LiveIDResult.Error(new LiveIDException(fVar.f1633a, fVar.f1634b, null, null, 12, null));
        m mVar = this.f1660a;
        mVar.f1683v = error;
        do {
            g0Var = mVar.f1682p;
            value = g0Var.getValue();
        } while (!g0Var.compareAndSet(value, i.a((i) value, null, 0.0f, null, null, g.f1637c, null, null, 79)));
    }
}
