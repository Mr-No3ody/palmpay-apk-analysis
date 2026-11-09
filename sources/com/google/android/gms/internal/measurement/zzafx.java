package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzafx {
    public static String zza(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length);
        for (byte b7 : bArr) {
            if (b7 == 34) {
                sb2.append("\\\"");
            } else if (b7 == 39) {
                sb2.append("\\'");
            } else if (b7 != 92) {
                switch (b7) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b7 < 32 || b7 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b7 >>> 6) & 3) + 48));
                            sb2.append((char) (((b7 >>> 3) & 7) + 48));
                            sb2.append((char) ((b7 & 7) + 48));
                        } else {
                            sb2.append((char) b7);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
