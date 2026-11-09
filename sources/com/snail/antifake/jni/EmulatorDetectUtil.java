package com.snail.antifake.jni;

import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class EmulatorDetectUtil {

    public interface Arch {
    }

    static {
        System.loadLibrary("emulator_check");
    }

    @Keep
    public static native boolean detectS();

    public static int getSystemArch() {
        String strA = PropertiesGet.a("ro.product.cpu.abi");
        if ("armeabi-v7a".equals(strA)) {
            return 2;
        }
        if ("arm64-v8a".equals(strA)) {
            return 3;
        }
        if ("x86".equals(strA)) {
            return 0;
        }
        return "x86_64".equals(strA) ? 1 : 3;
    }

    public static boolean isEmulator(Context context) {
        return detectS();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x016f A[Catch: IOException -> 0x016b, TryCatch #11 {IOException -> 0x016b, blocks: (B:99:0x0167, B:103:0x016f, B:105:0x0174), top: B:143:0x0167 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0174 A[Catch: IOException -> 0x016b, TRY_LEAVE, TryCatch #11 {IOException -> 0x016b, blocks: (B:99:0x0167, B:103:0x016f, B:105:0x0174), top: B:143:0x0167 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0181  */
    /* JADX WARN: Code duplicated, block: B:115:0x018b  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b5 A[Catch: IOException -> 0x01b1, TryCatch #5 {IOException -> 0x01b1, blocks: (B:124:0x01ad, B:128:0x01b5, B:130:0x01ba), top: B:139:0x01ad }] */
    /* JADX WARN: Code duplicated, block: B:130:0x01ba A[Catch: IOException -> 0x01b1, TRY_LEAVE, TryCatch #5 {IOException -> 0x01b1, blocks: (B:124:0x01ad, B:128:0x01b5, B:130:0x01ba), top: B:139:0x01ad }] */
    /* JADX WARN: Code duplicated, block: B:134:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0104 A[PHI: r2 r8
      0x0104: PHI (r2v13 java.lang.Process) = (r2v10 java.lang.Process), (r2v11 java.lang.Process), (r2v15 java.lang.Process), (r2v15 java.lang.Process) binds: [B:95:0x015f, B:108:0x017b, B:49:0x0101, B:46:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r8v33 java.lang.StringBuilder) = 
      (r8v24 java.lang.StringBuilder)
      (r8v25 java.lang.StringBuilder)
      (r8v44 java.lang.StringBuilder)
      (r8v44 java.lang.StringBuilder)
     binds: [B:95:0x015f, B:108:0x017b, B:49:0x0101, B:46:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0153 A[Catch: IOException -> 0x014f, TryCatch #9 {IOException -> 0x014f, blocks: (B:86:0x014b, B:90:0x0153, B:92:0x0158), top: B:141:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0158 A[Catch: IOException -> 0x014f, TRY_LEAVE, TryCatch #9 {IOException -> 0x014f, blocks: (B:86:0x014b, B:90:0x0153, B:92:0x0158), top: B:141:0x014b }] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
    
        r3.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isEmulatorFromAll(android.content.Context r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snail.antifake.jni.EmulatorDetectUtil.isEmulatorFromAll(android.content.Context):boolean");
    }
}
