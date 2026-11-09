package androidx.core.os;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.luck.picture.lib.config.FileSizeUnit;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f16084a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ChecksSdkIntAtLeast(extension = BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS)
    @JvmField
    public static final int f16085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ChecksSdkIntAtLeast(extension = 31)
    @JvmField
    public static final int f16086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ChecksSdkIntAtLeast(extension = 33)
    @JvmField
    public static final int f16087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ChecksSdkIntAtLeast(extension = FileSizeUnit.ACCURATE_MB)
    @JvmField
    public static final int f16088e;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f16085b = i7 >= 30 ? a.f16083a.a(30) : 0;
        f16086c = i7 >= 30 ? a.f16083a.a(31) : 0;
        f16087d = i7 >= 30 ? a.f16083a.a(33) : 0;
        f16088e = i7 >= 30 ? a.f16083a.a(FileSizeUnit.ACCURATE_MB) : 0;
    }

    private b() {
    }

    @JvmStatic
    @RestrictTo({p192n.c.f39800a})
    @VisibleForTesting
    public static final boolean a(@NotNull String codename, @NotNull String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if ("REL".equals(buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @Deprecated(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    public static final boolean b() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            return true;
        }
        if (i7 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("Tiramisu", CODENAME);
    }

    @JvmStatic
    @ChecksSdkIntAtLeast(api = 35, codename = "VanillaIceCream")
    public static final boolean c() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            return true;
        }
        if (i7 < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("VanillaIceCream", CODENAME);
    }
}
