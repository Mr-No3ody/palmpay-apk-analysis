package com.flexibank.sdk.core.viewmodel;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.flexibank.sdk.k;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p052da.ViewOnClickListenerC1649v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/flexibank/sdk/core/viewmodel/FlexiBankModelItemFee;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "mContext", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", FirebaseAnalytics.Param.CONTENT, "", "setContent", "(Ljava/lang/CharSequence;)V", "gravity", "setMessageGravity", "(I)V", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getMTitleTv", "()Landroid/widget/TextView;", "setMTitleTv", "(Landroid/widget/TextView;)V", "mTitleTv", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "getMRightIv", "()Landroid/widget/ImageView;", "setMRightIv", "(Landroid/widget/ImageView;)V", "mRightIv", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankModelItemFee extends RelativeLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f22121A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public TextView mTitleTv;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f22124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f22125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ImageView mRightIv;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f22127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f22128g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f22129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f22130j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f22131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f22132p;
    public final boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f22133v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22134w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexiBankModelItemFee(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i7) {
        super(mContext, attributeSet, i7);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f22122a = mContext;
        this.f22134w = 17;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.fb_BaseModel, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f22127f = typedArrayObtainStyledAttributes.getText(t.fb_BaseModel_fb_bm_title);
        this.f22128g = typedArrayObtainStyledAttributes.getText(t.fb_BaseModel_fb_bm_default_text);
        this.f22132p = typedArrayObtainStyledAttributes.getInt(t.fb_BaseModel_fb_bm_text_color, 0);
        this.f22129i = typedArrayObtainStyledAttributes.getText(t.fb_BaseModel_fb_bm_amount_sign);
        this.f22131o = typedArrayObtainStyledAttributes.getBoolean(t.fb_BaseModel_fb_bm_show_amount_sign, false);
        if (!TextUtils.isEmpty(this.f22129i)) {
            this.f22131o = true;
        } else if (this.f22131o) {
            k kVar = k.f22317a;
            this.f22129i = "₦";
        }
        this.t = typedArrayObtainStyledAttributes.getBoolean(t.fb_BaseModel_fb_bm_show_tips, false);
        this.f22130j = typedArrayObtainStyledAttributes.getText(t.fb_BaseModel_fb_bm_tips_text);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(mContext, q.fb_model_fee_item, this);
        this.mTitleTv = (TextView) findViewById(p.fb_mfi_title_tv);
        this.f22124c = (TextView) findViewById(p.fb_mfi_amount_tv);
        this.f22125d = (TextView) findViewById(p.fb_origin_amount_tv);
        this.f22133v = (ImageView) findViewById(p.fb_mfi_tips_iv);
        this.mRightIv = (ImageView) findViewById(p.fb_iv_right);
        ImageView imageView = this.f22133v;
        Intrinsics.e(imageView);
        imageView.setOnClickListener(new ViewOnClickListenerC1649v(this, 21));
        if (!TextUtils.isEmpty(this.f22128g)) {
            TextView textView = this.f22124c;
            Intrinsics.e(textView);
            textView.setText(this.f22128g);
        }
        if (!TextUtils.isEmpty(this.f22127f)) {
            TextView textView2 = this.mTitleTv;
            Intrinsics.e(textView2);
            textView2.setText(this.f22127f);
        }
        if (this.f22132p != 0) {
            TextView textView3 = this.f22124c;
            Intrinsics.e(textView3);
            textView3.setTextColor(this.f22132p);
        }
        if (this.t) {
            ImageView imageView2 = this.f22133v;
            Intrinsics.e(imageView2);
            imageView2.setVisibility(0);
        }
    }

    @Nullable
    public final ImageView getMRightIv() {
        return this.mRightIv;
    }

    @Nullable
    public final TextView getMTitleTv() {
        return this.mTitleTv;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    public final void setContent(@Nullable CharSequence content) {
        if (!this.f22131o || TextUtils.isEmpty(content)) {
            TextView textView = this.f22124c;
            Intrinsics.e(textView);
            textView.setText(content);
        } else {
            if ((TextUtils.isEmpty(this.f22129i) || TextUtils.isEmpty(content)) ? false : y.m(String.valueOf(content), String.valueOf(this.f22129i), false)) {
                TextView textView2 = this.f22124c;
                Intrinsics.e(textView2);
                textView2.setText(content);
            } else {
                TextView textView3 = this.f22124c;
                Intrinsics.e(textView3);
                textView3.setText(((Object) this.f22129i) + " " + ((Object) content));
            }
        }
        setVisibility(0);
    }

    public final void setMRightIv(@Nullable ImageView imageView) {
        this.mRightIv = imageView;
    }

    public final void setMTitleTv(@Nullable TextView textView) {
        this.mTitleTv = textView;
    }

    public final void setMessageGravity(int gravity) {
        this.f22134w = gravity;
    }
}
