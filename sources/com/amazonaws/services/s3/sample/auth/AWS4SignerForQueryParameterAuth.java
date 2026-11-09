package com.amazonaws.services.s3.sample.auth;

import C0.G;
import com.amazonaws.services.s3.sample.util.BinaryUtils;
import com.google.common.net.HttpHeaders;
import java.net.URL;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AWS4SignerForQueryParameterAuth extends AWS4SignerBase {
    public AWS4SignerForQueryParameterAuth(URL url, String str, String str2, String str3) {
        super(url, str, str2, str3);
    }

    public String computeSignature(Map<String, String> map, Map<String, String> map2, String str, String str2, String str3) {
        Date date = new Date();
        String str4 = this.f20362e.format(date);
        URL url = this.f20358a;
        String host = url.getHost();
        int port = url.getPort();
        if (port > -1) {
            host.concat(":" + Integer.toString(port));
        }
        map.put(HttpHeaders.HOST, host);
        String strB = AWS4SignerBase.b(map);
        String strC = AWS4SignerBase.c(map);
        String str5 = this.f20363f.format(date);
        StringBuilder sbT = G.t(str5, "/");
        String str6 = this.f20361d;
        sbT.append(str6);
        sbT.append("/");
        String str7 = this.f20360c;
        String strR = G.r(sbT, str7, "/aws4_request");
        map2.put("X-Amz-Algorithm", "AWS4-HMAC-SHA256");
        map2.put("X-Amz-Credential", str2 + "/" + strR);
        map2.put("X-Amz-Date", str4);
        map2.put("X-Amz-SignedHeaders", strB);
        String strA = AWS4SignerBase.a(this.f20358a, this.f20359b, AWS4SignerBase.getCanonicalizedQueryString(map2), strB, strC, str);
        System.out.println("--------- Canonical request --------");
        System.out.println(strA);
        System.out.println("------------------------------------");
        String strD = AWS4SignerBase.d(str4, strR, strA);
        System.out.println("--------- String to sign -----------");
        System.out.println(strD);
        System.out.println("------------------------------------");
        byte[] bArrE = AWS4SignerBase.e(strD, AWS4SignerBase.e("aws4_request", AWS4SignerBase.e(str7, AWS4SignerBase.e(str6, AWS4SignerBase.e(str5, ("AWS4" + str3).getBytes())))));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("X-Amz-Algorithm=" + map2.get("X-Amz-Algorithm"));
        sb2.append("&X-Amz-Credential=" + map2.get("X-Amz-Credential"));
        sb2.append("&X-Amz-Date=" + map2.get("X-Amz-Date"));
        sb2.append("&X-Amz-Expires=" + map2.get("X-Amz-Expires"));
        sb2.append("&X-Amz-SignedHeaders=" + map2.get("X-Amz-SignedHeaders"));
        sb2.append("&X-Amz-Signature=" + BinaryUtils.toHex(bArrE));
        return sb2.toString();
    }
}
