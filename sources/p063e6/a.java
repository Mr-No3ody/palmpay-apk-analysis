package p063e6;

import F2.g;
import android.graphics.drawable.Animatable;
import androidx.core.provider.m;
import com.facebook.imagepipeline.image.ImageInfo;
import com.palmpay.image.webp.WebpGLView;
import com.palmpay.image.webp.XGLTextureView;
import com.palmpay.image.webp.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebpGLView f36168b;

    public a(WebpGLView webpGLView) {
        this.f36168b = webpGLView;
    }

    @Override // F2.g, com.facebook.drawee.controller.ControllerListener
    public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
        ImageInfo imageInfo = (ImageInfo) obj;
        if (imageInfo == null || imageInfo.getHeight() < 1 || imageInfo.getWidth() < 1) {
            return;
        }
        WebpGLView webpGLView = this.f36168b;
        m mVar = new m(this, 15, imageInfo, false);
        f fVar = webpGLView.f23734b;
        fVar.getClass();
        V7.g gVar = XGLTextureView.t;
        synchronized (gVar) {
            fVar.f23786w.add(mVar);
            gVar.notifyAll();
        }
        this.f36168b.f23731v = animatable;
    }
}
