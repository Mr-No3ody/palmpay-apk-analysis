package H1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3580f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ImageView imageView, int i7) {
        super(imageView);
        this.f3580f = i7;
    }

    @Override // H1.g
    public final void a(Object obj) {
        switch (this.f3580f) {
            case 0:
                this.f3604b.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f3604b.setImageDrawable((Drawable) obj);
                break;
        }
    }
}
