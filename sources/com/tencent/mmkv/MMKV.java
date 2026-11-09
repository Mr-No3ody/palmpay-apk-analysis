package com.tencent.mmkv;

import N8.q0;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import dalvik.annotation.optimization.FastNative;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p126i8.a;
import p126i8.b;

/* JADX INFO: loaded from: classes3.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumMap f25518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumMap f25519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a[] f25520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f25521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f25522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f25523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f25524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f25525h;
    private final long nativeHandle;

    public interface LibLoader {
        void loadLibrary(String libName);
    }

    static {
        EnumMap enumMap = new EnumMap(b.class);
        f25518a = enumMap;
        enumMap.put(b.f37434a, 0);
        enumMap.put(b.f37435b, 1);
        EnumMap enumMap2 = new EnumMap(a.class);
        f25519b = enumMap2;
        a aVar = a.f37428a;
        enumMap2.put(aVar, 0);
        a aVar2 = a.f37429b;
        enumMap2.put(aVar2, 1);
        a aVar3 = a.f37430c;
        enumMap2.put(aVar3, 2);
        a aVar4 = a.f37431d;
        enumMap2.put(aVar4, 3);
        a aVar5 = a.f37432e;
        enumMap2.put(aVar5, 4);
        f25520c = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        f25521d = new HashSet();
        f25522e = null;
        f25523f = true;
        f25524g = new HashMap();
        f25525h = false;
    }

    public MMKV(long j6) {
        this.nativeHandle = j6;
    }

    public static MMKV a(int i7, long j6, String str) {
        String str2;
        if (j6 == 0) {
            throw new RuntimeException(q0.k("Fail to create an MMKV instance [", str, "] in JNI"));
        }
        if (!f25523f) {
            return new MMKV(j6);
        }
        HashSet hashSet = f25521d;
        synchronized (hashSet) {
            try {
                if (!hashSet.contains(Long.valueOf(j6))) {
                    if (!checkProcessMode(j6)) {
                        if (i7 == 1) {
                            str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                        } else {
                            str2 = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                        }
                        throw new IllegalArgumentException(str2);
                    }
                    hashSet.add(Long.valueOf(j6));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new MMKV(j6);
    }

    private native long actualSize(long handle);

    private native String[] allKeys(long handle, boolean filterExpire);

    public static native long backupAllToDirectory(String dstDir);

    public static native boolean backupOneToDirectory(String mmapID, String dstDir, @Nullable String rootPath);

    private static native boolean checkProcessMode(long handle);

    private native boolean containsKey(long handle, String key);

    private native long count(long handle, boolean filterExpire);

    private static native long createNB(int size);

    private native boolean decodeBool(long handle, String key, boolean defaultValue);

    @Nullable
    private native byte[] decodeBytes(long handle, String key);

    private native double decodeDouble(long handle, String key, double defaultValue);

    private native float decodeFloat(long handle, String key, float defaultValue);

    private native int decodeInt(long handle, String key, int defaultValue);

    private native long decodeLong(long handle, String key, long defaultValue);

    @Nullable
    private native String decodeString(long handle, String key, @Nullable String defaultValue);

    @Nullable
    private native String[] decodeStringSet(long handle, String key);

    private static native void destroyNB(long pointer, int size);

    public static MMKV e() {
        if (f25522e != null) {
            return a(1, getDefaultMMKV(1, null), "DefaultMMKV");
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private native boolean encodeBool(long handle, String key, boolean value);

    private native boolean encodeBool_2(long handle, String key, boolean value, int expireDurationInSecond);

    private native boolean encodeBytes(long handle, String key, @Nullable byte[] value);

    private native boolean encodeBytes_2(long handle, String key, @Nullable byte[] value, int expireDurationInSecond);

    private native boolean encodeDouble(long handle, String key, double value);

    private native boolean encodeDouble_2(long handle, String key, double value, int expireDurationInSecond);

    private native boolean encodeFloat(long handle, String key, float value);

    private native boolean encodeFloat_2(long handle, String key, float value, int expireDurationInSecond);

    private native boolean encodeInt(long handle, String key, int value);

    private native boolean encodeInt_2(long handle, String key, int value, int expireDurationInSecond);

    private native boolean encodeLong(long handle, String key, long value);

    private native boolean encodeLong_2(long handle, String key, long value, int expireDurationInSecond);

    private native boolean encodeSet(long handle, String key, @Nullable String[] value);

    private native boolean encodeSet_2(long handle, String key, @Nullable String[] value, int expireDurationInSecond);

    private native boolean encodeString(long handle, String key, @Nullable String value);

    private native boolean encodeString_2(long handle, String key, @Nullable String value, int expireDurationInSecond);

    private static native long getDefaultMMKV(int mode, @Nullable String cryptKey);

    private static native long getMMKVWithAshmemFD(String mmapID, int fd2, int metaFD, @Nullable String cryptKey);

    private static native long getMMKVWithID(String mmapID, int mode, @Nullable String cryptKey, @Nullable String rootPath, long expectedCapacity);

    private static native long getMMKVWithIDAndSize(String mmapID, int size, int mode, @Nullable String cryptKey);

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String mmapID, @Nullable String rootPath);

    private static native void jniInitialize(String rootDir, String cacheDir, int level, boolean wantLogReDirecting);

    public static void m(Context context) {
        n(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null);
    }

    private static void mmkvLogImp(int level, String file, int line, String function, String message) {
        if (f25520c[level].ordinal() != 3) {
            return;
        }
        Log.e("MMKV", message);
    }

    public static void n(Context context, String str, com.google.firebase.crashlytics.internal.concurrency.b bVar) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            synchronized (f25521d) {
                f25523f = false;
            }
        } else {
            synchronized (f25521d) {
                f25523f = true;
            }
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        boolean z3 = f25525h;
        if (bVar != null) {
            bVar.loadLibrary("mmkv");
        } else {
            System.loadLibrary("mmkv");
        }
        jniInitialize(str, absolutePath, 1, z3);
        f25522e = str;
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    public static MMKV o(String str) {
        if (f25522e != null) {
            return a(1, getMMKVWithID(str, 1, null, null, 0L), str);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private static void onContentChangedByOuterProcess(String mmapID) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String mmapID) {
        b bVar = b.f37434a;
        q(a.f37429b, "Recover strategic for " + mmapID + " is " + bVar);
        Integer num = (Integer) f25518a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String mmapID) {
        b bVar = b.f37434a;
        q(a.f37429b, "Recover strategic for " + mmapID + " is " + bVar);
        Integer num = (Integer) f25518a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static MMKV p(String str) {
        if (f25522e != null) {
            return a(2, getMMKVWithID(str, 2, null, null, 0L), str);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static native int pageSize();

    public static void q(a aVar, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[stackTrace.length - 1];
        Integer num = (Integer) f25519b.get(aVar);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    public static native boolean removeStorage(String mmapID, @Nullable String rootPath);

    private native void removeValueForKey(long handle, String key);

    public static native long restoreAllFromDirectory(String srcDir);

    public static native boolean restoreOneMMKVFromDirectory(String mmapID, String srcDir, @Nullable String rootPath);

    private static native void setCallbackHandler(boolean logReDirecting, boolean hasCallback);

    private static native void setLogLevel(int level);

    private static native void setWantsContentChangeNotify(boolean needsNotify);

    private native void sync(boolean sync);

    private native long totalSize(long handle);

    private native int valueSize(long handle, String key, boolean actualSize);

    public static native String version();

    private native int writeValueToNB(long handle, String key, long pointer, int size);

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public final byte[] b(String str) {
        byte[] bArrDecodeBytes = decodeBytes(this.nativeHandle, str);
        if (bArrDecodeBytes != null) {
            return bArrDecodeBytes;
        }
        return null;
    }

    public final Parcelable c(String str) {
        Parcelable.Creator creator;
        byte[] bArrDecodeBytes = decodeBytes(this.nativeHandle, str);
        if (bArrDecodeBytes != null) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrDecodeBytes, 0, bArrDecodeBytes.length);
            parcelObtain.setDataPosition(0);
            try {
                try {
                    String string = Object.class.toString();
                    HashMap map = f25524g;
                    synchronized (map) {
                        try {
                            creator = (Parcelable.Creator) map.get(string);
                            if (creator == null && (creator = (Parcelable.Creator) Object.class.getField("CREATOR").get(null)) != null) {
                                map.put(string, creator);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (creator != null) {
                        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        return parcelable;
                    }
                    throw new Exception("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class " + string);
                } catch (Exception e10) {
                    q(a.f37431d, e10.toString());
                    parcelObtain.recycle();
                }
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        return null;
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(@Nullable String cryptKey);

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return containsKey(this.nativeHandle, str);
    }

    @Nullable
    public native String cryptKey();

    public final Set d(String str, Set set) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet != null) {
            try {
                Set set2 = (Set) HashSet.class.newInstance();
                set2.addAll(Arrays.asList(strArrDecodeStringSet));
                return set2;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int expireDurationInSecond);

    public final void f(int i7, String str) {
        encodeInt(this.nativeHandle, str, i7);
    }

    public final void g(long j6, String str) {
        encodeLong(this.nativeHandle, str, j6);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z3) {
        return decodeBool(this.nativeHandle, str, z3);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        return decodeFloat(this.nativeHandle, str, f10);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i7) {
        return decodeInt(this.nativeHandle, str, i7);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j6) {
        return decodeLong(this.nativeHandle, str, j6);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return d(str, set);
    }

    public final void h(String str, Parcelable parcelable) {
        if (parcelable == null) {
            encodeBytes(this.nativeHandle, str, null);
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        encodeBytes(this.nativeHandle, str, bArrMarshall);
    }

    public final void i(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
    }

    public final void j(String str, Set set) {
        encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    public final void k(String str, boolean z3) {
        encodeBool(this.nativeHandle, str, z3);
    }

    public final void l(String str, byte[] bArr) {
        encodeBytes(this.nativeHandle, str, bArr);
    }

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z3) {
        encodeBool(this.nativeHandle, str, z3);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        encodeFloat(this.nativeHandle, str, f10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i7) {
        encodeInt(this.nativeHandle, str, i7);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j6) {
        encodeLong(this.nativeHandle, str, j6);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        j(str, set);
        return this;
    }

    public native boolean reKey(@Nullable String cryptKey);

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        removeValueForKey(this.nativeHandle, str);
        return this;
    }

    public native void removeValuesForKeys(String[] arrKeys);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }
}
