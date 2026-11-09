package ph;

import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41320c;

    public /* synthetic */ c(Object obj, int i7, int i10) {
        this.f41318a = i10;
        this.f41320c = obj;
        this.f41319b = i7;
    }

    @Override // ph.b
    public final InputStream a() {
        switch (this.f41318a) {
            case 0:
                return top.zibin.luban.io.a.f().n(((File) this.f41320c).getAbsolutePath());
            default:
                return top.zibin.luban.io.a.f().n((String) this.f41320c);
        }
    }

    @Override // top.zibin.luban.InputStreamProvider
    public final int getIndex() {
        switch (this.f41318a) {
            case 0:
                break;
        }
        return this.f41319b;
    }

    @Override // top.zibin.luban.InputStreamProvider
    public final String getPath() {
        switch (this.f41318a) {
            case 0:
                return ((File) this.f41320c).getAbsolutePath();
            default:
                return (String) this.f41320c;
        }
    }
}
