package com.palmpay.lib.bridgewrapper.photo.upload.auth;

import C0.G;
import com.google.common.net.HttpHeaders;
import com.palmpay.lib.bridgewrapper.photo.upload.util.BinaryUtils;
import java.net.URL;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AWS4SignerForQueryParameterAuth extends AWS4SignerBase {
    public AWS4SignerForQueryParameterAuth(URL url, String str, String str2, String str3) {
        super(url, str, str2, str3);
    }

    public String computeSignature(Map<String, String> map, Map<String, String> map2, String str, String str2, String str3) {
        Date date = new Date();
        String str4 = this.dateTimeFormat.format(date);
        String host = this.endpointUrl.getHost();
        int port = this.endpointUrl.getPort();
        if (port > -1) {
            host.concat(":" + Integer.toString(port));
        }
        map.put(HttpHeaders.HOST, host);
        String canonicalizeHeaderNames = AWS4SignerBase.getCanonicalizeHeaderNames(map);
        String canonicalizedHeaderString = AWS4SignerBase.getCanonicalizedHeaderString(map);
        String str5 = this.dateStampFormat.format(date);
        StringBuilder sbT = G.t(str5, "/");
        sbT.append(this.regionName);
        sbT.append("/");
        String strR = G.r(sbT, this.serviceName, "/aws4_request");
        map2.put("X-Amz-Algorithm", "AWS4-HMAC-SHA256");
        map2.put("X-Amz-Credential", str2 + "/" + strR);
        map2.put("X-Amz-Date", str4);
        map2.put("X-Amz-SignedHeaders", canonicalizeHeaderNames);
        String canonicalRequest = AWS4SignerBase.getCanonicalRequest(this.endpointUrl, this.httpMethod, AWS4SignerBase.getCanonicalizedQueryString(map2), canonicalizeHeaderNames, canonicalizedHeaderString, str);
        System.out.println("--------- Canonical request --------");
        System.out.println(canonicalRequest);
        System.out.println("------------------------------------");
        String stringToSign = AWS4SignerBase.getStringToSign("AWS4", "HMAC-SHA256", str4, strR, canonicalRequest);
        System.out.println("--------- String to sign -----------");
        System.out.println(stringToSign);
        System.out.println("------------------------------------");
        byte[] bArrSign = AWS4SignerBase.sign(stringToSign, AWS4SignerBase.sign("aws4_request", AWS4SignerBase.sign(this.serviceName, AWS4SignerBase.sign(this.regionName, AWS4SignerBase.sign(str5, ("AWS4" + str3).getBytes(), "HmacSHA256"), "HmacSHA256"), "HmacSHA256"), "HmacSHA256"), "HmacSHA256");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("X-Amz-Algorithm=" + map2.get("X-Amz-Algorithm"));
        sb2.append("&X-Amz-Credential=" + map2.get("X-Amz-Credential"));
        sb2.append("&X-Amz-Date=" + map2.get("X-Amz-Date"));
        sb2.append("&X-Amz-Expires=" + map2.get("X-Amz-Expires"));
        sb2.append("&X-Amz-SignedHeaders=" + map2.get("X-Amz-SignedHeaders"));
        sb2.append("&X-Amz-Signature=" + BinaryUtils.toHex(bArrSign));
        return sb2.toString();
    }
}
