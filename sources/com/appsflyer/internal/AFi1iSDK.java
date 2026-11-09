package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFi1iSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    private static int afDebugLog;
    private static long afErrorLog;
    private static int afErrorLogForExcManagerOnly;
    private static long afInfoLog;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Object f20398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f20399e;
    private static int force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static byte[] f20400i;
    public static final Map registerClient;
    private static Object unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static long f20401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Map f20402w;

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0040 -> B:18:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    private static java.lang.String $$c(short r8, short r9, short r10) {
        /*
            int r0 = com.appsflyer.internal.AFi1iSDK.$13
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.appsflyer.internal.AFi1iSDK.$12 = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            int r0 = r10 + 58
            byte[] r3 = com.appsflyer.internal.AFi1iSDK.$$a
            int r8 = r8 + 107
            int r9 = r9 + 82
            byte[] r0 = new byte[r0]
            int r10 = r10 + 94
            if (r3 != 0) goto L1e
            r9 = r2
            goto L2d
        L1e:
            r4 = r2
            goto L34
        L20:
            int r0 = r10 + 1
            byte[] r3 = com.appsflyer.internal.AFi1iSDK.$$a
            int r8 = r8 + 4
            int r9 = r9 + 33
            byte[] r0 = new byte[r0]
            if (r3 != 0) goto L33
            r9 = r1
        L2d:
            r5 = r9
            r4 = r3
            r9 = r8
            r3 = r0
            r0 = r10
            goto L55
        L33:
            r4 = r1
        L34:
            byte r5 = (byte) r9
            r0[r4] = r5
            int r8 = r8 + r2
            if (r4 != r10) goto L40
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0, r1)
            return r8
        L40:
            int r4 = r4 + 1
            r5 = r3[r8]
            int r6 = com.appsflyer.internal.AFi1iSDK.$13
            int r6 = r6 + 79
            int r6 = r6 % 128
            com.appsflyer.internal.AFi1iSDK.$12 = r6
            r7 = r9
            r9 = r8
            r8 = r7
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r4
            r4 = r3
            r3 = r7
        L55:
            int r10 = -r10
            int r8 = r8 + r10
            int r8 = r8 + (-3)
            r10 = r9
            r9 = r8
            r8 = r10
            r10 = r0
            r0 = r3
            r3 = r4
            r4 = r5
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1iSDK.$$c(short, short, short):java.lang.String");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 76741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1iSDK.<clinit>():void");
    }

    private AFi1iSDK() {
    }

    public static Object AFAdRevenueData(int i7, int i10, char c6) throws Throwable {
        int i11 = $11;
        int i12 = (i11 ^ 11) + ((i11 & 11) << 1);
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        Object obj = unregisterClient;
        int i13 = ((i11 ^ 81) + ((i11 & 81) << 1)) % 128;
        $10 = i13;
        $11 = ((i13 & 89) + (i13 | 89)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i7), Integer.valueOf(i10), Character.valueOf(c6)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((short) 585, bArr[19], bArr[912]), true, (ClassLoader) f20398d);
            String str$$c = $$c((short) 617, bArr[912], bArr[13]);
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i14 = $11;
            int i15 = (i14 ^ 91) + ((i14 & 91) << 1);
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                return objInvoke;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getMediationNetwork(Object obj) throws Throwable {
        int i7 = $10;
        int i10 = ((i7 | 35) << 1) - (i7 ^ 35);
        int i11 = i10 % 128;
        $11 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        Object obj2 = unregisterClient;
        $10 = (((i11 | 21) << 1) - (i11 ^ 21)) % 128;
        try {
            byte[] bArr = $$a;
            short s3 = (short) 1150;
            return ((Integer) Class.forName($$c((short) 585, bArr[19], bArr[912]), true, (ClassLoader) f20398d).getMethod($$c(s3, (byte) (s3 & 455), bArr[347]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getRevenue(int i7) throws Throwable {
        int i10 = $11 + 15;
        int i11 = i10 % 128;
        $10 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        Object obj = unregisterClient;
        $11 = ((i11 & 51) + (i11 | 51)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i7)};
            byte[] bArr = $$a;
            short s3 = (short) 1150;
            int iIntValue = ((Integer) Class.forName($$c((short) 585, bArr[19], bArr[912]), true, (ClassLoader) f20398d).getMethod($$c(s3, (byte) (s3 & 455), bArr[347]), Integer.TYPE).invoke(obj, objArr)).intValue();
            $10 = ($11 + 65) % 128;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i7;
        int i10 = $11;
        int i11 = (i10 ^ 93) + ((i10 & 93) << 1);
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            byte[] bArr = new byte[1176];
            System.arraycopy(".1*\u0095ð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBÇï\u000eç\u0013üó\u00044çÏ\u000eç\u0013üó\u0004\nï\u0001\u0000ó\u000e\u0013Ü\fû÷òøñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Ä\u0014\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:øÎ,Ì.üûýüÑ.Í+Ì1öÓ3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøØ7»\u001d\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÚ5Ä\u0014\föõýø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Å\u0013\fö$»Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ç)Ò(\u0003Ïüûüü\u0000þ(Î2øÏ4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHÿî$Ûþ\u0006î\bì\u0016ê\b÷þ\u001dæîú\u0005ú\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 1176);
            $$a = bArr;
            i7 = 5960;
        } else {
            byte[] bArr2 = new byte[1176];
            System.arraycopy(".1*\u0095ð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBÇï\u000eç\u0013üó\u00044çÏ\u000eç\u0013üó\u0004\nï\u0001\u0000ó\u000e\u0013Ü\fû÷òøñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Ä\u0014\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:øÎ,Ì.üûýüÑ.Í+Ì1öÓ3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøØ7»\u001d\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÚ5Ä\u0014\föõýø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Å\u0013\fö$»Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ç)Ò(\u0003Ïüûüü\u0000þ(Î2øÏ4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHÿî$Ûþ\u0006î\bì\u0016ê\b÷þ\u001dæîú\u0005ú\u0004".getBytes("ISO-8859-1"), 0, bArr2, 0, 1176);
            $$a = bArr2;
            i7 = 166;
        }
        $$b = i7;
    }

    private static void AFAdRevenueData(int i7, int i10) {
        int i11 = $11;
        int i12 = ((i11 | 7) << 1) - (i11 ^ 7);
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 94 / 0;
        }
    }
}
