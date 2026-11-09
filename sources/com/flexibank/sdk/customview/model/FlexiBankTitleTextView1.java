package com.flexibank.sdk.customview.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.t;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001#B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/flexibank/sdk/customview/model/FlexiBankTitleTextView1;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/flexibank/sdk/customview/model/FlexiBankTitleTextView1$Callback;", "callback", "", "setCallback", "(Lcom/flexibank/sdk/customview/model/FlexiBankTitleTextView1$Callback;)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getMTitleTv", "()Landroid/widget/TextView;", "setMTitleTv", "(Landroid/widget/TextView;)V", "mTitleTv", "b", "getMTextView", "setMTextView", "mTextView", "", "d", "Z", "getMZoomOuted", "()Z", "setMZoomOuted", "(Z)V", "mZoomOuted", "Callback", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankTitleTextView1 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public TextView mTitleTv;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public TextView mTextView;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f22270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean mZoomOuted;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Callback f22272e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/flexibank/sdk/customview/model/FlexiBankTitleTextView1$Callback;", "", "onTextTvClick", "", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback {
        void onTextTvClick();
    }

    @JvmOverloads
    public FlexiBankTitleTextView1(@Nullable Context context) {
        this(context, null, 6, 0);
    }

    @Nullable
    public final TextView getMTextView() {
        return this.mTextView;
    }

    @Nullable
    public final TextView getMTitleTv() {
        return this.mTitleTv;
    }

    public final boolean getMZoomOuted() {
        return this.mZoomOuted;
    }

    public final void setCallback(@Nullable Callback callback) {
        this.f22272e = callback;
    }

    public final void setMTextView(@Nullable TextView textView) {
        this.mTextView = textView;
    }

    public final void setMTitleTv(@Nullable TextView textView) {
        this.mTitleTv = textView;
    }

    public final void setMZoomOuted(boolean z3) {
        this.mZoomOuted = z3;
    }

    @JvmOverloads
    public FlexiBankTitleTextView1(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ FlexiBankTitleTextView1(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @JvmOverloads
    public FlexiBankTitleTextView1(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.fb_TitleEditView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f22270c = typedArrayObtainStyledAttributes.getText(t.fb_TitleEditView_fb_te_title);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, q.fb_title_textview1, this);
        this.mTitleTv = (TextView) findViewById(p.fb_tt_title_tv);
        this.mTextView = (TextView) findViewById(p.fb_tt_text);
        if (!TextUtils.isEmpty(this.f22270c)) {
            TextView textView = this.mTitleTv;
            Intrinsics.e(textView);
            textView.setText(this.f22270c);
        }
        TextView textView2 = this.mTextView;
        Intrinsics.e(textView2);
        textView2.setOnClickListener(new a(this));
        TextView textView3 = this.mTitleTv;
        Intrinsics.e(textView3);
        textView3.setPivotX(0.0f);
        TextView textView4 = this.mTitleTv;
        Intrinsics.e(textView4);
        textView4.setPivotY(0.0f);
    }
}
