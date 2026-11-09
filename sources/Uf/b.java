package Uf;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final c fromByteArray(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length == 16) {
            return fromLongs(J3.a.q(0, byteArray), J3.a.q(8, byteArray));
        }
        throw new IllegalArgumentException(("Expected exactly 16 bytes, but was " + C1847n.v(byteArray, null, null, 49) + " of size " + byteArray.length).toString());
    }

    @NotNull
    public final c fromLongs(long j6, long j10) {
        return (j6 == 0 && j10 == 0) ? getNIL() : new c(j6, j10);
    }

    @SinceKotlin(version = "2.1")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: fromUByteArray-GBYM_sE, reason: not valid java name */
    public final c m62fromUByteArrayGBYM_sE(@NotNull byte[] ubyteArray) {
        Intrinsics.checkNotNullParameter(ubyteArray, "ubyteArray");
        return fromByteArray(ubyteArray);
    }

    @NotNull
    /* JADX INFO: renamed from: fromULongs-eb3DHEI, reason: not valid java name */
    public final c m63fromULongseb3DHEI(long j6, long j10) {
        return fromLongs(j6, j10);
    }

    @NotNull
    public final Comparator<c> getLEXICAL_ORDER() {
        Bf.b bVar = Bf.b.f906a;
        Intrinsics.f(bVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return bVar;
    }

    @NotNull
    public final c getNIL() {
        return c.f9767d;
    }

    @NotNull
    public final c parse(@NotNull String uuidString) {
        Intrinsics.checkNotNullParameter(uuidString, "uuidString");
        int length = uuidString.length();
        if (length == 32) {
            return J3.a.U(uuidString);
        }
        if (length == 36) {
            return J3.a.V(uuidString);
        }
        throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + J3.a.b(uuidString) + "\" of length " + uuidString.length());
    }

    @NotNull
    public final c parseHex(@NotNull String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        if (hexString.length() == 32) {
            return J3.a.U(hexString);
        }
        throw new IllegalArgumentException(("Expected a 32-char hexadecimal string, but was \"" + J3.a.b(hexString) + "\" of length " + hexString.length()).toString());
    }

    @SinceKotlin(version = "2.1")
    @NotNull
    public final c parseHexDash(@NotNull String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        if (hexDashString.length() == 36) {
            return J3.a.V(hexDashString);
        }
        throw new IllegalArgumentException(("Expected a 36-char string in the standard hex-and-dash UUID format, but was \"" + J3.a.b(hexDashString) + "\" of length " + hexDashString.length()).toString());
    }

    @NotNull
    public final c random() {
        byte[] randomBytes = new byte[16];
        a.f9765a.nextBytes(randomBytes);
        Intrinsics.checkNotNullParameter(randomBytes, "randomBytes");
        byte b7 = (byte) (randomBytes[6] & Ascii.SI);
        randomBytes[6] = b7;
        randomBytes[6] = (byte) (b7 | SignedBytes.MAX_POWER_OF_TWO);
        byte b10 = (byte) (randomBytes[8] & 63);
        randomBytes[8] = b10;
        randomBytes[8] = (byte) (b10 | UnsignedBytes.MAX_POWER_OF_TWO);
        return c.f9766c.fromByteArray(randomBytes);
    }

    private b() {
    }

    @Deprecated(message = "Use naturalOrder<Uuid>() instead", replaceWith = @ReplaceWith(expression = "naturalOrder<Uuid>()", imports = {"kotlin.comparisons.naturalOrder"}))
    @DeprecatedSinceKotlin(warningSince = "2.1")
    public static /* synthetic */ void getLEXICAL_ORDER$annotations() {
    }
}
