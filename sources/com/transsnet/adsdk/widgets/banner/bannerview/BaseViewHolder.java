package com.transsnet.adsdk.widgets.banner.bannerview;

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
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    private final SparseArray<View> mViews;

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
        this.mViews = new SparseArray<>();
    }

    @Deprecated
    public void bindData(T data, int position, int pageSize) {
    }

    public <V extends View> V findViewById(int i7) {
        V v3 = (V) this.mViews.get(i7);
        if (v3 != null) {
            return v3;
        }
        V v4 = (V) this.itemView.findViewById(i7);
        this.mViews.put(i7, v4);
        return v4;
    }

    public void setBackgroundColor(int viewId, @ColorInt int colorId) {
        findViewById(viewId).setBackgroundColor(colorId);
    }

    public void setBackgroundResource(int viewId, @DrawableRes int resId) {
        findViewById(viewId).setBackgroundResource(resId);
    }

    public void setImageBitmap(@IdRes int viewId, Bitmap bitmap) {
        ((ImageView) findViewById(viewId)).setImageBitmap(bitmap);
    }

    public void setImageDrawable(@IdRes int viewId, Drawable drawable) {
        View viewFindViewById = findViewById(viewId);
        if (viewFindViewById instanceof ImageView) {
            ((ImageView) viewFindViewById).setImageDrawable(drawable);
        }
    }

    public void setImageResource(@IdRes int viewId, @DrawableRes int resId) {
        View viewFindViewById = findViewById(viewId);
        if (viewFindViewById instanceof ImageView) {
            ((ImageView) viewFindViewById).setImageResource(resId);
        }
    }

    public void setOnClickListener(int viewId, View.OnClickListener clickListener) {
        findViewById(viewId).setOnClickListener(clickListener);
    }

    public void setText(int viewId, CharSequence text) {
        View viewFindViewById = findViewById(viewId);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setText(text);
        }
    }

    public void setTextColor(int viewId, @ColorInt int colorId) {
        View viewFindViewById = findViewById(viewId);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setTextColor(colorId);
        }
    }

    public void setTextColorRes(@IdRes int viewId, @ColorRes int colorRes) {
        View viewFindViewById = findViewById(viewId);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setTextColor(this.itemView.getContext().getColor(colorRes));
        }
    }

    public void setVisibility(@IdRes int resId, int visibility) {
        findViewById(resId).setVisibility(visibility);
    }

    public void setText(int viewId, @StringRes int textId) {
        View viewFindViewById = findViewById(viewId);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setText(textId);
        }
    }
}
