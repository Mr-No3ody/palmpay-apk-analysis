package androidx.camera.camera2.internal;

import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0955u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f13654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.impl.H0 f13656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UseCaseConfig f13657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0993n f13658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13659g;

    public /* synthetic */ RunnableC0955u(J j6, String str, androidx.camera.core.impl.H0 h7, UseCaseConfig useCaseConfig, C0993n c0993n, ArrayList arrayList, int i7) {
        this.f13653a = i7;
        this.f13654b = j6;
        this.f13655c = str;
        this.f13656d = h7;
        this.f13657e = useCaseConfig;
        this.f13658f = c0993n;
        this.f13659g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13653a) {
            case 0:
                J j6 = this.f13654b;
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str = this.f13655c;
                sb2.append(str);
                sb2.append(" UPDATED");
                j6.f(sb2.toString());
                j6.f13175a.j(str, this.f13656d, this.f13657e, this.f13658f, this.f13659g);
                j6.x();
                break;
            default:
                J j10 = this.f13654b;
                StringBuilder sb3 = new StringBuilder("Use case ");
                String str2 = this.f13655c;
                sb3.append(str2);
                sb3.append(" ACTIVE");
                j10.f(sb3.toString());
                LinkedHashMap linkedHashMap = (LinkedHashMap) j10.f13175a.f41079b;
                androidx.camera.core.impl.R0 r3 = (androidx.camera.core.impl.R0) linkedHashMap.get(str2);
                androidx.camera.core.impl.H0 h7 = this.f13656d;
                UseCaseConfig useCaseConfig = this.f13657e;
                C0993n c0993n = this.f13658f;
                ArrayList arrayList = this.f13659g;
                if (r3 == null) {
                    r3 = new androidx.camera.core.impl.R0(h7, useCaseConfig, c0993n, arrayList);
                    linkedHashMap.put(str2, r3);
                }
                r3.f13954f = true;
                j10.f13175a.j(str2, h7, useCaseConfig, c0993n, arrayList);
                j10.x();
                break;
        }
    }
}
