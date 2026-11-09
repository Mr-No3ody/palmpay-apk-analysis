package Ad;

import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ad.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0060g extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f220a;

    public C0060g(boolean z3) {
        super(p159kd.f.sm_item_dialog_beneficiaries, null);
        this.f220a = z3;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        AddFromContactListResp item = (AddFromContactListResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(p159kd.e.tvRecipientName, item.getRecipientName());
        if (this.f220a) {
            r0.o1(item.getRecipientHeadImage(), (ImageView) holder.getView(p159kd.e.ivRecentlyBank));
            holder.setText(p159kd.e.tvInfo, r0.B0(item.getRecipientBankName(), item.getRecipientAccountNumber()));
        } else {
            r0.m1(item.getRecipientHeadImage(), (ImageView) holder.getView(p159kd.e.ivRecentlyBank));
            int i7 = p159kd.e.tvInfo;
            String recipientPhone = item.getRecipientPhone();
            holder.setText(i7, (recipientPhone != null ? r0.w(recipientPhone) : null) + (TextUtils.isEmpty(item.getRecipientPalmPayTag()) ? "" : C0.G.o("  ", item.getRecipientPalmPayTag())));
        }
        IconicsImageView iconicsImageView = (IconicsImageView) holder.getView(p159kd.e.iivCheck);
        IconicsDrawable iconicsDrawable = new IconicsDrawable(getContext(), item.getIsSelect() ? S6.a.pay_SelectedFill : S6.a.pay_CircleOutline);
        iconicsDrawable.a(new C0058e(1, item, this));
        iconicsImageView.setImageDrawable(iconicsDrawable);
    }
}
