package Fd;

import B6.ViewOnClickListenerC0087i;
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
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayContactViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Fd.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0250e implements OnItemClickListener, OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactAllFragment f2669a;

    public /* synthetic */ C0250e(TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment) {
        this.f2669a = transferToPalmPayContactAllFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2669a;
        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToPalmPayContactAllFragment.t().getItem(i7);
        if (recipientBeanV2 != null) {
            int id2 = view.getId();
            if (id2 == p159kd.e.iivFavorite) {
                if (Intrinsics.c(recipientBeanV2.getFavorite(), Boolean.TRUE)) {
                    TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) transferToPalmPayContactAllFragment.f27333i;
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
                postcardG.withString("beneficiary_bean", ((Gson) c0525wF.f7166b).toJson(recipientBean)).navigation(transferToPalmPayContactAllFragment.requireContext());
                return;
            }
            if (id2 == p159kd.e.iivMenu) {
                View layout = transferToPalmPayContactAllFragment.getLayoutInflater().inflate(p159kd.f.sm_popup_recipients_setting, (ViewGroup) null);
                Context contextRequireContext = transferToPalmPayContactAllFragment.requireContext();
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
                gVar.t = CommonViewExtKt.colorInt(L6.b.ppColorPopupWhiteBg, transferToPalmPayContactAllFragment.requireContext());
                gVar.f(G7.q.f3135a);
                gVar.f3076O = transferToPalmPayContactAllFragment.getViewLifecycleOwner();
                Balloon balloonA = gVar.a();
                p002a.a.B(view, balloonA);
                ((TextView) layout.findViewById(p159kd.e.tv_delete)).setOnClickListener(new ViewOnClickListenerC0087i(balloonA, 5, transferToPalmPayContactAllFragment, recipientBeanV2));
            }
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2669a;
        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToPalmPayContactAllFragment.t().getItem(i7);
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) transferToPalmPayContactAllFragment.f27333i;
        if (transferToPalmPayContactViewModel != null) {
            transferToPalmPayContactViewModel.e(recipientBeanV2.getBusinessType(), recipientBeanV2);
        }
    }
}
