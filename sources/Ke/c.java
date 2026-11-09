package Ke;

import Pa.F;
import Pa.n0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.M;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.main.export.bean.rsp.SlideMenuListRsp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f5430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SlideMenuListRsp.ExtraMenuData f5431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bc.i f5433d;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        SlideMenuListRsp.ExtraMenuData extraMenuData = this.f5431b;
        if (extraMenuData != null) {
            if (TextUtils.isEmpty(extraMenuData.jumpPath)) {
                extraMenuData = null;
            }
            if (extraMenuData != null) {
                n0.g().k(new ClickEvent("MeKycLevel_Click").add("JumpUrl", extraMenuData.jumpPath).add("UserType", String.valueOf(extraMenuData.userType)));
                if (view != null && (context = view.getContext()) != null) {
                    boolean zAreNotificationsEnabled = new M(context).f15943b.areNotificationsEnabled();
                    String jumpPath = extraMenuData.jumpPath;
                    Intrinsics.checkNotNullExpressionValue(jumpPath, "jumpPath");
                    if (StringsKt.A(jumpPath, "NotificationSettings", false) && !zAreNotificationsEnabled) {
                        Oe.d.h(context);
                        return;
                    }
                }
                F.f(extraMenuData.jumpPath, extraMenuData.jumpType, extraMenuData.jumpParams);
            }
        }
    }
}
