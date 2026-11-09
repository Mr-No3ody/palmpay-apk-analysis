package Ha;

import Pa.r0;
import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.core.bean.payment.PaymentFeeDetail;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        PaymentFeeDetail.DetailBean item = (PaymentFeeDetail.DetailBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(p025ba.e.tvName, TextUtils.isEmpty(item.subTypeId) ? item.subTypeName : item.subTypeId);
        long j6 = item.fee;
        if (j6 <= 0) {
            j6 = item.vat;
        }
        holder.setText(p025ba.e.tvAmount, r0.B(j6, false));
        if (!TextUtils.isEmpty(item.remark)) {
            holder.setText(p025ba.e.tvDetail, item.remark);
            holder.setGone(p025ba.e.tvDetail, false);
            return;
        }
        PaymentFeeDetail.TransferServiceFee transferServiceFee = item.transferServiceFee;
        if (transferServiceFee == null) {
            holder.setGone(p025ba.e.tvDetail, true);
            return;
        }
        int i7 = p025ba.e.tvDetail;
        Intrinsics.checkNotNullExpressionValue(transferServiceFee, "transferServiceFee");
        StringBuilder sb2 = new StringBuilder();
        if (transferServiceFee.transferAmount > 0) {
            sb2.append("Transfer Amount: ");
            sb2.append(r0.B(transferServiceFee.transferAmount, false));
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        if (transferServiceFee.transferRatio > 0.0d) {
            sb2.append("Daily Service Rate: ");
            sb2.append(com.airbnb.lottie.model.layer.d.o(new Object[]{Double.valueOf(transferServiceFee.transferRatio * ((double) 100))}, 1, Locale.ENGLISH, "%.2f", "format(...)"));
            sb2.append("%\n");
        }
        if (transferServiceFee.transferBorrowDays > 0) {
            sb2.append("Borrow Days: ");
            sb2.append(transferServiceFee.transferBorrowDays + " Days");
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        if (!TextUtils.isEmpty(transferServiceFee.nextBillDate)) {
            sb2.append("Due Date: ");
            sb2.append(transferServiceFee.nextBillDate);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        long j10 = transferServiceFee.minAmount;
        if (j10 <= 0) {
            j10 = 500;
        }
        sb2.append("The minimum payment fee is ");
        sb2.append(r0.B(j10, false));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        holder.setText(i7, string);
        holder.setGone(p025ba.e.tvDetail, false);
    }
}
