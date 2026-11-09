package com.transsnet.palmpay.credit.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p116hb.c;
import p116hb.d;
import p116hb.g;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0012B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView$OneTouchBorrowListener;", "g", "Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView$OneTouchBorrowListener;", "getOneTouchBorrowListener", "()Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView$OneTouchBorrowListener;", "setOneTouchBorrowListener", "(Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView$OneTouchBorrowListener;)V", "oneTouchBorrowListener", "OneTouchBorrowListener", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OneTouchBorrowView extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f30648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PpButton f30649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BorrowCLInfoView f30650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public OneTouchBorrowListener oneTouchBorrowListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView$OneTouchBorrowListener;", "", "clickBorrow", "", "clickAgreement", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OneTouchBorrowListener {
        void clickAgreement();

        void clickBorrow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneTouchBorrowView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.OneTouchBorrowView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f30651f = typedArrayObtainStyledAttributes.getBoolean(g.OneTouchBorrowView_otb_agreement_show, true);
        a(context);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        TextPaint paint;
        View viewInflate = View.inflate(context, d.cs_one_touch_borrow_view, this);
        this.f30648c = viewInflate != null ? (TextView) viewInflate.findViewById(c.agreement_tv) : null;
        this.f30649d = viewInflate != null ? (PpButton) viewInflate.findViewById(c.borrow_tv) : null;
        this.f30650e = viewInflate != null ? (BorrowCLInfoView) viewInflate.findViewById(c.borrow_cl_info_view) : null;
        TextView textView = this.f30648c;
        if (textView != null) {
            h.s(textView, this.f30651f);
        }
        TextView textView2 = this.f30648c;
        if (textView2 != null) {
            textView2.setPaintFlags(8);
        }
        TextView textView3 = this.f30648c;
        if (textView3 != null && (paint = textView3.getPaint()) != null) {
            paint.setAntiAlias(true);
        }
        PpButton ppButton = this.f30649d;
        if (ppButton != null) {
            final int i7 = 0;
            h.l(new View.OnClickListener(this) { // from class: Cb.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OneTouchBorrowView f1350b;

                {
                    this.f1350b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            OneTouchBorrowView.OneTouchBorrowListener oneTouchBorrowListener = this.f1350b.oneTouchBorrowListener;
                            if (oneTouchBorrowListener != null) {
                                oneTouchBorrowListener.clickBorrow();
                            }
                            break;
                        default:
                            OneTouchBorrowView.OneTouchBorrowListener oneTouchBorrowListener2 = this.f1350b.oneTouchBorrowListener;
                            if (oneTouchBorrowListener2 != null) {
                                oneTouchBorrowListener2.clickAgreement();
                            }
                            break;
                    }
                }
            }, ppButton);
        }
        TextView textView4 = this.f30648c;
        if (textView4 != null) {
            final int i10 = 1;
            h.l(new View.OnClickListener(this) { // from class: Cb.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OneTouchBorrowView f1350b;

                {
                    this.f1350b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            OneTouchBorrowView.OneTouchBorrowListener oneTouchBorrowListener = this.f1350b.oneTouchBorrowListener;
                            if (oneTouchBorrowListener != null) {
                                oneTouchBorrowListener.clickBorrow();
                            }
                            break;
                        default:
                            OneTouchBorrowView.OneTouchBorrowListener oneTouchBorrowListener2 = this.f1350b.oneTouchBorrowListener;
                            if (oneTouchBorrowListener2 != null) {
                                oneTouchBorrowListener2.clickAgreement();
                            }
                            break;
                    }
                }
            }, textView4);
        }
        Intrinsics.e(viewInflate);
        return viewInflate;
    }

    @Nullable
    public final OneTouchBorrowListener getOneTouchBorrowListener() {
        return this.oneTouchBorrowListener;
    }

    public final void setOneTouchBorrowListener(@Nullable OneTouchBorrowListener oneTouchBorrowListener) {
        this.oneTouchBorrowListener = oneTouchBorrowListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneTouchBorrowView(@NotNull Context context, @androidx.annotation.Nullable @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneTouchBorrowView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneTouchBorrowView(@NotNull Context context, @androidx.annotation.Nullable @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30651f = true;
    }
}
