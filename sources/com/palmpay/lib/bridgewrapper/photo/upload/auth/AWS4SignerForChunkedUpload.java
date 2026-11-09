package com.palmpay.lib.bridgewrapper.photo.upload.auth;

import C0.G;
import N8.q0;
import androidx.camera.camera2.internal.F;
import com.adjust.sdk.Constants;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.net.HttpHeaders;
import com.palmpay.lib.bridgewrapper.photo.upload.util.BinaryUtils;
import java.net.URL;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AWS4SignerForChunkedUpload extends AWS4SignerBase {
    private static final String CHUNK_SIGNATURE_HEADER = ";chunk-signature=";
    private static final String CHUNK_STRING_TO_SIGN_PREFIX = "AWS4-HMAC-SHA256-PAYLOAD";
    private static final String CLRF = "\r\n";
    private static final byte[] FINAL_CHUNK = new byte[0];
    private static final int SIGNATURE_LENGTH = 64;
    public static final String STREAMING_BODY_SHA256 = "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";
    private String dateTimeStamp;
    private String lastComputedSignature;
    private String scope;
    private byte[] signingKey;

    public AWS4SignerForChunkedUpload(URL url, String str, String str2, String str3) {
        super(url, str, str2, str3);
    }

    private static long calculateChunkHeaderLength(long j6) {
        return ((long) (Long.toHexString(j6).length() + 83)) + j6 + ((long) 2);
    }

    public static long calculateChunkedContentLength(long j6, long j10) {
        if (j6 <= 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j11 = j6 / j10;
        long j12 = j6 % j10;
        return (j11 * calculateChunkHeaderLength(j10)) + (j12 > 0 ? calculateChunkHeaderLength(j12) : 0L) + calculateChunkHeaderLength(0L);
    }

    public String computeSignature(Map<String, String> map, Map<String, String> map2, String str, String str2, String str3) {
        Date date = new Date();
        String str4 = this.dateTimeFormat.format(date);
        this.dateTimeStamp = str4;
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
        this.scope = strR;
        String stringToSign = AWS4SignerBase.getStringToSign("AWS4", "HMAC-SHA256", this.dateTimeStamp, strR, canonicalRequest);
        System.out.println("--------- String to sign -----------");
        System.out.println(stringToSign);
        System.out.println("------------------------------------");
        byte[] bArrSign = AWS4SignerBase.sign("aws4_request", AWS4SignerBase.sign(this.serviceName, AWS4SignerBase.sign(this.regionName, AWS4SignerBase.sign(str5, ("AWS4" + str3).getBytes(), "HmacSHA256"), "HmacSHA256"), "HmacSHA256"), "HmacSHA256");
        this.signingKey = bArrSign;
        this.lastComputedSignature = BinaryUtils.toHex(AWS4SignerBase.sign(stringToSign, bArrSign, "HmacSHA256"));
        StringBuilder sbQ = q0.q("Credential=", str2, "/");
        sbQ.append(this.scope);
        String string = sbQ.toString();
        String strO = G.o("SignedHeaders=", canonicalizeHeaderNames);
        String str6 = "Signature=" + this.lastComputedSignature;
        StringBuilder sbF = F.f("AWS4-HMAC-SHA256 ", string, ", ", strO, ", ");
        sbF.append(str6);
        return sbF.toString();
    }

    public byte[] constructSignedChunk(int i7, byte[] bArr) {
        if (i7 == 0) {
            bArr = FINAL_CHUNK;
        } else if (i7 < bArr.length) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, 0, bArr2, 0, i7);
            bArr = bArr2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(bArr.length));
        String hex = BinaryUtils.toHex(AWS4SignerBase.sign("AWS4-HMAC-SHA256-PAYLOAD\n" + this.dateTimeStamp + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + this.scope + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + this.lastComputedSignature + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + BinaryUtils.toHex(AWS4SignerBase.hash("")) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + BinaryUtils.toHex(AWS4SignerBase.hash(bArr)), this.signingKey, "HmacSHA256"));
        this.lastComputedSignature = hex;
        StringBuilder sb3 = new StringBuilder(CHUNK_SIGNATURE_HEADER);
        sb3.append(hex);
        sb2.append(sb3.toString());
        sb2.append(CLRF);
        try {
            byte[] bytes = sb2.toString().getBytes(Constants.ENCODING);
            byte[] bytes2 = CLRF.getBytes(Constants.ENCODING);
            byte[] bArr3 = new byte[bytes.length + bArr.length + bytes2.length];
            System.arraycopy(bytes, 0, bArr3, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr3, bytes.length, bArr.length);
            System.arraycopy(bytes2, 0, bArr3, bytes.length + bArr.length, bytes2.length);
            return bArr3;
        } catch (Exception e10) {
            throw new RuntimeException("Unable to sign the chunked data. " + e10.getMessage(), e10);
        }
    }
}
