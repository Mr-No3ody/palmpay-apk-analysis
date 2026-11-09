package Ed;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.Transition;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends H1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f2312b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(ImageView imageView, int i7) {
        super(0);
        this.f2311a = i7;
        this.f2312b = imageView;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable) {
        int i7 = this.f2311a;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj, Transition transition) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        switch (this.f2311a) {
            case 0:
                Bitmap resource = (Bitmap) obj;
                Intrinsics.checkNotNullParameter(resource, "resource");
                ImageView imageView = this.f2312b;
                if (imageView != null && (layoutParams = imageView.getLayoutParams()) != null) {
                    layoutParams.width = CommonViewExtKt.getDp((resource.getWidth() * 28) / resource.getHeight());
                }
                if (imageView != null) {
                    imageView.setImageBitmap(resource);
                }
                break;
            default:
                Bitmap resource2 = (Bitmap) obj;
                Intrinsics.checkNotNullParameter(resource2, "resource");
                ImageView imageView2 = this.f2312b;
                if (imageView2 != null && (layoutParams2 = imageView2.getLayoutParams()) != null) {
                    layoutParams2.width = CommonViewExtKt.getDp((resource2.getWidth() * 28) / resource2.getHeight());
                }
                if (imageView2 != null) {
                    imageView2.setImageBitmap(resource2);
                }
                break;
        }
    }

    private final void a(Drawable drawable) {
    }

    private final void b(Drawable drawable) {
    }
}
