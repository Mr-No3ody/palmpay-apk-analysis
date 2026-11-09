package we;

import Pa.F;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsStatisticsExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.RewardsInfo;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f43458b;

    public /* synthetic */ d(View view, int i7) {
        this.f43457a = i7;
        this.f43458b = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        switch (this.f43457a) {
            case 0:
                Object tag = view.getTag();
                PalmZoneTaskBean palmZoneTaskBean = tag instanceof PalmZoneTaskBean ? (PalmZoneTaskBean) tag : null;
                if (palmZoneTaskBean != null && (context = this.f43458b.getContext()) != null) {
                    if (TextUtils.isEmpty(palmZoneTaskBean.taskJumpParam)) {
                        ActivityUtils.startActivity(F.a(context, palmZoneTaskBean.taskJumpPath));
                    } else {
                        F.f(palmZoneTaskBean.taskJumpPath, palmZoneTaskBean.taskJumpType, palmZoneTaskBean.taskJumpParam);
                    }
                    HomeRewardsStatisticsExtKt.sendStatisticsEvent(palmZoneTaskBean, true);
                    break;
                }
                break;
            case 1:
                Object tag2 = view.getTag();
                RewardsInfo rewardsInfo = tag2 instanceof RewardsInfo ? (RewardsInfo) tag2 : null;
                if (rewardsInfo != null && !TextUtils.isEmpty(rewardsInfo.androidUrl)) {
                    Context context2 = this.f43458b.getContext();
                    if (context2 != null) {
                        F.g(context2, rewardsInfo.androidUrl);
                    }
                    HomeRewardsStatisticsExtKt.sendStatisticsEvent(rewardsInfo, true);
                    break;
                }
                break;
            default:
                Object tag3 = view.getTag();
                RewardsInfo rewardsInfo2 = tag3 instanceof RewardsInfo ? (RewardsInfo) tag3 : null;
                if (rewardsInfo2 != null && !TextUtils.isEmpty(rewardsInfo2.contentAndroidUrl)) {
                    Context context3 = this.f43458b.getContext();
                    if (context3 != null) {
                        F.g(context3, rewardsInfo2.contentAndroidUrl);
                    }
                    HomeRewardsStatisticsExtKt.sendStatisticsEvent(rewardsInfo2, true);
                    break;
                }
                break;
        }
    }
}
