package H1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements Target {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f3587c = com.bumptech.glide.h.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f3588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3589b;

    public f(View view) {
        J1.g.c(view, "Argument must not be null");
        this.f3589b = view;
        this.f3588a = new e(view);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final Request getRequest() {
        Object tag = this.f3589b.getTag(f3587c);
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request) {
            return (Request) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(SizeReadyCallback sizeReadyCallback) {
        e eVar = this.f3588a;
        View view = eVar.f3584a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = eVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = eVar.f3584a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA2 = eVar.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            sizeReadyCallback.onSizeReady(iA, iA2);
            return;
        }
        ArrayList arrayList = eVar.f3585b;
        if (!arrayList.contains(sizeReadyCallback)) {
            arrayList.add(sizeReadyCallback);
        }
        if (eVar.f3586c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            d dVar = new d(eVar);
            eVar.f3586c = dVar;
            viewTreeObserver.addOnPreDrawListener(dVar);
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable) {
        e eVar = this.f3588a;
        ViewTreeObserver viewTreeObserver = eVar.f3584a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(eVar.f3586c);
        }
        eVar.f3586c = null;
        eVar.f3585b.clear();
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void removeCallback(SizeReadyCallback sizeReadyCallback) {
        this.f3588a.f3585b.remove(sizeReadyCallback);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void setRequest(Request request) {
        this.f3589b.setTag(f3587c, request);
    }

    public final String toString() {
        return "Target for: " + this.f3589b;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadStarted(Drawable drawable) {
    }
}
