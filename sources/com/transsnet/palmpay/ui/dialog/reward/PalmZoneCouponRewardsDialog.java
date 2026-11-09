package com.transsnet.palmpay.ui.dialog.reward;

import A8.a;
import Ac.e;
import Ac.f;
import Ae.j;
import Be.d;
import Pa.F;
import Pa.n0;
import Pa.r0;
import Qb.c;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardPrizeItem;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p220oa.h;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR#\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/reward/PalmZoneCouponRewardsDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardPrizeItem;", "it", "", "clickToUse", "(Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardPrizeItem;)V", "initViews", "()V", "", "list", "updateUi", "(Ljava/util/List;)V", "show", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "ivClose$delegate", "Lkotlin/Lazy;", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "LBe/d;", "mAdapter", "LBe/d;", "cacheItems", "Ljava/util/List;", "Lcom/palmpay/lib/ui/button/PpButton;", "btnConfirm", "Lcom/palmpay/lib/ui/button/PpButton;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmZoneCouponRewardsDialog extends b {

    @Nullable
    private PpButton btnConfirm;

    @Nullable
    private List<? extends HomeRewardPrizeItem> cacheItems;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private d mAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PalmZoneCouponRewardsDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ivClose = C2131j.b(new j(this, 2));
    }

    private final void clickToUse(HomeRewardPrizeItem it) {
        if (TextUtils.isEmpty(it.androidLinkUrl)) {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
        } else {
            ActivityUtils.startActivity(F.a(getContext(), it.androidLinkUrl));
        }
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(PalmZoneCouponRewardsDialog palmZoneCouponRewardsDialog, View view) {
        List<? extends HomeRewardPrizeItem> list;
        HomeRewardPrizeItem homeRewardPrizeItem;
        if (r0.U0()) {
            return;
        }
        int id2 = view.getId();
        if (id2 != e.btnConfirm) {
            if (id2 == e.ivClose) {
                n0.g().l("new_reward_hub_success_pop_back_click");
                palmZoneCouponRewardsDialog.dismiss();
                return;
            }
            return;
        }
        n0.g().l("new_reward_hub_success_pop_button_click");
        List<? extends HomeRewardPrizeItem> list2 = palmZoneCouponRewardsDialog.cacheItems;
        if ((list2 != null ? list2.size() : 0) == 1 && (list = palmZoneCouponRewardsDialog.cacheItems) != null && (homeRewardPrizeItem = list.get(0)) != null) {
            palmZoneCouponRewardsDialog.clickToUse(homeRewardPrizeItem);
        }
        palmZoneCouponRewardsDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(PalmZoneCouponRewardsDialog palmZoneCouponRewardsDialog, M1.j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        int id2 = view.getId();
        d dVar = palmZoneCouponRewardsDialog.mAdapter;
        HomeRewardPrizeItem homeRewardPrizeItem = dVar != null ? (HomeRewardPrizeItem) dVar.getItem(i7) : null;
        if (id2 == e.btnAction) {
            if (homeRewardPrizeItem != null) {
                n0.g().k(new ClickEvent("new_reward_hub_success_pop_other_click").add("reward_value", String.valueOf(homeRewardPrizeItem.nominalValue)).add("button", "Use").add("reward_title", homeRewardPrizeItem.couponName).add(FirebaseAnalytics.Param.ITEM_ID, homeRewardPrizeItem.itemId));
                if (homeRewardPrizeItem.itemType == 2) {
                    palmZoneCouponRewardsDialog.clickToUse(homeRewardPrizeItem);
                    return;
                }
                return;
            }
            return;
        }
        if (id2 == e.tvFailed) {
            String str = (homeRewardPrizeItem == null || homeRewardPrizeItem.itemType != 2) ? "Sorry, prizes fail to arrive. Please ensure no transaction limit on your account." : "Sorry, prizes fail to arrive. Kindly contact customer service for assistance.";
            Context context = palmZoneCouponRewardsDialog.getContext();
            if (context != null) {
                h.z(context, str, null, null, 57);
            }
            palmZoneCouponRewardsDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$0(PalmZoneCouponRewardsDialog palmZoneCouponRewardsDialog) {
        return (ImageView) palmZoneCouponRewardsDialog.findViewById(e.ivClose);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        WindowManager.LayoutParams attributes;
        WindowManager.LayoutParams attributes2;
        setContentView(f.main_dialog_coupon_rewards);
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
        PpButton ppButton = (PpButton) findViewById(e.btnConfirm);
        this.btnConfirm = ppButton;
        h.q(new A8.b(this, 18), ppButton, getIvClose());
        d dVar = new d();
        dVar.a(1, f.main_item_rewards_prize_item_cash);
        dVar.a(3, f.main_item_rewards_prize_item_cash);
        dVar.a(2, f.main_item_rewards_prize_item_cash);
        dVar.a(100, f.main_item_rewards_prize_item_cash);
        dVar.addChildClickViewIds(e.btnAction, e.tvFailed, e.tvPending);
        this.mAdapter = dVar;
        RecyclerView recyclerView = (RecyclerView) findViewById(e.prizeList);
        recyclerView.addItemDecoration(new c(0, 12, 0, 0));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(this.mAdapter);
        d dVar2 = this.mAdapter;
        if (dVar2 != null) {
            dVar2.addChildClickViewIds(e.btnAction, e.tvFailed);
        }
        d dVar3 = this.mAdapter;
        if (dVar3 != null) {
            dVar3.setOnItemChildClickListener(new a(this, 15));
        }
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        n0.g().v("new_reward_hub_success_pop_show");
    }

    public final void updateUi(@Nullable List<? extends HomeRewardPrizeItem> list) {
        this.cacheItems = list;
        List<? extends HomeRewardPrizeItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            dismiss();
            return;
        }
        List<? extends HomeRewardPrizeItem> list3 = this.cacheItems;
        if ((list3 != null ? list3.size() : 0) == 1) {
            PpButton ppButton = this.btnConfirm;
            if (ppButton != null) {
                ppButton.setText(CommonViewExtKt.string(k.core_use, getContext()));
            }
        } else {
            PpButton ppButton2 = this.btnConfirm;
            if (ppButton2 != null) {
                ppButton2.setText(CommonViewExtKt.string(k.core_confirm, getContext()));
            }
        }
        d dVar = this.mAdapter;
        if (dVar != null) {
            dVar.setList(list2);
        }
    }
}
