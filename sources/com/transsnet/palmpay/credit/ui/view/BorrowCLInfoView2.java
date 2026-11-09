package com.transsnet.palmpay.credit.ui.view;

import Y.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p116hb.b;
import p116hb.c;
import p116hb.d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/view/BorrowCLInfoView2;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/RelativeLayout;", "parentBtnLayout", "", "setParentBtnLayout", "(Landroid/widget/RelativeLayout;)V", "Landroid/view/View;", "p", "Landroid/view/View;", "getAgreement", "()Landroid/view/View;", "setAgreement", "(Landroid/view/View;)V", "agreement", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BorrowCLInfoView2 extends BaseModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f30633A = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f30634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f30635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f30636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f30637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f30638g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f30640j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f30641o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public View agreement;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f30643v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RelativeLayout f30644w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BorrowCLInfoView2(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View viewInflate = View.inflate(context, d.cs_view_borrow_cl_info2, this);
        this.f30634c = (LinearLayout) viewInflate.findViewById(c.interest_layout);
        this.f30635d = (LinearLayout) viewInflate.findViewById(c.interest_sub_layout);
        this.f30636e = (LinearLayout) viewInflate.findViewById(c.fee_layout);
        this.f30637f = (LinearLayout) viewInflate.findViewById(c.stamp_duty_layout);
        this.f30638g = (LinearLayout) viewInflate.findViewById(c.agreement_layout);
        this.agreement = viewInflate.findViewById(c.ll_agreement);
        this.f30641o = (TextView) viewInflate.findViewById(c.service_fee_text);
        this.f30640j = (TextView) viewInflate.findViewById(c.interest_text);
        this.f30639i = (TextView) viewInflate.findViewById(c.interest_text_before);
        this.t = (TextView) viewInflate.findViewById(c.tv_stamp_duty_title);
        Intrinsics.e(context);
        Resources resources = context.getResources();
        int i7 = b.cs_cl_info_icon;
        ThreadLocal threadLocal = j.f11254a;
        Drawable drawable = resources.getDrawable(i7, null);
        if (drawable != null) {
            drawable.setBounds(0, 0, SizeUtils.dp2px(11.0f), SizeUtils.dp2px(11.0f));
        } else {
            drawable = null;
        }
        TextView textView = this.t;
        if (textView != null) {
            textView.setCompoundDrawables(null, null, drawable, null);
        }
        this.f30643v = (TextView) viewInflate.findViewById(c.stamp_duty_text);
        return viewInflate;
    }

    @Nullable
    public final View getAgreement() {
        return this.agreement;
    }

    public final void setAgreement(@Nullable View view) {
        this.agreement = view;
    }

    public final void setParentBtnLayout(@Nullable RelativeLayout parentBtnLayout) {
        this.f30644w = parentBtnLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BorrowCLInfoView2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BorrowCLInfoView2(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BorrowCLInfoView2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
