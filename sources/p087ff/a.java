package p087ff;

import com.transsnet.palmpay.credit.bean.WaiverInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f36798a = {new a("PASS_THROUGH", 0), new a(WaiverInfo.TYPE_FULL, 1), new a("SPECIAL", 2), new a("UNBOUNDED_IN", 3), new a("ERROR", 4), new a("NONE", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f36798a.clone();
    }
}
