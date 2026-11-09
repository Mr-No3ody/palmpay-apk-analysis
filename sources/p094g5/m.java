package p094g5;

import android.provider.Settings;
import android.text.TextUtils;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import p111h5.c;
import p111h5.d;
import p279s5.j;
import p279s5.k;
import p291t5.b;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f36876A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f36877B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f36878z;

    @Override // p111h5.c
    public final d a() {
        return new n(this);
    }

    @Override // p111h5.c
    public final String b() {
        return "VISIT";
    }

    @Override // p111h5.c
    public final void c() {
        super.c();
        k kVar = j.f42028a;
        kVar.b();
        if (TextUtils.isEmpty(kVar.f42036h)) {
            kVar.f42036h = Settings.System.getString(kVar.f42029a.getContentResolver(), "android_id");
        }
        this.f36878z = kVar.f42036h;
        if (TextUtils.isEmpty(kVar.f42038j)) {
            ModelLoader modelLoaderA = com.growingio.android.sdk.d.a().f23197a.a(b.class);
            kVar.f42038j = (String) (modelLoaderA != null ? modelLoaderA.buildLoadData(null).f41455a.executeData() : null);
        }
        this.f36876A = kVar.f42038j;
        this.f36877B = "";
    }
}
