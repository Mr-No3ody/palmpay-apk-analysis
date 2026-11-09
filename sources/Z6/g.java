package Z6;

import android.content.Context;
import androidx.fragment.app.E;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f11538m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f11540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f11543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f11544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f11546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function2 f11548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function3 f11549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f11550l;

    static {
        new f(null);
    }

    public g(Context context, E fragmentActivity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f11539a = context;
        this.f11540b = fragmentActivity;
        this.f11541c = 1;
        this.f11545g = Integer.MAX_VALUE;
        this.f11546h = Boolean.FALSE;
        this.f11550l = new ArrayList();
    }

    public final i a() {
        int i7 = this.f11541c;
        Function2 function2 = this.f11548j;
        Function3 function3 = this.f11549k;
        ArrayList data = this.f11550l;
        i iVar = new i(this.f11539a, this.f11540b, i7, function2, function3, data);
        iVar.f11557g = this.f11542d;
        iVar.f11558i = this.f11543e;
        iVar.f11559j = this.f11544f;
        iVar.f11560o = this.f11545g;
        iVar.f11561p = this.f11547i;
        iVar.t = this.f11546h;
        Intrinsics.checkNotNullParameter(data, "data");
        return iVar;
    }
}
