package okhttp3;

import com.google.common.net.HttpHeaders;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okhttp3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1942j {
    public /* synthetic */ C1942j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int indexOfElement(String str, String str2, int i7) {
        int length = str.length();
        while (i7 < length) {
            if (StringsKt.B(str2, str.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfElement$default(C1942j c1942j, String str, String str2, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        return c1942j.indexOfElement(str, str2, i7);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0132  */
    /* JADX WARN: Code duplicated, block: B:59:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x013f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0145  */
    /* JADX WARN: Code duplicated, block: B:64:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0155  */
    /* JADX WARN: Code duplicated, block: B:67:0x015d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0163  */
    /* JADX WARN: Code duplicated, block: B:70:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182  */
    /* JADX WARN: Code duplicated, block: B:76:0x018d  */
    /* JADX WARN: Code duplicated, block: B:94:0x00eb A[SYNTHETIC] */
    @JvmStatic
    @NotNull
    public final C1943k parse(@NotNull F f10) {
        int i7;
        int iIndexOfElement;
        boolean z3;
        String string;
        int i10;
        int iIndexOfElement2;
        String string2;
        boolean zEqualsIgnoreCase;
        F headers = f10;
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        boolean z8 = true;
        boolean z10 = true;
        int i11 = 0;
        String str = null;
        boolean z11 = false;
        boolean z12 = false;
        int iZ = -1;
        int iZ2 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int iZ3 = -1;
        int iZ4 = -1;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (i11 < size) {
            String strB = headers.b(i11);
            String strF = headers.f(i11);
            if (kotlin.text.y.h(strB, HttpHeaders.CACHE_CONTROL, z8)) {
                if (str == null) {
                    str = strF;
                }
                i7 = 0;
                while (i7 < strF.length()) {
                    iIndexOfElement = indexOfElement(strF, "=,;", i7);
                    String strSubstring = strF.substring(i7, iIndexOfElement);
                    z3 = z8;
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = StringsKt.V(strSubstring).toString();
                    if (iIndexOfElement != strF.length()) {
                        i10 = size;
                        if (strF.charAt(iIndexOfElement) == ',' && strF.charAt(iIndexOfElement) != ';') {
                            int length = iIndexOfElement + 1;
                            byte[] bArr = Dg.c.f1879a;
                            Intrinsics.checkNotNullParameter(strF, "<this>");
                            int length2 = strF.length();
                            while (true) {
                                if (length >= length2) {
                                    length = strF.length();
                                    break;
                                }
                                char cCharAt = strF.charAt(length);
                                int i12 = length2;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length++;
                                length2 = i12;
                            }
                            if (length >= strF.length() || strF.charAt(length) != '\"') {
                                iIndexOfElement2 = indexOfElement(strF, ",;", length);
                                String strSubstring2 = strF.substring(length, iIndexOfElement2);
                                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = StringsKt.V(strSubstring2).toString();
                            } else {
                                int i13 = length + 1;
                                int iD = StringsKt.D(strF, '\"', i13, 4);
                                string2 = strF.substring(i13, iD);
                                Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                iIndexOfElement2 = iD + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z11 = z8;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z12 = z8;
                        } else {
                            if ("max-age".equalsIgnoreCase(string)) {
                                iZ = Dg.c.z(-1, string2);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                iZ2 = Dg.c.z(-1, string2);
                            } else if ("private".equalsIgnoreCase(string)) {
                                i7 = iIndexOfElement2;
                                z8 = z3;
                                z13 = z8;
                            } else if ("public".equalsIgnoreCase(string)) {
                                i7 = iIndexOfElement2;
                                z8 = z3;
                                z14 = z8;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                i7 = iIndexOfElement2;
                                z8 = z3;
                                z15 = z8;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                iZ3 = Dg.c.z(Integer.MAX_VALUE, string2);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                iZ4 = Dg.c.z(-1, string2);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                i7 = iIndexOfElement2;
                                z8 = z3;
                                z16 = z8;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                i7 = iIndexOfElement2;
                                z8 = z3;
                                z17 = z8;
                            } else {
                                zEqualsIgnoreCase = "immutable".equalsIgnoreCase(string);
                                i7 = iIndexOfElement2;
                                z8 = z3;
                                if (zEqualsIgnoreCase) {
                                    z18 = z8;
                                }
                            }
                            i7 = iIndexOfElement2;
                            z8 = z3;
                        }
                        size = i10;
                    } else {
                        i10 = size;
                    }
                    iIndexOfElement2 = iIndexOfElement + 1;
                    string2 = null;
                    if ("no-cache".equalsIgnoreCase(string)) {
                        i7 = iIndexOfElement2;
                        z8 = z3;
                        z11 = z8;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        i7 = iIndexOfElement2;
                        z8 = z3;
                        z12 = z8;
                    } else {
                        if ("max-age".equalsIgnoreCase(string)) {
                            iZ = Dg.c.z(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iZ2 = Dg.c.z(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z13 = z8;
                        } else if ("public".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z14 = z8;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z15 = z8;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iZ3 = Dg.c.z(Integer.MAX_VALUE, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iZ4 = Dg.c.z(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z16 = z8;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z17 = z8;
                        } else {
                            zEqualsIgnoreCase = "immutable".equalsIgnoreCase(string);
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            if (zEqualsIgnoreCase) {
                                z18 = z8;
                            }
                        }
                        i7 = iIndexOfElement2;
                        z8 = z3;
                    }
                    size = i10;
                }
                i11++;
                headers = f10;
                z8 = z8;
                size = size;
            } else {
                if (kotlin.text.y.h(strB, HttpHeaders.PRAGMA, z8)) {
                }
                i11++;
                headers = f10;
                z8 = z8;
                size = size;
            }
            z10 = false;
            i7 = 0;
            while (i7 < strF.length()) {
                iIndexOfElement = indexOfElement(strF, "=,;", i7);
                String strSubstring3 = strF.substring(i7, iIndexOfElement);
                z3 = z8;
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                string = StringsKt.V(strSubstring3).toString();
                if (iIndexOfElement != strF.length()) {
                    i10 = size;
                    if (strF.charAt(iIndexOfElement) == ',') {
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        i7 = iIndexOfElement2;
                        z8 = z3;
                        z11 = z8;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        i7 = iIndexOfElement2;
                        z8 = z3;
                        z12 = z8;
                    } else {
                        if ("max-age".equalsIgnoreCase(string)) {
                            iZ = Dg.c.z(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iZ2 = Dg.c.z(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z13 = z8;
                        } else if ("public".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z14 = z8;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z15 = z8;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iZ3 = Dg.c.z(Integer.MAX_VALUE, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iZ4 = Dg.c.z(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z16 = z8;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            z17 = z8;
                        } else {
                            zEqualsIgnoreCase = "immutable".equalsIgnoreCase(string);
                            i7 = iIndexOfElement2;
                            z8 = z3;
                            if (zEqualsIgnoreCase) {
                                z18 = z8;
                            }
                        }
                        i7 = iIndexOfElement2;
                        z8 = z3;
                    }
                    size = i10;
                } else {
                    i10 = size;
                }
                iIndexOfElement2 = iIndexOfElement + 1;
                string2 = null;
                if ("no-cache".equalsIgnoreCase(string)) {
                    i7 = iIndexOfElement2;
                    z8 = z3;
                    z11 = z8;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    i7 = iIndexOfElement2;
                    z8 = z3;
                    z12 = z8;
                } else {
                    if ("max-age".equalsIgnoreCase(string)) {
                        iZ = Dg.c.z(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iZ2 = Dg.c.z(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        i7 = iIndexOfElement2;
                        z8 = z3;
                        z13 = z8;
                    } else if ("public".equalsIgnoreCase(string)) {
                        i7 = iIndexOfElement2;
                        z8 = z3;
                        z14 = z8;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        i7 = iIndexOfElement2;
                        z8 = z3;
                        z15 = z8;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iZ3 = Dg.c.z(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iZ4 = Dg.c.z(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        i7 = iIndexOfElement2;
                        z8 = z3;
                        z16 = z8;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        i7 = iIndexOfElement2;
                        z8 = z3;
                        z17 = z8;
                    } else {
                        zEqualsIgnoreCase = "immutable".equalsIgnoreCase(string);
                        i7 = iIndexOfElement2;
                        z8 = z3;
                        if (zEqualsIgnoreCase) {
                            z18 = z8;
                        }
                    }
                    i7 = iIndexOfElement2;
                    z8 = z3;
                }
                size = i10;
            }
            i11++;
            headers = f10;
            z8 = z8;
            size = size;
        }
        return new C1943k(z11, z12, iZ, iZ2, z13, z14, z15, iZ3, iZ4, z16, z17, z18, !z10 ? null : str);
    }

    private C1942j() {
    }
}
