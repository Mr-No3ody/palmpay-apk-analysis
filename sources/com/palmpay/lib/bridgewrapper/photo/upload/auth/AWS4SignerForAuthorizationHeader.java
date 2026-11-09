package com.palmpay.lib.bridgewrapper.photo.upload.auth;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.google.common.net.HttpHeaders;
import com.palmpay.lib.bridgewrapper.photo.upload.util.BinaryUtils;
import java.net.URL;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AWS4SignerForAuthorizationHeader extends AWS4SignerBase {
    public AWS4SignerForAuthorizationHeader(URL url, String str, String str2, String str3) {
        super(url, str, str2, str3);
    }

    public String computeSignature(Map<String, String> map, Map<String, String> map2, String str, String str2, String str3) {
        Date date = new Date();
        String str4 = this.dateTimeFormat.format(date);
        map.put("x-amz-date", str4);
        String host = this.endpointUrl.getHost();
        int port = this.endpointUrl.getPort();
        if (port > -1) {
            host.concat(":" + Integer.toString(port));
        }
        map.put(HttpHeaders.HOST, host);
        String canonicalizeHeaderNames = AWS4SignerBase.getCanonicalizeHeaderNames(map);
        String canonicalRequest = AWS4SignerBase.getCanonicalRequest(this.endpointUrl, this.httpMethod, AWS4SignerBase.getCanonicalizedQueryString(map2), canonicalizeHeaderNames, AWS4SignerBase.getCanonicalizedHeaderString(map), str);
        System.out.println("--------- Canonical request --------");
        System.out.println(canonicalRequest);
        System.out.println("------------------------------------");
        String str5 = this.dateStampFormat.format(date);
        StringBuilder sbT = G.t(str5, "/");
        sbT.append(this.regionName);
        sbT.append("/");
        String strR = G.r(sbT, this.serviceName, "/aws4_request");
        String stringToSign = AWS4SignerBase.getStringToSign("AWS4", "HMAC-SHA256", str4, strR, canonicalRequest);
        System.out.println("--------- String to sign -----------");
        System.out.println(stringToSign);
        System.out.println("------------------------------------");
        byte[] bArrSign = AWS4SignerBase.sign(stringToSign, AWS4SignerBase.sign("aws4_request", AWS4SignerBase.sign(this.serviceName, AWS4SignerBase.sign(this.regionName, AWS4SignerBase.sign(str5, ("AWS4" + str3).getBytes(), "HmacSHA256"), "HmacSHA256"), "HmacSHA256"), "HmacSHA256"), "HmacSHA256");
        String strP = G.p("Credential=", str2, "/", strR);
        String strO = G.o("SignedHeaders=", canonicalizeHeaderNames);
        String str6 = "Signature=" + BinaryUtils.toHex(bArrSign);
        StringBuilder sbF = F.f("AWS4-HMAC-SHA256 ", strP, ", ", strO, ", ");
        sbF.append(str6);
        return sbF.toString();
    }
}
