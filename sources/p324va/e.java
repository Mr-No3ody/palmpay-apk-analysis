package p324va;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Objects;
import okhttp3.U;
import retrofit2.C1988f;
import retrofit2.M;
import retrofit2.N;
import retrofit2.converter.gson.a;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile e f43143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f43144c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f43145a;

    public e() {
        M m7 = new M();
        U u6 = (U) d.f43142a.f18580b;
        Objects.requireNonNull(u6, "client == null");
        m7.f41879a = u6;
        Gson gsonCreate = new GsonBuilder().addSerializationExclusionStrategy(new p077f4.e(3)).addDeserializationExclusionStrategy(new p077f4.e(2)).disableHtmlEscaping().create();
        if (gsonCreate == null) {
            throw new NullPointerException("gson == null");
        }
        m7.a(new a(gsonCreate, 1));
        m7.f41882d.add(new C1988f(1));
        m7.b("https://ng-m.palmpay.app");
        this.f43145a = m7.c();
    }

    public static e a() {
        e eVar;
        e eVar2 = f43143b;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (f43144c) {
            try {
                if (f43143b == null) {
                    f43143b = new e();
                }
                eVar = f43143b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
