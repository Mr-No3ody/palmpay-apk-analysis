package p173ld;

import F6.d;
import Jd.c;
import M1.k;
import N8.q0;
import Pa.i0;
import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.InviteBean;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.util.TransferTrackingUtils;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.HtmlTextView;
import p002a.a;
import p051d9.C1605b;
import p054dd.n;
import p159kd.e;
import p159kd.f;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i7, int i10, int i11, boolean z3) {
        super(f.sm_select_bank_list_title_layout, f.sm_transfer_recently_item);
        boolean z8 = (i11 & 1) == 0;
        boolean z10 = (i11 & 2) == 0;
        i7 = (i11 & 16) != 0 ? CommonViewExtKt.getDp(16.0f) : i7;
        i10 = (i11 & 32) != 0 ? 0 : i10;
        this.f39340b = z8;
        this.f39341c = z10;
        this.f39342d = z3;
        this.f39343e = i7;
        this.f39344f = i10;
        addChildClickViewIds(e.ivMore, e.ivFavorite, e.btnSetup);
    }

    @Override // M1.k
    public final void b(BaseViewHolder helper, SectionEntity sectionEntity) {
        RecipientListResp.RecipientBean item = (RecipientListResp.RecipientBean) sectionEntity;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(e.title_tv, c.c(item.getRecipientNickname()));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0108  */
    /* JADX WARN: Code duplicated, block: B:41:0x012f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0131  */
    /* JADX WARN: Code duplicated, block: B:44:0x0135  */
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        InviteBean inviteBean;
        String toInviteTip;
        String str;
        RecipientListResp.RecipientBean item = (RecipientListResp.RecipientBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        getContext();
        a.r(item.getRecipientHeadImage(), (ImageView) holder.getView(e.ivRecentlyBank));
        BaseViewHolder gone = holder.setText(e.tvRecentlyBankName, item.getRecipientNickname()).setGone(e.tvRecentlyBankName, TextUtils.isEmpty(item.getRecipientNickname()));
        int i7 = e.tvReceiptName;
        String recipientAccountNumber = item.getRecipientAccountNumber();
        String strW = recipientAccountNumber != null ? r0.w(recipientAccountNumber) : null;
        BaseViewHolder text = gone.setText(i7, strW + "  " + item.getRecipientBankName());
        int i10 = e.ivMore;
        boolean z3 = this.f39340b;
        boolean z8 = z3 ^ true;
        BaseViewHolder gone2 = text.setGone(i10, z8).setGone(e.ivFavorite, z8);
        int i11 = e.ivFavorite;
        IconicsDrawable iconicsDrawable = new IconicsDrawable(getContext(), item.favorite ? S6.a.pay_Like : S6.a.pay_LikeOutline);
        iconicsDrawable.a(new C1605b(9, item, this));
        gone2.setImageDrawable(i11, iconicsDrawable);
        int layoutPosition = holder.getLayoutPosition() - 1;
        if (layoutPosition >= 0) {
        }
        holder.setGone(e.tvTag, true);
        ImageView imageView = (ImageView) holder.getView(e.iv_tag);
        String str2 = (!this.f39342d || TextUtils.isEmpty(item.relationshipDarkPic)) ? item.relationshipPic : item.relationshipDarkPic;
        if (TextUtils.isEmpty(str2)) {
            h.c(imageView);
            imageView.setImageDrawable(null);
        } else {
            r0.l1(str2, imageView);
            h.C(imageView);
        }
        if (this.f39341c) {
            long j6 = item.orderTime;
            if (j6 > 0) {
                holder.setText(e.tvLastTransferTime, item.orderTimeDesc + " " + r0.S(j6)).setGone(e.tvLastTransferTime, false);
            } else {
                holder.setGone(e.tvLastTransferTime, true);
            }
        } else {
            holder.setGone(e.tvLastTransferTime, true);
        }
        if (i0.V(holder.itemView)) {
            InviteBean inviteBean2 = item.invite;
            if (TextUtils.isEmpty(inviteBean2 != null ? inviteBean2.getToInviteDarkTip() : null)) {
                inviteBean = item.invite;
                if (inviteBean != null) {
                    toInviteTip = inviteBean.getToInviteTip();
                    str = toInviteTip;
                } else {
                    str = null;
                }
            } else {
                InviteBean inviteBean3 = item.invite;
                if (inviteBean3 != null) {
                    toInviteTip = inviteBean3.getToInviteDarkTip();
                    str = toInviteTip;
                } else {
                    str = null;
                }
            }
        } else {
            inviteBean = item.invite;
            if (inviteBean != null) {
                toInviteTip = inviteBean.getToInviteTip();
                str = toInviteTip;
            } else {
                str = null;
            }
        }
        String str3 = item.toFavoriteTip;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str3)) {
            View viewOrNull = holder.getViewOrNull(e.cl_favorit_set_up);
            if (viewOrNull != null) {
                h.c(viewOrNull);
                return;
            }
            return;
        }
        View viewOrNull2 = holder.getViewOrNull(e.cl_favorit_set_up);
        if (viewOrNull2 == null) {
            ViewStub viewStub = (ViewStub) holder.getViewOrNull(e.vs_favorit_set_up);
            viewOrNull2 = viewStub == null ? null : viewStub.inflate();
            if (viewOrNull2 == null) {
                return;
            }
        }
        View view = viewOrNull2;
        h.C(view);
        int i12 = this.f39343e;
        h.k(view, null, Integer.valueOf(i12), Integer.valueOf(this.f39344f), null, 9);
        if (i12 == CommonViewExtKt.getDp(12.0f)) {
            View viewFindViewById = view.findViewById(e.ivArrow);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            h.k(viewFindViewById, null, Integer.valueOf(CommonViewExtKt.getDp(16.0f)), null, null, 13);
        }
        HtmlTextView htmlTextView = (HtmlTextView) view.findViewById(e.tv_favorit_tip);
        View viewFindViewById2 = view.findViewById(e.btnInvite);
        View viewFindViewById3 = view.findViewById(e.btnSetup);
        if (TextUtils.isEmpty(str)) {
            if (htmlTextView != null) {
                htmlTextView.setMovementMethod(null);
            }
            if (htmlTextView != null) {
                htmlTextView.setText(str3);
            }
            if (viewFindViewById2 != null) {
                h.c(viewFindViewById2);
            }
            if (viewFindViewById3 != null) {
                h.C(viewFindViewById3);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setOnClickListener(null);
            }
            view.setOnClickListener(null);
            view.setClickable(false);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setOnClickListener(new n(15, holder, this));
                return;
            }
            return;
        }
        if (htmlTextView != null) {
            try {
                htmlTextView.setHtml(str == null ? "" : str);
            } catch (Exception e10) {
                d.c("TransferRecentlyRvAdapter", "bindFavoriteTip", e10);
            }
        }
        if (viewFindViewById2 != null) {
            h.C(viewFindViewById2);
        }
        if (viewFindViewById3 != null) {
            h.c(viewFindViewById3);
        }
        view.setOnClickListener(null);
        view.setClickable(false);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(null);
        }
        String recipientAccountNumber2 = item.getRecipientAccountNumber();
        if (recipientAccountNumber2 == null) {
            recipientAccountNumber2 = item.accountNo;
        }
        String strY = q0.y(recipientAccountNumber2 == null ? "" : recipientAccountNumber2, "|", str != null ? str : "");
        if (!Intrinsics.c(view.getTag(e.cl_favorit_set_up), strY)) {
            view.setTag(e.cl_favorit_set_up, strY);
            TransferTrackingUtils.INSTANCE.logInviteGuideShow(z3 ? TransferTrackingUtils.EVENT_BENEFICIARIES_INVITE_SHOW : TransferTrackingUtils.EVENT_RECENT_INVITE_SHOW, recipientAccountNumber2, str);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new n(14, this, item));
        }
    }
}
