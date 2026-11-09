package com.transsnet.palmpay.jara_packet.ui.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236pc.d;
import p236pc.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010!\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\"\u0010%\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\"\u0010)\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\"\u0010-\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010\u0014\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\u0017\u00102\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/model/ReferEarnTaskProgressModel;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ProgressBar;", "c", "Landroid/widget/ProgressBar;", "getMProgress", "()Landroid/widget/ProgressBar;", "setMProgress", "(Landroid/widget/ProgressBar;)V", "mProgress", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getMIvLevel1", "()Landroid/widget/TextView;", "setMIvLevel1", "(Landroid/widget/TextView;)V", "mIvLevel1", "e", "getMIvLevel2", "setMIvLevel2", "mIvLevel2", "f", "getMIvLevel3", "setMIvLevel3", "mIvLevel3", "g", "getMTvLevel1", "setMTvLevel1", "mTvLevel1", "i", "getMTvLevel2", "setMTvLevel2", "mTvLevel2", "j", "getMTvLevel3", "setMTvLevel3", "mTvLevel3", "o", "I", "getOffSet", "()I", "offSet", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnTaskProgressModel extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ProgressBar mProgress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public TextView mIvLevel1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public TextView mIvLevel2;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public TextView mIvLevel3;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public TextView mTvLevel1;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public TextView mTvLevel2;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public TextView mTvLevel3;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int offSet;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReferEarnTaskProgressModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View viewInflate = View.inflate(context, e.jp_layout_re_progress, this);
        setMProgress((ProgressBar) viewInflate.findViewById(d.seekBarProgress));
        setMIvLevel1((TextView) viewInflate.findViewById(d.ivCashLevel1));
        setMIvLevel2((TextView) viewInflate.findViewById(d.ivCashLevel2));
        setMIvLevel3((TextView) viewInflate.findViewById(d.ivCashLevel3));
        setMTvLevel1((TextView) viewInflate.findViewById(d.tvCashLevel1));
        setMTvLevel2((TextView) viewInflate.findViewById(d.tvCashLevel2));
        setMTvLevel3((TextView) viewInflate.findViewById(d.tvCashLevel3));
        return viewInflate;
    }

    @NotNull
    public final TextView getMIvLevel1() {
        TextView textView = this.mIvLevel1;
        if (textView != null) {
            return textView;
        }
        Intrinsics.n("mIvLevel1");
        throw null;
    }

    @NotNull
    public final TextView getMIvLevel2() {
        TextView textView = this.mIvLevel2;
        if (textView != null) {
            return textView;
        }
        Intrinsics.n("mIvLevel2");
        throw null;
    }

    @NotNull
    public final TextView getMIvLevel3() {
        TextView textView = this.mIvLevel3;
        if (textView != null) {
            return textView;
        }
        Intrinsics.n("mIvLevel3");
        throw null;
    }

    @NotNull
    public final ProgressBar getMProgress() {
        ProgressBar progressBar = this.mProgress;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.n("mProgress");
        throw null;
    }

    @NotNull
    public final TextView getMTvLevel1() {
        TextView textView = this.mTvLevel1;
        if (textView != null) {
            return textView;
        }
        Intrinsics.n("mTvLevel1");
        throw null;
    }

    @NotNull
    public final TextView getMTvLevel2() {
        TextView textView = this.mTvLevel2;
        if (textView != null) {
            return textView;
        }
        Intrinsics.n("mTvLevel2");
        throw null;
    }

    @NotNull
    public final TextView getMTvLevel3() {
        TextView textView = this.mTvLevel3;
        if (textView != null) {
            return textView;
        }
        Intrinsics.n("mTvLevel3");
        throw null;
    }

    public final int getOffSet() {
        return this.offSet;
    }

    public final void setMIvLevel1(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mIvLevel1 = textView;
    }

    public final void setMIvLevel2(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mIvLevel2 = textView;
    }

    public final void setMIvLevel3(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mIvLevel3 = textView;
    }

    public final void setMProgress(@NotNull ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.mProgress = progressBar;
    }

    public final void setMTvLevel1(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTvLevel1 = textView;
    }

    public final void setMTvLevel2(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTvLevel2 = textView;
    }

    public final void setMTvLevel3(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTvLevel3 = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReferEarnTaskProgressModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ReferEarnTaskProgressModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReferEarnTaskProgressModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.offSet = SizeUtils.dp2px(24.0f);
    }
}
