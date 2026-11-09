package Uc;

import com.transsnet.palmpay.p2pcash.ui.atm.ReasonForCancellationPage;
import java.util.ArrayList;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class A0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9525e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f9526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f9527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f9528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ReasonForCancellationPage f9529d;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r("reasons", "getReasons()Ljava/util/ArrayList;", A0.class);
        kotlin.jvm.internal.G.f38952a.getClass();
        f9525e = new KProperty[]{rVar, new kotlin.jvm.internal.r("selectReason", "getSelectReason()Ljava/lang/String;", A0.class), new kotlin.jvm.internal.r("editReason", "getEditReason()Ljava/lang/String;", A0.class)};
    }

    public A0(ReasonForCancellationPage reasonForCancellationPage) {
        this.f9529d = reasonForCancellationPage;
        this.f9526a = new z0(new ArrayList(), reasonForCancellationPage);
        this.f9527b = new z0(reasonForCancellationPage, 1);
        this.f9528c = new z0(reasonForCancellationPage, 2);
    }

    public final String a() {
        return (String) this.f9527b.getValue(this, f9525e[1]);
    }
}
