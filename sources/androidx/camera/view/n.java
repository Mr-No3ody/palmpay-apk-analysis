package androidx.camera.view;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public final class n implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreviewView f14992a;

    public n(PreviewView previewView) {
        this.f14992a = previewView;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        PreviewView previewView = this.f14992a;
        Display display = previewView.getDisplay();
        if (display == null || display.getDisplayId() != i7) {
            return;
        }
        previewView.b();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }
}
