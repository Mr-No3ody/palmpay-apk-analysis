package Pa;

import Wf.AbstractC0780y;
import android.content.Context;
import com.transsnet.adsdk.AdManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7005a;

    static {
        String name = A.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f7005a = name;
    }

    public static final void a() {
        int i7 = 0;
        String str = f7005a;
        try {
            p059e1.a.X("_show_rn_loan_home", false);
            p059e1.a.X("_show_rn_new_loan_home", false);
            p059e1.a.X("_show_new_loan_home", false);
            p059e1.a.X("_loan_use_new_domain", false);
            T.b(-4).submit(new RunnableC0527y(i7));
            AdManager.setUserId(null);
            AdManager.setExtraId(null);
            H.c(BaseApplication.getApplication()).a();
            int i10 = AbstractC0513j.f7096a;
            Context context = BaseApplication.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            new androidx.core.app.M(context.getApplicationContext()).f15943b.cancelAll();
            p367ya.a.d().b();
            p156ka.a userDataSource = BaseApplication.getInstance().getUserDataSource();
            userDataSource.f38720a.clear();
            User user = new User();
            userDataSource.f38720a = user;
            p156ka.a.c(user);
            p059e1.a.W("SET_PATTERN_PASSWORD_DIALOG_FIRST_SHOW_DATE", "");
            p115ha.c cVar = p115ha.b.f37362a;
            cVar.a(0L);
            cVar.f37365c = false;
            cVar.f37367e = 0;
            SPUtils.getInstance().put(com.transsnet.palmpay.core.config.d.i(), "");
            p059e1.a.U(0, "invest_interest_disable");
            n0.g().D(null);
            if (com.flexibank.sdk.k.k()) {
                try {
                    com.flexibank.sdk.k.n();
                } catch (Exception e10) {
                    F6.d.c(str, "Clear FlexiBank session failed", e10);
                }
            }
            Wf.V v3 = Wf.V.f10828a;
            p042cg.f fVar = Wf.I.f10809a;
            AbstractC0780y.m(v3, p042cg.e.f19009c, null, new C0528z(2, null), 2);
            C0521s c0521s = C0521s.f7158a;
            C0521s.b();
        } catch (Exception e11) {
            F6.d.c(str, "doLogoutWork: ", e11);
        }
    }
}
