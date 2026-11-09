package retrofit2;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Converter f41971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f41972g;

    public x(String str, Converter converter, boolean z3, int i7) {
        this.f41969d = i7;
        switch (i7) {
            case 1:
                Objects.requireNonNull(str, "name == null");
                this.f41970e = str;
                this.f41971f = converter;
                this.f41972g = z3;
                break;
            case 2:
                Objects.requireNonNull(str, "name == null");
                this.f41970e = str;
                this.f41971f = converter;
                this.f41972g = z3;
                break;
            default:
                Objects.requireNonNull(str, "name == null");
                this.f41970e = str;
                this.f41971f = converter;
                this.f41972g = z3;
                break;
        }
    }

    @Override // retrofit2.U
    public final void a(H h7, Object obj) {
        String str;
        String str2;
        String str3;
        switch (this.f41969d) {
            case 0:
                if (obj != null && (str = (String) this.f41971f.convert(obj)) != null) {
                    h7.a(this.f41970e, str, this.f41972g);
                }
                break;
            case 1:
                if (obj != null && (str2 = (String) this.f41971f.convert(obj)) != null) {
                    h7.b(this.f41970e, str2, this.f41972g);
                }
                break;
            default:
                if (obj != null && (str3 = (String) this.f41971f.convert(obj)) != null) {
                    h7.c(this.f41970e, str3, this.f41972g);
                }
                break;
        }
    }
}
