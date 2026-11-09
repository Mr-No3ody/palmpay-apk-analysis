package we;

import Pa.F;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCoupon;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCouponDetailInfo;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsStatisticsExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.RewardsInfo;
import p141j9.C1798f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f43488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1798f f43489c;

    public /* synthetic */ k(View view, C1798f c1798f, int i7) {
        this.f43487a = i7;
        this.f43488b = view;
        this.f43489c = c1798f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        switch (this.f43487a) {
            case 0:
                Object tag = view.getTag();
                HomeRewardsCouponDetailInfo homeRewardsCouponDetailInfo = tag instanceof HomeRewardsCouponDetailInfo ? (HomeRewardsCouponDetailInfo) tag : null;
                if (homeRewardsCouponDetailInfo != null && !TextUtils.isEmpty(homeRewardsCouponDetailInfo.androidUrl)) {
                    Context context = this.f43488b.getContext();
                    if (context != null) {
                        F.g(context, homeRewardsCouponDetailInfo.androidUrl);
                    }
                    HomeRewardsStatisticsExtKt.sendStatisticsEvent(homeRewardsCouponDetailInfo, true);
                    this.f43489c.invoke(new l());
                    break;
                }
                break;
            case 1:
                Object tag2 = view.getTag();
                RewardsInfo rewardsInfo = tag2 instanceof RewardsInfo ? (RewardsInfo) tag2 : null;
                if (rewardsInfo != null && (str = rewardsInfo.androidUrl) != null && str.length() > 0) {
                    Context context2 = this.f43488b.getContext();
                    if (context2 != null) {
                        F.g(context2, rewardsInfo.androidUrl);
                    }
                    this.f43489c.invoke(rewardsInfo);
                    HomeRewardsStatisticsExtKt.sendStatisticsEvent(rewardsInfo, true);
                    break;
                }
                break;
            default:
                Object tag3 = view.getTag();
                HomeRewardsCoupon homeRewardsCoupon = tag3 instanceof HomeRewardsCoupon ? (HomeRewardsCoupon) tag3 : null;
                if (homeRewardsCoupon != null && (str2 = homeRewardsCoupon.androidUrl) != null && str2.length() > 0) {
                    Context context3 = this.f43488b.getContext();
                    if (context3 != null) {
                        F.g(context3, homeRewardsCoupon.androidUrl);
                    }
                    this.f43489c.invoke(homeRewardsCoupon);
                    break;
                }
                break;
        }
    }
}
