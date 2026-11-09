package com.transsnet.palmpay.ui.dialog.reward;

import Ac.e;
import Ac.f;
import Bc.w;
import Be.a;
import M1.j;
import Pa.F;
import Pa.r0;
import Qb.c;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.main.export.bean.rsp.ClaimPalmZoneRewardsRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardPrizeItem;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/reward/PalmZoneRewardsDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "debugUi", "Lcom/transsnet/palmpay/main/export/bean/rsp/ClaimPalmZoneRewardsRsp;", "rsp", "updateUi", "(Lcom/transsnet/palmpay/main/export/bean/rsp/ClaimPalmZoneRewardsRsp;)V", "LBe/a;", "mAdapter", "LBe/a;", "LBc/w;", "binding", "LBc/w;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPalmZoneRewardsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PalmZoneRewardsDialog.kt\ncom/transsnet/palmpay/ui/dialog/reward/PalmZoneRewardsDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,247:1\n774#2:248\n865#2,2:249\n*S KotlinDebug\n*F\n+ 1 PalmZoneRewardsDialog.kt\ncom/transsnet/palmpay/ui/dialog/reward/PalmZoneRewardsDialog\n*L\n139#1:248\n139#1:249,2\n*E\n"})
public final class PalmZoneRewardsDialog extends b {

    @Nullable
    private w binding;

    @Nullable
    private a mAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PalmZoneRewardsDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(PalmZoneRewardsDialog palmZoneRewardsDialog, View view) {
        if (!r0.U0() && view.getId() == e.btnConfirm) {
            palmZoneRewardsDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(PalmZoneRewardsDialog palmZoneRewardsDialog, j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        int id2 = view.getId();
        a aVar = palmZoneRewardsDialog.mAdapter;
        HomeRewardPrizeItem homeRewardPrizeItem = aVar != null ? (HomeRewardPrizeItem) aVar.getItem(i7) : null;
        if (id2 == e.btnAction) {
            if (homeRewardPrizeItem != null) {
                if (TextUtils.isEmpty(homeRewardPrizeItem.androidLinkUrl)) {
                    HomeRewardPrizeItem.itemClick(homeRewardPrizeItem.itemType);
                    return;
                } else {
                    ActivityUtils.startActivity(F.a(palmZoneRewardsDialog.getContext(), homeRewardPrizeItem.androidLinkUrl));
                    return;
                }
            }
            return;
        }
        if (id2 == e.tvFailed) {
            String str = (homeRewardPrizeItem == null || homeRewardPrizeItem.itemType != 1) ? "Sorry, prizes fail to arrive. Kindly contact customer service for assistance." : "Sorry, prizes fail to arrive. Please ensure no transaction limit on your account.";
            Context context = palmZoneRewardsDialog.getContext();
            if (context != null) {
                h.z(context, str, null, null, 57);
            }
            palmZoneRewardsDialog.dismiss();
            return;
        }
        if (id2 == e.tvPending) {
            Context context2 = palmZoneRewardsDialog.getContext();
            if (context2 != null) {
                h.z(context2, "Uh-oh! Looks like there's a little glitch with the prize redemption. Please contact Customer Service. ", null, null, 57);
            }
            palmZoneRewardsDialog.dismiss();
        }
    }

    public final void debugUi() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HomeRewardPrizeItem(100, 100L, null, null));
        arrayList.add(new HomeRewardPrizeItem(2, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, "Coupon Name", "Coupon Desc"));
        arrayList.add(new HomeRewardPrizeItem(1, 100L, null, null));
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        WindowManager.LayoutParams attributes;
        WindowManager.LayoutParams attributes2;
        setContentView(f.main_dialog_palmzone_rewards);
        View viewFindViewById = findViewById(e.rootView);
        int i7 = e.btnConfirm;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewFindViewById);
        if (ppButton != null) {
            i7 = e.ivIcon;
            if (((ImageView) p059e1.a.m(i7, viewFindViewById)) != null) {
                i7 = e.prizeList;
                RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewFindViewById);
                if (recyclerView != null) {
                    this.binding = new w((ConstraintLayout) viewFindViewById, ppButton, recyclerView);
                    Window window = getWindow();
                    if (window != null) {
                        window.setGravity(17);
                    }
                    if (window != null && (attributes2 = window.getAttributes()) != null) {
                        attributes2.width = (int) (ScreenUtils.getScreenWidth() * 0.9f);
                    }
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        attributes.height = -2;
                    }
                    A8.b bVar = new A8.b(this, 19);
                    w wVar = this.binding;
                    h.q(bVar, wVar != null ? wVar.f867b : null);
                    a aVar = new a();
                    aVar.a(1, f.main_item_rewards_prize_item_cash);
                    aVar.a(3, f.main_item_rewards_prize_item_cash);
                    aVar.a(2, f.main_item_rewards_prize_item_cash);
                    aVar.a(100, f.main_item_rewards_prize_item_cash);
                    aVar.a(0, f.main_item_rewards_prize_item_cash);
                    aVar.addChildClickViewIds(e.btnAction, e.tvFailed, e.tvPending);
                    this.mAdapter = aVar;
                    w wVar2 = this.binding;
                    if (wVar2 != null) {
                        wVar2.f868c.addItemDecoration(new c(0, 12, 0, 0));
                    }
                    w wVar3 = this.binding;
                    if (wVar3 != null) {
                        wVar3.f868c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    }
                    w wVar4 = this.binding;
                    if (wVar4 != null) {
                        wVar4.f868c.setAdapter(this.mAdapter);
                    }
                    a aVar2 = this.mAdapter;
                    if (aVar2 != null) {
                        aVar2.addChildClickViewIds(e.btnAction, e.tvFailed, e.tvPending);
                    }
                    a aVar3 = this.mAdapter;
                    if (aVar3 != null) {
                        aVar3.setOnItemChildClickListener(new A8.a(this, 16));
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    public final void updateUi(@Nullable ClaimPalmZoneRewardsRsp rsp) {
        ArrayList arrayList;
        if (rsp != null) {
            List<HomeRewardPrizeItem> list = rsp.rewardItemDTOList;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (HomeRewardPrizeItem.isSupportedItemType(((HomeRewardPrizeItem) obj).itemType)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                dismiss();
                return;
            }
            a aVar = this.mAdapter;
            if (aVar != null) {
                aVar.setList(arrayList);
            }
        }
    }
}
