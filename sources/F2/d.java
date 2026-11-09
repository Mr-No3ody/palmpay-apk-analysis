package F2;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {
    @Override // F2.g, com.facebook.drawee.controller.ControllerListener
    public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
        if (animatable != null) {
            animatable.start();
        }
    }
}
