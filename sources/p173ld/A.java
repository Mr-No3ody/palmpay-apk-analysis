package p173ld;

import L6.b;
import M1.j;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import kotlin.jvm.internal.Intrinsics;
import p159kd.e;
import p159kd.f;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39314a;

    public A(boolean z3) {
        super(f.sm_item_transfer_to_palmpay_home_favorite, null);
        this.f39314a = z3;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        Integer businessType;
        Integer businessType2;
        String accountNo;
        String strW;
        String ppAccountNo;
        String phone;
        RecipientBeanV2 item = (RecipientBeanV2) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        r0.h1((ImageView) holder.getView(e.iv_avatar), item.getHeadPortrait(), r.cv_avatar_default);
        holder.setText(e.tv_name, TextUtils.isEmpty(item.getFullName()) ? r0.D0(item.getPhone()) : item.getFullName()).setBackgroundResource(e.cl_root, holder.getAdapterPosition() == getData().size() + (-1) ? r.cv_rect_bg_white_corner_bl_br_12 : b.ppColorBackgroundLight);
        ImageView imageView = (ImageView) holder.getView(e.iv_tag);
        boolean z3 = this.f39314a;
        String relationshipPic = (!z3 || TextUtils.isEmpty(item.getRelationshipDarkPic())) ? item.getRelationshipPic() : item.getRelationshipDarkPic();
        String accountMark = (!z3 || TextUtils.isEmpty(item.getDarkAccountMark())) ? item.getAccountMark() : item.getDarkAccountMark();
        if (!TextUtils.isEmpty(relationshipPic)) {
            r0.l1(relationshipPic, imageView);
            h.C(imageView);
        } else if (TextUtils.isEmpty(accountMark)) {
            h.c(imageView);
            imageView.setImageDrawable(null);
        } else {
            r0.l1(accountMark, imageView);
            h.C(imageView);
        }
        TextView textView = (TextView) holder.getView(e.tv_account);
        Integer businessType3 = item.getBusinessType();
        String str = "";
        if ((businessType3 != null && businessType3.intValue() == 2) || (((businessType = item.getBusinessType()) != null && businessType.intValue() == 5) || ((businessType2 = item.getBusinessType()) != null && businessType2.intValue() == 4)) ? !(!TextUtils.isEmpty(item.getPpAccountNo()) ? (ppAccountNo = item.getPpAccountNo()) == null || (strW = r0.w(ppAccountNo)) == null : (phone = item.getPhone()) == null || (strW = r0.w(phone)) == null) : !((accountNo = item.getAccountNo()) == null || (strW = r0.w(accountNo)) == null)) {
            str = strW;
        }
        textView.setText(str);
    }
}
