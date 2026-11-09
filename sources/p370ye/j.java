package p370ye;

import Ac.f;
import Fe.I;
import android.view.View;
import android.view.ViewGroup;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseViewHolder;
import com.transsnet.adsdk.widgets.banner.bannerview.utils.BannerUtils;
import com.transsnet.palmpay.main.export.bean.req.ClaimRewardReq;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterInfo;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCouponCombo;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsStatisticsExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.RewardsInfo;
import com.transsnet.palmpay.ui.adapter.rewards.RewardsBannerAdapterHolder;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p141j9.C1798f;
import p185ma.e;
import we.i;
import we.m;
import we.n;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends BaseBannerAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f44332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44333b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44334c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44335d = 21;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44336e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44337f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f44338g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1798f f44339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f44340j;

    public j(WeakReference weakReference) {
        HomeFragmentHomeTab homeFragmentHomeTab;
        this.f44332a = weakReference;
        this.f44338g = (weakReference == null || (homeFragmentHomeTab = (HomeFragmentHomeTab) weakReference.get()) == null) ? false : homeFragmentHomeTab.m();
        this.f44339i = new C1798f(this, 27);
        this.f44340j = new e(this, 18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public final void bindData(BaseViewHolder baseViewHolder, Object obj, int i7, int i10) {
        HomeRewardsCenterInfo homeRewardsCenterInfo = (HomeRewardsCenterInfo) obj;
        if (baseViewHolder instanceof RewardsBannerAdapterHolder) {
            RewardsBannerAdapterHolder rewardsBannerAdapterHolder = (RewardsBannerAdapterHolder) baseViewHolder;
            if (homeRewardsCenterInfo == null) {
                homeRewardsCenterInfo = new HomeRewardsCenterInfo();
            }
            rewardsBannerAdapterHolder.bindRewardsCenterData(homeRewardsCenterInfo, this.f44340j);
        }
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public final BaseViewHolder createViewHolder(ViewGroup parent, View itemView, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        int i10 = this.f44335d;
        C1798f c1798f = this.f44339i;
        boolean z3 = this.f44338g;
        if (i7 == i10) {
            return new m(itemView, z3, c1798f);
        }
        if (i7 == this.f44334c) {
            return new we.j(itemView, z3);
        }
        if (i7 == this.f44333b) {
            return new n(itemView, c1798f, 1);
        }
        if (i7 == this.f44337f) {
            return new n(itemView, c1798f, 0);
        }
        return i7 == this.f44336e ? new i(itemView, z3) : new i(itemView, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i7) {
        List<T> list = this.mList;
        return BannerUtils.getRealPosition(i7, list != 0 ? list.size() : 0);
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public final int getLayoutId(int i7) {
        if (i7 == this.f44335d) {
            return f.main_home_page_rewards_coupon_combo_used_item;
        }
        if (i7 == this.f44334c) {
            return f.main_home_page_rewards_coupon_combo_claim_item;
        }
        if (i7 == this.f44333b) {
            return f.main_home_page_rewards_single_coupon_item;
        }
        if (i7 == this.f44337f) {
            return f.main_home_page_rewards_marketing_coupon_item;
        }
        return i7 == this.f44336e ? f.main_home_page_rewards_common_item : f.main_home_page_rewards_common_item;
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public final int getViewType(int i7) {
        List<T> list;
        HomeRewardsCenterInfo homeRewardsCenterInfo;
        RewardsInfo oldDto;
        Integer num;
        HomeRewardsCenterInfo homeRewardsCenterInfo2;
        HomeRewardsCouponCombo couponCombo;
        HomeRewardsCenterInfo homeRewardsCenterInfo3;
        List<T> list2 = this.mList;
        int realPosition = BannerUtils.getRealPosition(i7, list2 != 0 ? list2.size() : 0);
        List<T> list3 = this.mList;
        String str = null;
        Integer showType = (list3 == 0 || (homeRewardsCenterInfo3 = (HomeRewardsCenterInfo) list3.get(realPosition)) == null) ? null : homeRewardsCenterInfo3.getShowType();
        if (showType != null && showType.intValue() == 1) {
            return this.f44333b;
        }
        if (showType == null || showType.intValue() != 2) {
            return (showType == null || showType.intValue() != 4 || (list = this.mList) == 0 || (homeRewardsCenterInfo = (HomeRewardsCenterInfo) list.get(realPosition)) == null || (oldDto = homeRewardsCenterInfo.getOldDto()) == null || (num = oldDto.contentType) == null || num.intValue() != 1) ? this.f44336e : this.f44337f;
        }
        List<T> list4 = this.mList;
        if (list4 != 0 && (homeRewardsCenterInfo2 = (HomeRewardsCenterInfo) list4.get(realPosition)) != null && (couponCombo = homeRewardsCenterInfo2.getCouponCombo()) != null) {
            str = couponCombo.status;
        }
        return "unUse".equalsIgnoreCase(str) ? this.f44335d : this.f44334c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HomeFragmentHomeTab homeFragmentHomeTab;
        if (view != null) {
            View view2 = view.getTag() instanceof HomeRewardsClaimClickEvent ? view : null;
            if (view2 != null) {
                Object tag = view2.getTag();
                Intrinsics.f(tag, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent");
                HomeRewardsClaimClickEvent homeRewardsClaimClickEvent = (HomeRewardsClaimClickEvent) tag;
                if (view instanceof PpButton) {
                    ((PpButton) view).b(true);
                }
                WeakReference weakReference = this.f44332a;
                if (weakReference != null && (homeFragmentHomeTab = (HomeFragmentHomeTab) weakReference.get()) != null) {
                    ClaimRewardReq claimRewardReq = new ClaimRewardReq();
                    claimRewardReq.activityId = homeRewardsClaimClickEvent.getActivityId();
                    claimRewardReq.couponCode = homeRewardsClaimClickEvent.getCouponCode();
                    claimRewardReq.contentType = homeRewardsClaimClickEvent.getContentType();
                    claimRewardReq.bizIdList = homeRewardsClaimClickEvent.takeBizIdList();
                    I i7 = (I) homeFragmentHomeTab.f27328i;
                    if (i7 != null) {
                        i7.claimRewardsCenterReward(claimRewardReq);
                    }
                }
                HomeRewardsStatisticsExtKt.sendStatisticsEvent(homeRewardsClaimClickEvent);
            }
        }
    }
}
