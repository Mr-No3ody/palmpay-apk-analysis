package E;

import androidx.camera.core.ForwardingImageProxy$OnImageCloseListener;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class S implements ForwardingImageProxy$OnImageCloseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f1953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f1954c;

    public /* synthetic */ S(ImageProxy imageProxy, ImageProxy imageProxy2, int i7) {
        this.f1952a = i7;
        this.f1953b = imageProxy;
        this.f1954c = imageProxy2;
    }

    @Override // androidx.camera.core.ForwardingImageProxy$OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        ImageProxy imageProxy2 = this.f1954c;
        ImageProxy imageProxy3 = this.f1953b;
        switch (this.f1952a) {
            case 0:
                int i7 = ImageProcessingUtil.f13708a;
                if (imageProxy3 != null && imageProxy2 != null) {
                    imageProxy2.close();
                    break;
                }
                break;
            default:
                int i10 = ImageProcessingUtil.f13708a;
                if (imageProxy3 != null && imageProxy2 != null) {
                    imageProxy2.close();
                    break;
                }
                break;
        }
    }
}
