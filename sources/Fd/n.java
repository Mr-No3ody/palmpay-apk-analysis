package Fd;

import B6.ViewOnClickListenerC0087i;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayContactViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements OnItemClickListener, OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactFavoriteFragment f2692a;

    public /* synthetic */ n(TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment) {
        this.f2692a = transferToPalmPayContactFavoriteFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = this.f2692a;
        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToPalmPayContactFavoriteFragment.t().getItem(i7);
        int id2 = view.getId();
        if (id2 == p159kd.e.iivFavorite) {
            TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) transferToPalmPayContactFavoriteFragment.f27333i;
            if (transferToPalmPayContactViewModel != null) {
                Boolean favorite = recipientBeanV2.getFavorite();
                transferToPalmPayContactViewModel.d(recipientBeanV2.getRelationId(), !(favorite != null ? favorite.booleanValue() : false));
                return;
            }
            return;
        }
        if (id2 == p159kd.e.iivMenu) {
            View layout = transferToPalmPayContactFavoriteFragment.getLayoutInflater().inflate(p159kd.f.sm_popup_recipients_setting, (ViewGroup) null);
            Context contextRequireContext = transferToPalmPayContactFavoriteFragment.requireContext();
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
            gVar.t = CommonViewExtKt.colorInt(L6.b.ppColorPopupWhiteBg, transferToPalmPayContactFavoriteFragment.requireContext());
            gVar.f(G7.q.f3135a);
            gVar.f3076O = transferToPalmPayContactFavoriteFragment.getViewLifecycleOwner();
            Balloon balloonA = gVar.a();
            p002a.a.B(view, balloonA);
            ((TextView) layout.findViewById(p159kd.e.tv_delete)).setOnClickListener(new ViewOnClickListenerC0087i(balloonA, 6, transferToPalmPayContactFavoriteFragment, recipientBeanV2));
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = this.f2692a;
        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToPalmPayContactFavoriteFragment.t().getItem(i7);
        if (recipientBeanV2 == null || (transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) transferToPalmPayContactFavoriteFragment.f27333i) == null) {
            return;
        }
        transferToPalmPayContactViewModel.e(recipientBeanV2.getBusinessType(), recipientBeanV2);
    }
}
