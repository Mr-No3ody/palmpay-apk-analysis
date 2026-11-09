package com.rnmaps.maps;

import V0.C0689h;
import V0.C0695n;
import V0.S;
import V0.U;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.android.gms.maps.model.UrlTileProvider;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class s implements TileProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UrlTileProvider f24972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f24980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f24983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f24984m;

    public s(int i7, boolean z3, String str, int i10, int i11, int i12, boolean z8, String str2, int i13, boolean z10, Context context, boolean z11) {
        this.f24972a = new r(this, i7, i7, str);
        this.f24974c = i7;
        this.f24975d = z3;
        this.f24973b = str;
        this.f24976e = i10;
        this.f24977f = i11;
        this.f24978g = i12;
        this.f24979h = z8;
        this.f24980i = str2;
        this.f24981j = i13;
        this.f24982k = z10;
        this.f24983l = context;
        this.f24984m = z11;
    }

    public final String a(int i7, int i10, int i11) {
        if (this.f24980i == null) {
            return null;
        }
        return this.f24980i + '/' + i11 + "/" + i7 + "/" + i10;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x02a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x029f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.InputStream] */
    public final byte[] b(int i7, int i10, int i11) throws Throwable {
        Context context;
        String str;
        String str2;
        Object obj;
        Object obj2;
        Class cls;
        String str3;
        String str4;
        String str5;
        String str6;
        int i12;
        int i13;
        Object obj3;
        int i14;
        byte[] bArr;
        ?? r3;
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        byte[] bArr2;
        String str7;
        Object obj4;
        String str8 = this.f24980i;
        Context context2 = this.f24983l;
        V0.D networkType = V0.D.f9864b;
        if (str8 != null) {
            byte[] bArrC = c(i7, i10, i11);
            if (bArrC == null || this.f24982k) {
                bArr = bArrC;
                context = context2;
            } else {
                String strA = a(i7, i10, i11);
                bArr = bArrC;
                context = context2;
                if ((System.currentTimeMillis() - new File(strA).lastModified()) / 1000 > this.f24981j) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Intrinsics.checkNotNullParameter(networkType, "networkType");
                    androidx.work.impl.utils.g gVar = new androidx.work.impl.utils.g(null);
                    Set setB0 = CollectionsKt.b0(linkedHashSet);
                    str2 = "tag";
                    cls = MapTileWorker.class;
                    str7 = "workerClass";
                    str5 = "constraints";
                    str4 = "networkType";
                    C0689h c0689h = new C0689h(gVar, networkType, false, false, false, false, -1L, -1L, setB0);
                    Intrinsics.checkNotNullParameter(cls, str7);
                    V0.E e10 = new V0.E(cls, false);
                    Intrinsics.checkNotNullParameter(c0689h, str5);
                    ((androidx.work.impl.model.k) e10.f9906b).f18621j = c0689h;
                    Intrinsics.checkNotNullParameter(strA, str2);
                    ((Set) e10.f9907c).add(strA);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    i12 = i7;
                    i13 = i10;
                    i14 = i11;
                    String string = this.f24972a.getTileUrl(i12, i13, i14).toString();
                    obj3 = "url";
                    str6 = "key";
                    Intrinsics.checkNotNullParameter(obj3, str6);
                    linkedHashMap.put(obj3, string);
                    Intrinsics.checkNotNullParameter("filename", str6);
                    linkedHashMap.put("filename", strA);
                    int i15 = this.f24981j;
                    obj2 = "filename";
                    obj4 = "maxAge";
                    Intrinsics.checkNotNullParameter(obj4, str6);
                    linkedHashMap.put(obj4, Integer.valueOf(i15));
                    C0695n inputData = new C0695n(linkedHashMap);
                    C0695n.f9956b.toByteArrayInternalV1(inputData);
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    str = "inputData";
                    ((androidx.work.impl.model.k) e10.f9906b).f18616e = inputData;
                    U.f9904a.getInstance(context.getApplicationContext()).d(strA, (V0.G) e10.a());
                }
            }
            str = "inputData";
            str2 = "tag";
            obj = "maxAge";
            obj2 = "filename";
            cls = MapTileWorker.class;
            str3 = "workerClass";
            str4 = "networkType";
            str5 = "constraints";
            str6 = "key";
            i12 = i7;
            i13 = i10;
            obj3 = "url";
            i14 = i11;
        } else {
            context = context2;
            str = "inputData";
            str2 = "tag";
            obj = "maxAge";
            obj2 = "filename";
            cls = MapTileWorker.class;
            str3 = "workerClass";
            str4 = "networkType";
            str5 = "constraints";
            str6 = "key";
            i12 = i7;
            i13 = i10;
            obj3 = "url";
            i14 = i11;
            bArr = null;
        }
        if (bArr == null && !this.f24982k && this.f24980i != null) {
            str3 = str7;
            obj = obj4;
            String strA2 = a(i7, i10, i11);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Intrinsics.checkNotNullParameter(networkType, str4);
            Object obj5 = obj3;
            String str9 = str6;
            Object obj6 = obj;
            Object obj7 = obj2;
            C0689h c0689h2 = new C0689h(new androidx.work.impl.utils.g(null), networkType, false, false, false, false, -1L, -1L, CollectionsKt.b0(linkedHashSet2));
            Intrinsics.checkNotNullParameter(cls, str3);
            V0.E e11 = new V0.E(cls, false);
            Intrinsics.checkNotNullParameter(c0689h2, str5);
            ((androidx.work.impl.model.k) e11.f9906b).f18621j = c0689h2;
            Intrinsics.checkNotNullParameter(strA2, str2);
            ((Set) e11.f9907c).add(strA2);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String string2 = this.f24972a.getTileUrl(i7, i10, i11).toString();
            Intrinsics.checkNotNullParameter(obj5, str9);
            linkedHashMap2.put(obj5, string2);
            Intrinsics.checkNotNullParameter(obj7, str9);
            linkedHashMap2.put(obj7, strA2);
            Intrinsics.checkNotNullParameter(obj6, str9);
            linkedHashMap2.put(obj6, -1);
            C0695n c0695n = new C0695n(linkedHashMap2);
            C0695n.f9956b.toByteArrayInternalV1(c0695n);
            Intrinsics.checkNotNullParameter(c0695n, str);
            ((androidx.work.impl.model.k) e11.f9906b).f18616e = c0695n;
            V0.G g7 = (V0.G) e11.a();
            U t = U.f9904a.getInstance(context.getApplicationContext());
            androidx.concurrent.futures.m mVar = (androidx.concurrent.futures.m) ((p1.d) t.d(strA2, g7)).f41179c;
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                mVar.get(1L, timeUnit);
                Thread.sleep(500L);
                ((S) ((List) t.e(strA2).f15066b.get(1L, timeUnit)).get(0)).toString();
                return this.f24980i != null ? c(i7, i10, i11) : bArr;
            } catch (Exception e12) {
                e12.printStackTrace();
                return bArr;
            }
        }
        str3 = str7;
        obj = obj4;
        str3 = str7;
        obj = obj4;
        str3 = str7;
        obj = obj4;
        int i16 = -1;
        if (bArr != null || this.f24982k) {
            return bArr;
        }
        try {
            try {
                InputStream inputStream2 = ((URLConnection) FirebasePerfUrlConnection.instrument(this.f24972a.getTileUrl(i12, i13, i14).openConnection())).getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr3 = new byte[16384];
                        while (true) {
                            int i17 = inputStream2.read(bArr3, 0, 16384);
                            int i18 = i16;
                            if (i17 == i18) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr3, 0, i17);
                            i16 = i18;
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            inputStream2.close();
                        } catch (Exception unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        bArr2 = byteArray;
                    } catch (IOException e13) {
                        e = e13;
                        inputStream = inputStream2;
                        e.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        bArr2 = null;
                    } catch (OutOfMemoryError e14) {
                        e = e14;
                        inputStream = inputStream2;
                        e.printStackTrace();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        bArr2 = null;
                    }
                } catch (IOException e15) {
                    e = e15;
                    byteArrayOutputStream = null;
                    inputStream = inputStream2;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    bArr2 = null;
                    return bArr2;
                } catch (OutOfMemoryError e16) {
                    e = e16;
                    byteArrayOutputStream = null;
                    inputStream = inputStream2;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    bArr2 = null;
                    return bArr2;
                } catch (Throwable th) {
                    th = th;
                    r3 = 0;
                    r10 = inputStream2;
                    if (r10 != 0) {
                        try {
                            r10.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (r3 == 0) {
                        throw th;
                    }
                    try {
                        r3.close();
                        throw th;
                    } catch (Exception unused6) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r3 = str3;
                r10 = obj;
            }
        } catch (IOException e17) {
            e = e17;
            byteArrayOutputStream = null;
            inputStream = null;
            e.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            bArr2 = null;
            return bArr2;
        } catch (OutOfMemoryError e18) {
            e = e18;
            byteArrayOutputStream = null;
            inputStream = null;
            e.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            bArr2 = null;
            return bArr2;
        } catch (Throwable th3) {
            th = th3;
            r3 = 0;
            r10 = 0;
        }
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    public final byte[] c(int i7, int i10, int i11) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        ?? r10;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        String strA = a(i7, i10, i11);
        if (strA == null) {
            return null;
        }
        File file = new File(strA);
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int i12 = fileInputStream2.read(bArr, 0, 16384);
                            if (i12 == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i12);
                        }
                        byteArrayOutputStream2.flush();
                        if (this.f24981j == 0) {
                            file.setLastModified(System.currentTimeMillis());
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        try {
                            fileInputStream2.close();
                        } catch (Exception unused) {
                        }
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused2) {
                        }
                        return byteArray;
                    } catch (IOException e10) {
                        e = e10;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Exception unused4) {
                            }
                        }
                        return null;
                    } catch (OutOfMemoryError e11) {
                        e = e11;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (byteArrayOutputStream2 != null) {
                            byteArrayOutputStream2.close();
                        }
                        return null;
                    }
                } catch (IOException e12) {
                    e = e12;
                    byteArrayOutputStream2 = null;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    return null;
                } catch (OutOfMemoryError e13) {
                    e = e13;
                    byteArrayOutputStream2 = null;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    byteArrayOutputStream = null;
                    th = th2;
                    r10 = fileInputStream2;
                    if (r10 != 0) {
                        try {
                            r10.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (byteArrayOutputStream == null) {
                        throw th;
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (Exception unused6) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r10 = strA;
            }
        } catch (IOException e14) {
            e = e14;
            fileInputStream = null;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            return null;
        } catch (OutOfMemoryError e15) {
            e = e15;
            fileInputStream = null;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            return null;
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            r10 = 0;
        }
    }

    public final byte[] d(int i7, int i10, int i11, int i12) throws Throwable {
        int i13 = i11 - i12;
        int i14 = 1 << i13;
        int i15 = i7 >> i13;
        int i16 = i10 >> i13;
        int i17 = i11 - i13;
        int i18 = i7 % i14;
        int i19 = i10 % i14;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        byte[] bArrB = b(i15, i16, i17);
        if (bArrB == null) {
            return null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length);
        int i20 = this.f24974c / i14;
        int i21 = i18 * i20;
        int i22 = i19 * i20;
        canvas.drawBitmap(bitmapDecodeByteArray, new Rect(i21, i22, i21 + i20, i20 + i22), new Rect(0, 0, 512, 512), paint);
        bitmapDecodeByteArray.recycle();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        bitmapCreateBitmap.recycle();
        return byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i7, int i10, int i11) throws Throwable {
        byte[] bArrD;
        int i12;
        if (!this.f24984m) {
            return this.f24972a.getTile(i7, i10, i11);
        }
        int i13 = this.f24976e;
        if (i13 <= 0) {
            i13 = Integer.MAX_VALUE;
        }
        if (this.f24974c != 256 || !this.f24975d || (i12 = i11 + 1) > this.f24977f || i12 > i13) {
            bArrD = null;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            int i14 = i7 * 2;
            int i15 = i10 * 2;
            byte[] bArrB = b(i14, i15, i12);
            int i16 = i15 + 1;
            byte[] bArrB2 = b(i14, i16, i12);
            int i17 = i14 + 1;
            byte[] bArrB3 = b(i17, i15, i12);
            byte[] bArrB4 = b(i17, i16, i12);
            if (bArrB == null || bArrB2 == null || bArrB3 == null || bArrB4 == null) {
                bArrD = null;
            } else {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length);
                canvas.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, paint);
                bitmapDecodeByteArray.recycle();
                Bitmap bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(bArrB2, 0, bArrB2.length);
                canvas.drawBitmap(bitmapDecodeByteArray2, 0.0f, 256.0f, paint);
                bitmapDecodeByteArray2.recycle();
                Bitmap bitmapDecodeByteArray3 = BitmapFactory.decodeByteArray(bArrB3, 0, bArrB3.length);
                canvas.drawBitmap(bitmapDecodeByteArray3, 256.0f, 0.0f, paint);
                bitmapDecodeByteArray3.recycle();
                Bitmap bitmapDecodeByteArray4 = BitmapFactory.decodeByteArray(bArrB4, 0, bArrB4.length);
                canvas.drawBitmap(bitmapDecodeByteArray4, 256.0f, 256.0f, paint);
                bitmapDecodeByteArray4.recycle();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArrD = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                bitmapCreateBitmap.recycle();
            }
        }
        int i18 = this.f24977f;
        if (i11 > i18) {
            bArrD = d(i7, i10, i11, i18);
        }
        if (bArrD == null && i11 <= i13) {
            bArrD = b(i7, i10, i11);
        }
        if (bArrD == null && this.f24980i != null && this.f24982k) {
            int i19 = this.f24977f;
            int iMax = Math.max(this.f24978g, i11 - 3);
            for (int i20 = i11 > i19 ? i19 - 1 : i11 - 1; i20 >= iMax; i20--) {
                bArrD = d(i7, i10, i11, i20);
                if (bArrD != null) {
                    break;
                }
            }
        }
        if (bArrD == null) {
            return null;
        }
        int i21 = this.f24974c;
        return new Tile(i21, i21, bArrD);
    }
}
