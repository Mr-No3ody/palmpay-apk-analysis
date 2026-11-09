package com.amazonaws.services.s3.sample.auth;

import C0.G;
import N8.q0;
import androidx.camera.camera2.internal.F;
import com.adjust.sdk.Constants;
import com.amazonaws.services.s3.sample.util.BinaryUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.net.HttpHeaders;
import java.net.URL;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AWS4SignerForChunkedUpload extends AWS4SignerBase {
    public static final String STREAMING_BODY_SHA256 = "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f20364k = new byte[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f20365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f20366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f20367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f20368j;

    public AWS4SignerForChunkedUpload(URL url, String str, String str2, String str3) {
        super(url, str, str2, str3);
    }

    public static long calculateChunkedContentLength(long j6, long j10) {
        if (j6 <= 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j11 = j6 / j10;
        long j12 = j6 % j10;
        return f(0L) + (f(j10) * j11) + (j12 > 0 ? f(j12) : 0L);
    }

    public static long f(long j6) {
        return ((long) (Long.toHexString(j6).length() + 83)) + j6 + ((long) 2);
    }

    public String computeSignature(Map<String, String> map, Map<String, String> map2, String str, String str2, String str3) {
        Date date = new Date();
        String str4 = this.f20362e.format(date);
        this.f20366h = str4;
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
        this.f20367i = strR;
        String strD = AWS4SignerBase.d(this.f20366h, strR, strA);
        System.out.println("--------- String to sign -----------");
        System.out.println(strD);
        System.out.println("------------------------------------");
        byte[] bArrE = AWS4SignerBase.e("aws4_request", AWS4SignerBase.e(str7, AWS4SignerBase.e(str6, AWS4SignerBase.e(str5, ("AWS4" + str3).getBytes()))));
        this.f20368j = bArrE;
        this.f20365g = BinaryUtils.toHex(AWS4SignerBase.e(strD, bArrE));
        StringBuilder sbQ = q0.q("Credential=", str2, "/");
        sbQ.append(this.f20367i);
        String string = sbQ.toString();
        String strO = G.o("SignedHeaders=", strB);
        String str8 = "Signature=" + this.f20365g;
        StringBuilder sbF = F.f("AWS4-HMAC-SHA256 ", string, ", ", strO, ", ");
        sbF.append(str8);
        return sbF.toString();
    }

    public byte[] constructSignedChunk(int i7, byte[] bArr) {
        if (i7 == 0) {
            bArr = f20364k;
        } else if (i7 < bArr.length) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, 0, bArr2, 0, i7);
            bArr = bArr2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(bArr.length));
        String hex = BinaryUtils.toHex(AWS4SignerBase.e("AWS4-HMAC-SHA256-PAYLOAD\n" + this.f20366h + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + this.f20367i + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + this.f20365g + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + BinaryUtils.toHex(AWS4SignerBase.hash("")) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + BinaryUtils.toHex(AWS4SignerBase.hash(bArr)), this.f20368j));
        this.f20365g = hex;
        StringBuilder sb3 = new StringBuilder(";chunk-signature=");
        sb3.append(hex);
        sb2.append(sb3.toString());
        sb2.append("\r\n");
        try {
            byte[] bytes = sb2.toString().getBytes(Constants.ENCODING);
            byte[] bytes2 = "\r\n".getBytes(Constants.ENCODING);
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
