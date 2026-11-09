package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class S {
    public /* synthetic */ S(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final T createHandle(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new T();
            }
            HashMap map = new HashMap();
            for (String key : bundle2.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                map.put(key, bundle2.get(key));
            }
            return new T(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = parcelableArrayList.get(i7);
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
        }
        return new T(linkedHashMap);
    }

    @RestrictTo({p192n.c.f39801b})
    public final boolean validateValue(@Nullable Object obj) {
        if (obj == null) {
            return true;
        }
        for (Class cls : T.f17406g) {
            Intrinsics.e(cls);
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private S() {
    }
}
