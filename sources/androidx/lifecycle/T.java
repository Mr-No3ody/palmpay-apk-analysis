package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry$SavedStateProvider;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final S f17405f = new S(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Class[] f17406g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f17408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f17409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f17410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SavedStateRegistry$SavedStateProvider f17411e;

    public T(HashMap initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f17407a = linkedHashMap;
        this.f17408b = new LinkedHashMap();
        this.f17409c = new LinkedHashMap();
        this.f17410d = new LinkedHashMap();
        this.f17411e = new E0.n(this, 3);
        linkedHashMap.putAll(initialState);
    }

    public static Bundle a(T this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = kotlin.collections.G.k(this$0.f17408b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f17407a;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return p002a.a.e(new Pair(UserMetadata.KEYDATA_FILENAME, arrayList), new Pair("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Bundle bundleSaveState = ((SavedStateRegistry$SavedStateProvider) entry.getValue()).saveState();
            Intrinsics.checkNotNullParameter(key, "key");
            if (!f17405f.validateValue(bundleSaveState)) {
                StringBuilder sb2 = new StringBuilder("Can't put value with type ");
                Intrinsics.e(bundleSaveState);
                sb2.append(bundleSaveState.getClass());
                sb2.append(" into saved state");
                throw new IllegalArgumentException(sb2.toString());
            }
            Object obj = this$0.f17409c.get(key);
            F f10 = obj instanceof F ? (F) obj : null;
            if (f10 != null) {
                f10.k(bundleSaveState);
            } else {
                linkedHashMap.put(key, bundleSaveState);
            }
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this$0.f17410d.get(key);
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(bundleSaveState);
            }
        }
    }

    public T() {
        this.f17407a = new LinkedHashMap();
        this.f17408b = new LinkedHashMap();
        this.f17409c = new LinkedHashMap();
        this.f17410d = new LinkedHashMap();
        this.f17411e = new E0.n(this, 3);
    }
}
