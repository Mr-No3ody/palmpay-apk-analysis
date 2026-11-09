package com.flexibank.sdk.customview.model;

import android.content.Context;
import android.content.res.TypedArray;
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
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p185ma.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010+\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R$\u0010/\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R$\u00103\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016¨\u00064"}, d2 = {"Lcom/flexibank/sdk/customview/model/FlexiBankModelPageTitleArea;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "mContext", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getMTitleTv", "()Landroid/widget/TextView;", "setMTitleTv", "(Landroid/widget/TextView;)V", "mTitleTv", "Landroid/widget/RelativeLayout;", "c", "Landroid/widget/RelativeLayout;", "getMRoot", "()Landroid/widget/RelativeLayout;", "setMRoot", "(Landroid/widget/RelativeLayout;)V", "mRoot", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getMBackIv", "()Landroid/widget/ImageView;", "setMBackIv", "(Landroid/widget/ImageView;)V", "mBackIv", "e", "getMRightIv", "setMRightIv", "mRightIv", "f", "getMContentTv", "setMContentTv", "mContentTv", "g", "getMRightTopTv", "setMRightTopTv", "mRightTopTv", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FlexiBankModelPageTitleArea extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public TextView mTitleTv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public RelativeLayout mRoot;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ImageView mBackIv;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ImageView mRightIv;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public TextView mContentTv;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public TextView mRightTopTv;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f22259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f22260j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f22261o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPageTitleArea(@NotNull Context mContext) {
        this(mContext, null, 6, 0);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public void a(Context context) {
        View.inflate(context, q.fb_model_page_title_area, this);
        this.mTitleTv = (TextView) findViewById(p.fb_cmpta_title);
        this.mRoot = (RelativeLayout) findViewById(p.fb_cmpta_root);
        this.mBackIv = (ImageView) findViewById(p.fb_cmpta_back_iv);
        this.mContentTv = (TextView) findViewById(p.fb_cmpta_content);
        this.mRightTopTv = (TextView) findViewById(p.fb_cmpta_right_top_text);
        if (!TextUtils.isEmpty(this.f22259i)) {
            TextView textView = this.mTitleTv;
            Intrinsics.e(textView);
            textView.setText(this.f22259i);
        }
        if (!TextUtils.isEmpty(this.f22260j)) {
            TextView textView2 = this.mContentTv;
            Intrinsics.e(textView2);
            textView2.setText(this.f22260j);
        }
        if (this.f22261o != 0) {
            ImageView imageView = this.mBackIv;
            Intrinsics.e(imageView);
            imageView.setImageResource(this.f22261o);
        }
        e eVar = new e(this, 7);
        ImageView imageView2 = this.mBackIv;
        Intrinsics.e(imageView2);
        imageView2.setOnClickListener(eVar);
    }

    @Nullable
    public final ImageView getMBackIv() {
        return this.mBackIv;
    }

    @Nullable
    public final TextView getMContentTv() {
        return this.mContentTv;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    public final ImageView getMRightIv() {
        return this.mRightIv;
    }

    @Nullable
    public final TextView getMRightTopTv() {
        return this.mRightTopTv;
    }

    @Nullable
    public final RelativeLayout getMRoot() {
        return this.mRoot;
    }

    @Nullable
    public final TextView getMTitleTv() {
        return this.mTitleTv;
    }

    public final void setMBackIv(@Nullable ImageView imageView) {
        this.mBackIv = imageView;
    }

    public final void setMContentTv(@Nullable TextView textView) {
        this.mContentTv = textView;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMRightIv(@Nullable ImageView imageView) {
        this.mRightIv = imageView;
    }

    public final void setMRightTopTv(@Nullable TextView textView) {
        this.mRightTopTv = textView;
    }

    public final void setMRoot(@Nullable RelativeLayout relativeLayout) {
        this.mRoot = relativeLayout;
    }

    public final void setMTitleTv(@Nullable TextView textView) {
        this.mTitleTv = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPageTitleArea(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        this(mContext, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public /* synthetic */ FlexiBankModelPageTitleArea(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPageTitleArea(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i7) {
        super(mContext, attributeSet, i7);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.fb_title_area, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f22259i = typedArrayObtainStyledAttributes.getText(t.fb_title_area_fb_cta_title);
        this.f22260j = typedArrayObtainStyledAttributes.getText(t.fb_title_area_fb_cta_content_text);
        this.f22261o = typedArrayObtainStyledAttributes.getResourceId(t.fb_title_area_fb_cta_back_iv, 0);
        typedArrayObtainStyledAttributes.recycle();
        a(this.mContext);
    }
}
