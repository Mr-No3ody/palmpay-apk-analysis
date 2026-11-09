package androidx.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.ImageCapture$ScreenFlash;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenFlashView extends View {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14913d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1024e f14914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Window f14915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f14916c;

    @UiThread
    public ScreenFlashView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f14915b;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        p140j8.f.g("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f10) {
        if (this.f14915b == null) {
            p140j8.f.g("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f10)) {
            p140j8.f.g("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f14915b.getAttributes();
        attributes.screenBrightness = f10;
        this.f14915b.setAttributes(attributes);
        p140j8.f.G("ScreenFlashView");
    }

    private void setScreenFlashUiInfo(ImageCapture$ScreenFlash imageCapture$ScreenFlash) {
        AbstractC1024e abstractC1024e = this.f14914a;
        if (abstractC1024e == null) {
            p140j8.f.G("ScreenFlashView");
            return;
        }
        androidx.camera.view.internal.a aVar = androidx.camera.view.internal.a.f14975b;
        androidx.camera.view.internal.b bVar = new androidx.camera.view.internal.b(aVar, imageCapture$ScreenFlash);
        androidx.camera.view.internal.b bVarF = abstractC1024e.f();
        abstractC1024e.f14923B.put(aVar, bVar);
        androidx.camera.view.internal.b bVarF2 = abstractC1024e.f();
        if (bVarF2 == null || bVarF2.equals(bVarF)) {
            return;
        }
        abstractC1024e.q();
    }

    @Nullable
    @UiThread
    public ImageCapture$ScreenFlash getScreenFlash() {
        return this.f14916c;
    }

    @RestrictTo({p192n.c.f39801b})
    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    @UiThread
    public void setController(@Nullable AbstractC1024e abstractC1024e) {
        p140j8.f.b();
        AbstractC1024e abstractC1024e2 = this.f14914a;
        if (abstractC1024e2 != null && abstractC1024e2 != abstractC1024e) {
            setScreenFlashUiInfo(null);
        }
        this.f14914a = abstractC1024e;
        if (abstractC1024e == null) {
            return;
        }
        p140j8.f.b();
        if (abstractC1024e.f14927d.F() == 3 && this.f14915b == null) {
            throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        }
        setScreenFlashUiInfo(getScreenFlash());
    }

    @UiThread
    public void setScreenFlashWindow(@Nullable Window window) {
        p140j8.f.b();
        if (this.f14915b != window) {
            this.f14916c = window == null ? null : new z(this);
        }
        this.f14915b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    @UiThread
    public ScreenFlashView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @UiThread
    public ScreenFlashView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
