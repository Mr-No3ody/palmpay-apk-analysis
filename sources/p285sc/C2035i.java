package p285sc;

import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.util.TimeUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p236pc.f;

/* JADX INFO: renamed from: sc.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2035i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f42219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReferEarnHomePageActivity f42220b;

    public /* synthetic */ C2035i(long j6, ReferEarnHomePageActivity referEarnHomePageActivity) {
        this.f42219a = j6;
        this.f42220b = referEarnHomePageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long it = (Long) obj;
        int i7 = ReferEarnHomePageActivity.f31872z0;
        Intrinsics.checkNotNullParameter(it, "it");
        return TimeUtils.millis2FitTimeSpanReferEarn(this.f42219a, this.f42220b, f.jp_invite_new_users_expire);
    }
}
