package U;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterView;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageFilterView f9095b;

    public /* synthetic */ b(ImageFilterView imageFilterView, int i7) {
        this.f9094a = i7;
        this.f9095b = imageFilterView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f9094a) {
            case 0:
                ImageFilterView imageFilterView = this.f9095b;
                int width = imageFilterView.getWidth();
                int height = imageFilterView.getHeight();
                outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterView.f15524f) / 2.0f);
                break;
            default:
                ImageFilterView imageFilterView2 = this.f9095b;
                outline.setRoundRect(0, 0, imageFilterView2.getWidth(), imageFilterView2.getHeight(), imageFilterView2.f15525g);
                break;
        }
    }
}
