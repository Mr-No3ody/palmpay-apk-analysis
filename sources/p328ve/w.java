package p328ve;

import C0.G;
import Ea.a;
import G1.d;
import M1.b;
import M1.j;
import Pa.r0;
import S1.c;
import S1.e;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.i;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.MerchantLogo;
import com.transsnet.palmpay.core.bean.bill.TransHistoryItemBean;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends b implements LoadMoreModule {
    public static int b(TransHistoryItemBean transHistoryItemBean) {
        String str = transHistoryItemBean.transType;
        if (str == null) {
            str = "";
        }
        Integer num = transHistoryItemBean.businessType;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = transHistoryItemBean.payerAccountType;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Long l5 = transHistoryItemBean.amount;
        return a.b(l5 != null ? l5.longValue() : 0L, str, iIntValue, iIntValue2);
    }

    @Override // com.chad.library.adapter.base.module.LoadMoreModule
    public final c addLoadMoreModule(j jVar) {
        return e.a(this, jVar);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        int iColorInt;
        Integer num;
        TransHistoryItemBean item = (TransHistoryItemBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemViewType = holder.getItemViewType();
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                return;
            }
            Calendar calendar = Calendar.getInstance();
            Long l5 = item.updateTime;
            calendar.setTimeInMillis(l5 != null ? l5.longValue() : 0L);
            int i7 = calendar.get(2);
            int i10 = i7 + 1;
            int i11 = calendar.get(1);
            if (i10 > 0) {
                if (r0.N0(System.currentTimeMillis()) == i11) {
                    holder.setText(Ac.e.tvMonth, r0.i0(i7));
                } else {
                    holder.setText(Ac.e.tvMonth, r0.i0(i7) + " " + i11);
                }
            }
            Long l6 = item.inComeAmount;
            Long l8 = item.payOutAmount;
            holder.setText(Ac.e.moneyInTextViewSummary, G.i("In  ").setForegroundColor(getContext().getColor(Ac.b.main_color_858a8f)).append(r0.B(l6 != null ? l6.longValue() : 0L, false)).create()).setText(Ac.e.moneyOutTextViewSummary, G.i("Out  ").setForegroundColor(getContext().getColor(Ac.b.main_color_858a8f)).append(r0.B(Math.abs(l8 != null ? l8.longValue() : 0L), false)).create());
            return;
        }
        ImageView imageView = (ImageView) holder.getView(Ac.e.imageViewAvatar);
        if (!TextUtils.isEmpty(item.iconUrl)) {
            r0.u1(imageView, item.iconUrl, b(item));
        } else if ((TransType.TRANS_TYPE_BULK_DISBURSEMENT.equals(item.transType) || TransType.TRANS_TYPE_AIRTIME_DISBURSEMENT.equals(item.transType)) && !TextUtils.isEmpty(item.merchantNo)) {
            com.bumptech.glide.b.f(imageView).load(new MerchantLogo(item.merchantNo)).a(((d) ((d) new d().I(new i(), true)).j(r.cv_default_merchat)).x(r.cv_default_merchat)).S(imageView);
        } else {
            String str = item.transType;
            if (str == null) {
                str = "";
            }
            Uri uriC = a.c(str, item.businessType, item.payerAccountType, item.amount);
            int iB = b(item);
            r0.g1(imageView, uriC, (d) d.O(iB).j(iB));
        }
        BaseViewHolder text = holder.setText(Ac.e.tvAmount, TextUtils.isEmpty(item.displayAmount) ? "" : item.displayAmount).setText(Ac.e.tvTitle, item.title);
        int i12 = Ac.e.tvDate;
        Long l10 = item.updateTime;
        text.setText(i12, r0.O(l10 != null ? l10.longValue() : 0L)).setGone(Ac.e.tvBooked, ("04".equals(item.transType) && (num = item.businessType) != null && num.intValue() == 12) ? false : true);
        String str2 = item.orderStatus;
        if ("Pending".equalsIgnoreCase(str2)) {
            str2 = "Processing";
        }
        String str3 = str2 != null ? str2 : "";
        if ("Waiting to receive".equalsIgnoreCase(str3) || "Waiting to pay".equalsIgnoreCase(str3) || "Pending".equalsIgnoreCase(str3) || "Processing".equalsIgnoreCase(str3)) {
            iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorWarning, getContext());
        } else if ("Successful".equalsIgnoreCase(str3)) {
            iColorInt = -1;
        } else if ("Failed".equalsIgnoreCase(str3) || "Declined".equalsIgnoreCase(str3)) {
            iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorError, getContext());
        } else if ("Cancelled".equalsIgnoreCase(str3) || "Expired".equalsIgnoreCase(str3) || "Closed".equalsIgnoreCase(str3)) {
            iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, getContext());
        } else {
            iColorInt = "Refunded".equalsIgnoreCase(str3) ? CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext()) : CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext());
        }
        if (iColorInt != -1) {
            holder.setText(Ac.e.tvState, str2).setTextColor(Ac.e.tvState, iColorInt).setGone(Ac.e.tvState, false);
        } else {
            holder.setGone(Ac.e.tvState, true);
        }
    }
}
