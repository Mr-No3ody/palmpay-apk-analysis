package cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g;

import C0.G;
import android.content.Context;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gqgg9q99qg9 {
    private boolean gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private Set f19097q999ggg99999qqggqqg9qg;
    private qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99;
    private boolean qgqq999g;
    private qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    static {
        q999ggg99999qqggqqg9qg("294d43", 115);
    }

    public gqgg9q99qg9() {
        this(new gqg99q9q9q(), new q999ggg99999qqggqqg9qg());
    }

    private static File q999ggg99999qqggqqg9qg(Context context) {
        return context.getDir(q999ggg99999qqggqqg9qg("292826", 22), 0);
    }

    private File qgq9qg99(Context context, String str, String str2) {
        String strQqggggg9g9q99q9gq = this.qgq9qg99.qqggggg9g9q99q9gq(str);
        return q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(str2) ? new File(q999ggg99999qqggqqg9qg(context), strQqggggg9g9q99q9gq) : new File(q999ggg99999qqggqqg9qg(context), G.r(u.s(strQqggggg9g9q99q9gq), q999ggg99999qqggqqg9qg("6b", 24), str2));
    }

    private void qqggggg9g9q99q9gq(Context context, String str, String str2) {
        File fileQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(context);
        File fileQgq9qg99 = qgq9qg99(context, str, str2);
        File[] fileArrListFiles = fileQ999ggg99999qqggqqg9qg.listFiles(new qg9gqgqqggg9q9qg(this, this.qgq9qg99.qqggggg9g9q99q9gq(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.getAbsolutePath().equals(fileQgq9qg99.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    private gqgg9q99qg9(gqg99q9q9q gqg99q9q9qVar, q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar) {
        this.f19097q999ggg99999qqggqqg9qg = new HashSet();
        this.qgq9qg99 = gqg99q9q9qVar;
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 59);
            byte b10 = (byte) (bArr[0] ^ 69);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5 A[Catch: Exception -> 0x00ff, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ff, blocks: (B:34:0x00dd, B:37:0x00e5), top: B:49:0x00dd }] */
    public void q999ggg99999qqggqqg9qg(Context context, String str, String str2) {
        gqgg9q99qg9 gqgg9q99qg9Var;
        if (this.f19097q999ggg99999qqggqqg9qg.contains(str)) {
            return;
        }
        try {
            this.qgq9qg99.q999ggg99999qqggqqg9qg(str);
            this.f19097q999ggg99999qqggqqg9qg.add(str);
        } catch (Throwable th) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qq9gg99gqqqgqgq999gqg;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar, th.getLocalizedMessage());
            if (context == null) {
                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar, q999ggg99999qqggqqg9qg("0256676b73363b7479626965742c31622b36636178", 67));
                return;
            }
            File fileQgq9qg99 = qgq9qg99(context, str, str2);
            try {
                if (!fileQgq9qg99.exists()) {
                    qqggggg9g9q99q9gq(context, str, str2);
                    this.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(context, this.qgq9qg99.q999ggg99999qqggqqg9qg(), this.qgq9qg99.qqggggg9g9q99q9gq(str), fileQgq9qg99);
                }
                this.qgq9qg99.qgq9qg99(fileQgq9qg99.getAbsolutePath());
                this.f19097q999ggg99999qqggqqg9qg.add(str);
                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar);
            } catch (Throwable th2) {
                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar2 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qq9gg9q;
                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar2, th2.getLocalizedMessage());
                if (th2 instanceof UnsatisfiedLinkError) {
                    String message = th2.getMessage();
                    if (!q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(message)) {
                        boolean zEndsWith = message.endsWith(q999ggg99999qqggqqg9qg("2c622b6e7a613773652c317f657f697c7d3c37713e6b7967377365", 67));
                        boolean zEndsWith2 = message.endsWith(q999ggg99999qqggqqg9qg("2c622b6b79673773652c317f657f697c7d3c37713e6e7a61377365", 67));
                        if (zEndsWith || zEndsWith2) {
                            try {
                                qqggggg9g9q99q9gq(context, str, str2);
                                String[] strArr = {q999ggg99999qqggqqg9qg("246a66717d7a723d22382f", 66), q999ggg99999qqggqqg9qg("24434f5854535b", 107)};
                                String[] strArr2 = {q999ggg99999qqggqqg9qg("2424286c352e6c796e", 12)};
                                qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
                                if (!zEndsWith) {
                                    strArr = strArr2;
                                }
                                q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(context, strArr, this.qgq9qg99.qqggggg9g9q99q9gq(str), fileQgq9qg99);
                                this.qgq9qg99.qgq9qg99(fileQgq9qg99.getAbsolutePath());
                                this.f19097q999ggg99999qqggqqg9qg.add(str);
                                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar2);
                            } catch (Throwable unused) {
                                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qq9gg9q, th2.getLocalizedMessage());
                                if (fileQgq9qg99.exists()) {
                                    gqgg9q99qg9Var = this;
                                } else {
                                    qqggggg9g9q99q9gq(context, str, str2);
                                    gqgg9q99qg9Var = this;
                                    try {
                                        this.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(context, this.qgq9qg99.q999ggg99999qqggqqg9qg(), this.qgq9qg99.qqggggg9g9q99q9gq(str), fileQgq9qg99, gqgg9q99qg9Var);
                                    } catch (Exception e10) {
                                        e = e10;
                                        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.gqgqgq9qqqg999qggqqqg, e.getLocalizedMessage());
                                        gqgg9q99qg9Var.qgq9qg99.qgq9qg99(fileQgq9qg99.getAbsolutePath());
                                        gqgg9q99qg9Var.f19097q999ggg99999qqggqqg9qg.add(str);
                                    }
                                }
                                gqgg9q99qg9Var.qgq9qg99.qgq9qg99(fileQgq9qg99.getAbsolutePath());
                                gqgg9q99qg9Var.f19097q999ggg99999qqggqqg9qg.add(str);
                            }
                        }
                    }
                }
                try {
                    if (fileQgq9qg99.exists()) {
                        gqgg9q99qg9Var = this;
                    } else {
                        qqggggg9g9q99q9gq(context, str, str2);
                        gqgg9q99qg9Var = this;
                        this.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(context, this.qgq9qg99.q999ggg99999qqggqqg9qg(), this.qgq9qg99.qqggggg9g9q99q9gq(str), fileQgq9qg99, gqgg9q99qg9Var);
                    }
                } catch (Exception e11) {
                    e = e11;
                    gqgg9q99qg9Var = this;
                }
                try {
                    gqgg9q99qg9Var.qgq9qg99.qgq9qg99(fileQgq9qg99.getAbsolutePath());
                    gqgg9q99qg9Var.f19097q999ggg99999qqggqqg9qg.add(str);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void q999ggg99999qqggqqg9qg(Context context, String str, String str2, qqggggg9g9q99q9gq.InterfaceC0011qqggggg9g9q99q9gq interfaceC0011qqggggg9g9q99q9gq) {
        if (q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(str)) {
            throw new IllegalArgumentException(q999ggg99999qqggqqg9qg("0260515d4500024b455e5d5d451707541d0b42535243591c0055574e0201531c0b46534a43", 117));
        }
        if (interfaceC0011qqggggg9g9q99q9gq == null) {
            q999ggg99999qqggqqg9qg(context, str, str2);
        } else {
            new Thread(new qgqq999g(this, context, str, str2, interfaceC0011qqggggg9g9q99q9gq)).start();
        }
    }
}
