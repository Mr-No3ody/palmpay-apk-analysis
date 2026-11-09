package Ed;

import Pa.C0525w;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.IconicsDrawable;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayContactViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ed.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0236p implements OnItemClickListener, OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BankAccountPalmPayContactFragment f2390a;

    public /* synthetic */ C0236p(BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment) {
        this.f2390a = bankAccountPalmPayContactFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        Object[] objArr = 0;
        final int i10 = 1;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        final BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment = this.f2390a;
        final RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) bankAccountPalmPayContactFragment.t().getItem(i7);
        int id2 = view.getId();
        if (id2 == p159kd.e.iivFavorite) {
            if (Intrinsics.c(recipientBeanV2.getFavorite(), Boolean.TRUE)) {
                TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) bankAccountPalmPayContactFragment.f27333i;
                if (transferToPalmPayContactViewModel != null) {
                    Boolean favorite = recipientBeanV2.getFavorite();
                    transferToPalmPayContactViewModel.d(recipientBeanV2.getRelationId(), !(favorite != null ? favorite.booleanValue() : false));
                    return;
                }
                return;
            }
            Postcard postcardG = d0.g(1, "/sm/add_beneficiary", "beneficiary_type");
            C0525w c0525wF = C0525w.f();
            RecipientListResp.RecipientBean recipientBean = new RecipientListResp.RecipientBean();
            recipientBean.setRecipientPhone(TextUtils.isEmpty(recipientBeanV2.getPpAccountNo()) ? recipientBeanV2.getPhone() : recipientBeanV2.getPpAccountNo());
            Unit unit = Unit.f38893a;
            postcardG.withString("beneficiary_bean", ((Gson) c0525wF.f7166b).toJson(recipientBean)).navigation(bankAccountPalmPayContactFragment.requireContext());
            return;
        }
        if (id2 == p159kd.e.iivMenu) {
            View layout = bankAccountPalmPayContactFragment.getLayoutInflater().inflate(p159kd.f.sm_popup_recipients_setting, (ViewGroup) null);
            Context contextRequireContext = bankAccountPalmPayContactFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            G7.g gVar = new G7.g(contextRequireContext);
            Intrinsics.e(layout);
            Intrinsics.checkNotNullParameter(layout, "layout");
            gVar.f3068G = layout;
            gVar.d(10);
            gVar.i(21);
            gVar.b(G7.b.f3050c);
            gVar.c(G7.c.f3055b);
            gVar.e(4);
            gVar.g(8.0f);
            gVar.h();
            gVar.t = CommonViewExtKt.colorInt(L6.b.ppColorPopupWhiteBg, bankAccountPalmPayContactFragment.requireContext());
            gVar.f(G7.q.f3135a);
            gVar.f3076O = bankAccountPalmPayContactFragment.getViewLifecycleOwner();
            final Balloon balloonA = gVar.a();
            p002a.a.B(view, balloonA);
            TextView textView = (TextView) layout.findViewById(p159kd.e.tv_favorite);
            Intrinsics.e(textView);
            p220oa.h.c(textView);
            Context contextRequireContext2 = bankAccountPalmPayContactFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext2, S6.a.pay_Like);
            iconicsDrawable.a(new Ab.C(bankAccountPalmPayContactFragment, 10));
            textView.setCompoundDrawables(iconicsDrawable, null, null, null);
            final Object[] objArr2 = objArr == true ? 1 : 0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: Ed.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (objArr2) {
                        case 0:
                            balloonA.f();
                            TransferToPalmPayContactViewModel transferToPalmPayContactViewModel2 = (TransferToPalmPayContactViewModel) bankAccountPalmPayContactFragment.f27333i;
                            if (transferToPalmPayContactViewModel2 != null) {
                                RecipientBeanV2 recipientBeanV3 = recipientBeanV2;
                                Boolean favorite2 = recipientBeanV3.getFavorite();
                                transferToPalmPayContactViewModel2.d(recipientBeanV3.getRelationId(), !(favorite2 != null ? favorite2.booleanValue() : false));
                            }
                            break;
                        default:
                            balloonA.f();
                            BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment2 = bankAccountPalmPayContactFragment;
                            O6.c cVar = new O6.c(bankAccountPalmPayContactFragment2.getContext());
                            cVar.f6596b = O6.d.f("Delete the Beneficiray?");
                            cVar.f6598d = "Deleted will no longer show up in beneficiaries";
                            cVar.c(p025ba.k.core_cancel, null);
                            cVar.d(p025ba.k.core_delete, new A8.c(17, bankAccountPalmPayContactFragment2, recipientBeanV2));
                            cVar.g();
                            break;
                    }
                }
            });
            ((TextView) layout.findViewById(p159kd.e.tv_delete)).setOnClickListener(new View.OnClickListener() { // from class: Ed.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            balloonA.f();
                            TransferToPalmPayContactViewModel transferToPalmPayContactViewModel2 = (TransferToPalmPayContactViewModel) bankAccountPalmPayContactFragment.f27333i;
                            if (transferToPalmPayContactViewModel2 != null) {
                                RecipientBeanV2 recipientBeanV3 = recipientBeanV2;
                                Boolean favorite2 = recipientBeanV3.getFavorite();
                                transferToPalmPayContactViewModel2.d(recipientBeanV3.getRelationId(), !(favorite2 != null ? favorite2.booleanValue() : false));
                            }
                            break;
                        default:
                            balloonA.f();
                            BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment2 = bankAccountPalmPayContactFragment;
                            O6.c cVar = new O6.c(bankAccountPalmPayContactFragment2.getContext());
                            cVar.f6596b = O6.d.f("Delete the Beneficiray?");
                            cVar.f6598d = "Deleted will no longer show up in beneficiaries";
                            cVar.c(p025ba.k.core_cancel, null);
                            cVar.d(p025ba.k.core_delete, new A8.c(17, bankAccountPalmPayContactFragment2, recipientBeanV2));
                            cVar.g();
                            break;
                    }
                }
            });
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment = this.f2390a;
        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) bankAccountPalmPayContactFragment.t().getItem(i7);
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) bankAccountPalmPayContactFragment.f27333i;
        if (transferToPalmPayContactViewModel != null) {
            transferToPalmPayContactViewModel.e(recipientBeanV2.getBusinessType(), recipientBeanV2);
        }
    }
}
