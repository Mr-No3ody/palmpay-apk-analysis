package com.google.android.gms.internal.measurement;

import androidx.camera.camera2.internal.F;
import com.google.android.gms.internal.measurement.zzaca;
import com.google.android.gms.internal.measurement.zzacb;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzacb<MessageType extends zzacb<MessageType, BuilderType>, BuilderType extends zzaca<MessageType, BuilderType>> implements zzafc {
    protected transient int zza = 0;

    public static void zzcg(Iterable iterable, List list) {
        zzaca.zzaV(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final zzacr zzcc() {
        try {
            int iZzcq = zzcq();
            zzacr zzacrVar = zzacr.zza;
            byte[] bArr = new byte[iZzcq];
            int i7 = zzada.zzb;
            zzacx zzacxVar = new zzacx(bArr, 0, iZzcq);
            zzcH(zzacxVar);
            return zzaco.zza(zzacxVar, bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(F.d(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final byte[] zzcd() {
        try {
            int iZzcq = zzcq();
            byte[] bArr = new byte[iZzcq];
            int i7 = zzada.zzb;
            zzacx zzacxVar = new zzacx(bArr, 0, iZzcq);
            zzcH(zzacxVar);
            zzacxVar.zzH();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(F.d(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final void zzce(OutputStream outputStream) throws IOException {
        int iZzcq = zzcq();
        int i7 = zzada.zzb;
        if (iZzcq > 4096) {
            iZzcq = 4096;
        }
        zzacz zzaczVar = new zzacz(outputStream, iZzcq);
        zzcH(zzaczVar);
        zzaczVar.zzx();
    }

    public int zzcf(zzafp zzafpVar) {
        throw null;
    }
}
