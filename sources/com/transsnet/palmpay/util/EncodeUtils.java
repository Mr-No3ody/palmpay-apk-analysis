package com.transsnet.palmpay.util;

import android.text.Html;
import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.common.primitives.UnsignedBytes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public final class EncodeUtils {
    private EncodeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static byte[] base64Decode(String str) {
        return Base64.decode(str, 2);
    }

    public static byte[] base64Encode(String str) {
        return base64Encode(str.getBytes());
    }

    public static String base64Encode2String(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    private static byte[] convertIntToBytes(int i7) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.asIntBuffer().put(i7);
        return byteBufferAllocate.array();
    }

    public static byte[] decodeStringToBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArr = new byte[str.length() / 2];
            int i7 = 0;
            while (i7 <= str.length() - 2) {
                int i10 = i7 + 2;
                bArr[i7 / 2] = convertIntToBytes(Integer.parseInt(str.substring(i7, i10), 16))[0];
                i7 = i10;
            }
            return bArr;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String encodeToString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b7 : bArr) {
            String hexString = Integer.toHexString(b7 & UnsignedBytes.MAX_VALUE);
            if (hexString.length() == 1) {
                sb2.append("0");
            }
            sb2.append(hexString);
        }
        return sb2.toString().toUpperCase();
    }

    public static String fileToBase64(File file) throws Throwable {
        FileInputStream fileInputStream;
        String strEncodeToString = null;
        strEncodeToString = null;
        strEncodeToString = null;
        strEncodeToString = null;
        strEncodeToString = null;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[fileInputStream.available()];
                        strEncodeToString = Base64.encodeToString(bArr, 0, fileInputStream.read(bArr), 2);
                        fileInputStream.close();
                    } catch (FileNotFoundException e10) {
                        e = e10;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return strEncodeToString;
                    } catch (IOException e11) {
                        e = e11;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return strEncodeToString;
                    }
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            } catch (FileNotFoundException e13) {
                e = e13;
                fileInputStream = null;
            } catch (IOException e14) {
                e = e14;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                throw th;
            }
            return strEncodeToString;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
        }
    }

    public static CharSequence htmlDecode(String str) {
        return Html.fromHtml(str, 0);
    }

    public static String htmlEncode(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt == '\"') {
                sb2.append("&quot;");
            } else if (cCharAt == '<') {
                sb2.append("&lt;");
            } else if (cCharAt == '>') {
                sb2.append("&gt;");
            } else if (cCharAt == '&') {
                sb2.append("&amp;");
            } else if (cCharAt != '\'') {
                sb2.append(cCharAt);
            } else {
                sb2.append("&#39;");
            }
        }
        return sb2.toString();
    }

    public static String urlDecode(String str) {
        return urlDecode(str, Constants.ENCODING);
    }

    public static String urlEncode(String str) {
        return urlEncode(str, Constants.ENCODING);
    }

    public static byte[] base64Decode(byte[] bArr) {
        return Base64.decode(bArr, 2);
    }

    public static byte[] base64Encode(byte[] bArr) {
        return Base64.encode(bArr, 2);
    }

    public static String base64Encode2String(String str) {
        try {
            return new String(base64Encode(str), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public static String urlDecode(String str, String str2) {
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public static String urlEncode(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public static String base64Encode(File file) throws Throwable {
        FileInputStream fileInputStream;
        String strEncodeToString = null;
        strEncodeToString = null;
        strEncodeToString = null;
        strEncodeToString = null;
        strEncodeToString = null;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[fileInputStream.available()];
                        strEncodeToString = Base64.encodeToString(bArr, 0, fileInputStream.read(bArr), 2);
                        fileInputStream.close();
                    } catch (FileNotFoundException e10) {
                        e = e10;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return strEncodeToString;
                    } catch (IOException e11) {
                        e = e11;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return strEncodeToString;
                    }
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            } catch (FileNotFoundException e13) {
                e = e13;
                fileInputStream = null;
            } catch (IOException e14) {
                e = e14;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                throw th;
            }
            return strEncodeToString;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
        }
    }
}
