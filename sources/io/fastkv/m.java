package io.fastkv;

import Pa.C0505b;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import io.fastkv.interfaces.FastEncoder;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f37645B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f37649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f37651e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0505b f37654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37656j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37661o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FileChannel f37665s;
    public FileChannel t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public MappedByteBuffer f37666u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MappedByteBuffer f37667v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f37668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f37669x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f37646z = new byte[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f37644A = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f37652f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f37653g = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f37657k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37658l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f37659m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f37660n = new o();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f37662p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f37663q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f37664r = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f37670y = true;

    static {
        int iIntValue;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            iIntValue = ((Integer) declaredMethod.invoke(declaredField.get(null), new Object[0])).intValue();
        } catch (Throwable unused) {
            iIntValue = 16384;
        }
        f37645B = iIntValue;
    }

    public m(String str, String str2, FastEncoder[] fastEncoderArr, int i7) {
        this.f37647a = str;
        this.f37648b = str2;
        this.f37669x = i7;
        HashMap map = new HashMap();
        if (fastEncoderArr != null) {
            for (FastEncoder fastEncoder : fastEncoderArr) {
                String strTag = fastEncoder.tag();
                if (map.containsKey(strTag)) {
                    p059e1.a.k(this, "duplicate encoder tag:" + strTag);
                } else {
                    map.put(strTag, fastEncoder);
                }
            }
        }
        map.put("StringSet", q.f37676a);
        this.f37649c = map;
        synchronized (this.f37652f) {
            n.j().execute(new k(this, 1));
            if (!this.f37653g) {
                try {
                    this.f37652f.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static m a(Context context, String str) {
        l lVar = new l(context.getFilesDir().getAbsolutePath() + "/fastkv", str);
        String str2 = lVar.f37642a + lVar.f37643b;
        ConcurrentHashMap concurrentHashMap = l.f37641c;
        m mVar = (m) concurrentHashMap.get(str2);
        if (mVar == null) {
            synchronized (l.class) {
                try {
                    mVar = (m) concurrentHashMap.get(str2);
                    if (mVar == null) {
                        mVar = new m(lVar.f37642a, lVar.f37643b, null, 0);
                        concurrentHashMap.put(str2, mVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (mVar.contains("kv_import_flag")) {
            return mVar;
        }
        Map<String, ?> all = context.getSharedPreferences(str, 0).getAll();
        synchronized (mVar) {
            try {
                if (!mVar.f37659m) {
                    if (mVar.f37669x != 0) {
                        mVar.f37670y = false;
                    }
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (key != null && !key.isEmpty()) {
                            if (value instanceof String) {
                                mVar.putString(key, (String) value);
                            } else if (value instanceof Boolean) {
                                mVar.putBoolean(key, ((Boolean) value).booleanValue());
                            } else if (value instanceof Integer) {
                                mVar.putInt(key, ((Integer) value).intValue());
                            } else if (value instanceof Long) {
                                mVar.putLong(key, ((Long) value).longValue());
                            } else if (value instanceof Float) {
                                mVar.putFloat(key, ((Float) value).floatValue());
                            } else if (value instanceof Double) {
                                mVar.j(key, ((Double) value).doubleValue());
                            } else if (value instanceof byte[]) {
                                mVar.i(key, (byte[]) value);
                            } else {
                                if (value instanceof Set) {
                                    Set set = (Set) value;
                                    if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                                        mVar.putStringSet(key, set);
                                    }
                                }
                                new Exception("missing encoders");
                            }
                        }
                    }
                    if (mVar.f37669x != 0) {
                        mVar.commit();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        mVar.putBoolean("kv_import_flag", true);
        return mVar;
    }

    public static void c(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        if (this.f37659m) {
            return;
        }
        this.f37670y = true;
        e();
    }

    public final void b(String str, Object obj, byte[] bArr, j jVar, byte b7) {
        b aVar;
        if (jVar == null) {
            int iR = r(str, bArr, b7);
            if (iR > 0) {
                int length = bArr.length;
                if (b7 == 6) {
                    aVar = new i(this.f37655i, iR, (String) obj, length, false);
                } else {
                    aVar = b7 == 7 ? new a(this.f37655i, iR, obj, length, false) : new h(this.f37655i, iR, obj, length, false);
                }
                this.f37652f.put(str, aVar);
                o();
                return;
            }
            return;
        }
        if (!jVar.f37638e && jVar.f37637d == bArr.length) {
            int i7 = jVar.f37628a;
            int length2 = bArr.length;
            this.f37651e ^= this.f37654h.f(i7, length2);
            C0505b c0505b = this.f37654h;
            c0505b.f7072b = i7;
            c0505b.o(bArr);
            long jF = this.f37651e ^ this.f37654h.f(i7, length2);
            this.f37651e = jF;
            if (this.f37669x == 0) {
                this.f37666u.putInt(0, -1);
                this.f37666u.putLong(4, this.f37651e);
                this.f37666u.position(i7);
                this.f37666u.put(bArr);
                this.f37666u.putInt(0, this.f37650d - 12);
                this.f37667v.putLong(4, this.f37651e);
                this.f37667v.position(i7);
                this.f37667v.put(bArr);
            } else {
                this.f37654h.r(4, jF);
            }
            jVar.f37635b = obj;
            return;
        }
        int iR2 = r(str, bArr, jVar.a());
        if (iR2 > 0) {
            String str2 = jVar.f37638e ? (String) jVar.f37635b : null;
            l(jVar.f37636c, jVar.f37628a + jVar.f37637d, jVar.a());
            jVar.f37636c = this.f37655i;
            jVar.f37628a = iR2;
            jVar.f37638e = false;
            jVar.f37635b = obj;
            jVar.f37637d = bArr.length;
            o();
            if (this.f37661o >= 8192 || this.f37662p.size() >= 100) {
                com.palmpay.lib.apm.launchcounter.util.d.p(this, 0);
            }
            if (str2 != null) {
                if (this.f37669x == 0) {
                    n.j().execute(new com.flexibank.sdk.g(20, this, str2));
                } else {
                    this.f37657k.add(str2);
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            if (this.f37659m) {
                return this;
            }
            com.facebook.imagepipeline.nativecode.b.f(this);
            if (this.f37669x != 0) {
                com.facebook.imagepipeline.nativecode.b.i(this);
            }
            h(null);
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        if (this.f37659m) {
            return false;
        }
        this.f37670y = true;
        return e();
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f37652f.containsKey(str);
    }

    public final synchronized void d() {
        if (!this.f37659m) {
            this.f37659m = true;
            if (this.f37669x == 0) {
                FileChannel fileChannel = this.f37665s;
                if (fileChannel != null) {
                    try {
                        fileChannel.force(true);
                    } catch (IOException unused) {
                    }
                }
                FileChannel fileChannel2 = this.f37665s;
                if (fileChannel2 != null) {
                    try {
                        fileChannel2.close();
                    } catch (IOException unused2) {
                    }
                }
                FileChannel fileChannel3 = this.t;
                if (fileChannel3 != null) {
                    try {
                        fileChannel3.force(true);
                    } catch (IOException unused3) {
                    }
                }
                FileChannel fileChannel4 = this.t;
                if (fileChannel4 != null) {
                    try {
                        fileChannel4.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        }
        synchronized (l.class) {
            l.f37641c.remove(this.f37647a + this.f37648b);
        }
    }

    public final boolean e() {
        int i7 = this.f37669x;
        if (i7 == 1) {
            this.f37660n.execute(new k(this, 0));
            return true;
        }
        if (i7 == 2) {
            return com.facebook.imagepipeline.nativecode.b.Y(this);
        }
        return true;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    public final synchronized Object f(String str) {
        b bVar = (b) this.f37652f.get(str);
        if (bVar != null && bVar.a() == 8) {
            h hVar = (h) bVar;
            if (!hVar.f37638e) {
                return hVar.f37635b;
            }
            Object objT = com.facebook.imagepipeline.nativecode.b.t(this, hVar);
            if (objT == null) {
                remove(str);
                return null;
            }
            hVar.f37635b = objT;
            hVar.f37638e = false;
            return objT;
        }
        return null;
    }

    public final void g(String str) {
        if (this.f37669x != 0 && this.f37670y) {
            e();
        }
        h(str);
    }

    @Override // android.content.SharedPreferences
    public final synchronized Map getAll() {
        Object objValueOf;
        int size = this.f37652f.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f37652f.entrySet()) {
            String str = (String) entry.getKey();
            b bVar = (b) entry.getValue();
            switch (bVar.a()) {
                case 1:
                    objValueOf = Boolean.valueOf(((c) bVar).f37629b);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((f) bVar).f37632b);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((e) bVar).f37631b);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((g) bVar).f37633b);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((d) bVar).f37630b);
                    break;
                case 6:
                    i iVar = (i) bVar;
                    objValueOf = iVar.f37638e ? com.facebook.imagepipeline.nativecode.b.w(this, iVar) : iVar.f37635b;
                    break;
                case 7:
                    a aVar = (a) bVar;
                    objValueOf = aVar.f37638e ? com.facebook.imagepipeline.nativecode.b.p(this, aVar) : aVar.f37635b;
                    break;
                case 8:
                    h hVar = (h) bVar;
                    objValueOf = hVar.f37638e ? com.facebook.imagepipeline.nativecode.b.t(this, hVar) : ((h) bVar).f37635b;
                    break;
                default:
                    objValueOf = null;
                    break;
            }
            if (objValueOf != null) {
                map.put(str, objValueOf);
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean getBoolean(String str, boolean z3) {
        b bVar = (b) this.f37652f.get(str);
        if (bVar != null) {
            z3 = bVar.b();
        }
        return z3;
    }

    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f10) {
        b bVar = (b) this.f37652f.get(str);
        if (bVar != null) {
            f10 = bVar.c();
        }
        return f10;
    }

    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i7) {
        b bVar = (b) this.f37652f.get(str);
        if (bVar != null) {
            i7 = bVar.d();
        }
        return i7;
    }

    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j6) {
        b bVar = (b) this.f37652f.get(str);
        if (bVar != null) {
            j6 = bVar.e();
        }
        return j6;
    }

    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        b bVar = (b) this.f37652f.get(str);
        if (bVar == null) {
            return str2;
        }
        if (bVar.a() == 6) {
            i iVar = (i) bVar;
            if (iVar.f37638e) {
                String strW = com.facebook.imagepipeline.nativecode.b.w(this, iVar);
                if (strW != null && !strW.isEmpty()) {
                    iVar.f37635b = strW;
                    iVar.f37638e = false;
                    return strW;
                }
                remove(str);
                return str2;
            }
        }
        return bVar.f();
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) f(str);
        }
        return set2 != null ? set2 : set;
    }

    public final synchronized void h(String str) {
        if (this.f37663q.isEmpty()) {
            return;
        }
        Iterator it = this.f37663q.iterator();
        while (it.hasNext()) {
            this.f37664r.post(new androidx.emoji2.text.j(this, 23, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str));
        }
    }

    public final synchronized void i(String str, byte[] bArr) {
        Throwable th;
        try {
            try {
                if (this.f37659m) {
                    return;
                }
                c(str);
                try {
                    if (bArr == null) {
                        remove(str);
                    } else {
                        b bVar = (b) this.f37652f.get(str);
                        if (bVar != null && bVar.a() != 7) {
                            remove(str);
                            bVar = null;
                        }
                        b(str, bArr, bArr, (a) bVar, (byte) 7);
                        g(str);
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final synchronized void j(String str, double d2) {
        Throwable th;
        try {
            try {
                if (this.f37659m) {
                    return;
                }
                c(str);
                b bVar = (b) this.f37652f.get(str);
                if (bVar != null) {
                    try {
                        if (bVar.a() != 5) {
                            remove(str);
                            bVar = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                d dVar = (d) bVar;
                if (dVar != null) {
                    if (dVar.f37630b != d2) {
                        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2);
                        long jH = jDoubleToRawLongBits ^ this.f37654h.h(dVar.f37628a);
                        dVar.f37630b = d2;
                        q(jDoubleToRawLongBits, jH, dVar.f37628a);
                        g(str);
                    }
                    return;
                }
                s(str, (byte) 5, f37644A[5]);
                C0505b c0505b = this.f37654h;
                int i7 = c0505b.f7072b;
                c0505b.r(c0505b.f7072b, Double.doubleToRawLongBits(d2));
                c0505b.f7072b += 8;
                o();
                this.f37652f.put(str, new d(i7, d2));
                g(str);
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final synchronized void k(String str, Object obj, FastEncoder fastEncoder) {
        Throwable th;
        byte[] bArrEncode;
        try {
            try {
                if (this.f37659m) {
                    return;
                }
                c(str);
                if (fastEncoder == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                String strTag = fastEncoder.tag();
                if (strTag == null || strTag.isEmpty() || strTag.length() > 50) {
                    throw new IllegalArgumentException("Invalid encoder tag:" + strTag);
                }
                if (!this.f37649c.containsKey(strTag)) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    b bVar = null;
                    try {
                        bArrEncode = fastEncoder.encode(obj);
                    } catch (Exception e10) {
                        Log.e("FastKV", this.f37648b, e10);
                        bArrEncode = null;
                    }
                    if (bArrEncode == null) {
                        remove(str);
                        return;
                    }
                    b bVar2 = (b) this.f37652f.get(str);
                    if (bVar2 == null || bVar2.a() == 8) {
                        bVar = bVar2;
                    } else {
                        remove(str);
                    }
                    h hVar = (h) bVar;
                    int iL = C0505b.l(strTag);
                    C0505b c0505b = new C0505b(iL + 1 + bArrEncode.length);
                    c0505b.n((byte) iL);
                    c0505b.s(strTag);
                    c0505b.o(bArrEncode);
                    byte[] bArr = (byte[]) c0505b.f7074d;
                    if (bArr == null) {
                        return;
                    }
                    b(str, obj, bArr, hVar, (byte) 8);
                    g(str);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final void l(int i7, int i10, byte b7) {
        this.f37661o = (i10 - i7) + this.f37661o;
        ArrayList arrayList = this.f37662p;
        p pVar = new p();
        pVar.f37674a = i7;
        pVar.f37675b = i10;
        arrayList.add(pVar);
        byte b10 = (byte) (b7 | UnsignedBytes.MAX_POWER_OF_TWO);
        byte[] bArr = (byte[]) this.f37654h.f7074d;
        this.f37651e = ((((long) (bArr[i7] ^ b10)) & 255) << ((i7 & 7) << 3)) ^ this.f37651e;
        bArr[i7] = b10;
        this.f37668w = i7;
    }

    public final void m(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f37651e);
        int i7 = this.f37668w;
        if (i7 != 0) {
            mappedByteBuffer.put(i7, ((byte[]) this.f37654h.f7074d)[i7]);
        }
        if (this.f37656j != 0) {
            mappedByteBuffer.position(this.f37655i);
            mappedByteBuffer.put((byte[]) this.f37654h.f7074d, this.f37655i, this.f37656j);
        }
    }

    public final void n(byte b7, int i7) {
        long jT = this.f37651e ^ com.facebook.imagepipeline.nativecode.b.T(i7, 1L);
        this.f37651e = jT;
        if (this.f37669x == 0) {
            this.f37666u.putLong(4, jT);
            this.f37666u.put(i7, b7);
            this.f37667v.putLong(4, this.f37651e);
            this.f37667v.put(i7, b7);
        } else {
            this.f37654h.r(4, jT);
        }
        ((byte[]) this.f37654h.f7074d)[i7] = b7;
    }

    public final void o() {
        this.f37651e ^= this.f37654h.f(this.f37655i, this.f37656j);
        int i7 = this.f37650d - 12;
        if (this.f37669x == 0) {
            this.f37666u.putInt(0, -1);
            m(this.f37666u);
            this.f37666u.putInt(0, i7);
            this.f37667v.putInt(0, i7);
            m(this.f37667v);
        } else {
            this.f37654h.q(0, i7);
            this.f37654h.r(4, this.f37651e);
        }
        this.f37668w = 0;
        this.f37656j = 0;
    }

    public final void p(int i7, int i10, long j6) {
        long jT = com.facebook.imagepipeline.nativecode.b.T(i10, j6) ^ this.f37651e;
        this.f37651e = jT;
        if (this.f37669x == 0) {
            this.f37666u.putLong(4, jT);
            this.f37666u.putInt(i10, i7);
            this.f37667v.putLong(4, this.f37651e);
            this.f37667v.putInt(i10, i7);
        } else {
            this.f37654h.r(4, jT);
        }
        this.f37654h.q(i10, i7);
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z3) {
        try {
            if (this.f37659m) {
                return this;
            }
            c(str);
            b bVar = (b) this.f37652f.get(str);
            if (bVar != null && bVar.a() != 1) {
                remove(str);
                bVar = null;
            }
            c cVar = (c) bVar;
            if (cVar == null) {
                s(str, (byte) 1, f37644A[1]);
                C0505b c0505b = this.f37654h;
                int i7 = c0505b.f7072b;
                c0505b.n(z3 ? (byte) 1 : (byte) 0);
                o();
                this.f37652f.put(str, new c(i7, z3));
                g(str);
            } else if (cVar.f37629b != z3) {
                cVar.f37629b = z3;
                n(z3 ? (byte) 1 : (byte) 0, cVar.f37628a);
                g(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f10) {
        try {
            if (this.f37659m) {
                return this;
            }
            c(str);
            b bVar = (b) this.f37652f.get(str);
            if (bVar != null && bVar.a() != 3) {
                remove(str);
                bVar = null;
            }
            e eVar = (e) bVar;
            if (eVar == null) {
                s(str, (byte) 3, f37644A[3]);
                C0505b c0505b = this.f37654h;
                int i7 = c0505b.f7072b;
                c0505b.p(Float.floatToRawIntBits(f10));
                o();
                this.f37652f.put(str, new e(i7, f10));
                g(str);
            } else if (eVar.f37631b != f10) {
                int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
                C0505b c0505b2 = this.f37654h;
                int i10 = eVar.f37628a;
                byte[] bArr = (byte[]) c0505b2.f7074d;
                int i11 = ((bArr[i10 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i10] & UnsignedBytes.MAX_VALUE);
                long j6 = ((long) (((bArr[i10 + 3] << Ascii.CAN) | (i11 | ((bArr[i10 + 2] & UnsignedBytes.MAX_VALUE) << 16))) ^ iFloatToRawIntBits)) & 4294967295L;
                eVar.f37631b = f10;
                p(iFloatToRawIntBits, eVar.f37628a, j6);
                g(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i7) {
        try {
            if (this.f37659m) {
                return this;
            }
            c(str);
            b bVar = (b) this.f37652f.get(str);
            if (bVar != null && bVar.a() != 2) {
                remove(str);
                bVar = null;
            }
            f fVar = (f) bVar;
            if (fVar == null) {
                s(str, (byte) 2, f37644A[2]);
                C0505b c0505b = this.f37654h;
                int i10 = c0505b.f7072b;
                c0505b.p(i7);
                o();
                this.f37652f.put(str, new f(i10, i7));
                g(str);
            } else {
                int i11 = fVar.f37632b;
                if (i11 != i7) {
                    fVar.f37632b = i7;
                    p(i7, fVar.f37628a, ((long) (i11 ^ i7)) & 4294967295L);
                    g(str);
                }
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putLong(String str, long j6) {
        Throwable th;
        m mVar;
        try {
            try {
                if (this.f37659m) {
                    return this;
                }
                c(str);
                b bVar = (b) this.f37652f.get(str);
                if (bVar != null) {
                    try {
                        if (bVar.a() != 4) {
                            remove(str);
                            bVar = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                g gVar = (g) bVar;
                if (gVar != null) {
                    long j10 = gVar.f37633b;
                    if (j10 != j6) {
                        long j11 = j6 ^ j10;
                        gVar.f37633b = j6;
                        mVar = this;
                        mVar.q(j6, j11, gVar.f37628a);
                        g(str);
                    }
                    return mVar;
                }
                s(str, (byte) 4, f37644A[4]);
                C0505b c0505b = this.f37654h;
                int i7 = c0505b.f7072b;
                c0505b.r(i7, j6);
                c0505b.f7072b += 8;
                o();
                this.f37652f.put(str, new g(i7, j6));
                g(str);
                mVar = this;
                return mVar;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putString(String str, String str2) {
        Throwable th;
        m mVar;
        try {
            try {
                if (this.f37659m) {
                    return this;
                }
                c(str);
                try {
                    if (str2 == null) {
                        remove(str);
                        mVar = this;
                    } else {
                        b bVar = (b) this.f37652f.get(str);
                        if (bVar != null && bVar.a() != 6) {
                            remove(str);
                            bVar = null;
                        }
                        i iVar = (i) bVar;
                        if (iVar != null && !iVar.f37638e && str2.equals(iVar.f37635b)) {
                            return this;
                        }
                        byte[] bytes = str2.isEmpty() ? f37646z : str2.getBytes(StandardCharsets.UTF_8);
                        if (bytes == null) {
                            Log.e("FastKV", this.f37648b, new Exception("Encrypt failed"));
                            return this;
                        }
                        mVar = this;
                        mVar.b(str, str2, bytes, iVar, (byte) 6);
                        g(str);
                    }
                    return mVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putStringSet(String str, Set set) {
        try {
            if (this.f37659m) {
                return this;
            }
            if (set == null) {
                remove(str);
            } else {
                k(str, set, q.f37676a);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void q(long j6, long j10, int i7) {
        long jT = com.facebook.imagepipeline.nativecode.b.T(i7, j10) ^ this.f37651e;
        this.f37651e = jT;
        if (this.f37669x == 0) {
            this.f37666u.putLong(4, jT);
            this.f37666u.putLong(i7, j6);
            this.f37667v.putLong(4, this.f37651e);
            this.f37667v.putLong(i7, j6);
        } else {
            this.f37654h.r(4, jT);
        }
        this.f37654h.r(i7, j6);
    }

    public final int r(String str, byte[] bArr, byte b7) {
        boolean z3 = bArr.length >= 65535;
        if (z3) {
            if (b7 == 6) {
                b7 = 9;
            } else if (b7 == 7) {
                b7 = 10;
            } else if (b7 == 8) {
                b7 = Ascii.VT;
            }
        }
        s(str, b7, (z3 ? 4 : 2) + bArr.length);
        if (z3) {
            this.f37654h.p(bArr.length);
        } else {
            C0505b c0505b = this.f37654h;
            short length = (short) bArr.length;
            byte[] bArr2 = (byte[]) c0505b.f7074d;
            int i7 = c0505b.f7072b;
            int i10 = i7 + 1;
            c0505b.f7072b = i10;
            bArr2[i7] = (byte) length;
            c0505b.f7072b = i7 + 2;
            bArr2[i10] = (byte) (length >> 8);
        }
        C0505b c0505b2 = this.f37654h;
        int i11 = c0505b2.f7072b;
        c0505b2.o(bArr);
        return i11;
    }

    @Override // android.content.SharedPreferences
    public final synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.f37663q.contains(onSharedPreferenceChangeListener)) {
            this.f37663q.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            if (this.f37659m) {
                return this;
            }
            b bVar = (b) this.f37652f.get(str);
            if (bVar != null) {
                this.f37652f.remove(str);
                byte bA = bVar.a();
                String str2 = null;
                if (bA <= 5) {
                    int iL = C0505b.l(str);
                    int i7 = bVar.f37628a;
                    l(i7 - (iL + 2), i7 + f37644A[bA], bA);
                } else {
                    j jVar = (j) bVar;
                    l(jVar.f37636c, jVar.f37628a + jVar.f37637d, bA);
                    if (jVar.f37638e) {
                        str2 = (String) jVar.f37635b;
                    }
                }
                byte b7 = (byte) (bA | UnsignedBytes.MAX_POWER_OF_TWO);
                if (this.f37669x == 0) {
                    this.f37666u.putLong(4, this.f37651e);
                    this.f37666u.put(this.f37668w, b7);
                    this.f37667v.putLong(4, this.f37651e);
                    this.f37667v.put(this.f37668w, b7);
                } else {
                    this.f37654h.r(4, this.f37651e);
                }
                this.f37668w = 0;
                if (str2 != null) {
                    if (this.f37669x == 0) {
                        n.j().execute(new com.flexibank.sdk.g(20, this, str2));
                    } else {
                        this.f37657k.add(str2);
                    }
                }
                if (this.f37661o >= 8192 || this.f37662p.size() >= 100) {
                    com.palmpay.lib.apm.launchcounter.util.d.p(this, 0);
                }
                if (this.f37669x != 0 && this.f37670y) {
                    e();
                }
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean s(String str, byte b7, int i7) {
        int iL = C0505b.l(str);
        if (iL > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
        int i10 = iL + 2 + i7;
        this.f37656j = i10;
        int length = ((byte[]) this.f37654h.f7074d).length;
        int i11 = this.f37650d + i10;
        if (i11 >= length) {
            int i12 = this.f37661o;
            if (i12 <= i10 || i12 <= 8192) {
                int iS = com.facebook.imagepipeline.nativecode.b.s(length, i11);
                byte[] bArr = new byte[iS];
                System.arraycopy((byte[]) this.f37654h.f7074d, 0, bArr, 0, this.f37650d);
                this.f37654h.f7074d = bArr;
                if (this.f37669x == 0) {
                    MappedByteBuffer mappedByteBufferL = com.facebook.imagepipeline.nativecode.b.L(this.f37665s, iS);
                    MappedByteBuffer mappedByteBufferL2 = com.facebook.imagepipeline.nativecode.b.L(this.t, iS);
                    if (mappedByteBufferL == null || mappedByteBufferL2 == null) {
                        Log.e("FastKV", this.f37648b, new Exception("map failed"));
                        this.f37654h.q(0, this.f37650d - 12);
                        this.f37654h.r(4, this.f37651e);
                        com.facebook.imagepipeline.nativecode.b.W(this);
                    } else {
                        this.f37666u = mappedByteBufferL;
                        this.f37667v = mappedByteBufferL2;
                    }
                }
            } else {
                com.palmpay.lib.apm.launchcounter.util.d.p(this, i10);
            }
        }
        int i13 = this.f37650d;
        this.f37655i = i13;
        this.f37650d = this.f37656j + i13;
        C0505b c0505b = this.f37654h;
        c0505b.f7072b = i13;
        c0505b.n(b7);
        this.f37654h.n((byte) iL);
        if (iL != str.length()) {
            this.f37654h.s(str);
            return true;
        }
        C0505b c0505b2 = this.f37654h;
        str.getBytes(0, iL, (byte[]) c0505b2.f7074d, c0505b2.f7072b);
        this.f37654h.f7072b += iL;
        return true;
    }

    public final String toString() {
        return "FastKV: path:" + this.f37647a + " name:" + this.f37648b;
    }

    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f37663q.remove(onSharedPreferenceChangeListener);
    }
}
