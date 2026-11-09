package com.transsnet.palmpay.core.viewmodel;

import Oc.j;
import Pa.r0;
import R8.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p025ba.k;
import p025ba.m;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ReportTransactionItem;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "clickListener", "", "setClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/transsnet/palmpay/core/bean/OrderInfoForCustomerService;", FirebaseAnalytics.Param.CONTENT, "setEmailData", "(Lcom/transsnet/palmpay/core/bean/OrderInfoForCustomerService;)V", "Landroid/widget/ImageView;", "a", "Lkotlin/Lazy;", "getReport_right_img", "()Landroid/widget/ImageView;", "report_right_img", "Landroid/widget/TextView;", "b", "getReport_content_tv", "()Landroid/widget/TextView;", "report_content_tv", "c", "getReport_left_img", "report_left_img", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReportTransactionItem extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f28567g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f28569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View.OnClickListener f28573f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportTransactionItem(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getReport_content_tv() {
        Object value = this.f28569b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final ImageView getReport_left_img() {
        Object value = this.f28570c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ImageView getReport_right_img() {
        Object value = this.f28568a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final void a(String title, OrderInfoForCustomerService content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f28571d = title;
        this.f28572e = "Order type: " + content.paymentType + "\nTransaction ID: " + content.orderNumber + "\nTransaction date: " + r0.R(content.time) + "\nTransaction status: " + content.orderStatus + "\nAmount: " + r0.B(content.amount, false) + "\nFEE: " + r0.B(content.fee, false) + "\nTax: " + r0.B(content.vat, false) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
    }

    public final void setClickListener(@NotNull View.OnClickListener clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f28573f = clickListener;
    }

    public final void setEmailData(@NotNull OrderInfoForCustomerService content) {
        Intrinsics.checkNotNullParameter(content, "content");
        String string = BaseApplication.getContext().getString(k.core_email_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a(string, content);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportTransactionItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportTransactionItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28568a = C2131j.b(new Function0(this) { // from class: Ua.B0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportTransactionItem f9305b;

            {
                this.f9305b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReportTransactionItem reportTransactionItem = this.f9305b;
                switch (i10) {
                    case 0:
                        int i11 = ReportTransactionItem.f28567g;
                        return (ImageView) reportTransactionItem.findViewById(p025ba.e.report_right_img);
                    case 1:
                        int i12 = ReportTransactionItem.f28567g;
                        return (TextView) reportTransactionItem.findViewById(p025ba.e.report_content_tv);
                    default:
                        int i13 = ReportTransactionItem.f28567g;
                        return (ImageView) reportTransactionItem.findViewById(p025ba.e.report_left_img);
                }
            }
        });
        final int i11 = 1;
        this.f28569b = C2131j.b(new Function0(this) { // from class: Ua.B0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportTransactionItem f9305b;

            {
                this.f9305b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReportTransactionItem reportTransactionItem = this.f9305b;
                switch (i11) {
                    case 0:
                        int i12 = ReportTransactionItem.f28567g;
                        return (ImageView) reportTransactionItem.findViewById(p025ba.e.report_right_img);
                    case 1:
                        int i13 = ReportTransactionItem.f28567g;
                        return (TextView) reportTransactionItem.findViewById(p025ba.e.report_content_tv);
                    default:
                        int i14 = ReportTransactionItem.f28567g;
                        return (ImageView) reportTransactionItem.findViewById(p025ba.e.report_left_img);
                }
            }
        });
        final int i12 = 2;
        this.f28570c = C2131j.b(new Function0(this) { // from class: Ua.B0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportTransactionItem f9305b;

            {
                this.f9305b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReportTransactionItem reportTransactionItem = this.f9305b;
                switch (i12) {
                    case 0:
                        int i13 = ReportTransactionItem.f28567g;
                        return (ImageView) reportTransactionItem.findViewById(p025ba.e.report_right_img);
                    case 1:
                        int i14 = ReportTransactionItem.f28567g;
                        return (TextView) reportTransactionItem.findViewById(p025ba.e.report_content_tv);
                    default:
                        int i15 = ReportTransactionItem.f28567g;
                        return (ImageView) reportTransactionItem.findViewById(p025ba.e.report_left_img);
                }
            }
        });
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.CoreReportTransactionItem);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = typedArrayObtainStyledAttributes.getString(m.CoreReportTransactionItem_android_text);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(m.CoreReportTransactionItem_core_report_left_icon);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(m.CoreReportTransactionItem_core_report_right_icon);
            typedArrayObtainStyledAttributes.recycle();
            LayoutInflater.from(context).inflate(g.core_report_transaction, (ViewGroup) this, true);
            if (string != null) {
                getReport_content_tv().setText(string);
            }
            if (drawable != null) {
                getReport_left_img().setImageDrawable(drawable);
            }
            if (drawable2 != null) {
                getReport_right_img().setImageDrawable(drawable2);
            }
        }
        this.f28573f = new j(13, this, context);
        setOnClickListener(new d(this, 23));
    }
}
