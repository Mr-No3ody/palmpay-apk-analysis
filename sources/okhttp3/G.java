package okhttp3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class G {
    public /* synthetic */ G(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int parsePort(String str, int i7, int i10) {
        try {
            int i11 = Integer.parseInt(I.canonicalize$okhttp$default(J.f40577k, str, i7, i10, "", false, false, false, false, null, 248, null));
            if (1 > i11 || i11 >= 65536) {
                return -1;
            }
            return i11;
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int portColonOffset(String str, int i7, int i10) {
        while (i7 < i10) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '[') {
                do {
                    i7++;
                    if (i7 >= i10) {
                        break;
                    }
                } while (str.charAt(i7) != ']');
            } else if (cCharAt == ':') {
                return i7;
            }
            i7++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int schemeDelimiterOffset(String str, int i7, int i10) {
        if (i10 - i7 < 2) {
            return -1;
        }
        char cCharAt = str.charAt(i7);
        if ((Intrinsics.h(cCharAt, 97) >= 0 && Intrinsics.h(cCharAt, 122) <= 0) || (Intrinsics.h(cCharAt, 65) >= 0 && Intrinsics.h(cCharAt, 90) <= 0)) {
            while (true) {
                i7++;
                if (i7 >= i10) {
                    break;
                }
                char cCharAt2 = str.charAt(i7);
                if ('a' > cCharAt2 || cCharAt2 >= '{') {
                    if ('A' > cCharAt2 || cCharAt2 >= '[') {
                        if ('0' > cCharAt2 || cCharAt2 >= ':') {
                            if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                if (cCharAt2 == ':') {
                                    return i7;
                                }
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int slashCount(String str, int i7, int i10) {
        int i11 = 0;
        while (i7 < i10) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\\' && cCharAt != '/') {
                break;
            }
            i11++;
            i7++;
        }
        return i11;
    }

    private G() {
    }
}
