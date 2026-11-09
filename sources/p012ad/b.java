package p012ad;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.transsnet.palmpay.photograph.crop.CropView;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CropView f11879a;

    public b(CropView cropView) {
        this.f11879a = cropView;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        CropView cropView = this.f11879a;
        try {
            float scale = cropView.getScale();
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            float f10 = cropView.f33092b;
            if (scale < f10) {
                CropView.c(cropView, f10, x3, y8);
                return true;
            }
            if (scale >= f10) {
                float f11 = cropView.f33093c;
                if (scale < f11) {
                    CropView.c(cropView, f11, x3, y8);
                    return true;
                }
            }
            CropView.c(cropView, cropView.f33091a, x3, y8);
            return true;
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }
}
