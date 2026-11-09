package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFa1jSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    private static long afDebugLog;
    private static long afErrorLog;
    private static long afInfoLog;
    private static int afWarnLog;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Object f20378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Object f20379e;
    private static int force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static byte[] f20380i;
    public static final Map registerClient;
    public static final Map unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f20381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static byte[] f20382w;

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r1 r3 r7 r9
      0x002c: PHI (r1v3 byte[]) = (r1v2 byte[]), (r1v8 byte[]) binds: [B:9:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r3v1 byte[]) = (r3v0 byte[]), (r3v4 byte[]) binds: [B:9:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r7v2 int) = (r7v1 int), (r7v14 int) binds: [B:9:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r9v2 int) = (r9v1 int), (r9v19 int) binds: [B:9:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e A[PHI: r1 r3 r7 r8 r9
      0x001e: PHI (r1v5 byte[]) = (r1v2 byte[]), (r1v8 byte[]) binds: [B:9:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r3v3 byte[]) = (r3v0 byte[]), (r3v4 byte[]) binds: [B:9:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r7v13 int) = (r7v1 int), (r7v14 int) binds: [B:9:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r8v10 int) = (r8v1 int), (r8v11 int) binds: [B:9:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r9v18 int) = (r9v1 int), (r9v19 int) binds: [B:9:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    private static String $$c(int i7, short s3, int i10) {
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        byte[] bArr2;
        int i14;
        int i15 = $12;
        int i16 = i15 + 27;
        $13 = i16 % 128;
        if (i16 % 2 == 0) {
            i11 = 126 << s3;
            i12 = 12095 << i7;
            i13 = i10 + 86;
            bArr = $$a;
            bArr2 = new byte[i13];
            if (bArr == null) {
                $13 = (i15 + 87) % 128;
                int i17 = i13;
                int i18 = i12 + 1;
                $12 = ($13 + 67) % 128;
                i11 = (i12 + (-i13)) - 1;
                i12 = i18;
                i13 = i17;
                i14 = 0;
            } else {
                i14 = 0;
            }
        } else {
            i11 = 119 - s3;
            i12 = 1166 - i7;
            i13 = i10 + 1;
            bArr = $$a;
            bArr2 = new byte[i13];
            if (bArr == null) {
                $13 = (i15 + 87) % 128;
                int i19 = i13;
                int i110 = i12 + 1;
                $12 = ($13 + 67) % 128;
                i11 = (i12 + (-i13)) - 1;
                i12 = i110;
                i13 = i19;
                i14 = 0;
            } else {
                i14 = 0;
            }
        }
        while (true) {
            int i20 = i14 + 1;
            bArr2[i14] = (byte) i11;
            if (i20 == i13) {
                return new String(bArr2, 0);
            }
            int i21 = i11;
            int i22 = i12;
            int i23 = i13;
            int i24 = (i21 + (-bArr[i12])) - 1;
            int i25 = i22 + 1;
            $12 = ($13 + 67) % 128;
            i11 = i24;
            i12 = i25;
            i13 = i23;
            i14 = i20;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 74241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1jSDK.<clinit>():void");
    }

    private AFa1jSDK() {
    }

    public static int getMediationNetwork(int i7) throws Throwable {
        int i10 = $10;
        int i11 = ((i10 | 33) << 1) - (i10 ^ 33);
        int i12 = i11 % 128;
        $11 = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        Object obj = f20378d;
        $10 = (i12 + 9) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i7)};
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c((short) 598, bArr[201], bArr[176]), true, (ClassLoader) f20379e).getMethod($$c(bArr[113], bArr[13], bArr[283]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i13 = $10 + 37;
            $11 = i13 % 128;
            if (i13 % 2 != 0) {
                return iIntValue;
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

    public static Object getMonetizationNetwork(int i7, int i10, char c6) throws Throwable {
        int i11 = ($10 + 55) % 128;
        Object obj = f20378d;
        int i12 = (i11 + 21) % 128;
        $10 = i12;
        $11 = ((i12 & 63) + (i12 | 63)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i7), Integer.valueOf(i10), Character.valueOf(c6)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((short) 598, bArr[201], bArr[176]), true, (ClassLoader) f20379e);
            String str$$c = $$c((short) (-bArr[489]), bArr[13], bArr[283]);
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            $11 = ($10 + 45) % 128;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getRevenue(Object obj) throws Throwable {
        int i7 = $11;
        int i10 = ((i7 ^ 109) + ((i7 & 109) << 1)) % 128;
        $10 = i10;
        Object obj2 = f20378d;
        $11 = (i10 + 119) % 128;
        try {
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((short) 598, bArr[201], bArr[176]), true, (ClassLoader) f20379e);
            byte b7 = bArr[5];
            return ((Integer) cls.getMethod($$c(b7, bArr[13], b7), Object.class).invoke(obj2, obj)).intValue();
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
        int i10 = $10;
        int i11 = (i10 ^ 25) + ((i10 & 25) << 1);
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            byte[] bArr = new byte[1187];
            System.arraycopy("q\u001dF\u0099ò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üüõö\u000fó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0¶&\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<Ê\u0000\u0000,ü\u0002Ï1\u0002þù\u0001Ñü\u00000Ò3\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÚ9½\u001f\u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0¶&\u000eø÷ÿ\u0001ð&ç\u0000ú\u0007ì\nù\u0000\u001fèðü\u0007ü\u0006\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúä/Æ\u0016\u000eø&¯Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ö\u0005ø\u0001ÿÕ.úý\u0005\u0000ýýÓþ\u00004\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0001ð&Ý\u0000\bð\nî\u0018ì\nù\u0000\u001fèðü\u0007ü\u0006\u0001ð!ìî\u0010öø\u000f\u0001ð0Í\u0002ÿ\fö\né/Õ\u0003:\u0001\u0000ùóÓ\nþ".getBytes("ISO-8859-1"), 0, bArr, 0, 1187);
            $$a = bArr;
            i7 = 9597;
        } else {
            byte[] bArr2 = new byte[1187];
            System.arraycopy("q\u001dF\u0099ò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üüõö\u000fó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0¶&\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<Ê\u0000\u0000,ü\u0002Ï1\u0002þù\u0001Ñü\u00000Ò3\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÚ9½\u001f\u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0¶&\u000eø÷ÿ\u0001ð&ç\u0000ú\u0007ì\nù\u0000\u001fèðü\u0007ü\u0006\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúä/Æ\u0016\u000eø&¯Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ö\u0005ø\u0001ÿÕ.úý\u0005\u0000ýýÓþ\u00004\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0001ð&Ý\u0000\bð\nî\u0018ì\nù\u0000\u001fèðü\u0007ü\u0006\u0001ð!ìî\u0010öø\u000f\u0001ð0Í\u0002ÿ\fö\né/Õ\u0003:\u0001\u0000ùóÓ\nþ".getBytes("ISO-8859-1"), 0, bArr2, 0, 1187);
            $$a = bArr2;
            i7 = 160;
        }
        $$b = i7;
        int i12 = $11 + 91;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 37 / 0;
        }
    }

    private static void getMonetizationNetwork(int i7, int i10) {
        int i11 = $10;
        int i12 = (i11 ^ 99) + ((i11 & 99) << 1);
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 95 / 0;
        }
    }
}
