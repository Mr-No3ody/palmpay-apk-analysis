package p173ld;

import Jd.c;
import L6.b;
import M1.k;
import Pa.r0;
import S6.a;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p051d9.C1605b;
import p159kd.e;
import p159kd.f;
import p159kd.h;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39345b;

    public y(boolean z3) {
        super(f.sm_select_bank_list_title_layout);
        this.f39345b = z3;
        a(-100, f.sm_item_transfer_to_palmpay_contact_all);
        addChildClickViewIds(e.iivMenu, e.iivFavorite);
    }

    @Override // M1.k
    public final void b(BaseViewHolder viewHolder, SectionEntity sectionEntity) {
        RecipientBeanV2 item = (RecipientBeanV2) sectionEntity;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(item, "item");
        viewHolder.setText(e.title_tv, item.getHeader());
    }

    public final int c(String letter) {
        Intrinsics.checkNotNullParameter(letter, "letter");
        if ("#".equals(letter)) {
            return 0;
        }
        List<Object> data = getData();
        int size = data.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (c.c(((RecipientBeanV2) data.get(i7)).getFullName()).equals(letter)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        Integer businessType;
        Integer businessType2;
        String accountNo;
        String strW;
        String fullName;
        Integer businessType3;
        String ppAccountNo;
        String phone;
        RecipientBeanV2 item = (RecipientBeanV2) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        Integer businessType4 = item.getBusinessType();
        String str = "";
        if ((businessType4 != null && businessType4.intValue() == 2) || (((businessType = item.getBusinessType()) != null && businessType.intValue() == 5) || ((businessType2 = item.getBusinessType()) != null && businessType2.intValue() == 4)) ? !(!TextUtils.isEmpty(item.getPpAccountNo()) ? (ppAccountNo = item.getPpAccountNo()) == null || (strW = r0.w(ppAccountNo)) == null : (phone = item.getPhone()) == null || (strW = r0.w(phone)) == null) : !((accountNo = item.getAccountNo()) == null || (strW = r0.w(accountNo)) == null)) {
            str = strW;
        }
        r0.h1((ImageView) holder.getView(e.iv_avatar), item.getHeadPortrait(), r.cv_avatar_default);
        int i7 = e.tv_name;
        if (TextUtils.isEmpty(item.getFullName())) {
            fullName = TextUtils.isEmpty(item.getMemberId()) ? getContext().getString(h.sm_not_registered) : str;
        } else {
            fullName = item.getFullName();
        }
        boolean z3 = true;
        BaseViewHolder backgroundResource = holder.setText(i7, fullName).setBackgroundResource(e.cl_root, holder.getAdapterPosition() == getData().size() - 1 ? r.cv_rect_bg_white_corner_bl_br_12 : b.ppColorBackgroundLight);
        int i10 = e.iivFavorite;
        Integer businessType5 = item.getBusinessType();
        if ((businessType5 != null && businessType5.intValue() == 2) || ((businessType3 = item.getBusinessType()) != null && businessType3.intValue() == 4)) {
            z3 = false;
        }
        BaseViewHolder gone = backgroundResource.setGone(i10, z3);
        int i11 = e.iivFavorite;
        IconicsDrawable iconicsDrawable = new IconicsDrawable(getContext(), Intrinsics.c(item.getFavorite(), Boolean.TRUE) ? a.pay_Like : a.pay_LikeOutline);
        iconicsDrawable.a(new C1605b(10, item, this));
        gone.setImageDrawable(i11, iconicsDrawable);
        ImageView imageView = (ImageView) holder.getView(e.iv_tag);
        boolean z8 = this.f39345b;
        String relationshipPic = (!z8 || TextUtils.isEmpty(item.getRelationshipDarkPic())) ? item.getRelationshipPic() : item.getRelationshipDarkPic();
        String accountMark = (!z8 || TextUtils.isEmpty(item.getDarkAccountMark())) ? item.getAccountMark() : item.getDarkAccountMark();
        if (!TextUtils.isEmpty(relationshipPic)) {
            r0.l1(relationshipPic, imageView);
            p220oa.h.C(imageView);
        } else if (TextUtils.isEmpty(accountMark)) {
            p220oa.h.c(imageView);
            imageView.setImageDrawable(null);
        } else {
            r0.l1(accountMark, imageView);
            p220oa.h.C(imageView);
        }
        ((TextView) holder.getView(e.tv_account)).setText(str);
    }
}
