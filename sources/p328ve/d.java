package p328ve;

import Ac.e;
import L6.b;
import M1.j;
import Pa.r0;
import S6.a;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.custom_view.p;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        String bankCardNoDesensitize;
        LinkBankCardResp.LinkBankCard item = (LinkBankCardResp.LinkBankCard) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder text = holder.setText(e.tv_bank_name, item.getBankName()).setText(e.tv_valid_thru, item.getExpiryMonth() + "/" + item.getExpiryYear());
        int i7 = e.tv_bank_card_no;
        if (item.isShow()) {
            bankCardNoDesensitize = Pattern.compile("(\\d{4})(?=\\d)").matcher(item.getCardNo()).replaceAll("$1 ");
        } else {
            bankCardNoDesensitize = item.getBankCardNoDesensitize();
        }
        text.setText(i7, bankCardNoDesensitize).setGone(e.tv_default, !item.isDefaultPaymentCard());
        r0.o1(item.getBankUrl(), (ImageView) holder.getView(e.iv_bank));
        r0.l1(item.getBgNewUrl(), (ImageView) holder.getView(e.iv_bg));
        BaseViewHolder visible = holder.setGone(e.iv_copy, !item.isShow()).setVisible(e.iv_setting, item.bankCardStatus == 1);
        int i10 = e.ivDelete;
        int i11 = item.bankCardStatus;
        visible.setVisible(i10, i11 == 2 || i11 == 3);
        IconicsImageView iconicsImageView = (IconicsImageView) holder.getView(e.iiv_show);
        IconicsDrawable iconicsDrawable = new IconicsDrawable(getContext(), item.isShow() ? a.pay_Show : a.pay_Hide);
        iconicsDrawable.a(new p323v9.d(2));
        iconicsImageView.setIcon(iconicsDrawable);
        int i12 = item.bankCardStatus;
        if (i12 == 2) {
            BaseViewHolder text2 = holder.setGone(e.g_status, false).setText(e.tv_status, k.core_failed);
            if (text2 != null) {
                text2.setTextColor(e.tv_status, getContext().getColor(b.ppColorError));
            }
            ((IconicsTextView) holder.getView(e.tv_status_tips)).setText(item.getBankCardStatusDesc() + " {pay_ArrowRight}");
            return;
        }
        if (i12 != 3) {
            if (i12 != 4) {
                holder.setGone(e.g_status, true);
                return;
            }
            BaseViewHolder text3 = holder.setGone(e.g_status, false).setText(e.tv_status, k.core_processing);
            if (text3 != null) {
                text3.setTextColor(e.tv_status, getContext().getColor(p.cv_color_ffaa0c));
            }
            ((IconicsTextView) holder.getView(e.tv_status_tips)).setText(item.getBankCardStatusDesc());
            return;
        }
        BaseViewHolder text4 = holder.setGone(e.g_status, false).setText(e.tv_status, k.core_expired);
        if (text4 != null) {
            text4.setTextColor(e.tv_status, getContext().getColor(b.ppColorError));
        }
        ((IconicsTextView) holder.getView(e.tv_status_tips)).setText(item.getBankCardStatusDesc() + " {pay_ArrowRight}");
    }
}
