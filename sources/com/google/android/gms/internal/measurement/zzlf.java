package com.google.android.gms.internal.measurement;

import M.n;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlf {
    private static volatile Optional zza;

    private zzlf() {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #2 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:76:0x0163, B:15:0x0025, B:17:0x002d, B:22:0x003d, B:24:0x0043, B:26:0x0049, B:27:0x004d, B:75:0x015e, B:77:0x0166, B:78:0x0169, B:79:0x016a, B:28:0x0051, B:30:0x0055, B:31:0x0062, B:33:0x0068, B:39:0x0081, B:41:0x0087, B:42:0x008f, B:62:0x0141, B:63:0x0144, B:71:0x0153, B:70:0x0150, B:72:0x0154, B:73:0x0159, B:74:0x015a, B:36:0x0070, B:38:0x0076), top: B:87:0x0007, inners: #4 }] */
    public static Optional zza(Context context) {
        Optional optional;
        Optional optionalAbsent;
        Optional optionalAbsent2;
        Optional optional2 = zza;
        if (optional2 != null) {
            return optional2;
        }
        synchronized (zzlf.class) {
            try {
                optional = zza;
                if (optional == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i7 = zzlg.zza;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        optionalAbsent2 = Optional.absent();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        if (zzky.zza() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                optionalAbsent = file.exists() ? Optional.of(file) : Optional.absent();
                            } catch (RuntimeException e10) {
                                Log.e("HermeticFileOverrides", "no data dir", e10);
                                optionalAbsent = Optional.absent();
                            }
                            if (optionalAbsent.isPresent()) {
                                File file2 = (File) optionalAbsent.get();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        n nVar = new n(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb2 = new StringBuilder(line.length() + 9);
                                                sb2.append("Invalid: ");
                                                sb2.append(line);
                                                Log.e("HermeticFileOverrides", sb2.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                n nVar2 = (n) nVar.get(str3);
                                                if (nVar2 == null) {
                                                    nVar2 = new n(0);
                                                    nVar.put(str3, nVar2);
                                                }
                                                nVar2.put(strDecode, strDecode2);
                                            }
                                        }
                                        new StringBuilder(file2.toString().length() + 28 + String.valueOf(context.getPackageName()).length());
                                        zzle zzleVar = new zzle(nVar);
                                        bufferedReader.close();
                                        optionalAbsent2 = Optional.of(zzleVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            } else {
                                optionalAbsent2 = Optional.absent();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        optionalAbsent2 = Optional.absent();
                    }
                    optional = optionalAbsent2;
                    zza = optional;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return optional;
    }
}
