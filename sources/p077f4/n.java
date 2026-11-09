package p077f4;

import com.transsnet.palmpay.managemoney.ui.view.c;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.U;
import p355xf.C2131j;
import p355xf.t;
import retrofit2.C1988f;
import retrofit2.M;
import retrofit2.N;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f36398b = new m(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f36399c = C2131j.b(new c(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f36400a;

    public n(String str) {
        M m7 = new M();
        U instance$flexibank_sdk_release = l.f36389b.getInstance$flexibank_sdk_release();
        Objects.requireNonNull(instance$flexibank_sdk_release, "client == null");
        m7.f41879a = instance$flexibank_sdk_release;
        m7.f41882d.add(new C1988f(1));
        m7.a(g.f36387b.create());
        m7.b(str);
        this.f36400a = m7.c();
    }

    public final Object a(Class service) {
        Intrinsics.checkNotNullParameter(service, "service");
        Object objB = this.f36400a.b(service);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return objB;
    }
}
