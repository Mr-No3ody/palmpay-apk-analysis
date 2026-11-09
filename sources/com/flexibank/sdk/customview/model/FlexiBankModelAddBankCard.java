package com.flexibank.sdk.customview.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/flexibank/sdk/customview/model/FlexiBankModelAddBankCard;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "mContext", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "", "setTitle", "(Ljava/lang/String;)V", "resId", "(I)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getMTitleTv", "()Landroid/widget/TextView;", "setMTitleTv", "(Landroid/widget/TextView;)V", "mTitleTv", "b", "getMHintTv", "setMHintTv", "mHintTv", "Landroid/widget/RelativeLayout;", "c", "Landroid/widget/RelativeLayout;", "getMRoot", "()Landroid/widget/RelativeLayout;", "setMRoot", "(Landroid/widget/RelativeLayout;)V", "mRoot", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankModelAddBankCard extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public TextView mTitleTv;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public TextView mHintTv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public RelativeLayout mRoot;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelAddBankCard(@NotNull Context mContext) {
        this(mContext, null, 6, 0);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    @Nullable
    public final TextView getMHintTv() {
        return this.mHintTv;
    }

    @Nullable
    public final RelativeLayout getMRoot() {
        return this.mRoot;
    }

    @Nullable
    public final TextView getMTitleTv() {
        return this.mTitleTv;
    }

    public final void setMHintTv(@Nullable TextView textView) {
        this.mHintTv = textView;
    }

    public final void setMRoot(@Nullable RelativeLayout relativeLayout) {
        this.mRoot = relativeLayout;
    }

    public final void setMTitleTv(@Nullable TextView textView) {
        this.mTitleTv = textView;
    }

    public final void setTitle(@Nullable String title) {
        TextView textView = this.mTitleTv;
        Intrinsics.e(textView);
        textView.setText(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelAddBankCard(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        this(mContext, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public final void setTitle(int resId) {
        TextView textView = this.mTitleTv;
        Intrinsics.e(textView);
        textView.setText(resId);
    }

    public /* synthetic */ FlexiBankModelAddBankCard(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelAddBankCard(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i7) {
        super(mContext, attributeSet, i7);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        View.inflate(mContext, q.fb_model_add_bank_card, this);
        this.mTitleTv = (TextView) findViewById(p.fb_mabc_title_text_tv);
        this.mHintTv = (TextView) findViewById(p.fb_mabc_hint_text_tv);
        this.mRoot = (RelativeLayout) findViewById(p.fb_mabc_root);
    }
}
