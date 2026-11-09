package Fd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.Transition;
import com.google.android.material.tabs.TabLayout;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.send_money.bean.resp.TransferToPalmPayHomeConfigResp;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends H1.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f2653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayHomeFragment f2654c;

    public D(ImageView imageView, TransferToPalmPayHomeFragment transferToPalmPayHomeFragment) {
        this.f2653b = imageView;
        this.f2654c = transferToPalmPayHomeFragment;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj, Transition transition) {
        TabLayout.Tab tabAt;
        TabLayout.TabView tabView;
        Drawable resource = (Drawable) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        ImageView layout = this.f2653b;
        layout.setImageDrawable(resource);
        TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = this.f2654c;
        Context contextRequireContext = transferToPalmPayHomeFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        G7.g gVar = new G7.g(contextRequireContext);
        Intrinsics.checkNotNullParameter(layout, "layout");
        gVar.f3068G = layout;
        gVar.d(10);
        gVar.i(21);
        gVar.b(G7.b.f3050c);
        gVar.c(G7.c.f3055b);
        gVar.e(4);
        gVar.g(8.0f);
        gVar.h();
        gVar.f3070I = true;
        gVar.f3111x = 12.0f;
        gVar.f3110w = transferToPalmPayHomeFragment.requireContext().getColor(L6.b.ppColorButtonTextWhite);
        gVar.t = transferToPalmPayHomeFragment.requireContext().getColor(L6.b.ppColorPrimary);
        Ab.C block = new Ab.C(transferToPalmPayHomeFragment, 13);
        Intrinsics.checkNotNullParameter(block, "block");
        gVar.f3069H = new G7.u(block);
        gVar.f(G7.q.f3135a);
        gVar.f3076O = transferToPalmPayHomeFragment.getViewLifecycleOwner();
        Balloon balloonA = gVar.a();
        transferToPalmPayHomeFragment.f33815B = balloonA;
        p223od.r rVar = (p223od.r) transferToPalmPayHomeFragment.f27335j;
        if (rVar != null && (tabAt = rVar.f40471A.getTabAt(2)) != null && (tabView = tabAt.view) != null) {
            p002a.a.B(tabView, balloonA);
        }
        TransferToPalmPayHomeConfigResp transferToPalmPayHomeConfigResp = transferToPalmPayHomeFragment.f33814A;
        if (transferToPalmPayHomeConfigResp != null) {
            transferToPalmPayHomeConfigResp.setNoRecipientLocalContactPic("");
        }
        TransferToPalmPayHomeConfigResp transferToPalmPayHomeConfigResp2 = transferToPalmPayHomeFragment.f33814A;
        if (transferToPalmPayHomeConfigResp2 != null) {
            transferToPalmPayHomeConfigResp2.setNoRecipientLocalContactDarkPic("");
        }
    }
}
