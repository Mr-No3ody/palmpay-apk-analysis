package p251q9;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41466a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f41467b;

    public a(BalloonAnchorOverlayView balloonAnchorOverlayView, BalloonAnchorOverlayView balloonAnchorOverlayView2) {
        this.f41467b = balloonAnchorOverlayView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f41466a) {
            case 0:
                return (BalloonAnchorOverlayView) this.f41467b;
            default:
                return (RelativeLayout) this.f41467b;
        }
    }

    public a(RelativeLayout relativeLayout) {
        this.f41467b = relativeLayout;
    }
}
