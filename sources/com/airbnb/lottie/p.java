package com.airbnb.lottie;

import Pg.AbstractC0555b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.alibaba.android.arouter.utils.Consts;
import com.google.common.base.Ascii;
import com.google.mlkit.common.sdkinternal.Constants;
import com.horcrux.svg.d0;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f20122a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f20123b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f20124c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f20125d = {Ascii.US, -117, 8};

    public static D a(final String str, Callable callable, Runnable runnable) {
        k kVarA = str == null ? null : p212o1.f.f40011b.a(str);
        D d2 = kVarA != null ? new D(kVarA) : null;
        HashMap map = f20122a;
        if (str != null && map.containsKey(str)) {
            d2 = (D) map.get(str);
        }
        if (d2 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return d2;
        }
        D d10 = new D(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i7 = 0;
            d10.b(new LottieListener() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    switch (i7) {
                        case 0:
                            HashMap map2 = p.f20122a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                p.l(true);
                            }
                            break;
                        default:
                            HashMap map3 = p.f20122a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                p.l(true);
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            d10.a(new LottieListener() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    switch (i10) {
                        case 0:
                            HashMap map2 = p.f20122a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                p.l(true);
                            }
                            break;
                        default:
                            HashMap map3 = p.f20122a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                p.l(true);
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, d10);
                if (map.size() == 1) {
                    l(false);
                }
            }
        }
        return d10;
    }

    public static B b(Context context, String str, String str2) {
        k kVarA = str2 == null ? null : p212o1.f.f40011b.a(str2);
        if (kVarA != null) {
            return new B(kVarA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new B(e10);
        }
    }

    public static B c(Context context, InputStream inputStream, String str) {
        int i7 = 1;
        k kVarA = str == null ? null : p212o1.f.f40011b.a(str);
        if (kVarA != null) {
            return new B(kVarA);
        }
        try {
            Pg.x xVarC = AbstractC0555b.c(AbstractC0555b.l(inputStream));
            if (k(xVarC, f20124c).booleanValue()) {
                return i(context, new ZipInputStream(new Pg.i(xVarC, i7)), str);
            }
            if (k(xVarC, f20125d).booleanValue()) {
                return d(new GZIPInputStream(new Pg.i(xVarC, i7)), str);
            }
            String[] strArr = com.airbnb.lottie.parser.moshi.a.f20163e;
            return e(new com.airbnb.lottie.parser.moshi.b(xVarC), str, true);
        } catch (IOException e10) {
            return new B(e10);
        }
    }

    public static B d(InputStream inputStream, String str) {
        Pg.x xVarC = AbstractC0555b.c(AbstractC0555b.l(inputStream));
        String[] strArr = com.airbnb.lottie.parser.moshi.a.f20163e;
        return e(new com.airbnb.lottie.parser.moshi.b(xVarC), str, true);
    }

    public static B e(com.airbnb.lottie.parser.moshi.b bVar, String str, boolean z3) {
        try {
            k kVarA = str == null ? null : p212o1.f.f40011b.a(str);
            if (kVarA != null) {
                return new B(kVarA);
            }
            k kVarA2 = com.airbnb.lottie.parser.s.a(bVar);
            if (str != null) {
                p212o1.f.f40011b.f40012a.put(str, kVarA2);
            }
            return new B(kVarA2);
        } catch (Exception e10) {
            return new B(e10);
        } finally {
            if (z3) {
                com.airbnb.lottie.utils.i.b(bVar);
            }
        }
    }

    public static D f(Context context, final int i7, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: com.airbnb.lottie.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return p.g(context2, i7, str);
            }
        }, null);
    }

    public static B g(Context context, int i7, String str) {
        int i10 = 1;
        k kVarA = str == null ? null : p212o1.f.f40011b.a(str);
        if (kVarA != null) {
            return new B(kVarA);
        }
        try {
            Pg.x xVarC = AbstractC0555b.c(AbstractC0555b.l(context.getResources().openRawResource(i7)));
            if (k(xVarC, f20124c).booleanValue()) {
                return i(context, new ZipInputStream(new Pg.i(xVarC, i10)), str);
            }
            if (!k(xVarC, f20125d).booleanValue()) {
                String[] strArr = com.airbnb.lottie.parser.moshi.a.f20163e;
                return e(new com.airbnb.lottie.parser.moshi.b(xVarC), str, true);
            }
            try {
                return d(new GZIPInputStream(new Pg.i(xVarC, i10)), str);
            } catch (IOException e10) {
                return new B(e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new B(e11);
        }
    }

    public static D h(Context context, String str) {
        String strO = C0.G.o("url_", str);
        return a(strO, new l(context, 0, str, strO), null);
    }

    public static B i(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return j(context, zipInputStream, str);
        } finally {
            com.airbnb.lottie.utils.i.b(zipInputStream);
        }
    }

    public static B j(Context context, ZipInputStream zipInputStream, String str) {
        k kVarA;
        A a3;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            kVarA = null;
        } else {
            try {
                kVarA = p212o1.f.f40011b.a(str);
            } catch (IOException e10) {
                return new B(e10);
            }
        }
        if (kVarA != null) {
            return new B(kVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        k kVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase(Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME)) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                Pg.x xVarC = AbstractC0555b.c(AbstractC0555b.l(zipInputStream));
                String[] strArr = com.airbnb.lottie.parser.moshi.a.f20163e;
                kVar = e(new com.airbnb.lottie.parser.moshi.b(xVarC), null, false).f19556a;
            } else if (name.contains(PictureMimeType.PNG) || name.contains(".webp") || name.contains(PictureMimeType.JPG) || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new B(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i7 = zipInputStream.read(bArr);
                                if (i7 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i7);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    com.airbnb.lottie.utils.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    com.airbnb.lottie.utils.c.b("Failed to delete temp font file " + file.getAbsolutePath() + Consts.DOT);
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (kVar == null) {
            return new B(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) kVar.c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    a3 = null;
                    break;
                }
                a3 = (A) it.next();
            } while (!a3.f19553d.equals(str4));
            if (a3 != null) {
                a3.f19555f = com.airbnb.lottie.utils.i.d((Bitmap) entry.getValue(), a3.f19550a, a3.f19551b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z3 = false;
            for (p212o1.c cVar : kVar.f19879f.values()) {
                if (cVar.f39999a.equals(entry2.getKey())) {
                    cVar.f40002d = (Typeface) entry2.getValue();
                    z3 = true;
                }
            }
            if (!z3) {
                com.airbnb.lottie.utils.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) kVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                A a10 = (A) ((Map.Entry) it2.next()).getValue();
                if (a10 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = a10.f19553d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            a10.f19555f = com.airbnb.lottie.utils.i.d(bitmapDecodeByteArray, a10.f19550a, a10.f19551b);
                        }
                    } catch (IllegalArgumentException e11) {
                        com.airbnb.lottie.utils.c.c("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            p212o1.f.f40011b.f40012a.put(str, kVar);
        }
        return new B(kVar);
    }

    public static Boolean k(Pg.x xVar, byte[] bArr) {
        try {
            BufferedSource bufferedSourcePeek = xVar.peek();
            for (byte b7 : bArr) {
                if (((Pg.x) bufferedSourcePeek).readByte() != b7) {
                    return Boolean.FALSE;
                }
            }
            ((Pg.x) bufferedSourcePeek).close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            com.airbnb.lottie.utils.c.f20222a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void l(boolean z3) {
        ArrayList arrayList = new ArrayList(f20123b);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((LottieTaskIdleListener) arrayList.get(i7)).onIdleChanged(z3);
        }
    }

    public static String m(int i7, Context context) {
        return d0.n(i7, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
