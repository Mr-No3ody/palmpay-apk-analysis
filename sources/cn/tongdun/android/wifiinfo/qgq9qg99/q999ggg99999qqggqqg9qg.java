package cn.tongdun.android.wifiinfo.qgq9qg99;

import android.annotation.TargetApi;
import com.adjust.sdk.Constants;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {
    @TargetApi(23)
    public static String q999ggg99999qqggqqg9qg() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase(q999ggg99999qqggqqg9qg("3127313362", 53))) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b7 : hardwareAddress) {
                        sb2.append(String.format(q999ggg99999qqggqqg9qg("632c3b535b", 48), Byte.valueOf(b7)));
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    return sb2.toString().toLowerCase();
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String qgq9qg99(String str) throws Throwable {
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
                        String strReplaceAll = new String(byteArray, q999ggg99999qqggqqg9qg("3373603967", 123)).replaceAll(q999ggg99999qqggqqg9qg("1a31", 10), "").replaceAll(q999ggg99999qqggqqg9qg("66", 126), "");
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

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 9);
            byte b10 = (byte) (bArr[0] ^ 70);
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

    public static String q999ggg99999qqggqqg9qg(String str) {
        byte[] hardwareAddress;
        try {
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(InetAddress.getByName(str));
            if (byInetAddress != null && (hardwareAddress = byInetAddress.getHardwareAddress()) != null) {
                StringBuffer stringBuffer = new StringBuffer(hardwareAddress.length);
                for (byte b7 : hardwareAddress) {
                    String hexString = Integer.toHexString(b7 & UnsignedBytes.MAX_VALUE);
                    if (hexString.length() == 1) {
                        stringBuffer.append(q999ggg99999qqggqqg9qg("76", 15));
                    }
                    stringBuffer.append(hexString);
                    stringBuffer.append(q999ggg99999qqggqqg9qg("7c", 71));
                }
                return String.valueOf(stringBuffer.substring(0, stringBuffer.length() - 1));
            }
        } catch (Exception unused) {
        }
        return "";
    }
}
