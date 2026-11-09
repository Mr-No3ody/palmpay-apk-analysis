package B6;

import Ad.C0058e;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetector;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: renamed from: B6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0080b extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0081c f449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0080b(ImageProxy imageProxy, C0081c c0081c, Continuation continuation) {
        super(2, continuation);
        this.f448c = imageProxy;
        this.f449d = c0081c;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0080b c0080b = new C0080b(this.f448c, this.f449d, continuation);
        c0080b.f447b = obj;
        return c0080b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0080b) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f446a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            ProducerScope producerScope = (ProducerScope) this.f447b;
            ImageProxy imageProxy = this.f448c;
            Image image = imageProxy.getImage();
            if (image == null) {
                producerScope.close(null);
                return Unit.f38893a;
            }
            InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, imageProxy.getImageInfo().getRotationDegrees());
            Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
            ((FaceDetector) this.f449d.f465b.getValue()).process(inputImageFromMediaImage).addOnSuccessListener(new A8.a(new C0058e(2, inputImageFromMediaImage, producerScope), 11)).addOnFailureListener(new A8.a(producerScope, 12)).addOnCompleteListener(new Ad.c0(1, imageProxy, producerScope));
            Aa.a aVar2 = new Aa.a(2);
            this.f446a = 1;
            if (Yf.C.a(producerScope, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
