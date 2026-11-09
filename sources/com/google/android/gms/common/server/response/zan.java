package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    private final HashMap zab;

    @SafeParcelable.Field(getter = "getRootClassName", id = 3)
    private final String zac;

    @SafeParcelable.Constructor
    public zan(@SafeParcelable.Param(id = 1) int i7, @SafeParcelable.Param(id = 2) ArrayList arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.zaa = i7;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zal zalVar = (zal) arrayList.get(i10);
            String str2 = zalVar.zab;
            HashMap map2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.checkNotNull(zalVar.zac)).size();
            for (int i11 = 0; i11 < size2; i11++) {
                zam zamVar = (zam) zalVar.zac.get(i11);
                map2.put(zamVar.zab, zamVar.zac);
            }
            map.put(str2, map2);
        }
        this.zab = map;
        this.zac = (String) Preconditions.checkNotNull(str);
        zaa();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        HashMap map = this.zab;
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                u.w(sb2, "  ", str2, ": ");
                sb2.append(map2.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.zab;
        for (String str : map.keySet()) {
            arrayList.add(new zal(str, (Map) map.get(str)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.zac, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final void zaa() {
        HashMap map = this.zab;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map2 = (Map) map.get((String) it.next());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map2.get((String) it2.next())).zad(this);
            }
        }
    }

    public final void zab() {
        HashMap map = this.zab;
        for (String str : map.keySet()) {
            Map map2 = (Map) map.get(str);
            HashMap map3 = new HashMap();
            for (String str2 : map2.keySet()) {
                map3.put(str2, ((FastJsonResponse.Field) map2.get(str2)).zaa());
            }
            map.put(str, map3);
        }
    }

    public final void zac(Class cls, Map map) {
        this.zab.put((String) Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    @Nullable
    public final Map zad(String str) {
        return (Map) this.zab.get(str);
    }

    public final boolean zae(Class cls) {
        return this.zab.containsKey(Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public final String zaf() {
        return this.zac;
    }

    public zan(Class cls) {
        this.zaa = 1;
        this.zab = new HashMap();
        this.zac = (String) Preconditions.checkNotNull(cls.getCanonicalName());
    }
}
