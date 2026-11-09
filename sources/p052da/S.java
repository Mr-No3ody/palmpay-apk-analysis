package p052da;

import G8.a;
import Kb.c;
import L6.b;
import Pa.k0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.d;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.rsp.ActivityConfig;
import com.transsnet.palmpay.core.bean.rsp.OkCardPreCreditInfoRsp;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.viewmodel.ModelApplyOkCard;
import com.transsnet.palmpay.core.viewmodel.PayMethodItem;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.List;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f35725A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f35726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f35728g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f35729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f35730j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f35732p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f35733v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f35734w;

    public S(Context context) {
        super(context);
        this.f35727f = false;
        this.f35728g = true;
        this.f35731o = -1;
        this.f35732p = -1;
        this.f35734w = false;
        this.f35725A = true;
        this.f35729i = d.e(k.core_use_new_bank_card_title_lowercase, context);
        this.f35730j = context.getColor(b.ppColorPrimary);
        this.f35733v = new ArrayList();
    }

    public static String c(S s3, int i7) {
        for (ActivityConfig activityConfig : s3.f35733v) {
            if (i7 == activityConfig.senderAccountType) {
                return activityConfig.acTips;
            }
        }
        return null;
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (!this.f35727f) {
            return super.getItemCount();
        }
        List list = this.f4985b;
        if (list == null || list.size() == 0) {
            return 1;
        }
        return this.f4985b.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        List list = this.f4985b;
        if (list == null || list.size() == 0) {
            return 18;
        }
        if (this.f35727f && i7 == this.f4985b.size()) {
            return 18;
        }
        PaymentMethod paymentMethod = (PaymentMethod) this.f4985b.get(i7);
        if (paymentMethod == null || paymentMethod.senderAccountType != 28) {
            return 17;
        }
        return TextUtils.isEmpty(paymentMethod.accountId) ? 20 : 19;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        boolean z3 = viewHolder instanceof Q;
        int i10 = this.f35732p;
        boolean z8 = this.f35725A;
        int i11 = 8;
        if (z3) {
            Q q10 = (Q) viewHolder;
            List list = this.f4985b;
            if (list != null && i7 < list.size()) {
                q10.f35723d.e((PaymentMethod) this.f4985b.get(i7), this.f35726e);
                PayMethodItem payMethodItem = q10.f35723d;
                payMethodItem.t.setVisibility(((PaymentMethod) this.f4985b.get(i7)).expiryFlag ? 0 : 8);
                payMethodItem.f28537v.setVisibility(((PaymentMethod) this.f4985b.get(i7)).expiryFlag ? 0 : 8);
                payMethodItem.f28533i.setClickable(!((PaymentMethod) this.f4985b.get(i7)).expiryFlag);
                TextView textView = payMethodItem.f28538w;
                if (i7 == 0 && this.f35734w) {
                    i11 = 0;
                }
                textView.setVisibility(i11);
            }
            int i12 = q10.f35724e;
            PayMethodItem payMethodItem2 = q10.f35723d;
            if (i12 == 18) {
                payMethodItem2.f28529d.setTextColor(this.f35730j);
                if (this.f35728g) {
                    payMethodItem2.d(null, true);
                    payMethodItem2.f28531f.setText(k.core_maximum_10_cards);
                } else {
                    payMethodItem2.d(null, false);
                }
            }
            if (z8) {
                if (this.f35731o != i7 || i10 == i7) {
                    payMethodItem2.f28534j.setImageResource(r.cv_gray_unchecked);
                    return;
                } else {
                    payMethodItem2.f28534j.setImageResource(r.cv_check_purple);
                    return;
                }
            }
            return;
        }
        if (!(viewHolder instanceof N)) {
            if (viewHolder instanceof P) {
                P p3 = (P) viewHolder;
                OkCardPreCreditInfoRsp okCardPreCreditInfoRsp = ((PaymentMethod) this.f4985b.get(i7)).mOkCardPreCreditInfo;
                if (okCardPreCreditInfoRsp == null) {
                    p3.getClass();
                    return;
                } else {
                    if (p3.itemView instanceof ModelApplyOkCard) {
                        if (!TextUtils.isEmpty(okCardPreCreditInfoRsp.okCardPreCreditDesc)) {
                            ((ModelApplyOkCard) p3.itemView).d(okCardPreCreditInfoRsp.okCardPreCreditDesc);
                        }
                        ((ModelApplyOkCard) p3.itemView).e(okCardPreCreditInfoRsp.okCardPreCreditTags);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        N n10 = (N) viewHolder;
        n10.f35722o = this.f4986c;
        List list2 = this.f4985b;
        if (list2 != null && i7 < list2.size()) {
            PaymentMethod paymentMethod = (PaymentMethod) this.f4985b.get(i7);
            long j6 = this.f35726e;
            n10.f35721j = paymentMethod;
            if (paymentMethod.senderAccountType == 28) {
                n10.f35714b.setImageResource(r.cv_ok_card_icon);
                int i13 = k.core_oc_limit;
                TextView textView2 = n10.f35715c;
                textView2.setText(i13);
                textView2.setText(k0.a());
                int i14 = k.core_oc_limit;
                Context context = n10.f35720i;
                AutoTrackUtil.addViewRemark(n10.f35719g, context.getString(i14));
                n10.f35716d.setText(" (" + r0.B(paymentMethod.availableBalance, false) + ")");
                n10.f35718f.setVisibility(8);
                if (paymentMethod.enable) {
                    n10.a(paymentMethod, true);
                    if (paymentMethod.availableBalance < j6) {
                        n10.a(null, true);
                        n10.b(context.getString(k.core_insufficient_balance));
                    } else if (!TextUtils.isEmpty(paymentMethod.tips)) {
                        n10.b(paymentMethod.tips);
                    }
                } else {
                    n10.a(paymentMethod, false);
                    if (!TextUtils.isEmpty(paymentMethod.okcardTips)) {
                        String str = paymentMethod.okcardTips;
                        TextView textView3 = n10.f35717e;
                        if (textView3 != null) {
                            if (TextUtils.isEmpty(str)) {
                                textView3.setVisibility(8);
                            } else {
                                textView3.setVisibility(0);
                                textView3.setTextColor(context.getColor(b.ppColorError));
                                textView3.setBackground(null);
                                textView3.setText(str);
                            }
                        }
                    } else if (!TextUtils.isEmpty(paymentMethod.tips)) {
                        n10.b(paymentMethod.tips);
                    }
                }
            }
        }
        if (z8) {
            if (this.f35731o != i7 || i10 == i7) {
                n10.f35713a.f28534j.setImageResource(r.cv_gray_unchecked);
            } else {
                n10.f35713a.f28534j.setImageResource(r.cv_check_purple);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        Context context = this.f4984a;
        if (i7 == 17) {
            return new Q(this, LayoutInflater.from(context).inflate(g.core_layout_payment_method_item, viewGroup, false));
        }
        if (i7 != 18) {
            if (i7 == 19) {
                return new N(LayoutInflater.from(context).inflate(g.core_layout_payment_method_item, viewGroup, false));
            }
            if (i7 != 20) {
                return new Q(this, LayoutInflater.from(context).inflate(g.core_layout_payment_method_item, viewGroup, false));
            }
            ModelApplyOkCard modelApplyOkCard = new ModelApplyOkCard(context);
            P p3 = new P(this, modelApplyOkCard);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            int iDp2px = SizeUtils.dp2px(15.0f);
            marginLayoutParams.leftMargin = iDp2px;
            marginLayoutParams.rightMargin = iDp2px;
            marginLayoutParams.bottomMargin = SizeUtils.dp2px(8.0f);
            modelApplyOkCard.setLayoutParams(marginLayoutParams);
            modelApplyOkCard.c(context.getString(k.core_msg_credit_limit_up_to));
            return p3;
        }
        View viewInflate = LayoutInflater.from(context).inflate(g.core_payment_method_list_footer, viewGroup, false);
        O o10 = new O(this, viewInflate);
        PayMethodItem payMethodItem = (PayMethodItem) viewInflate.findViewById(e.pmlf_use_new_bank_card);
        PayMethodItem payMethodItem2 = (PayMethodItem) viewInflate.findViewById(e.pmlf_use_new_bank_account);
        PayMethodItem payMethodItem3 = (PayMethodItem) viewInflate.findViewById(e.pmlf_use_new_bank_card_and_bank_account);
        PayMethodItem payMethodItem4 = (PayMethodItem) viewInflate.findViewById(e.pmlf_use_ussd);
        payMethodItem.f28528c.setImageDrawable(a.s(viewInflate.getContext()));
        payMethodItem.f28529d.setText(this.f35729i);
        payMethodItem.f28529d.setTextColor(context.getResources().getColor(b.ppColorPrimary));
        payMethodItem.f28534j.setVisibility(8);
        payMethodItem.f28530e.setText("");
        payMethodItem.f(payMethodItem.f28531f, c(this, 5));
        payMethodItem2.f28528c.setImageDrawable(a.s(viewInflate.getContext()));
        payMethodItem2.f28529d.setText(context.getResources().getText(k.core_use_new_bank_account));
        payMethodItem2.f28529d.setTextColor(context.getResources().getColor(b.ppColorPrimary));
        payMethodItem2.f28534j.setVisibility(8);
        payMethodItem2.f28530e.setText("");
        payMethodItem2.f(payMethodItem2.f28531f, c(this, 6));
        payMethodItem3.f28528c.setImageDrawable(a.s(viewInflate.getContext()));
        payMethodItem3.f28529d.setText(context.getResources().getText(k.core_add_bank_card_or_bank_account));
        payMethodItem3.f28529d.setMaxWidth(Integer.MAX_VALUE);
        payMethodItem3.f28529d.setTextColor(context.getResources().getColor(b.ppColorPrimary));
        payMethodItem3.f28534j.setVisibility(8);
        payMethodItem3.f28530e.setText("");
        payMethodItem3.f(payMethodItem3.f28531f, null);
        payMethodItem4.f28528c.setImageDrawable(a.s(viewInflate.getContext()));
        payMethodItem4.f28529d.setText(context.getResources().getText(k.core_use_ussd));
        payMethodItem4.f28529d.setTextColor(context.getResources().getColor(b.ppColorPrimary));
        payMethodItem4.f28534j.setVisibility(8);
        payMethodItem4.f28530e.setText("");
        payMethodItem4.f(payMethodItem4.f28531f, c(this, 23));
        if (BaseApplication.isNG()) {
            if ((this.t & 3) == 3) {
                payMethodItem3.setVisibility(0);
                payMethodItem.setVisibility(8);
                payMethodItem2.setVisibility(8);
            } else {
                payMethodItem3.setVisibility(8);
                if ((this.t & 1) == 1) {
                    payMethodItem.setVisibility(0);
                } else {
                    payMethodItem.setVisibility(8);
                }
                if ((this.t & 2) == 2) {
                    payMethodItem2.setVisibility(0);
                } else {
                    payMethodItem2.setVisibility(8);
                }
            }
            if ((this.t & 4) == 4) {
                payMethodItem4.setVisibility(0);
            } else {
                payMethodItem4.setVisibility(8);
            }
        }
        o10.a(payMethodItem);
        o10.a(payMethodItem2);
        o10.a(payMethodItem3);
        o10.a(payMethodItem4);
        return o10;
    }
}
