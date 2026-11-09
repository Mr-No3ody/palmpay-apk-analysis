package U;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageFilterButton f9093b;

    public /* synthetic */ a(ImageFilterButton imageFilterButton, int i7) {
        this.f9092a = i7;
        this.f9093b = imageFilterButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f9092a) {
            case 0:
                ImageFilterButton imageFilterButton = this.f9093b;
                int width = imageFilterButton.getWidth();
                int height = imageFilterButton.getHeight();
                outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterButton.f15506c) / 2.0f);
                break;
            default:
                ImageFilterButton imageFilterButton2 = this.f9093b;
                outline.setRoundRect(0, 0, imageFilterButton2.getWidth(), imageFilterButton2.getHeight(), imageFilterButton2.f15507d);
                break;
        }
    }
}
