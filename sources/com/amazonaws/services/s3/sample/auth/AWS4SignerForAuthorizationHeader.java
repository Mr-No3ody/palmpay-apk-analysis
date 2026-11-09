package com.amazonaws.services.s3.sample.auth;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.amazonaws.services.s3.sample.util.BinaryUtils;
import com.google.common.net.HttpHeaders;
import java.net.URL;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AWS4SignerForAuthorizationHeader extends AWS4SignerBase {
    public AWS4SignerForAuthorizationHeader(URL url, String str, String str2, String str3) {
        super(url, str, str2, str3);
    }

    public String computeSignature(Map<String, String> map, Map<String, String> map2, String str, String str2, String str3) {
        Date date = new Date();
        String str4 = this.f20362e.format(date);
        map.put("x-amz-date", str4);
        URL url = this.f20358a;
        String host = url.getHost();
        int port = url.getPort();
        if (port > -1) {
            host.concat(":" + Integer.toString(port));
        }
        map.put(HttpHeaders.HOST, host);
        String strB = AWS4SignerBase.b(map);
        String strA = AWS4SignerBase.a(this.f20358a, this.f20359b, AWS4SignerBase.getCanonicalizedQueryString(map2), strB, AWS4SignerBase.c(map), str);
        System.out.println("--------- Canonical request --------");
        System.out.println(strA);
        System.out.println("------------------------------------");
        String str5 = this.f20363f.format(date);
        StringBuilder sbT = G.t(str5, "/");
        String str6 = this.f20361d;
        sbT.append(str6);
        sbT.append("/");
        String str7 = this.f20360c;
        String strR = G.r(sbT, str7, "/aws4_request");
        String strD = AWS4SignerBase.d(str4, strR, strA);
        System.out.println("--------- String to sign -----------");
        System.out.println(strD);
        System.out.println("------------------------------------");
        byte[] bArrE = AWS4SignerBase.e(strD, AWS4SignerBase.e("aws4_request", AWS4SignerBase.e(str7, AWS4SignerBase.e(str6, AWS4SignerBase.e(str5, ("AWS4" + str3).getBytes())))));
        String strP = G.p("Credential=", str2, "/", strR);
        String strO = G.o("SignedHeaders=", strB);
        String str8 = "Signature=" + BinaryUtils.toHex(bArrE);
        StringBuilder sbF = F.f("AWS4-HMAC-SHA256 ", strP, ", ", strO, ", ");
        sbF.append(str8);
        return sbF.toString();
    }
}
