package Ka;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f4979j;

    static {
        new a(null);
    }

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4970a = context;
    }

    public abstract Intent a();

    public final void b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f4979j = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final void c(Long l5) {
        this.f4975f = l5 != null ? l5.longValue() : 0L;
    }

    public final void d() {
        Intent intentA = a();
        intentA.putExtra("mOrderNo", this.f4971b);
        intentA.putExtra("mTransType", this.f4972c);
        intentA.putExtra("mSubTransType", this.f4973d);
        intentA.putExtra("mOrderType", this.f4974e);
        intentA.putExtra("mOrderAmount", this.f4975f);
        intentA.putExtra("mDisplayOrderAmount", (String) null);
        intentA.putExtra("mCustomerId", (String) null);
        intentA.putExtra("mCalculationExtInfo", this.f4978i);
        intentA.putParcelableArrayListExtra("mExtras", this.f4979j);
        intentA.addFlags(268435456);
        this.f4970a.startActivity(intentA);
    }
}
