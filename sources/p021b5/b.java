package p021b5;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f18772a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f18778g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18774c = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f18779h = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18773b = System.currentTimeMillis();

    public b(Activity activity) {
        this.f18772a = activity;
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.f18777f)) {
            return this.f18777f;
        }
        if (!TextUtils.isEmpty(this.f18775d)) {
            String str = "/" + this.f18775d;
            this.f18777f = str;
            return str;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        StringBuilder sb2 = new StringBuilder();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList.get(size);
            sb2.append("/");
            a aVar = (a) bVar;
            sb2.append(!TextUtils.isEmpty(aVar.f18775d) ? aVar.f18775d : aVar.f18772a.getClass().getSimpleName());
        }
        String string = sb2.toString();
        this.f18777f = string;
        return string;
    }
}
