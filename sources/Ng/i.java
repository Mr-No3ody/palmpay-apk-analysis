package Ng;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okhttp3.F;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i {
    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f A[PHI: r7 r9
      0x008f: PHI (r7v7 java.lang.Integer) = (r7v5 java.lang.Integer), (r7v5 java.lang.Integer), (r7v9 java.lang.Integer) binds: [B:47:0x00c0, B:44:0x00b7, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r9v10 java.lang.Integer) = (r9v5 java.lang.Integer), (r9v7 java.lang.Integer), (r9v5 java.lang.Integer) binds: [B:47:0x00c0, B:44:0x00b7, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    @NotNull
    public final j parse(@NotNull F responseHeaders) throws IOException {
        String strK;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        int size = responseHeaders.size();
        int i7 = 0;
        int i10 = 0;
        boolean z3 = false;
        boolean z8 = false;
        boolean z10 = false;
        boolean z11 = false;
        Integer intOrNull = null;
        Integer intOrNull2 = null;
        while (i10 < size) {
            if (y.h(responseHeaders.b(i10), HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, true)) {
                String strF = responseHeaders.f(i10);
                int i11 = i7;
                while (i11 < strF.length()) {
                    int iG = Dg.c.g(strF, ',', i11, i7, 4);
                    char c6 = ';';
                    int iF = Dg.c.f(strF, ';', i11, iG);
                    String strA = Dg.c.A(i11, iF, strF);
                    int i12 = iF + 1;
                    if (y.h(strA, "permessage-deflate", true)) {
                        if (z3) {
                            z11 = true;
                        }
                        i11 = i12;
                        while (i11 < iG) {
                            int iF2 = Dg.c.f(strF, c6, i11, iG);
                            int iF3 = Dg.c.f(strF, '=', i11, iF2);
                            String strA2 = Dg.c.A(i11, iF3, strF);
                            if (iF3 < iF2) {
                                String strA3 = Dg.c.A(iF3 + 1, iF2, strF);
                                Intrinsics.checkNotNullParameter(strA3, "<this>");
                                Intrinsics.checkNotNullParameter("\"", "delimiter");
                                strK = StringsKt.K(strA3, "\"", "\"");
                            } else {
                                strK = null;
                            }
                            i11 = iF2 + 1;
                            if (y.h(strA2, "client_max_window_bits", true)) {
                                if (intOrNull != null) {
                                    z11 = true;
                                }
                                intOrNull = strK != null ? StringsKt.toIntOrNull(strK) : null;
                                if (intOrNull == null) {
                                    z11 = true;
                                }
                            } else if (y.h(strA2, "client_no_context_takeover", true)) {
                                if (z8) {
                                    z11 = true;
                                }
                                if (strK != null) {
                                    z11 = true;
                                }
                                z8 = true;
                            } else if (y.h(strA2, "server_max_window_bits", true)) {
                                if (intOrNull2 != null) {
                                    z11 = true;
                                }
                                intOrNull2 = strK != null ? StringsKt.toIntOrNull(strK) : null;
                                if (intOrNull2 == null) {
                                    z11 = true;
                                }
                            } else if (y.h(strA2, "server_no_context_takeover", true)) {
                                if (z10) {
                                    z11 = true;
                                }
                                if (strK != null) {
                                    z11 = true;
                                }
                                z10 = true;
                            } else {
                                z11 = true;
                            }
                            c6 = ';';
                        }
                        z3 = true;
                    } else {
                        i11 = i12;
                        z11 = true;
                    }
                    i7 = 0;
                }
            }
            i10++;
            i7 = 0;
        }
        return new j(z3, intOrNull, z8, intOrNull2, z10, z11);
    }

    private i() {
    }
}
