package we;

import C0.G;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.bean.CompensateMsg;
import com.transsnet.palmpay.bean.MerchantMsg;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.BindBankCardMsg;
import com.transsnet.palmpay.core.bean.message.BusinessInfoBean;
import com.transsnet.palmpay.core.bean.message.MoneyOrderBean;
import com.transsnet.palmpay.core.bean.message.PointMessageBean;
import com.transsnet.palmpay.core.bean.message.QuickTellerMessageInfoBean;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.StringUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f43461p = g.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f43462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f43463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f43464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f43465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f43466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f43467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f43468g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f43469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f43470j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f43471o;

    public static SpannableStringBuilder a(long j6) {
        return new SpanUtils().append(BaseApplication.getCurrencySymbol() + " ").setFontSize(SizeUtils.sp2px(14.0f)).append(r0.A(j6)).setFontSize(SizeUtils.sp2px(32.0f)).create();
    }

    public static BindBankCardMsg b(String str) {
        try {
            C0525w.f().getClass();
            return (BindBankCardMsg) C0525w.d(str, BindBankCardMsg.class);
        } catch (Exception e10) {
            F6.d.c(f43461p, "getBindBankCardMsgBean: ", e10);
            return null;
        }
    }

    public static BusinessInfoBean c(String str) {
        try {
            C0525w.f().getClass();
            return (BusinessInfoBean) C0525w.d(str, BusinessInfoBean.class);
        } catch (Exception e10) {
            F6.d.c(f43461p, "getBusinessInfoBean: ", e10);
            return null;
        }
    }

    public static CompensateMsg d(String str) {
        try {
            C0525w.f().getClass();
            return (CompensateMsg) C0525w.d(str, CompensateMsg.class);
        } catch (Exception e10) {
            F6.d.c(f43461p, "getCompensateMsgBean: ", e10);
            return null;
        }
    }

    public static MerchantMsg f(String str) {
        try {
            C0525w.f().getClass();
            return (MerchantMsg) C0525w.d(str, MerchantMsg.class);
        } catch (Exception e10) {
            F6.d.c(f43461p, "getMerchantMsgBean: ", e10);
            return null;
        }
    }

    public static MoneyOrderBean g(String str) {
        try {
            C0525w.f().getClass();
            return (MoneyOrderBean) C0525w.d(str, MoneyOrderBean.class);
        } catch (Exception e10) {
            F6.d.c(f43461p, "getMoneyOrderBean: ", e10);
            return null;
        }
    }

    public static PointMessageBean i(String str) {
        try {
            C0525w.f().getClass();
            return (PointMessageBean) C0525w.d(str, PointMessageBean.class);
        } catch (Exception e10) {
            F6.d.c(f43461p, "getPointBean: ", e10);
            return null;
        }
    }

    public static String j(MoneyOrderBean moneyOrderBean) {
        if (!TextUtils.isEmpty(moneyOrderBean.recipientNickname)) {
            return moneyOrderBean.recipientNickname;
        }
        if (TextUtils.isEmpty(moneyOrderBean.recipientFirstName)) {
            return !TextUtils.isEmpty(moneyOrderBean.recipientPhone) ? r0.D0(moneyOrderBean.recipientPhone) : "";
        }
        return moneyOrderBean.recipientFirstName + " " + moneyOrderBean.recipientLastName;
    }

    public static String k(MoneyOrderBean moneyOrderBean) {
        if (TextUtils.isEmpty(moneyOrderBean.senderNickname)) {
            return !TextUtils.isEmpty(moneyOrderBean.senderPhone) ? r0.D0(moneyOrderBean.senderPhone) : "";
        }
        return moneyOrderBean.senderNickname;
    }

    public final SpannableStringBuilder e(long j6) {
        SpanUtils fontSize = new SpanUtils().append(BaseApplication.getCurrencySymbol() + " ").setFontSize(SizeUtils.sp2px(14.0f));
        Context context = this.f43470j;
        return fontSize.setForegroundColor(context.getResources().getColor(L6.b.ppColorTextDisable)).append(r0.A(j6)).setFontSize(SizeUtils.sp2px(32.0f)).setForegroundColor(context.getResources().getColor(L6.b.ppColorTextDisable)).create();
    }

    public final SpannableStringBuilder h(long j6) {
        SpanUtils spanUtilsI = G.i("P ");
        Context context = this.f43470j;
        return spanUtilsI.setForegroundColor(context.getResources().getColor(Ac.b.main_point_text_color_1)).setFontSize(SizeUtils.sp2px(14.0f)).append(String.valueOf(j6)).setForegroundColor(context.getResources().getColor(Ac.b.main_point_text_color_1)).setFontSize(SizeUtils.sp2px(32.0f)).create();
    }

    public final void l(String str) {
        BusinessInfoBean businessInfoBeanC = c(str);
        if (businessInfoBeanC == null) {
            return;
        }
        this.f43464c.setText(a(businessInfoBeanC.payAmount));
        if (!TextUtils.isEmpty(businessInfoBeanC.title)) {
            this.f43462a.setText(businessInfoBeanC.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, businessInfoBeanC.orderNo);
        this.f43467f.setText(r0.D0(businessInfoBeanC.phone));
    }

    public final void m(String str) {
        BusinessInfoBean businessInfoBeanC = c(str);
        if (businessInfoBeanC == null) {
            return;
        }
        this.f43464c.setText(a(businessInfoBeanC.amount));
        if (!TextUtils.isEmpty(businessInfoBeanC.title)) {
            this.f43462a.setText(businessInfoBeanC.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, businessInfoBeanC.orderNo);
        String strH = i0.h(StringUtils.null2Length0(businessInfoBeanC.bankName), businessInfoBeanC.payerNo);
        if (businessInfoBeanC.payerAccountType == 6) {
            strH = i0.g(StringUtils.null2Length0(businessInfoBeanC.bankName), businessInfoBeanC.payerNo);
        }
        if (TextUtils.isEmpty(strH)) {
            int i7 = businessInfoBeanC.payerAccountType;
            Context context = this.f43470j;
            if (i7 == 6) {
                strH = context.getResources().getString(Ac.h.main_bank_account);
            } else if (i7 == 8 || i7 == 13) {
                strH = context.getResources().getString(Ac.h.main_mobile_wallet);
            } else if (i7 == 5 || i7 == 12) {
                strH = context.getResources().getString(Ac.h.main_bank_card);
            }
        }
        this.f43467f.setText(strH);
    }

    public final void n(String str) {
        MoneyOrderBean moneyOrderBeanG = g(str);
        if (moneyOrderBeanG == null) {
            return;
        }
        this.f43464c.setText(a(moneyOrderBeanG.payAmount.longValue()));
        if (!TextUtils.isEmpty(moneyOrderBeanG.title)) {
            this.f43462a.setText(moneyOrderBeanG.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, moneyOrderBeanG.orderId);
        this.f43467f.setText(j(moneyOrderBeanG));
    }

    public final void o(String str) {
        MoneyOrderBean moneyOrderBeanG = g(str);
        if (moneyOrderBeanG == null) {
            return;
        }
        this.f43464c.setText(a(moneyOrderBeanG.payAmount.longValue()));
        if (!TextUtils.isEmpty(moneyOrderBeanG.title)) {
            this.f43462a.setText(moneyOrderBeanG.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, moneyOrderBeanG.orderId);
        this.f43467f.setText(i0.g(StringUtils.null2Length0(moneyOrderBeanG.recipientBankName), moneyOrderBeanG.recipientBankAccount));
    }

    public final void p(String str) {
        BusinessInfoBean businessInfoBeanC = c(str);
        if (businessInfoBeanC == null) {
            return;
        }
        this.f43464c.setText(a(businessInfoBeanC.payAmount));
        if (!TextUtils.isEmpty(businessInfoBeanC.title)) {
            this.f43462a.setText(businessInfoBeanC.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, businessInfoBeanC.orderNo);
        String strH = i0.h(StringUtils.null2Length0(businessInfoBeanC.bankName), businessInfoBeanC.collectNo);
        if (businessInfoBeanC.payeeAccountType == 6) {
            strH = i0.g(StringUtils.null2Length0(businessInfoBeanC.bankName), businessInfoBeanC.collectNo);
        }
        if (TextUtils.isEmpty(strH)) {
            int i7 = businessInfoBeanC.payeeAccountType;
            Context context = this.f43470j;
            if (i7 == 6) {
                strH = context.getResources().getString(Ac.h.main_bank_account);
            } else if (i7 == 8 || i7 == 13) {
                strH = context.getResources().getString(Ac.h.main_mobile_wallet);
            } else if (i7 == 5 || i7 == 12) {
                strH = context.getResources().getString(Ac.h.main_bank_card);
            }
        }
        this.f43467f.setText(strH);
    }

    public final void q(String str) {
        MoneyOrderBean moneyOrderBeanG = g(str);
        if (moneyOrderBeanG == null) {
            return;
        }
        this.f43464c.setText(a(moneyOrderBeanG.recipientAmount));
        if (!TextUtils.isEmpty(moneyOrderBeanG.title)) {
            this.f43462a.setText(moneyOrderBeanG.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, moneyOrderBeanG.orderId);
        this.f43467f.setText(k(moneyOrderBeanG));
    }

    public final void r(String str) {
        MoneyOrderBean moneyOrderBeanG = g(str);
        if (moneyOrderBeanG == null) {
            return;
        }
        this.f43464c.setText(a(moneyOrderBeanG.payAmount.longValue()));
        if (!TextUtils.isEmpty(moneyOrderBeanG.title)) {
            this.f43462a.setText(moneyOrderBeanG.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, moneyOrderBeanG.orderId);
        this.f43467f.setText(j(moneyOrderBeanG));
    }

    public final void s(String str) {
        MoneyOrderBean moneyOrderBeanG = g(str);
        if (moneyOrderBeanG == null) {
            return;
        }
        this.f43464c.setText(a(moneyOrderBeanG.payAmount.longValue()));
        if (!TextUtils.isEmpty(moneyOrderBeanG.title)) {
            this.f43462a.setText(moneyOrderBeanG.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, moneyOrderBeanG.orderId);
        this.f43467f.setText(j(moneyOrderBeanG));
    }

    public final void t(String str) {
        MoneyOrderBean moneyOrderBeanG = g(str);
        if (moneyOrderBeanG == null) {
            return;
        }
        this.f43464c.setText(a(moneyOrderBeanG.payAmount.longValue()));
        if (!TextUtils.isEmpty(moneyOrderBeanG.title)) {
            this.f43462a.setText(moneyOrderBeanG.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, moneyOrderBeanG.orderId);
        this.f43467f.setText(j(moneyOrderBeanG));
    }

    public final void u(String str) {
        MoneyOrderBean moneyOrderBeanG = g(str);
        if (moneyOrderBeanG == null) {
            return;
        }
        this.f43464c.setText(a(moneyOrderBeanG.payAmount.longValue()));
        if (!TextUtils.isEmpty(moneyOrderBeanG.title)) {
            this.f43462a.setText(moneyOrderBeanG.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, moneyOrderBeanG.orderId);
        this.f43467f.setText(j(moneyOrderBeanG));
    }

    public final void v(String str) {
        MoneyOrderBean moneyOrderBeanG = g(str);
        if (moneyOrderBeanG == null) {
            return;
        }
        this.f43464c.setText(a(moneyOrderBeanG.amount.longValue()));
        if (!TextUtils.isEmpty(moneyOrderBeanG.title)) {
            this.f43462a.setText(moneyOrderBeanG.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, moneyOrderBeanG.orderId);
        this.f43467f.setText(k(moneyOrderBeanG));
    }

    public final void w(boolean z3) {
        Context context = this.f43470j;
        TextView textView = this.f43464c;
        if (z3) {
            textView.setText(Ac.h.main_approved);
            textView.setTextColor(context.getResources().getColor(L6.b.ppColorPrimary));
        } else {
            textView.setText(Ac.h.main_rejected);
            textView.setTextColor(context.getResources().getColor(L6.b.ppColorTextPrimary));
        }
        this.f43467f.setText(BaseApplication.getInstance().getUser().getFullName());
    }

    public final void x(String str, boolean z3) {
        QuickTellerMessageInfoBean quickTellerMessageInfoBean;
        try {
            C0525w.f().getClass();
            quickTellerMessageInfoBean = (QuickTellerMessageInfoBean) C0525w.d(str, QuickTellerMessageInfoBean.class);
        } catch (Exception e10) {
            F6.d.c(f43461p, "getQuickTellerMessageInfoBean: ", e10);
            quickTellerMessageInfoBean = null;
        }
        if (quickTellerMessageInfoBean == null) {
            return;
        }
        TextView textView = this.f43464c;
        if (z3) {
            textView.setText(a(quickTellerMessageInfoBean.payAmount));
        } else {
            textView.setText(e(quickTellerMessageInfoBean.amount));
        }
        if (!TextUtils.isEmpty(quickTellerMessageInfoBean.title)) {
            this.f43462a.setText(quickTellerMessageInfoBean.title);
        }
        this.f43469i.setTag(Ac.e.main_tag_order_number, quickTellerMessageInfoBean.orderNo);
        String str2 = quickTellerMessageInfoBean.billerName;
        TextView textView2 = this.f43467f;
        textView2.setText(str2);
        if (z3) {
            return;
        }
        textView2.setTextColor(this.f43470j.getResources().getColor(L6.b.ppColorTextNormal));
    }
}
