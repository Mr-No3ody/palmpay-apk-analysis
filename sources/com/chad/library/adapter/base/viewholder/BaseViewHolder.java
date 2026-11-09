package com.chad.library.adapter.base.viewholder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import androidx.databinding.c;
import androidx.databinding.j;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.perf.util.Constants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p106h0.a;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\u0002*\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0016J#\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0016J#\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u0016J#\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0016J#\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010\u0016J!\u0010*\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010+J!\u0010/\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020(H\u0016¢\u0006\u0004\b/\u0010+R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/databinding/j;", "B", "getBinding", "()Landroidx/databinding/j;", "T", "", "viewId", "getView", "(I)Landroid/view/View;", "getViewOrNull", "findView", "", "value", "setText", "(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "strId", "(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", ViewProps.COLOR, "setTextColor", "colorRes", "setTextColorRes", "imageResId", "setImageResource", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(ILandroid/graphics/drawable/Drawable;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "(ILandroid/graphics/Bitmap;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "setBackgroundColor", "backgroundRes", "setBackgroundResource", "", "isVisible", "setVisible", "(IZ)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "isGone", "setGone", Constants.ENABLE_DISABLE, "setEnabled", "Landroid/util/SparseArray;", "views", "Landroid/util/SparseArray;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class BaseViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    private final SparseArray<View> views;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.views = new SparseArray<>();
    }

    @Nullable
    public <T extends View> T findView(int i7) {
        return (T) this.itemView.findViewById(i7);
    }

    @Deprecated(message = "Please use BaseDataBindingHolder class", replaceWith = @ReplaceWith(expression = "DataBindingUtil.getBinding(itemView)", imports = {"androidx.databinding.DataBindingUtil"}))
    @Nullable
    public <B extends j> B getBinding() {
        View view = this.itemView;
        int i7 = c.f16423a;
        int i10 = j.f16428b;
        if (view == null || view.getTag(a.dataBinding) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @NotNull
    public <T extends View> T getView(@IdRes int viewId) {
        T t = (T) getViewOrNull(viewId);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(Intrinsics.k(Integer.valueOf(viewId), "No view found with id ").toString());
    }

    @Nullable
    public <T extends View> T getViewOrNull(@IdRes int viewId) {
        T t;
        T t3 = (T) this.views.get(viewId);
        if (t3 == null && (t = (T) this.itemView.findViewById(viewId)) != null) {
            this.views.put(viewId, t);
            return t;
        }
        if (t3 != null) {
            return t3;
        }
        return null;
    }

    @NotNull
    public BaseViewHolder setBackgroundColor(@IdRes int viewId, @ColorInt int color) {
        getView(viewId).setBackgroundColor(color);
        return this;
    }

    @NotNull
    public BaseViewHolder setBackgroundResource(@IdRes int viewId, @DrawableRes int backgroundRes) {
        getView(viewId).setBackgroundResource(backgroundRes);
        return this;
    }

    @NotNull
    public BaseViewHolder setEnabled(@IdRes int viewId, boolean isEnabled) {
        getView(viewId).setEnabled(isEnabled);
        return this;
    }

    @NotNull
    public BaseViewHolder setGone(@IdRes int viewId, boolean isGone) {
        getView(viewId).setVisibility(isGone ? 8 : 0);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageBitmap(@IdRes int viewId, @Nullable Bitmap bitmap) {
        ((ImageView) getView(viewId)).setImageBitmap(bitmap);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageDrawable(@IdRes int viewId, @Nullable Drawable drawable) {
        ((ImageView) getView(viewId)).setImageDrawable(drawable);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageResource(@IdRes int viewId, @DrawableRes int imageResId) {
        ((ImageView) getView(viewId)).setImageResource(imageResId);
        return this;
    }

    @NotNull
    public BaseViewHolder setText(@IdRes int viewId, @Nullable CharSequence value) {
        ((TextView) getView(viewId)).setText(value);
        return this;
    }

    @NotNull
    public BaseViewHolder setTextColor(@IdRes int viewId, @ColorInt int color) {
        ((TextView) getView(viewId)).setTextColor(color);
        return this;
    }

    @NotNull
    public BaseViewHolder setTextColorRes(@IdRes int viewId, @ColorRes int colorRes) {
        ((TextView) getView(viewId)).setTextColor(this.itemView.getContext().getColor(colorRes));
        return this;
    }

    @NotNull
    public BaseViewHolder setVisible(@IdRes int viewId, boolean isVisible) {
        getView(viewId).setVisibility(isVisible ? 0 : 4);
        return this;
    }

    @Nullable
    public BaseViewHolder setText(@IdRes int viewId, @StringRes int strId) {
        ((TextView) getView(viewId)).setText(strId);
        return this;
    }
}
