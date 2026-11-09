package p173ld;

import C0.G;
import L6.b;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.send_money.bean.ScheduleTransferPaymentBean;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import p159kd.e;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        ScheduleTransferPaymentBean item = (ScheduleTransferPaymentBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getView(e.iv_icon);
        r0.l1(item.getBalanceEnough() ? item.getPaymentIcon() : item.getPaymentAshIcon(), imageView);
        TextView textView = (TextView) holder.getView(e.tv_payment_name_balance);
        SpanUtils spanUtils = new SpanUtils();
        String paymentTypeDesc = item.getPaymentTypeDesc();
        if (paymentTypeDesc == null) {
            paymentTypeDesc = "";
        }
        textView.setText(spanUtils.append(paymentTypeDesc).append("(" + r0.B(item.getBalance(), false) + ")" + (TextUtils.isEmpty(item.getBalanceDesc()) ? "" : G.o(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, item.getBalanceDesc()))).setFontFamily("sans-serif").setForegroundColor(getContext().getColor(b.ppColorTextNormal)).create());
        float f10 = item.getBalanceEnough() ? 1.0f : 0.6f;
        imageView.setAlpha(f10);
        textView.setAlpha(f10);
        holder.setGone(e.tv_fund, item.getBalanceEnough()).setGone(e.iv_check, !item.getDefaultOption());
    }
}
