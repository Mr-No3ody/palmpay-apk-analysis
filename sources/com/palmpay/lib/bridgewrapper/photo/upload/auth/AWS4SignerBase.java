package com.palmpay.lib.bridgewrapper.photo.upload.auth;

import C0.G;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.palmpay.lib.bridgewrapper.photo.upload.util.BinaryUtils;
import com.palmpay.lib.bridgewrapper.photo.upload.util.HttpUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AWS4SignerBase {
    public static final String ALGORITHM = "HMAC-SHA256";
    public static final String DateStringFormat = "yyyyMMdd";
    public static final String EMPTY_BODY_SHA256 = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
    public static final String ISO8601BasicFormat = "yyyyMMdd'T'HHmmss'Z'";
    public static final String SCHEME = "AWS4";
    public static final String TERMINATOR = "aws4_request";
    public static final String UNSIGNED_PAYLOAD = "UNSIGNED-PAYLOAD";
    protected final SimpleDateFormat dateStampFormat;
    protected final SimpleDateFormat dateTimeFormat;
    protected URL endpointUrl;
    protected String httpMethod;
    protected String regionName;
    protected String serviceName;

    public AWS4SignerBase(URL url, String str, String str2, String str3) {
        this.endpointUrl = url;
        this.httpMethod = str;
        this.serviceName = str2;
        this.regionName = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        this.dateTimeFormat = simpleDateFormat;
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd");
        this.dateStampFormat = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, "UTC"));
    }

    public static String getCanonicalRequest(URL url, String str, String str2, String str3, String str4, String str5) {
        StringBuilder sbT = G.t(str, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sbT.append(getCanonicalizedResourcePath(url));
        sbT.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sbT.append(str2);
        sbT.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        u.x(sbT, str4, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, str3, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sbT.append(str5);
        return sbT.toString();
    }

    public static String getCanonicalizeHeaderNames(Map<String, String> map) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb2 = new StringBuilder();
        for (String str : arrayList) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(str.toLowerCase());
        }
        return sb2.toString();
    }

    public static String getCanonicalizedHeaderString(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb2 = new StringBuilder();
        for (String str : arrayList) {
            sb2.append(str.toLowerCase().replaceAll("\\s+", " ") + ":" + map.get(str).replaceAll("\\s+", " "));
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return sb2.toString();
    }

    public static String getCanonicalizedQueryString(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            treeMap.put(HttpUtils.urlEncode(entry.getKey(), false), HttpUtils.urlEncode(entry.getValue(), false));
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append((String) entry2.getValue());
            if (it.hasNext()) {
                sb2.append("&");
            }
        }
        return sb2.toString();
    }

    public static String getCanonicalizedResourcePath(URL url) {
        String path;
        if (url == null || (path = url.getPath()) == null || path.isEmpty()) {
            return "/";
        }
        String strUrlEncode = HttpUtils.urlEncode(path, true);
        return strUrlEncode.startsWith("/") ? strUrlEncode : "/".concat(strUrlEncode);
    }

    public static String getStringToSign(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str3 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str4 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + BinaryUtils.toHex(hash(str5));
    }

    public static byte[] hash(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Constants.ENCODING));
            return messageDigest.digest();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to compute hash while signing request: " + e10.getMessage(), e10);
        }
    }

    public static byte[] sign(String str, byte[] bArr, String str2) {
        try {
            byte[] bytes = str.getBytes(Constants.ENCODING);
            Mac mac = Mac.getInstance(str2);
            mac.init(new SecretKeySpec(bArr, str2));
            return mac.doFinal(bytes);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to calculate a request signature: " + e10.getMessage(), e10);
        }
    }

    public static byte[] hash(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to compute hash while signing request: " + e10.getMessage(), e10);
        }
    }
}
