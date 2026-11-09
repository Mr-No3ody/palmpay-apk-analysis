package Ha;

import Pa.r0;
import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.core.bean.cashier.CashierFeeDetailBean;
import com.transsnet.palmpay.core.bean.cashier.TransferServiceFee;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends M1.j {
    public static String a(TransferServiceFee transferServiceFee) {
        StringBuilder sb2 = new StringBuilder();
        Long transferAmount = transferServiceFee.getTransferAmount();
        if ((transferAmount != null ? transferAmount.longValue() : 0L) > 0) {
            sb2.append("Transfer Amount: ");
            Long transferAmount2 = transferServiceFee.getTransferAmount();
            sb2.append(r0.B(transferAmount2 != null ? transferAmount2.longValue() : 0L, false));
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        Double transferRatio = transferServiceFee.getTransferRatio();
        if ((transferRatio != null ? transferRatio.doubleValue() : 0.0d) > 0.0d) {
            sb2.append("Daily Service Rate: ");
            Locale locale = Locale.ENGLISH;
            Double transferRatio2 = transferServiceFee.getTransferRatio();
            sb2.append(com.airbnb.lottie.model.layer.d.o(new Object[]{Double.valueOf((transferRatio2 != null ? transferRatio2.doubleValue() : 0.0d) * ((double) 100))}, 1, locale, "%.2f", "format(...)"));
            sb2.append("%\n");
        }
        Long transferBorrowDays = transferServiceFee.getTransferBorrowDays();
        if ((transferBorrowDays != null ? transferBorrowDays.longValue() : 0L) > 0) {
            sb2.append("Borrow Days: ");
            sb2.append(transferServiceFee.getTransferBorrowDays() + " Days");
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        if (!TextUtils.isEmpty(transferServiceFee.getNextBillDate())) {
            sb2.append("Due Date: ");
            sb2.append(transferServiceFee.getNextBillDate());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        Long minAmount = transferServiceFee.getMinAmount();
        Long minAmount2 = (minAmount != null ? minAmount.longValue() : 0L) > 0 ? transferServiceFee.getMinAmount() : 500L;
        sb2.append("The minimum payment fee is ");
        sb2.append(r0.B(minAmount2 != null ? minAmount2.longValue() : 0L, false));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BaseViewHolder gone;
        CashierFeeDetailBean item = (CashierFeeDetailBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(p025ba.e.tvName, TextUtils.isEmpty(item.getSubTypeId()) ? item.getSubTypeName() : item.getSubTypeId());
        Long fee = item.getFee();
        Long fee2 = (fee != null ? fee.longValue() : 0L) > 0 ? item.getFee() : item.getVat();
        holder.setText(p025ba.e.tvAmount, r0.B(fee2 != null ? fee2.longValue() : 0L, false));
        if (!TextUtils.isEmpty(item.getRemark())) {
            holder.setText(p025ba.e.tvDetail, item.getRemark());
            holder.setGone(p025ba.e.tvDetail, false);
            return;
        }
        TransferServiceFee transferServiceFee = item.getTransferServiceFee();
        if (transferServiceFee != null) {
            if (TextUtils.isEmpty(a(transferServiceFee))) {
                gone = holder.setGone(p025ba.e.tvDetail, true);
            } else {
                holder.setText(p025ba.e.tvDetail, a(transferServiceFee));
                gone = holder.setGone(p025ba.e.tvDetail, false);
            }
            if (gone != null) {
                return;
            }
        }
        holder.setGone(p025ba.e.tvDetail, true);
    }
}
