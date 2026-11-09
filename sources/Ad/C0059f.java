package Ad;

import Pa.r0;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ad.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0059f extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f217a;

    public C0059f(boolean z3) {
        super(p159kd.f.sm_item_dialog_beneficiaries, null);
        this.f217a = z3;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        AddFromContactListResp item = (AddFromContactListResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder text = holder.setText(p159kd.e.tvRecipientName, item.getRecipientName());
        int i7 = p159kd.e.tvInfo;
        String recipientPhone = item.getRecipientPhone();
        text.setText(i7, recipientPhone != null ? r0.w(recipientPhone) : null).setGone(p159kd.e.tvPalmpayUser, this.f217a);
        r0.m1(item.getRecipientHeadImage(), (ImageView) holder.getView(p159kd.e.ivRecentlyBank));
        IconicsImageView iconicsImageView = (IconicsImageView) holder.getView(p159kd.e.iivCheck);
        IconicsDrawable iconicsDrawable = new IconicsDrawable(getContext(), item.getIsSelect() ? S6.a.pay_SelectedFill : S6.a.pay_CircleOutline);
        iconicsDrawable.a(new C0058e(0, item, this));
        iconicsImageView.setImageDrawable(iconicsDrawable);
    }
}
