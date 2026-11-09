package H1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.SizeReadyCallback;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f3603d = com.bumptech.glide.h.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f3604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f3605c;

    public m(ImageView imageView) {
        J1.g.c(imageView, "Argument must not be null");
        this.f3604b = imageView;
        this.f3605c = new l(imageView);
    }

    @Override // H1.a, com.bumptech.glide.request.target.Target
    public final Request getRequest() {
        Object tag = this.f3604b.getTag(f3603d);
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request) {
            return (Request) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(SizeReadyCallback sizeReadyCallback) {
        l lVar = this.f3605c;
        ImageView imageView = lVar.f3600a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iA = lVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = lVar.f3600a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iA2 = lVar.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            sizeReadyCallback.onSizeReady(iA, iA2);
            return;
        }
        ArrayList arrayList = lVar.f3601b;
        if (!arrayList.contains(sizeReadyCallback)) {
            arrayList.add(sizeReadyCallback);
        }
        if (lVar.f3602c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            d dVar = new d(lVar);
            lVar.f3602c = dVar;
            viewTreeObserver.addOnPreDrawListener(dVar);
        }
    }

    public final View getView() {
        return this.f3604b;
    }

    @Override // H1.a, com.bumptech.glide.request.target.Target
    public void onLoadCleared(Drawable drawable) {
        l lVar = this.f3605c;
        ViewTreeObserver viewTreeObserver = lVar.f3600a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(lVar.f3602c);
        }
        lVar.f3602c = null;
        lVar.f3601b.clear();
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void removeCallback(SizeReadyCallback sizeReadyCallback) {
        this.f3605c.f3601b.remove(sizeReadyCallback);
    }

    @Override // H1.a, com.bumptech.glide.request.target.Target
    public final void setRequest(Request request) {
        this.f3604b.setTag(f3603d, request);
    }

    public final String toString() {
        return "Target for: " + this.f3604b;
    }
}
