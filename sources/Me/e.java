package Me;

import Bc.C0107d;
import C0.G;
import Fe.I;
import Pa.F;
import Pa.n0;
import Pa.r0;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.main.export.bean.rsp.HomeTaskCenterRsp;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.util.ActivityUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f5962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0107d f5963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f5964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HomeTaskCenterRsp f5965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f5966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f5967f;

    static {
        new d(null);
    }

    public static boolean a(HomeTaskCenterRsp homeTaskCenterRsp) {
        Integer num;
        Integer num2;
        String str;
        return (homeTaskCenterRsp == null || (num = homeTaskCenterRsp.templateType) == null || num.intValue() != 1 || (num2 = homeTaskCenterRsp.taskFlag) == null || num2.intValue() != 3 || (str = homeTaskCenterRsp.templateConfig) == null || str.length() == 0) ? false : true;
    }

    public final void b() {
        HomeFragmentHomeTab homeFragmentHomeTab;
        I i7;
        WeakReference weakReference = this.f5964c;
        if (weakReference == null || (homeFragmentHomeTab = (HomeFragmentHomeTab) weakReference.get()) == null || (i7 = (I) homeFragmentHomeTab.f27328i) == null) {
            return;
        }
        i7.f2737e = true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HomeTaskCenterRsp homeTaskCenterRsp;
        String str;
        String str2;
        Integer num;
        HomeFragmentHomeTab homeFragmentHomeTab;
        Integer num2;
        String str3;
        if (r0.U0()) {
            return;
        }
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        C0107d c0107d = this.f5963b;
        boolean zC = Intrinsics.c(numValueOf, c0107d != null ? Integer.valueOf(((AppCompatImageView) c0107d.f682d).getId()) : null);
        View view2 = this.f5962a;
        if (!zC) {
            if (!Intrinsics.c(numValueOf, c0107d != null ? Integer.valueOf(c0107d.f683e.getId()) : null) || (homeTaskCenterRsp = this.f5965d) == null || (str = homeTaskCenterRsp.subButtonAndroidUrl) == null) {
                return;
            }
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                b();
                ActivityUtils.startActivity(F.a(view2 != null ? view2.getContext() : null, str));
                n0 n0VarG = n0.g();
                ClickEvent clickEvent = (ClickEvent) G.f("Home_TaskCenter_SubButtonClick", "Type", "Jump");
                HomeTaskCenterRsp homeTaskCenterRsp2 = this.f5965d;
                str2 = homeTaskCenterRsp2 != null ? homeTaskCenterRsp2.subButtonAndroidUrl : null;
                n0VarG.k(clickEvent.add(FirebaseAnalytics.Param.CONTENT, str2 != null ? str2 : ""));
                return;
            }
            return;
        }
        if (a(this.f5965d)) {
            return;
        }
        HomeTaskCenterRsp homeTaskCenterRsp3 = this.f5965d;
        if (homeTaskCenterRsp3 != null && (num2 = homeTaskCenterRsp3.taskFlag) != null && num2.intValue() == 1) {
            HomeTaskCenterRsp homeTaskCenterRsp4 = this.f5965d;
            if (homeTaskCenterRsp4 != null && (str3 = homeTaskCenterRsp4.androidUrl) != null) {
                if (str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 != null) {
                    b();
                    ActivityUtils.startActivity(F.a(view2 != null ? view2.getContext() : null, str3));
                }
            }
            n0 n0VarG2 = n0.g();
            ClickEvent clickEvent2 = (ClickEvent) G.f("Home_TaskCenter_Click", "Type", "Jump");
            HomeTaskCenterRsp homeTaskCenterRsp5 = this.f5965d;
            str2 = homeTaskCenterRsp5 != null ? homeTaskCenterRsp5.androidUrl : null;
            n0VarG2.k(clickEvent2.add(FirebaseAnalytics.Param.CONTENT, str2 != null ? str2 : ""));
            return;
        }
        HomeTaskCenterRsp homeTaskCenterRsp6 = this.f5965d;
        if (homeTaskCenterRsp6 == null || (num = homeTaskCenterRsp6.taskFlag) == null || num.intValue() != 2) {
            return;
        }
        b();
        WeakReference weakReference = this.f5964c;
        if (weakReference != null && (homeFragmentHomeTab = (HomeFragmentHomeTab) weakReference.get()) != null) {
            HomeTaskCenterRsp homeTaskCenterRsp7 = this.f5965d;
            String taskSceneType = homeTaskCenterRsp7 != null ? homeTaskCenterRsp7.taskSceneType : null;
            if (taskSceneType == null) {
                taskSceneType = "";
            }
            Intrinsics.checkNotNullParameter(taskSceneType, "taskSceneType");
            I i7 = (I) homeFragmentHomeTab.f27328i;
            if (i7 != null) {
                i7.claimTaskCenterReward(taskSceneType);
            }
        }
        n0 n0VarG3 = n0.g();
        ClickEvent clickEvent3 = (ClickEvent) G.f("Home_TaskCenter_Click", "Type", "Claim");
        HomeTaskCenterRsp homeTaskCenterRsp8 = this.f5965d;
        str2 = homeTaskCenterRsp8 != null ? homeTaskCenterRsp8.taskSceneType : null;
        n0VarG3.k(clickEvent3.add(FirebaseAnalytics.Param.CONTENT, str2 != null ? str2 : ""));
    }
}
