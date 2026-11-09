package p267r9;

import android.app.Application;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f41646e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f41647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f41648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f41649c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f41650d = new ThreadLocal();

    public c(Application application, Function2 function2) {
        this.f41647a = application;
        this.f41648b = function2;
    }
}
