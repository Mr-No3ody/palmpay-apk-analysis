package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateAdd(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(@NonNull RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i7;
        int i10;
        return (itemHolderInfo == null || ((i7 = itemHolderInfo.left) == (i10 = itemHolderInfo2.left) && itemHolderInfo.f17680top == itemHolderInfo2.f17680top)) ? animateAdd(viewHolder) : animateMove(viewHolder, i7, itemHolderInfo.f17680top, i10, itemHolderInfo2.f17680top);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i7, int i10, int i11, int i12);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i7;
        int i10;
        int i11 = itemHolderInfo.left;
        int i12 = itemHolderInfo.f17680top;
        if (viewHolder2.shouldIgnore()) {
            int i13 = itemHolderInfo.left;
            i10 = itemHolderInfo.f17680top;
            i7 = i13;
        } else {
            i7 = itemHolderInfo2.left;
            i10 = itemHolderInfo2.f17680top;
        }
        return animateChange(viewHolder, viewHolder2, i11, i12, i7, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateDisappearance(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i7 = itemHolderInfo.left;
        int i10 = itemHolderInfo.f17680top;
        View view = viewHolder.itemView;
        int left = itemHolderInfo2 == null ? view.getLeft() : itemHolderInfo2.left;
        int top2 = itemHolderInfo2 == null ? view.getTop() : itemHolderInfo2.f17680top;
        if (viewHolder.isRemoved() || (i7 == left && i10 == top2)) {
            return animateRemove(viewHolder);
        }
        view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
        return animateMove(viewHolder, i7, i10, left, top2);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateMove(RecyclerView.ViewHolder viewHolder, int i7, int i10, int i11, int i12);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animatePersistence(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i7 = itemHolderInfo.left;
        int i10 = itemHolderInfo2.left;
        if (i7 != i10 || itemHolderInfo.f17680top != itemHolderInfo2.f17680top) {
            return animateMove(viewHolder, i7, itemHolderInfo.f17680top, i10, itemHolderInfo2.f17680top);
        }
        dispatchMoveFinished(viewHolder);
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateRemove(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder) {
        return !this.mSupportsChangeAnimations || viewHolder.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(RecyclerView.ViewHolder viewHolder) {
        onAddFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(RecyclerView.ViewHolder viewHolder) {
        onAddStarting(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z3) {
        onChangeFinished(viewHolder, z3);
        dispatchAnimationFinished(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z3) {
        onChangeStarting(viewHolder, z3);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(RecyclerView.ViewHolder viewHolder) {
        onMoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(RecyclerView.ViewHolder viewHolder) {
        onMoveStarting(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        onRemoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        onRemoveStarting(viewHolder);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(RecyclerView.ViewHolder viewHolder) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z3) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z3) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void setSupportsChangeAnimations(boolean z3) {
        this.mSupportsChangeAnimations = z3;
    }
}
