package com.google.android.gms.internal.measurement;

import C0.G;
import android.net.Uri;
import android.text.TextUtils;
import com.airbnb.lottie.model.layer.d;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzru {
    private final Map zza;
    private final Map zzb;
    private final List zzc;

    public zzru(List list) {
        zztc zztcVar;
        zzsx zzsxVar;
        List<zztc> list2 = Collections.EMPTY_LIST;
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzsx zzsxVar2 = (zzsx) it.next();
            if (!TextUtils.isEmpty(zzsxVar2.zzc()) && (zzsxVar = (zzsx) this.zza.put(zzsxVar2.zzc(), zzsxVar2)) != null) {
                String canonicalName = zzsxVar.getClass().getCanonicalName();
                String canonicalName2 = zzsxVar2.getClass().getCanonicalName();
                throw new IllegalArgumentException(G.s(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
            }
        }
        for (zztc zztcVar2 : list2) {
            if (!TextUtils.isEmpty(zztcVar2.zza()) && (zztcVar = (zztc) this.zzb.put(zztcVar2.zza(), zztcVar2)) != null) {
                String canonicalName3 = zztcVar.getClass().getCanonicalName();
                String canonicalName4 = zztcVar2.getClass().getCanonicalName();
                throw new IllegalArgumentException(G.s(new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length()), "Cannot to override Transform ", canonicalName3, " with ", canonicalName4));
            }
        }
        this.zzc.addAll(list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zzrs zze(Uri uri) throws IOException {
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        String encodedFragment = uri.getEncodedFragment();
        ImmutableList immutableListOf = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? ImmutableList.of() : ImmutableList.copyOf(Splitter.on("+").omitEmptyStrings().split(encodedFragment.substring(10)));
        int size = immutableListOf.size();
        for (int i7 = 0; i7 < size; i7++) {
            builder2.add(zzsp.zza((String) immutableListOf.get(i7)));
        }
        ImmutableList immutableListBuild = builder2.build();
        int size2 = immutableListBuild.size();
        for (int i10 = 0; i10 < size2; i10++) {
            String str = (String) immutableListBuild.get(i10);
            zztc zztcVar = (zztc) this.zzb.get(str);
            if (zztcVar == null) {
                String strValueOf = String.valueOf(uri);
                throw new zzsk(G.s(new StringBuilder(d.c(40, str) + strValueOf.length()), "Requested transform isn't registered: ", str, ": ", strValueOf));
            }
            builder.add(zztcVar);
        }
        ImmutableList immutableListReverse = builder.build().reverse();
        zzrr zzrrVar = new zzrr(null);
        String scheme = uri.getScheme();
        zzsx zzsxVar = (zzsx) this.zza.get(scheme);
        if (zzsxVar == null) {
            throw new zzsk(G.o("Requested backend isn't registered: ", scheme));
        }
        zzrrVar.zza(zzsxVar);
        zzrrVar.zzc(this.zzc);
        zzrrVar.zzb(immutableListReverse);
        zzrrVar.zze(uri);
        if (!immutableListReverse.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str2 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator<E> listIterator = immutableListReverse.listIterator(immutableListReverse.size());
                while (listIterator.hasPrevious()) {
                }
                arrayList.set(arrayList.size() - 1, str2);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        zzrrVar.zzd(uri);
        return new zzrs(zzrrVar);
    }

    public final Object zza(Uri uri, zzrt zzrtVar) throws IOException {
        return zzrtVar.zza(zze(uri));
    }

    public final void zzb(Uri uri) throws IOException {
        zzrs zzrsVarZze = zze(uri);
        zzrsVarZze.zza().zzk(zzrsVarZze.zzb());
    }

    public final boolean zzc(Uri uri) throws IOException {
        zzrs zzrsVarZze = zze(uri);
        return zzrsVarZze.zza().zze(zzrsVarZze.zzb());
    }

    public final void zzd(Uri uri, Uri uri2) throws IOException {
        zzrs zzrsVarZze = zze(uri);
        zzrs zzrsVarZze2 = zze(uri2);
        if (zzrsVarZze.zza() != zzrsVarZze2.zza()) {
            throw new zzsk("Cannot rename file across backends");
        }
        zzrsVarZze.zza().zzl(zzrsVarZze.zzb(), zzrsVarZze2.zzb());
    }
}
