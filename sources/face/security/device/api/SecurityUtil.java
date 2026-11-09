package face.security.device.api;

import N8.q0;
import android.text.TextUtils;
import android.util.Base64;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.google.maps.android.BuildConfig;
import com.pp.faceguard.traffic.FaceGuardTrafficBridge;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class SecurityUtil {
    private static final int MAX_TIME_OUT = 20;
    public static final int NET_EXCEPTION_CODE = -1;
    public static Field artMethodField;

    public static String cs(Map<String, String> map, String str) throws Exception {
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        Arrays.sort(strArr);
        StringBuilder sb2 = new StringBuilder();
        boolean z3 = true;
        for (String str2 : strArr) {
            if (z3) {
                z3 = false;
            } else {
                sb2.append("&");
            }
            sb2.append(encode(str2, str));
            sb2.append("=");
            sb2.append(encode(map.get(str2), str));
        }
        return FaceSecDevice.gsRaw("POST&" + encode("/", str) + "&" + encode(sb2.toString(), str));
    }

    private static int dw(String str, String str2) {
        return -1;
    }

    private static String encode(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return URLEncoder.encode(str, str2).replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
    }

    private static String fd(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
        return simpleDateFormat.format(date);
    }

    public static long getArtMethod(Member member) {
        Field field = artMethodField;
        if (field == null) {
            return 0L;
        }
        try {
            return ((Long) field.get(member)).longValue();
        } catch (IllegalAccessException unused) {
            return 0L;
        }
    }

    public static Field getField(Class cls, String str) {
        while (cls != null && cls != Object.class) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static String gsi(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String string = UUID.randomUUID().toString();
        if (string.isEmpty()) {
            return "";
        }
        String strF = u.f(4, 0, String.format("%s-%s-%d-%s", str, "h", Long.valueOf(System.currentTimeMillis()), string.replace("-", "")));
        int iAbs = Math.abs((strF + "7849478494").hashCode());
        String strValueOf = String.valueOf(iAbs);
        if (strValueOf.length() > 4) {
            strValueOf = strValueOf.substring(strValueOf.length() - 4);
        } else if (strValueOf.length() < 4) {
            strValueOf = String.format("%4d", Integer.valueOf(iAbs));
        }
        return q0.j(strF, strValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.net.HttpURLConnection] */
    public static String httpPost(String str, Map<String, String> map, Map<String, String> map2) throws Throwable {
        ?? r10;
        HttpURLConnection httpURLConnection;
        String str2;
        BufferedReader bufferedReader = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) FaceGuardTrafficBridge.openConnection(new URL(str));
                try {
                    httpURLConnection.setRequestMethod("POST");
                    boolean z3 = true;
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setConnectTimeout(20000);
                    httpURLConnection.setReadTimeout(20000);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        if (z3) {
                            z3 = false;
                        } else {
                            sb2.append("&");
                        }
                        sb2.append(encode(entry2.getKey(), Constants.ENCODING));
                        sb2.append("=");
                        sb2.append(encode(entry2.getValue(), Constants.ENCODING));
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(sb2.toString().getBytes());
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String str3 = responseCode + "#" + Base64.encodeToString("net error".getBytes(), 2);
                        httpURLConnection.disconnect();
                        return str3;
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    try {
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb3.append(line);
                        }
                        str2 = responseCode + "#" + Base64.encodeToString(sb3.toString().getBytes(), 2);
                        inputStream.close();
                        try {
                            bufferedReader2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedReader = bufferedReader2;
                        httpURLConnection = httpURLConnection;
                        e.printStackTrace();
                        str2 = "-1#" + Base64.encodeToString(e.getMessage().getBytes(), 2);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        if (httpURLConnection != null) {
                        }
                        return str2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        r10 = httpURLConnection;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        if (r10 == 0) {
                            throw th;
                        }
                        r10.disconnect();
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    return str2;
                } catch (Exception e14) {
                    e = e14;
                    httpURLConnection = httpURLConnection;
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = str;
            }
        } catch (Exception e15) {
            e = e15;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            r10 = 0;
        }
    }

    public static String spr(String str, Map<String, String> map, Map<String, String> map2) {
        HashMap map3 = new HashMap();
        map3.put("TimestampKeep", fd(new Date()));
        map3.put("SignatureNonce", UUID.randomUUID().toString());
        if (map2 != null) {
            map2.remove("Signature");
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    map3.put(key, value);
                }
            }
            String str2 = map2.get("Version");
            if (str2 != null && !str2.isEmpty() && str2.equals("2020-04-25")) {
                map3.put("Timestamp", fd(new Date()));
            }
        }
        try {
            map3.put("Signature", cs(map3, Constants.ENCODING));
        } catch (Throwable unused) {
            map3.put("Signature", BuildConfig.TRAVIS);
        }
        return httpPost(str, map, map3);
    }

    public static void utilInit() {
        try {
            artMethodField = getField(Method.class, "artMethod");
        } catch (Exception unused) {
        }
    }
}
