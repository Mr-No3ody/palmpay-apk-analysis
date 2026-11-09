package p328ve;

import Ac.e;
import Ac.f;
import Ac.h;
import Ad.V;
import G1.d;
import Pa.r0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.custom_view.r;
import java.util.ArrayList;
import java.util.List;
import p025ba.k;
import p294tb.W;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43179a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f43182d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43181c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f43180b = new ArrayList();

    public c(Context context) {
        this.f43179a = context;
    }

    public final void a() {
        this.f43180b.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f43180b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
        int i10;
        b bVar = (b) viewHolder;
        final Object obj = this.f43180b.get(i7);
        final int i11 = 0;
        bVar.f43174j.setOnClickListener(new View.OnClickListener(this) { // from class: ve.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f43162b;

            {
                this.f43162b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v7, types: [com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v8, types: [com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c cVar = this.f43162b;
                        if (cVar.f43182d != null) {
                            Object obj2 = obj;
                            if (!(obj2 instanceof LinkBankCardResp.LinkBankCard) || !((LinkBankCardResp.LinkBankCard) obj2).isVirtualCard()) {
                                cVar.f43182d.onItemClick(cVar.f43180b.get(i7));
                            }
                        }
                        break;
                    default:
                        c cVar2 = this.f43162b;
                        if (cVar2.f43182d != null) {
                            Object obj3 = obj;
                            if ((obj3 instanceof LinkBankCardResp.LinkBankCard) && ((LinkBankCardResp.LinkBankCard) obj3).getDefaultCard() == 1) {
                                cVar2.f43182d.onSetDefaultCardClick();
                            } else {
                                cVar2.f43182d.onRemoveClick(cVar2.f43180b.get(i7));
                            }
                        }
                        break;
                }
            }
        });
        final int i12 = 1;
        bVar.f43171f.setOnClickListener(new View.OnClickListener(this) { // from class: ve.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f43162b;

            {
                this.f43162b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v7, types: [com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v8, types: [com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        c cVar = this.f43162b;
                        if (cVar.f43182d != null) {
                            Object obj2 = obj;
                            if (!(obj2 instanceof LinkBankCardResp.LinkBankCard) || !((LinkBankCardResp.LinkBankCard) obj2).isVirtualCard()) {
                                cVar.f43182d.onItemClick(cVar.f43180b.get(i7));
                            }
                        }
                        break;
                    default:
                        c cVar2 = this.f43162b;
                        if (cVar2.f43182d != null) {
                            Object obj3 = obj;
                            if ((obj3 instanceof LinkBankCardResp.LinkBankCard) && ((LinkBankCardResp.LinkBankCard) obj3).getDefaultCard() == 1) {
                                cVar2.f43182d.onSetDefaultCardClick();
                            } else {
                                cVar2.f43182d.onRemoveClick(cVar2.f43180b.get(i7));
                            }
                        }
                        break;
                }
            }
        });
        V v3 = new V(this, i7, 8);
        View view = bVar.f43177v;
        view.setOnClickListener(v3);
        boolean z3 = obj instanceof LinkBankCardResp.LinkBankCard;
        Context context = this.f43179a;
        ImageView imageView = bVar.f43167b;
        View view2 = bVar.f43175o;
        TextView textView = bVar.f43169d;
        TextView textView2 = bVar.f43168c;
        ImageView imageView2 = bVar.f43166a;
        TextView textView3 = bVar.f43172g;
        TextView textView4 = bVar.f43170e;
        TextView textView5 = bVar.f43173i;
        if (!z3) {
            if (obj instanceof LinkBankAccountResp.LinkBankAccount) {
                view2.setTag(Boolean.FALSE);
                view.setVisibility(8);
                LinkBankAccountResp.LinkBankAccount linkBankAccount = (LinkBankAccountResp.LinkBankAccount) obj;
                String bankUrl = linkBankAccount.getBankUrl();
                b.e(context).load(bankUrl).a(d.O(r.cv_default_bank_account_logo)).S(imageView2);
                textView3.setText(k.core_remove_bank_account);
                view.setVisibility(8);
                textView2.setText(linkBankAccount.getBankName());
                textView.setText(r0.G(linkBankAccount.getBankAccountNo()));
                r0.h1(imageView, linkBankAccount.getBgUrl(), r.cv_shape_rect_corner_8_bg_gray_padding_lr_12_tb_6);
                textView5.setVisibility(8);
                if (linkBankAccount.getAuthFlag() == 1) {
                    textView5.setVisibility(0);
                    textView5.setText(h.main_bound);
                }
                if (linkBankAccount.isDefaultPaymentCard()) {
                    textView4.setCompoundDrawablesWithIntrinsicBounds(r.cv_default_acount_small, 0, 0, 0);
                    textView4.setVisibility(0);
                } else {
                    textView4.setVisibility(8);
                }
                int supportType = linkBankAccount.getSupportType();
                TextView textView6 = bVar.f43165A;
                if (supportType == 1) {
                    textView6.setText(h.main_receiving_money);
                    textView6.setVisibility(0);
                    return;
                } else if (linkBankAccount.getSupportType() != 2) {
                    textView6.setVisibility(8);
                    return;
                } else {
                    textView6.setText(h.main_support_payments);
                    textView6.setVisibility(0);
                    return;
                }
            }
            return;
        }
        LinkBankCardResp.LinkBankCard linkBankCard = (LinkBankCardResp.LinkBankCard) obj;
        String bankUrl2 = linkBankCard.getBankUrl();
        b.e(context).load(bankUrl2).a(d.O(r.cv_default_bank_logo)).S(imageView2);
        if (this.f43181c) {
            textView3.setText(k.core_replace_with_default_repayment_card);
        } else {
            textView3.setText(k.core_remove_bank_card);
        }
        textView2.setText(linkBankCard.getBankName());
        textView.setText(r0.I(linkBankCard.getCardNo()));
        boolean zIsExpired = linkBankCard.isExpired();
        ImageView imageView3 = bVar.f43178w;
        if (zIsExpired) {
            imageView3.setVisibility(0);
            imageView3.setOnClickListener(new W(8, this, linkBankCard));
            i10 = 8;
        } else {
            i10 = 8;
            imageView3.setVisibility(8);
        }
        textView5.setVisibility(i10);
        Boolean bool = Boolean.FALSE;
        view2.setTag(bool);
        view.setVisibility(i10);
        if (linkBankCard.isDefaultPaymentCard()) {
            textView4.setCompoundDrawablesWithIntrinsicBounds(r.cv_default_card_small, 0, 0, 0);
            textView4.setVisibility(0);
        } else {
            textView4.setVisibility(i10);
        }
        int accountStatus = linkBankCard.getAccountStatus();
        ImageView imageView4 = bVar.f43176p;
        TextView textView7 = bVar.t;
        if (accountStatus != 1) {
            textView7.setTag(bool);
            textView7.setText(k.core_bind_bank_card);
            imageView4.setImageResource(r.cv_link_gray);
        } else {
            textView7.setTag(Boolean.TRUE);
            textView7.setText(k.core_unbind_bank_card);
            textView5.setVisibility(0);
            textView5.setText(h.main_bound);
            imageView4.setImageResource(r.cv_unlink_gray);
        }
        r0.h1(imageView, linkBankCard.getBgUrl(), r.cv_shape_rect_corner_8_bg_gray_padding_lr_12_tb_6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f43179a).inflate(f.main_bank_card_account_item_layout, viewGroup, false);
        b bVar = new b(viewInflate);
        bVar.f43174j = viewInflate.findViewById(e.bank_content);
        bVar.f43166a = (ImageView) viewInflate.findViewById(e.bank_icon);
        bVar.f43168c = (TextView) viewInflate.findViewById(e.bank_name);
        bVar.f43169d = (TextView) viewInflate.findViewById(e.bank_num);
        bVar.f43170e = (TextView) viewInflate.findViewById(e.tvDefaultCard);
        bVar.f43171f = viewInflate.findViewById(e.remove_container);
        bVar.f43172g = (TextView) viewInflate.findViewById(e.remove_tv);
        bVar.f43175o = viewInflate.findViewById(e.mbcail_root);
        bVar.f43173i = (TextView) viewInflate.findViewById(e.tvVerified);
        bVar.f43167b = (ImageView) viewInflate.findViewById(e.card_bg);
        bVar.f43176p = (ImageView) viewInflate.findViewById(e.unlink_iv);
        bVar.t = (TextView) viewInflate.findViewById(e.unlink_tv);
        bVar.f43177v = viewInflate.findViewById(e.unlink_container);
        bVar.f43178w = (ImageView) viewInflate.findViewById(e.ivExpired);
        bVar.f43165A = (TextView) viewInflate.findViewById(e.tvCardType);
        return bVar;
    }
}
