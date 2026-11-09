package p155k9;

import L6.b;
import M1.j;
import N8.q0;
import Pa.r0;
import Pd.c;
import Pd.f;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import face.security.device.api.FaceSecCode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        String strJ;
        Integer timeValue;
        ScheduleTopUpTaskBean item = (ScheduleTopUpTaskBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getViewOrNull(c.ivOperatorIcon);
        if (imageView != null && !TextUtils.isEmpty(item.getBillerLogo())) {
            r0.h1(imageView, item.getBillerLogo(), r.cv_coupon_icon_gray);
        }
        if (TextUtils.isEmpty(item.getTagName())) {
            holder.setText(c.tvTagName, getContext().getString(f.qt_airtime_edit_tag));
            holder.setTextColor(c.tvTagName, CommonViewExtKt.colorInt(b.ppColorTextDisable, getContext()));
        } else {
            holder.setText(c.tvTagName, item.getTagName());
            holder.setTextColor(c.tvTagName, CommonViewExtKt.colorInt(b.ppColorTextPrimary, getContext()));
        }
        String strW0 = r0.w0(item.getPhone());
        if (strW0 != null) {
            holder.setText(c.tvNumber, CommonExtKt.formatWithPhone(strW0));
        }
        Integer timeType = item.getTimeType();
        if (timeType != null && timeType.intValue() == 1) {
            Integer timeValue2 = item.getTimeValue();
            if ((timeValue2 != null ? timeValue2.intValue() : 0) > 10000) {
                Integer timeValue3 = item.getTimeValue();
                timeValue = Integer.valueOf((timeValue3 != null ? timeValue3.intValue() : 0) - FaceSecCode.SC_SUCCESS);
            } else {
                timeValue = item.getTimeValue();
            }
            strJ = String.valueOf(timeValue != null ? CommonViewExtKt.toDayOfWeekByIndex(timeValue.intValue()) : null);
        } else {
            Integer timeValue4 = item.getTimeValue();
            strJ = q0.j(timeValue4 != null ? CommonViewExtKt.toDayOfMonthByIndex(timeValue4.intValue()) : null, " of Month");
        }
        holder.setText(c.tvDate, strJ);
        int i7 = c.tvPrice;
        Long rechargeAmount = item.getRechargeAmount();
        holder.setText(i7, r0.B(rechargeAmount != null ? rechargeAmount.longValue() : 0L, false));
    }
}
