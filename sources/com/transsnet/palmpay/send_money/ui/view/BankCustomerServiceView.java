package com.transsnet.palmpay.send_money.ui.view;

import Ab.C;
import Ae.j;
import Ce.ViewOnClickListenerC0159a;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.f;
import p270rd.B;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/BankCustomerServiceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTv_customer_service_tips", "()Landroid/widget/TextView;", "tv_customer_service_tips", "OnBankCustomerServiceViewListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BankCustomerServiceView extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33829c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f33831b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/BankCustomerServiceView$OnBankCustomerServiceViewListener;", "", ViewProps.ON_CLICK, "", "v", "Landroid/view/View;", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnBankCustomerServiceViewListener {
        void onClick(@NotNull View v3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BankCustomerServiceView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getTv_customer_service_tips() {
        Object value = this.f33830a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void c(String str, String str2) {
        List listSplit$default;
        String str3;
        String str4;
        SpanUtils spanUtils = new SpanUtils();
        String str5 = "";
        if (TextUtils.isEmpty(str2)) {
            if (str == null) {
                str = "";
            }
            spanUtils.append(str);
        } else {
            if (str != null) {
                listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{str2 == null ? "" : str2}, false, 0, 6, null);
            } else {
                listSplit$default = null;
            }
            if (listSplit$default == null || (str3 = (String) listSplit$default.get(0)) == null) {
                str3 = "";
            }
            SpanUtils spanUtilsAppend = spanUtils.append(str3);
            if (str2 == null) {
                str2 = "";
            }
            spanUtilsAppend.append(str2).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext())).setFontFamily("sans-serif-medium");
            if ((listSplit$default != null ? listSplit$default.size() : 0) > 1) {
                if (listSplit$default != null && (str4 = (String) listSplit$default.get(1)) != null) {
                    str5 = str4;
                }
                SpanUtils spanUtilsAppend2 = spanUtils.append(str5).append(" ");
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                IconicsDrawable iconicsDrawable = new IconicsDrawable(context, S6.a.pay_Phone);
                iconicsDrawable.a(new C(this, 15));
                spanUtilsAppend2.appendImage(iconicsDrawable, 1);
            }
            setOnClickListener(new ViewOnClickListenerC0159a(this, 23));
        }
        getTv_customer_service_tips().setText(spanUtils.create());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BankCustomerServiceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BankCustomerServiceView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BankCustomerServiceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33830a = C2131j.b(new j(this, 18));
        View.inflate(context, f.sm_item_bank_phone_call, this);
    }
}
