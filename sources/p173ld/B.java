package p173ld;

import F6.d;
import L6.b;
import M1.j;
import N8.q0;
import Pa.i0;
import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.InviteBean;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.util.TransferTrackingUtils;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.HtmlTextView;
import p054dd.n;
import p159kd.e;
import p159kd.f;
import p159kd.h;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39315a;

    public B(boolean z3) {
        super(f.sm_item_transfer_to_palmpay_home_recently, null);
        this.f39315a = z3;
        addChildClickViewIds(e.btnSetup);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:101:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:132:0x021c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0221  */
    /* JADX WARN: Code duplicated, block: B:135:0x0227  */
    /* JADX WARN: Code duplicated, block: B:136:0x0229  */
    /* JADX WARN: Code duplicated, block: B:139:0x022d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0241  */
    /* JADX WARN: Code duplicated, block: B:145:0x024f  */
    /* JADX WARN: Code duplicated, block: B:146:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x025c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0261  */
    /* JADX WARN: Code duplicated, block: B:151:0x0266  */
    /* JADX WARN: Code duplicated, block: B:153:0x026b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0270  */
    /* JADX WARN: Code duplicated, block: B:158:0x027b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x015a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0160  */
    /* JADX WARN: Code duplicated, block: B:96:0x019e A[PHI: r7
      0x019e: PHI (r7v3 android.view.View) = (r7v2 android.view.View), (r7v8 android.view.View) binds: [B:89:0x0188, B:94:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bd A[DONT_INVERT] */
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        String fullName;
        Integer businessType;
        Integer businessType2;
        String accountNo;
        String strW;
        InviteBean invite;
        String toInviteTip;
        HtmlTextView htmlTextView;
        View viewFindViewById;
        View viewFindViewById2;
        Integer businessType3;
        String accountNo2;
        String str;
        String strY;
        String str2;
        String ppAccountNo;
        String phone;
        RecipientBeanV2 item = (RecipientBeanV2) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        r0.h1((ImageView) holder.getView(e.iv_avatar), item.getHeadPortrait(), r.cv_avatar_default);
        int i7 = e.tv_name;
        if (TextUtils.isEmpty(item.getFullName())) {
            fullName = TextUtils.isEmpty(item.getMemberId()) ? getContext().getString(h.sm_not_registered) : r0.D0(item.getPhone());
        } else {
            fullName = item.getFullName();
        }
        holder.setText(i7, fullName).setBackgroundResource(e.cl_root, (hasFooterLayout() || holder.getBindingAdapterPosition() - getHeaderLayoutCount() != C1850q.g(getData())) ? b.ppColorBackgroundLight : r.cv_rect_bg_white_corner_bl_br_12);
        ImageView imageView = (ImageView) holder.getView(e.iv_tag);
        boolean zV = i0.V(imageView);
        String relationshipPic = (!zV || TextUtils.isEmpty(item.getRelationshipDarkPic())) ? item.getRelationshipPic() : item.getRelationshipDarkPic();
        String accountMark = (!zV || TextUtils.isEmpty(item.getDarkAccountMark())) ? item.getAccountMark() : item.getDarkAccountMark();
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
        TextView textView = (TextView) holder.getView(e.tv_account);
        Integer businessType4 = item.getBusinessType();
        if ((businessType4 != null && businessType4.intValue() == 2) || (((businessType = item.getBusinessType()) != null && businessType.intValue() == 5) || ((businessType2 = item.getBusinessType()) != null && businessType2.intValue() == 4)) ? !TextUtils.isEmpty(item.getPpAccountNo()) ? (ppAccountNo = item.getPpAccountNo()) == null || (strW = r0.w(ppAccountNo)) == null : (phone = item.getPhone()) == null || (strW = r0.w(phone)) == null : (accountNo = item.getAccountNo()) == null || (strW = r0.w(accountNo)) == null) {
            strW = "";
        }
        textView.setText(strW);
        if (i0.V(holder.itemView)) {
            InviteBean invite2 = item.getInvite();
            if (TextUtils.isEmpty(invite2 != null ? invite2.getToInviteDarkTip() : null)) {
                invite = item.getInvite();
                if (invite != null) {
                    toInviteTip = invite.getToInviteTip();
                } else {
                    toInviteTip = null;
                }
            } else {
                InviteBean invite3 = item.getInvite();
                if (invite3 != null) {
                    toInviteTip = invite3.getToInviteDarkTip();
                } else {
                    toInviteTip = null;
                }
            }
        } else {
            invite = item.getInvite();
            if (invite != null) {
                toInviteTip = invite.getToInviteTip();
            } else {
                toInviteTip = null;
            }
        }
        String toFavoriteTip = item.getToFavoriteTip();
        if (TextUtils.isEmpty(toInviteTip) && TextUtils.isEmpty(toFavoriteTip)) {
            View viewOrNull = holder.getViewOrNull(e.cl_favorit_set_up);
            if (viewOrNull != null) {
                p220oa.h.c(viewOrNull);
            }
        } else {
            View viewOrNull2 = holder.getViewOrNull(e.cl_favorit_set_up);
            if (viewOrNull2 != null) {
                p220oa.h.C(viewOrNull2);
                htmlTextView = (HtmlTextView) viewOrNull2.findViewById(e.tv_favorit_tip);
                viewFindViewById = viewOrNull2.findViewById(e.btnInvite);
                viewFindViewById2 = viewOrNull2.findViewById(e.btnSetup);
                if (TextUtils.isEmpty(toInviteTip)) {
                    if (htmlTextView != null) {
                        htmlTextView.setMovementMethod(null);
                    }
                    if (htmlTextView != null) {
                        htmlTextView.setText(toFavoriteTip);
                    }
                    if (viewFindViewById != null) {
                        p220oa.h.c(viewFindViewById);
                    }
                    if (viewFindViewById2 != null) {
                        p220oa.h.C(viewFindViewById2);
                    }
                    if (viewFindViewById != null) {
                        viewFindViewById.setOnClickListener(null);
                    }
                    viewOrNull2.setOnClickListener(null);
                    viewOrNull2.setClickable(false);
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setOnClickListener(new n(17, holder, this));
                    }
                } else {
                    if (htmlTextView != null) {
                        if (toInviteTip == null) {
                            str2 = "";
                        } else {
                            str2 = toInviteTip;
                        }
                        try {
                            htmlTextView.setHtml(str2);
                        } catch (Exception e10) {
                            d.c("ToPalmPayRecentlyAdapter", "bindFavoriteTip", e10);
                        }
                    }
                    if (viewFindViewById != null) {
                        p220oa.h.C(viewFindViewById);
                    }
                    if (viewFindViewById2 != null) {
                        p220oa.h.c(viewFindViewById2);
                    }
                    viewOrNull2.setOnClickListener(null);
                    viewOrNull2.setClickable(false);
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setOnClickListener(null);
                    }
                    businessType3 = item.getBusinessType();
                    if ((businessType3 != null || businessType3.intValue() != 2) && ((businessType3 == null || businessType3.intValue() != 5) && (businessType3 == null || businessType3.intValue() != 4))) {
                        accountNo2 = item.getAccountNo();
                        if (accountNo2 == null) {
                            accountNo2 = item.getPhone();
                        }
                    } else if (TextUtils.isEmpty(item.getPpAccountNo())) {
                        accountNo2 = item.getPhone();
                    } else {
                        accountNo2 = item.getPpAccountNo();
                    }
                    if (accountNo2 == null) {
                        str = "";
                    } else {
                        str = accountNo2;
                    }
                    strY = q0.y(str, "|", toInviteTip != null ? toInviteTip : "");
                    if (!Intrinsics.c(viewOrNull2.getTag(e.cl_favorit_set_up), strY)) {
                        viewOrNull2.setTag(e.cl_favorit_set_up, strY);
                        TransferTrackingUtils.INSTANCE.logInviteGuideShow(TransferTrackingUtils.EVENT_RECENT_INVITE_SHOW, accountNo2, toInviteTip);
                    }
                    if (viewFindViewById != null) {
                        viewFindViewById.setOnClickListener(new n(16, this, item));
                    }
                }
            } else {
                ViewStub viewStub = (ViewStub) holder.getViewOrNull(e.vs_favorit_set_up);
                viewOrNull2 = viewStub == null ? null : viewStub.inflate();
                if (viewOrNull2 != null) {
                    p220oa.h.C(viewOrNull2);
                    htmlTextView = (HtmlTextView) viewOrNull2.findViewById(e.tv_favorit_tip);
                    viewFindViewById = viewOrNull2.findViewById(e.btnInvite);
                    viewFindViewById2 = viewOrNull2.findViewById(e.btnSetup);
                    if (TextUtils.isEmpty(toInviteTip)) {
                        if (htmlTextView != null) {
                            if (toInviteTip == null) {
                                str2 = "";
                            } else {
                                str2 = toInviteTip;
                            }
                            htmlTextView.setHtml(str2);
                        }
                        if (viewFindViewById != null) {
                            p220oa.h.C(viewFindViewById);
                        }
                        if (viewFindViewById2 != null) {
                            p220oa.h.c(viewFindViewById2);
                        }
                        viewOrNull2.setOnClickListener(null);
                        viewOrNull2.setClickable(false);
                        if (viewFindViewById2 != null) {
                            viewFindViewById2.setOnClickListener(null);
                        }
                        businessType3 = item.getBusinessType();
                        if (businessType3 != null) {
                            if (TextUtils.isEmpty(item.getPpAccountNo())) {
                                accountNo2 = item.getPhone();
                            } else {
                                accountNo2 = item.getPpAccountNo();
                            }
                        } else if (TextUtils.isEmpty(item.getPpAccountNo())) {
                            accountNo2 = item.getPhone();
                        } else {
                            accountNo2 = item.getPpAccountNo();
                        }
                        if (accountNo2 == null) {
                            str = "";
                        } else {
                            str = accountNo2;
                        }
                        strY = q0.y(str, "|", toInviteTip != null ? toInviteTip : "");
                        if (!Intrinsics.c(viewOrNull2.getTag(e.cl_favorit_set_up), strY)) {
                            viewOrNull2.setTag(e.cl_favorit_set_up, strY);
                            TransferTrackingUtils.INSTANCE.logInviteGuideShow(TransferTrackingUtils.EVENT_RECENT_INVITE_SHOW, accountNo2, toInviteTip);
                        }
                        if (viewFindViewById != null) {
                            viewFindViewById.setOnClickListener(new n(16, this, item));
                        }
                    } else {
                        if (htmlTextView != null) {
                            htmlTextView.setMovementMethod(null);
                        }
                        if (htmlTextView != null) {
                            htmlTextView.setText(toFavoriteTip);
                        }
                        if (viewFindViewById != null) {
                            p220oa.h.c(viewFindViewById);
                        }
                        if (viewFindViewById2 != null) {
                            p220oa.h.C(viewFindViewById2);
                        }
                        if (viewFindViewById != null) {
                            viewFindViewById.setOnClickListener(null);
                        }
                        viewOrNull2.setOnClickListener(null);
                        viewOrNull2.setClickable(false);
                        if (viewFindViewById2 != null) {
                            viewFindViewById2.setOnClickListener(new n(17, holder, this));
                        }
                    }
                }
            }
        }
        if (this.f39315a) {
            Long orderTime = item.getOrderTime();
            if ((orderTime != null ? orderTime.longValue() : 0L) > 0) {
                int i10 = e.tvLastTransferTime;
                String orderTimeDesc = item.getOrderTimeDesc();
                Long orderTime2 = item.getOrderTime();
                holder.setText(i10, orderTimeDesc + " " + r0.S(orderTime2 != null ? orderTime2.longValue() : 0L)).setGone(e.tvLastTransferTime, false);
                return;
            }
        }
        holder.setGone(e.tvLastTransferTime, true);
    }
}
