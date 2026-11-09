package P8;

import M1.j;
import Pa.r0;
import Pd.c;
import Ya.e;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.model.layer.d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierFeeDetailBean;
import com.flexibank.sdk.cashier.bean.FlexiBankTransferServiceFee;
import com.flexibank.sdk.p;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.bean.CommonKeyValueItem;
import com.transsnet.palmpay.core.bean.bill.TransHistoryItemBean;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.HomeCouponRewardsItems;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponBean;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p159kd.f;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, List list, int i10) {
        super(i7, list);
        this.f7000a = i10;
    }

    public static String a(FlexiBankTransferServiceFee flexiBankTransferServiceFee) {
        StringBuilder sb2 = new StringBuilder();
        Long transferAmount = flexiBankTransferServiceFee.getTransferAmount();
        if ((transferAmount != null ? transferAmount.longValue() : 0L) > 0) {
            sb2.append("Transfer Amount: ");
            Long transferAmount2 = flexiBankTransferServiceFee.getTransferAmount();
            sb2.append(p118hf.a.t(transferAmount2 != null ? transferAmount2.longValue() : 0L, false));
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        Double transferRatio = flexiBankTransferServiceFee.getTransferRatio();
        if ((transferRatio != null ? transferRatio.doubleValue() : 0.0d) > 0.0d) {
            sb2.append("Daily Service Rate: ");
            Locale locale = Locale.ENGLISH;
            Double transferRatio2 = flexiBankTransferServiceFee.getTransferRatio();
            sb2.append(d.o(new Object[]{Double.valueOf((transferRatio2 != null ? transferRatio2.doubleValue() : 0.0d) * ((double) 100))}, 1, locale, "%.2f", "format(...)"));
            sb2.append("%\n");
        }
        Long transferBorrowDays = flexiBankTransferServiceFee.getTransferBorrowDays();
        if ((transferBorrowDays != null ? transferBorrowDays.longValue() : 0L) > 0) {
            sb2.append("Borrow Days: ");
            sb2.append(flexiBankTransferServiceFee.getTransferBorrowDays() + " Days");
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        if (!TextUtils.isEmpty(flexiBankTransferServiceFee.getNextBillDate())) {
            sb2.append("Due Date: ");
            sb2.append(flexiBankTransferServiceFee.getNextBillDate());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        Long minAmount = flexiBankTransferServiceFee.getMinAmount();
        Long minAmount2 = (minAmount != null ? minAmount.longValue() : 0L) > 0 ? flexiBankTransferServiceFee.getMinAmount() : 500L;
        sb2.append("The minimum payment fee is ");
        sb2.append(p118hf.a.t(minAmount2 != null ? minAmount2.longValue() : 0L, false));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BaseViewHolder gone;
        int iColorInt;
        switch (this.f7000a) {
            case 0:
                CommonKeyValueItem item = (CommonKeyValueItem) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item, "item");
                int i7 = F8.d.tvKey;
                CharSequence charSequence = item.key;
                if (charSequence == null) {
                    charSequence = "";
                }
                holder.setText(i7, charSequence);
                int i10 = F8.d.tvValue;
                CharSequence charSequence2 = item.value;
                holder.setText(i10, charSequence2 != null ? charSequence2 : "");
                ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int dp = holder.getBindingAdapterPosition() == 0 ? 0 : CommonViewExtKt.getDp(16);
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dp, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
                holder.itemView.setLayoutParams(marginLayoutParams);
                break;
            case 1:
                FlexiBankCashierFeeDetailBean item2 = (FlexiBankCashierFeeDetailBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item2, "item");
                holder.setText(p.fb_tvName, TextUtils.isEmpty(item2.getSubTypeId()) ? item2.getSubTypeName() : item2.getSubTypeId());
                Long fee = item2.getFee();
                Long fee2 = (fee != null ? fee.longValue() : 0L) > 0 ? item2.getFee() : item2.getVat();
                holder.setText(p.fb_tvAmount, p118hf.a.t(fee2 != null ? fee2.longValue() : 0L, false));
                if (!TextUtils.isEmpty(item2.getRemark())) {
                    holder.setText(p.fb_tvDetail, item2.getRemark());
                    holder.setGone(p.fb_tvDetail, false);
                } else {
                    FlexiBankTransferServiceFee transferServiceFee = item2.getTransferServiceFee();
                    if (transferServiceFee != null) {
                        if (TextUtils.isEmpty(a(transferServiceFee))) {
                            gone = holder.setGone(p.fb_tvDetail, true);
                        } else {
                            holder.setText(p.fb_tvDetail, a(transferServiceFee));
                            gone = holder.setGone(p.fb_tvDetail, false);
                        }
                        if (gone != null) {
                        }
                    }
                    holder.setGone(p.fb_tvDetail, true);
                }
                break;
            case 2:
                Ud.a item3 = (Ud.a) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item3, "item");
                holder.setText(c.tvText, item3.f9752c);
                break;
            case 3:
                BillerCouponItemBean item4 = (BillerCouponItemBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item4, "item");
                holder.setText(c.tvCouponName, item4.getCouponName());
                holder.setText(c.couponLimitTv, item4.getCouponSubhead());
                SpanUtils fontSize = new SpanUtils().append("₦").setFontSize(CommonViewExtKt.getDp(16));
                Long nominaValue = item4.getNominaValue();
                String strA = r0.A(nominaValue != null ? nominaValue.longValue() : 0L);
                Intrinsics.checkNotNullExpressionValue(strA, "getAmountString(...)");
                holder.setText(c.tvCouponAmount, fontSize.append(y.k(strA, ".00", "")).setFontSize(CommonViewExtKt.getDp(24)).create());
                if (!TextUtils.isEmpty(item4.getCouponIcon())) {
                    r0.h1((ImageView) holder.getView(c.ivCouponIcon), item4.getCouponIcon(), r.cv_coupon_icon);
                } else {
                    holder.setImageResource(c.ivCouponIcon, r.cv_coupon_icon);
                }
                break;
            case 4:
                OcRouterDetail ocRouterDetail = (OcRouterDetail) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                if (ocRouterDetail != null) {
                    r0.l1(ocRouterDetail.getIconUrlV2(), (ImageView) holder.getView(e.ivVerifyImg));
                    holder.setText(e.tvVerifyTitle, ocRouterDetail.getRouteName());
                }
                break;
            case 5:
                long jLongValue = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(holder, "holder");
                holder.setText(p159kd.e.tvAmount, r0.E(jLongValue));
                break;
            case 6:
                TransHistoryItemBean item5 = (TransHistoryItemBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item5, "item");
                String str = item5.orderStatus;
                if ("Pending".equalsIgnoreCase(str)) {
                    str = "Processing";
                }
                String str2 = str == null ? "" : str;
                if ("Waiting to receive".equalsIgnoreCase(str2) || "Waiting to pay".equalsIgnoreCase(str2) || "Pending".equalsIgnoreCase(str2) || "Processing".equalsIgnoreCase(str2)) {
                    iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorWarning, getContext());
                } else if ("Successful".equalsIgnoreCase(str2)) {
                    iColorInt = -1;
                } else if ("Failed".equalsIgnoreCase(str2) || "Declined".equalsIgnoreCase(str2)) {
                    iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorError, getContext());
                } else if ("Cancelled".equalsIgnoreCase(str2) || "Expired".equalsIgnoreCase(str2) || "Closed".equalsIgnoreCase(str2)) {
                    iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, getContext());
                } else {
                    iColorInt = "Refunded".equalsIgnoreCase(str2) ? CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext()) : CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext());
                }
                if (iColorInt != -1) {
                    holder.setText(Ac.e.tvTransactionStatus, str).setTextColor(Ac.e.tvTransactionStatus, iColorInt).setGone(Ac.e.tvTransactionStatus, false);
                } else {
                    holder.setGone(Ac.e.tvTransactionStatus, true);
                }
                holder.setText(Ac.e.tvTransactionName, item5.title);
                int i11 = Ac.e.tvTransactionTime;
                Long l5 = item5.updateTime;
                holder.setText(i11, r0.O(l5 != null ? l5.longValue() : 0L));
                int i12 = Ac.e.tvTransactionAmount;
                Long l6 = item5.amount;
                holder.setText(i12, r0.A(l6 != null ? l6.longValue() : 0L));
                break;
            case 7:
                WelcomeCouponBean item6 = (WelcomeCouponBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item6, "item");
                String str3 = item6.title;
                if (str3 != null) {
                    holder.setText(Ac.e.tv1, y.k(str3, "\\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE));
                }
                String str4 = item6.description;
                if (str4 != null) {
                    holder.setText(Ac.e.tv2, y.k(str4, "\\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE));
                }
                holder.setText(Ac.e.tvName, item6.reward);
                break;
            default:
                HomeCouponRewardsItems item7 = (HomeCouponRewardsItems) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item7, "item");
                TextView textView = (TextView) holder.getView(Ac.e.tvAmount);
                String strB = r0.B(item7.nominalValue, true);
                Intrinsics.e(strB);
                if (y.g(strB, ".00", false)) {
                    strB = strB.substring(0, strB.length() - 3);
                    Intrinsics.checkNotNullExpressionValue(strB, "substring(...)");
                }
                textView.setText(strB);
                ImageView imageView = (ImageView) holder.getView(Ac.e.ivBg);
                if (imageView != null) {
                    imageView.setImageResource(Ac.d.main_bg_palmzone_coupon);
                }
                holder.setText(Ac.e.tvTitle, item7.couponName);
                PpButton ppButton = (PpButton) holder.getView(Ac.e.btnClaim);
                h.s(ppButton, TextUtils.isEmpty(item7.status) || Intrinsics.c(item7.claimType, "combo"));
                View view = holder.getView(Ac.e.btnUse);
                if (Intrinsics.c(item7.claimType, "combo")) {
                    h.s(view, false);
                } else {
                    h.s(view, true ^ TextUtils.isEmpty(item7.status));
                }
                int iColorInt2 = CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, getContext());
                if (TextUtils.isEmpty(item7.status) || Intrinsics.c(item7.claimType, "combo")) {
                    if (Intrinsics.c(item7.claimType, "combo")) {
                        holder.setText(Ac.e.tvMessage, Ac.h.main_rewards_coupons_combo);
                    } else {
                        holder.setText(Ac.e.tvMessage, item7.couponSubhead);
                    }
                    holder.setTextColor(Ac.e.tvMessage, iColorInt2);
                } else {
                    holder.setText(Ac.e.tvMessage, item7.couponSubhead);
                    holder.setTextColor(Ac.e.tvMessage, iColorInt2);
                }
                ppButton.b(item7.isLoading);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i7) {
        super(F8.e.ac_item_guardian_auth_key_value, null);
        this.f7000a = i7;
        switch (i7) {
            case 5:
                super(f.sm_item_amount_option, null);
                break;
            case 6:
                super(Ac.f.main_item_minor_transaction, null);
                break;
            case 7:
                super(Ac.f.main_item_welcome_back_rewards, null);
                break;
            default:
                break;
        }
    }
}
