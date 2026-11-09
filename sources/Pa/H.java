package Pa;

import B6.RunnableC0085g;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.CloseUtils;
import com.transsnet.palmpay.util.EncryptUtils;
import com.transsnet.palmpay.util.FileUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f7018b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static MMKV f7019c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public G f7020a;

    public static String b(Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj instanceof String) {
                sb2.append(obj);
            } else {
                try {
                    sb2.append(obj.getClass().getSimpleName());
                    sb2.append(((Gson) C0525w.f().f7166b).toJson(obj));
                } catch (Exception unused) {
                    sb2.append(obj.toString());
                }
            }
        }
        sb2.append(BaseApplication.get().getVersionName());
        return "" + EncryptUtils.encryptMD5ToString(sb2.toString());
    }

    public static H c(Context context) {
        File file = new File(context.getCacheDir().getAbsolutePath(), Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        HashMap map = f7018b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsoluteFile());
        sb2.append("_" + Process.myPid());
        H h7 = (H) map.get(sb2.toString());
        if (h7 == null) {
            h7 = new H();
            if (FileUtils.createOrExistsDir(file)) {
                h7.f7020a = new G(file, 0);
            } else if (file.isFile()) {
                if (FileUtils.createOrExistsDir(new File(file.getAbsolutePath() + "_1"))) {
                    h7.f7020a = new G(file, 0);
                }
            } else {
                F6.d.c("PalmPayCache", "check parent " + FileUtils.createOrExistsDir(file.getParentFile()) + " can't make dirs in " + file.getAbsolutePath());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(file.getAbsolutePath());
            sb3.append("_" + Process.myPid());
            map.put(sb3.toString(), h7);
        }
        return h7;
    }

    public static MMKV e() {
        if (f7019c == null) {
            f7019c = MMKV.o("PalmPayCache");
        }
        return f7019c;
    }

    public final void a() {
        G g7 = this.f7020a;
        if (g7 != null) {
            g7.f7017d.clear();
            g7.f7015b.set(0L);
            File[] fileArrListFiles = g7.f7014a.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    F6.d.h("PalmPayCache", 3, com.horcrux.svg.d0.q("clear: ret ", file.delete()));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final String d(String str) {
        BufferedReader bufferedReader;
        int i7 = 16;
        ?? r10 = 0;
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("Pref_")) {
                String string = e().getString(str, null);
                if (TextUtils.isEmpty(string)) {
                    return string;
                }
                if (!r0.a(string)) {
                    return r0.Q0(string.getBytes()) ? string.substring(string.indexOf(32) + 1, string.length()) : string;
                }
                e().remove(str);
                return null;
            }
            G g7 = this.f7020a;
            if (g7 != null) {
                File file = new File(g7.f7014a, str.hashCode() + "");
                Long lValueOf = Long.valueOf(System.currentTimeMillis());
                T.b(-4).execute(new RunnableC0085g(i7, file, lValueOf));
                g7.f7017d.put(file, lValueOf);
                ?? Exists = file.exists();
                try {
                    if (Exists != 0) {
                        try {
                            bufferedReader = new BufferedReader(new FileReader(file));
                            String strSubstring = "";
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    strSubstring = strSubstring + line;
                                } catch (IOException e10) {
                                    e = e10;
                                    F6.d.c("PalmPayCache", "getAsString: ", e);
                                    CloseUtils.closeIO(bufferedReader);
                                }
                            }
                            if (!r0.a(strSubstring)) {
                                if (r0.Q0(strSubstring.getBytes())) {
                                    strSubstring = strSubstring.substring(strSubstring.indexOf(32) + 1, strSubstring.length());
                                }
                                CloseUtils.closeIO(bufferedReader);
                                return strSubstring;
                            }
                            CloseUtils.closeIO(bufferedReader);
                            G g10 = this.f7020a;
                            if (g10 != null) {
                                File file2 = new File(g10.f7014a, str.hashCode() + "");
                                Long lValueOf2 = Long.valueOf(System.currentTimeMillis());
                                T.b(-4).execute(new RunnableC0085g(i7, file2, lValueOf2));
                                g10.f7017d.put(file2, lValueOf2);
                                file2.delete();
                                return null;
                            }
                        } catch (IOException e11) {
                            e = e11;
                            bufferedReader = null;
                        } catch (Throwable th) {
                            th = th;
                            CloseUtils.closeIO(new Closeable[]{r10});
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r10 = Exists;
                }
            }
        }
        return null;
    }

    public final void f(int i7, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        String strConcat = System.currentTimeMillis() + "";
        while (strConcat.length() < 13) {
            strConcat = "0".concat(strConcat);
        }
        sb2.append(strConcat + "-" + i7 + ' ');
        sb2.append(str2);
        g(str, sb2.toString());
    }

    public final void g(String str, String str2) {
        BufferedWriter bufferedWriter;
        Throwable th;
        IOException e10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("Pref_")) {
            e().putString(str, str2);
            return;
        }
        G g7 = this.f7020a;
        if (g7 == null) {
            return;
        }
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(new File(g7.f7014a, str.hashCode() + "")), 1024);
            try {
                try {
                    bufferedWriter.write(str2);
                    bufferedWriter.flush();
                    CloseUtils.closeIO(bufferedWriter);
                } catch (IOException e11) {
                    e10 = e11;
                    F6.d.c("PalmPayCache", "put error: ", e10);
                    CloseUtils.closeIO(bufferedWriter);
                }
            } catch (Throwable th2) {
                th = th2;
                CloseUtils.closeIO(bufferedWriter);
                throw th;
            }
        } catch (IOException e12) {
            bufferedWriter = null;
            e10 = e12;
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
            CloseUtils.closeIO(bufferedWriter);
            throw th;
        }
    }
}
