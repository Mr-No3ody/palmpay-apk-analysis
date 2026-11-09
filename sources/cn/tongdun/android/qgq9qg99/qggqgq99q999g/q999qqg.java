package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class q999qqg {
    public static int q999ggg99999qqggqqg9qg(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService(q999ggg99999qqggqqg9qg("62717c7d767b6a6062626070", 99))) != null) {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                        if (networkCapabilities.hasTransport(0)) {
                            return 2;
                        }
                        if (networkCapabilities.hasTransport(1)) {
                            return 1;
                        }
                        if (networkCapabilities.hasTransport(3)) {
                            return 3;
                        }
                        if (networkCapabilities.hasTransport(4)) {
                            return 4;
                        }
                        networkCapabilities.getTransportInfo();
                        return 0;
                    }
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        if (activeNetworkInfo.getType() != 1) {
                            if (activeNetworkInfo.getType() == 0) {
                                return 2;
                            }
                            if (activeNetworkInfo.getType() != 9) {
                                if (activeNetworkInfo.getType() == 17) {
                                    return 4;
                                }
                            }
                            return 3;
                        }
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static boolean qgq9qg99(Context context) {
        return q999ggg99999qqggqqg9qg(context) != 0;
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
            byte b7 = (byte) (bArr[0] ^ 1);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 125);
                bArr[i12] = b7;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
