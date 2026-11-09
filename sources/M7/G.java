package M7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f5785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f5786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f5787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f5788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G f5789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ G[] f5790f;

    static {
        G g7 = new G("LEFT", 0);
        f5785a = g7;
        G g10 = new G("CENTER", 1);
        f5786b = g10;
        G g11 = new G("RIGHT", 2);
        f5787c = g11;
        G g12 = new G("BACK", 3);
        f5788d = g12;
        G g13 = new G("SEARCH_BAR", 4);
        f5789e = g13;
        G[] gArr = {g7, g10, g11, g12, g13};
        f5790f = gArr;
        com.facebook.imagepipeline.nativecode.b.n(gArr);
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f5790f.clone();
    }
}
