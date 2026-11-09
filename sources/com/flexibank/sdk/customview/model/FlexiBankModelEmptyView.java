package com.flexibank.sdk.customview.model;

import L6.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/flexibank/sdk/customview/model/FlexiBankModelEmptyView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "getMLayout", "()Landroid/widget/LinearLayout;", "setMLayout", "(Landroid/widget/LinearLayout;)V", "mLayout", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "getMIv", "()Landroid/widget/ImageView;", "setMIv", "(Landroid/widget/ImageView;)V", "mIv", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getMTv", "()Landroid/widget/TextView;", "setMTv", "(Landroid/widget/TextView;)V", "mTv", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankModelEmptyView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public LinearLayout mLayout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public ImageView mIv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public TextView mTv;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f22250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f22251e;

    public FlexiBankModelEmptyView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        TextView textView;
        ImageView imageView;
        super(context, attributeSet, i7);
        View.inflate(context, q.fb_layout_list_empty_view_2, this);
        this.mLayout = (LinearLayout) findViewById(p.fb_llEmptyView);
        this.mIv = (ImageView) findViewById(p.fb_imageViewIcon);
        this.mTv = (TextView) findViewById(p.fb_textViewMessage);
        Drawable drawable = this.f22250d;
        if (drawable != null) {
            ImageView imageView2 = this.mIv;
            Intrinsics.e(imageView2);
            imageView2.setImageDrawable(drawable);
        }
        CharSequence charSequence = this.f22251e;
        if (!TextUtils.isEmpty(charSequence)) {
            TextView textView2 = this.mTv;
            Intrinsics.e(textView2);
            textView2.setText(charSequence);
        }
        setBackgroundColor(getResources().getColor(b.ppColorBackgroundDark));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.fb_EmptyView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(t.fb_EmptyView_fb_empty_icon);
        this.f22250d = drawable2;
        CharSequence text = typedArrayObtainStyledAttributes.getText(t.fb_EmptyView_fb_empty_text);
        this.f22251e = text;
        typedArrayObtainStyledAttributes.recycle();
        if (drawable2 != null && (imageView = this.mIv) != null) {
            Intrinsics.e(imageView);
            imageView.setImageDrawable(drawable2);
        }
        if (TextUtils.isEmpty(text) || (textView = this.mTv) == null) {
            return;
        }
        Intrinsics.e(textView);
        textView.setText(text);
    }

    @Nullable
    public final ImageView getMIv() {
        return this.mIv;
    }

    @Nullable
    public final LinearLayout getMLayout() {
        return this.mLayout;
    }

    @Nullable
    public final TextView getMTv() {
        return this.mTv;
    }

    public final void setMIv(@Nullable ImageView imageView) {
        this.mIv = imageView;
    }

    public final void setMLayout(@Nullable LinearLayout linearLayout) {
        this.mLayout = linearLayout;
    }

    public final void setMTv(@Nullable TextView textView) {
        this.mTv = textView;
    }
}
