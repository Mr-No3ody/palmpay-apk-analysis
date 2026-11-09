package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qq9gg99gqqqgqgq999gqg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static final List f19111q999ggg99999qqggqqg9qg = new CopyOnWriteArrayList();

    public static String q999ggg99999qqggqqg9qg(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            if (!file.exists() || !file.canRead()) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                int i7 = fileInputStream.read(bArr);
                fileInputStream.close();
                if (i7 == -1) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                    return null;
                }
                String str = new String(bArr, 0, i7, q999ggg99999qqggqqg9qg("1d74673e60", 81));
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
                return str;
            } catch (Exception unused3) {
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException unused6) {
            }
        }
        return null;
    }

    public static void qgq9qg99() {
        List list = f19111q999ggg99999qqggqqg9qg;
        if (list != null) {
            list.clear();
        }
    }

    public static String q999ggg99999qqggqqg9qg(String str) throws Throwable {
        FileInputStream fileInputStream;
        File file = new File(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream2 = null;
        if (file.exists() && file.canRead()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i7 = fileInputStream.read(bArr);
                        if (i7 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i7);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray != null && byteArray.length != 0) {
                        String strReplaceAll = new String(byteArray, q999ggg99999qqggqqg9qg("1d2a39603e", 15)).replaceAll(q999ggg99999qqggqqg9qg("345e", 72), "").replaceAll(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_FACE_TO_FACE_P2P_CASH_OUT, 116), "");
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused2) {
                        }
                        return strReplaceAll;
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused4) {
                    }
                    return "";
                } catch (Exception unused5) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused7) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused8) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused9) {
                        throw th;
                    }
                }
            } catch (Exception unused10) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    public static byte[] qgq9qg99(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i7 = fileInputStream2.read(bArr);
                    if (i7 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                }
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg(fileInputStream2);
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg(fileInputStream);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg(fileInputStream);
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
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
            byte b7 = (byte) (i7 ^ 36);
            byte b10 = (byte) (bArr[0] ^ 104);
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

    public static synchronized List q999ggg99999qqggqqg9qg() {
        BufferedReader bufferedReader;
        try {
            List list = f19111q999ggg99999qqggqqg9qg;
            if (!list.isEmpty()) {
                return list;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(String.format(Locale.US, q999ggg99999qqggqqg9qg("474e130c1d5d1b505a531d0012", 53), Integer.valueOf(Process.myPid()))));
                int i7 = 0;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null || i7 >= 10240) {
                            break;
                        }
                        f19111q999ggg99999qqggqqg9qg.add(line);
                        i7++;
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
                bufferedReader = null;
            }
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg(bufferedReader);
            return f19111q999ggg99999qqggqqg9qg;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static Map q999ggg99999qqggqqg9qg(String str, List list, String str2) throws Throwable {
        HashMap map = new HashMap();
        if (str != null && new File(str).exists()) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(str), q999ggg99999qqggqqg9qg("1d60732a74", 69)));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                bufferedReader2.close();
                                bufferedReader2.close();
                                return map;
                            }
                            if (g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(str2)) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    if (line.contains(str3)) {
                                        map.put(str3, line);
                                    }
                                }
                            } else {
                                List listQ999ggg99999qqggqqg9qg = g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(line, str2);
                                if (!listQ999ggg99999qqggqqg9qg.isEmpty()) {
                                    String strTrim = ((String) listQ999ggg99999qqggqqg9qg.get(0)).trim();
                                    if (strTrim.length() != 0 && list.contains(strTrim) && listQ999ggg99999qqggqqg9qg.size() > 1) {
                                        map.put(strTrim, ((String) listQ999ggg99999qqggqqg9qg.get(1)).trim());
                                    }
                                }
                            }
                        } catch (Exception unused) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return map;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused3) {
                }
            } catch (Exception unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return map;
    }

    public static boolean q999ggg99999qqggqqg9qg(File file, File file2) {
        return q999ggg99999qqggqqg9qg(file.getAbsolutePath(), file2.getAbsolutePath());
    }

    public static boolean q999ggg99999qqggqqg9qg(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            File file2 = new File(file.toString());
            if (!file2.exists()) {
                file2.createNewFile();
            }
            if (!file.canWrite()) {
                return false;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            if (str == null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
                return false;
            }
            try {
                fileOutputStream2.write(str.getBytes(q999ggg99999qqggqqg9qg("1d3c2f7628", 25)));
                if (!g99q9ggqg9gqgq9.qgq9qg99(9)) {
                    Class<?> cls = file.getClass();
                    String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("1b77704756656464626f68", 69);
                    Class cls2 = Boolean.TYPE;
                    cls.getMethod(strQ999ggg99999qqggqqg9qg, cls2, cls2).invoke(file, Boolean.TRUE, Boolean.FALSE);
                } else if (!file.setReadable(true, false)) {
                    Os.chmod(file.getAbsolutePath(), OsConstants.S_IRUSR | OsConstants.S_IRGRP | OsConstants.S_IROTH);
                }
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
                return true;
            } catch (Exception unused3) {
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused6) {
            }
        }
        return false;
    }

    private static boolean q999ggg99999qqggqqg9qg(String str, String str2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i7 = fileInputStream2.read(bArr);
                        if (i7 <= 0) {
                            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg(fileInputStream2);
                            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg(fileOutputStream);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i7);
                    }
                } catch (Throwable unused) {
                    fileInputStream = fileInputStream2;
                    cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg(fileInputStream);
                    cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg(fileOutputStream);
                    return false;
                }
            } catch (Throwable unused2) {
                fileOutputStream = null;
            }
        } catch (Throwable unused3) {
            fileOutputStream = null;
        }
    }
}
