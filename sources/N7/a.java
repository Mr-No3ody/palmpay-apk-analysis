package N7;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.y0;
import androidx.fragment.app.Fragment;
import com.swmansion.rnscreens.Screen;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6100b;

    public a(y0 y0Var, int i7) {
        switch (i7) {
            case 2:
                this.f6100b = false;
                this.f6099a = y0Var.b(AutoFlashUnderExposedQuirk.class) != null;
                break;
            case 3:
                this.f6099a = CaptureIntentPreviewQuirk.workaroundByCaptureIntentPreview(y0Var);
                this.f6100b = y0Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
            default:
                this.f6099a = y0Var.a(ImageCaptureFailWithAutoFlashQuirk.class);
                this.f6100b = androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
        }
    }

    public void a(Screen screen) {
        if (this.f6099a && this.f6100b) {
            if (!screen.sheetShouldOverflowTopInset) {
                screen.shouldTriggerPostponedTransitionAfterLayout = true;
            }
            if (screen.shouldTriggerPostponedTransitionAfterLayout) {
                screen.shouldTriggerPostponedTransitionAfterLayout = false;
                Fragment fragment = screen.getFragment();
                if (fragment != null) {
                    fragment.startPostponedEnterTransition();
                }
            }
        }
    }
}
