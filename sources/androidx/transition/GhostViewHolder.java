package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class GhostViewHolder extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17937c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f17938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17939b;

    public static void a(View view, ArrayList arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (!this.f17939b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            int i7 = E.ghost_view_holder;
            ViewGroup viewGroup = this.f17938a;
            viewGroup.setTag(i7, null);
            viewGroup.getOverlay().remove(this);
            this.f17939b = false;
        }
    }
}
