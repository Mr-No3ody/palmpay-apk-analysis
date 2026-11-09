package com.transsnet.palmpay.credit.ui.view;

import Pa.n0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView2;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView2;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enable", "", "setBorrowEnable", "(Z)V", "Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView2$OneTouchBorrowListener2;", "g", "Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView2$OneTouchBorrowListener2;", "getOneTouchBorrowListener", "()Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView2$OneTouchBorrowListener2;", "setOneTouchBorrowListener", "(Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView2$OneTouchBorrowListener2;)V", "oneTouchBorrowListener", "OneTouchBorrowListener2", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OneTouchBorrowView2 extends BaseModel {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f30653i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PpButton f30654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f30655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BorrowCLInfoView2 f30656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public OneTouchBorrowListener2 oneTouchBorrowListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView2$OneTouchBorrowListener2;", "", "clickBorrow", "", "clickAgreement", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OneTouchBorrowListener2 {
        void clickAgreement();

        void clickBorrow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneTouchBorrowView2(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.OneTouchBorrowView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f30657f = typedArrayObtainStyledAttributes.getBoolean(g.OneTouchBorrowView_otb_agreement_show, true);
        a(context);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View agreement;
        View agreement2;
        View viewInflate = View.inflate(context, d.cs_one_touch_borrow_view2, this);
        this.f30654c = viewInflate != null ? (PpButton) viewInflate.findViewById(c.borrow_tv) : null;
        this.f30655d = viewInflate != null ? (RelativeLayout) viewInflate.findViewById(c.btn_layout) : null;
        BorrowCLInfoView2 borrowCLInfoView2 = viewInflate != null ? (BorrowCLInfoView2) viewInflate.findViewById(c.borrow_cl_info_view) : null;
        this.f30656e = borrowCLInfoView2;
        if (borrowCLInfoView2 != null && (agreement2 = borrowCLInfoView2.getAgreement()) != null) {
            h.s(agreement2, this.f30657f);
        }
        PpButton ppButton = this.f30654c;
        if (ppButton != null) {
            final int i7 = 0;
            h.l(new View.OnClickListener(this) { // from class: Cb.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OneTouchBorrowView2 f1352b;

                {
                    this.f1352b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneTouchBorrowView2 oneTouchBorrowView2 = this.f1352b;
                    switch (i7) {
                        case 0:
                            int i10 = OneTouchBorrowView2.f30653i;
                            n0.g().l("PalmpayCashLoanHomeElementClick_BorrowAll");
                            OneTouchBorrowView2.OneTouchBorrowListener2 oneTouchBorrowListener2 = oneTouchBorrowView2.oneTouchBorrowListener;
                            if (oneTouchBorrowListener2 != null) {
                                oneTouchBorrowListener2.clickBorrow();
                            }
                            break;
                        default:
                            OneTouchBorrowView2.OneTouchBorrowListener2 oneTouchBorrowListener3 = oneTouchBorrowView2.oneTouchBorrowListener;
                            if (oneTouchBorrowListener3 != null) {
                                oneTouchBorrowListener3.clickAgreement();
                            }
                            break;
                    }
                }
            }, ppButton);
        }
        BorrowCLInfoView2 borrowCLInfoView3 = this.f30656e;
        if (borrowCLInfoView3 != null && (agreement = borrowCLInfoView3.getAgreement()) != null) {
            final int i10 = 1;
            h.l(new View.OnClickListener(this) { // from class: Cb.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OneTouchBorrowView2 f1352b;

                {
                    this.f1352b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneTouchBorrowView2 oneTouchBorrowView2 = this.f1352b;
                    switch (i10) {
                        case 0:
                            int i11 = OneTouchBorrowView2.f30653i;
                            n0.g().l("PalmpayCashLoanHomeElementClick_BorrowAll");
                            OneTouchBorrowView2.OneTouchBorrowListener2 oneTouchBorrowListener2 = oneTouchBorrowView2.oneTouchBorrowListener;
                            if (oneTouchBorrowListener2 != null) {
                                oneTouchBorrowListener2.clickBorrow();
                            }
                            break;
                        default:
                            OneTouchBorrowView2.OneTouchBorrowListener2 oneTouchBorrowListener3 = oneTouchBorrowView2.oneTouchBorrowListener;
                            if (oneTouchBorrowListener3 != null) {
                                oneTouchBorrowListener3.clickAgreement();
                            }
                            break;
                    }
                }
            }, agreement);
        }
        BorrowCLInfoView2 borrowCLInfoView4 = this.f30656e;
        if (borrowCLInfoView4 != null) {
            borrowCLInfoView4.setParentBtnLayout(this.f30655d);
        }
        Intrinsics.e(viewInflate);
        return viewInflate;
    }

    @Nullable
    public final OneTouchBorrowListener2 getOneTouchBorrowListener() {
        return this.oneTouchBorrowListener;
    }

    public final void setBorrowEnable(boolean enable) {
        PpButton ppButton = this.f30654c;
        if (ppButton != null) {
            ppButton.setEnabled(enable);
        }
    }

    public final void setOneTouchBorrowListener(@Nullable OneTouchBorrowListener2 oneTouchBorrowListener2) {
        this.oneTouchBorrowListener = oneTouchBorrowListener2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneTouchBorrowView2(@NotNull Context context, @androidx.annotation.Nullable @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneTouchBorrowView2(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneTouchBorrowView2(@NotNull Context context, @androidx.annotation.Nullable @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30657f = true;
    }
}
