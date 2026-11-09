package androidx.preference;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class l extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f17637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17639c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PreferenceFragmentCompat f17640d;

    public l(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.f17640d = preferenceFragmentCompat;
    }

    public final boolean a(RecyclerView recyclerView, View view) {
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if (!(childViewHolder instanceof u) || !((u) childViewHolder).f17674c) {
            return false;
        }
        boolean z3 = this.f17639c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z3;
        }
        RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
        return (childViewHolder2 instanceof u) && ((u) childViewHolder2).f17673b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (a(recyclerView, view)) {
            rect.bottom = this.f17638b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f17637a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            if (a(recyclerView, childAt)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f17637a.setBounds(0, height, width, this.f17638b + height);
                this.f17637a.draw(canvas);
            }
        }
    }
}
