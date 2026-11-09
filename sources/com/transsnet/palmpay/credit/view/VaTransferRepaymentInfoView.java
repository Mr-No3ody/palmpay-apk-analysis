package com.transsnet.palmpay.credit.view;

import Bc.C0104a;
import Ce.ViewOnClickListenerC0159a;
import Fb.i;
import Fb.j;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.CLPhoneInstallmentMainData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.VirtualAccountData;
import com.transsnet.palmpay.credit.bean.style.StyleConfigConstant;
import com.transsnet.palmpay.credit.bean.style.VaTransferRepaymentStyleConfig;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/view/VaTransferRepaymentInfoView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "styleKeyFromCard", "", "setViewStyleConfig", "(Ljava/lang/String;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVaTransferRepaymentInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VaTransferRepaymentInfoView.kt\ncom/transsnet/palmpay/credit/view/VaTransferRepaymentInfoView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
public final class VaTransferRepaymentInfoView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0104a f30887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CLPhoneInstallmentMainData f30888b;

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
    public VaTransferRepaymentInfoView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000d  */
    private final void setViewStyleConfig(String styleKeyFromCard) {
        if (styleKeyFromCard == null) {
            styleKeyFromCard = StyleConfigConstant.CONFIG_VA_TRANSFER_REPAYMENT;
        } else {
            if (StringsKt.F(styleKeyFromCard)) {
                styleKeyFromCard = null;
            }
            if (styleKeyFromCard == null) {
                styleKeyFromCard = StyleConfigConstant.CONFIG_VA_TRANSFER_REPAYMENT;
            }
        }
        VaTransferRepaymentStyleConfig vaTransferRepaymentStyleConfig = (VaTransferRepaymentStyleConfig) l.l(styleKeyFromCard, "getVaTransferRepaymentStyleConfig", VaTransferRepaymentStyleConfig.class);
        if (vaTransferRepaymentStyleConfig != null) {
            j.a(this, vaTransferRepaymentStyleConfig.vaTransferCardBg);
            C0104a c0104a = this.f30887a;
            j.c(c0104a != null ? (TextView) c0104a.f651c : null, vaTransferRepaymentStyleConfig.vaTransferTitle);
            j.c(c0104a != null ? (TextView) c0104a.f657j : null, vaTransferRepaymentStyleConfig.vaTransferGuideText);
            j.a(c0104a != null ? (ImageView) c0104a.f653e : null, vaTransferRepaymentStyleConfig.vaTransferGuideArrowIcon);
            j.c(c0104a != null ? (TextView) c0104a.f650b : null, vaTransferRepaymentStyleConfig.vaTransferDesc);
            j.c(c0104a != null ? (TextView) c0104a.f654f : null, vaTransferRepaymentStyleConfig.vaTransferAccountNumberLabel);
            j.c(c0104a != null ? c0104a.t : null, vaTransferRepaymentStyleConfig.vaTransferAccountNo);
            j.a(c0104a != null ? (ImageView) c0104a.f652d : null, vaTransferRepaymentStyleConfig.vaTransferAccountCopyIcon);
            j.c(c0104a != null ? c0104a.f659p : null, vaTransferRepaymentStyleConfig.vaTransferAccountNameLabel);
            j.c(c0104a != null ? (TextView) c0104a.f658o : null, vaTransferRepaymentStyleConfig.vaTransferAccountName);
            j.c(c0104a != null ? (TextView) c0104a.f656i : null, vaTransferRepaymentStyleConfig.vaTransferBankNameLabel);
            j.c(c0104a != null ? (TextView) c0104a.f655g : null, vaTransferRepaymentStyleConfig.vaTransferBankName);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0023  */
    /* JADX WARN: Code duplicated, block: B:25:0x003a  */
    public final void a(CLPhoneInstallmentMainData cLPhoneInstallmentMainData) {
        VirtualAccountData virtualAccountData;
        C0104a c0104a;
        String string;
        this.f30888b = cLPhoneInstallmentMainData;
        if (cLPhoneInstallmentMainData == null || (virtualAccountData = cLPhoneInstallmentMainData.getVirtualAccountData()) == null || (c0104a = this.f30887a) == null) {
            return;
        }
        String itemStyle = virtualAccountData.getItemStyle();
        if (itemStyle == null) {
            itemStyle = cLPhoneInstallmentMainData.getItemStyle();
        } else {
            if (StringsKt.F(itemStyle)) {
                itemStyle = null;
            }
            if (itemStyle == null) {
                itemStyle = cLPhoneInstallmentMainData.getItemStyle();
            }
        }
        setViewStyleConfig(itemStyle);
        String title = virtualAccountData.getTitle();
        if (title == null) {
            string = getContext().getString(g.cs_va_transfer_repayment_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = StringsKt.F(title) ? null : title;
            if (string == null) {
                string = getContext().getString(g.cs_va_transfer_repayment_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
        }
        ((TextView) c0104a.f651c).setText(string);
        r0.q1((ImageView) c0104a.f653e, virtualAccountData.getImage(), virtualAccountData.getImageDark());
        String icon = virtualAccountData.getIcon();
        String iconDark = virtualAccountData.getIconDark();
        ImageView imageView = (ImageView) c0104a.f652d;
        r0.q1(imageView, icon, iconDark);
        c0104a.t.setText(i.b(virtualAccountData.getVirtualAccountNo()));
        String accountName = virtualAccountData.getAccountName();
        String string2 = "-";
        ((TextView) c0104a.f658o).setText((accountName == null || StringsKt.F(accountName)) ? "-" : StringsKt.V(accountName).toString());
        String bankName = virtualAccountData.getBankName();
        if (bankName != null && !StringsKt.F(bankName)) {
            string2 = StringsKt.V(bankName).toString();
        }
        ((TextView) c0104a.f655g).setText(string2);
        i.a(imageView, virtualAccountData.getVirtualAccountNo());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VaTransferRepaymentInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        View viewInflate = View.inflate(context, f.cs_cl_phone_va_transfer_repayment_layout, this);
        int i7 = e.ivVaAccountCopy;
        ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
        if (imageView != null) {
            i7 = e.ivVaGuideArrow;
            ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView2 != null) {
                i7 = e.llVaGuide;
                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                if (linearLayout != null) {
                    i7 = e.tvVaAccountName;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = e.tvVaAccountNameLabel;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = e.tvVaAccountNo;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView3 != null) {
                                i7 = e.tvVaAccountNumberLabel;
                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView4 != null) {
                                    i7 = e.tvVaBankName;
                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView5 != null) {
                                        i7 = e.tvVaBankNameLabel;
                                        TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView6 != null) {
                                            i7 = e.tvVaGuide;
                                            TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView7 != null) {
                                                i7 = e.tvVaTransferDesc;
                                                TextView textView8 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView8 != null) {
                                                    i7 = e.tvVaTransferTitle;
                                                    TextView textView9 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView9 != null) {
                                                        this.f30887a = new C0104a(viewInflate, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                        setPadding(CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(12));
                                                        linearLayout.setOnClickListener(new ViewOnClickListenerC0159a(this, 22));
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }
}
