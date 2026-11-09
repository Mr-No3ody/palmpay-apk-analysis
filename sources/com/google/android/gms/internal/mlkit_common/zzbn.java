package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbn implements ObjectEncoderContext {
    private static final Charset zza = Charset.forName(Constants.ENCODING);
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("key"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("value"));
    private static final ObjectEncoder zzd = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_common.zzbm
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            zzbn.zzg((Map.Entry) obj, objectEncoderContext);
        }
    };
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final ObjectEncoder zzh;
    private final zzbr zzi = new zzbr(this);

    public zzbn(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = objectEncoder;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(zzb, entry.getKey());
        objectEncoderContext.add(zzc, entry.getValue());
    }

    private static int zzh(FieldDescriptor fieldDescriptor) {
        zzbl zzblVar = (zzbl) fieldDescriptor.getProperty(zzbl.class);
        if (zzblVar != null) {
            return zzblVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(ObjectEncoder objectEncoder, Object obj) throws IOException {
        zzbi zzbiVar = new zzbi();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzbiVar;
            try {
                objectEncoder.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzbiVar.zza();
                zzbiVar.close();
                return jZza;
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzbiVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static zzbl zzj(FieldDescriptor fieldDescriptor) {
        zzbl zzblVar = (zzbl) fieldDescriptor.getProperty(zzbl.class);
        if (zzblVar != null) {
            return zzblVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzbn zzk(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z3) throws IOException {
        long jZzi = zzi(objectEncoder, obj);
        if (z3 && jZzi == 0) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 2);
        zzo(jZzi);
        objectEncoder.encode(obj, this);
        return this;
    }

    private final zzbn zzl(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z3) throws IOException {
        this.zzi.zza(fieldDescriptor, z3);
        valueEncoder.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            this.zze.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.zze.write(i7 & 127);
    }

    private final void zzo(long j6) throws IOException {
        while (((-128) & j6) != 0) {
            this.zze.write((((int) j6) & 127) | 128);
            j6 >>>= 7;
        }
        this.zze.write(((int) j6) & 127);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d2) throws IOException {
        zza(fieldDescriptor, d2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final ObjectEncoderContext zza(@NonNull FieldDescriptor fieldDescriptor, double d2, boolean z3) throws IOException {
        if (z3 && d2 == 0.0d) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d2).array());
        return this;
    }

    public final ObjectEncoderContext zzb(@NonNull FieldDescriptor fieldDescriptor, float f10, boolean z3) throws IOException {
        if (z3 && f10 == 0.0f) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f10).array());
        return this;
    }

    public final ObjectEncoderContext zzc(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z3) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z3 || charSequence.length() != 0) {
                    zzn((zzh(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, fieldDescriptor, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(fieldDescriptor, ((Double) obj).doubleValue(), z3);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(fieldDescriptor, ((Float) obj).floatValue(), z3);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(fieldDescriptor, ((Number) obj).longValue(), z3);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
                    if (objectEncoder != null) {
                        zzk(objectEncoder, fieldDescriptor, obj, z3);
                        return this;
                    }
                    ValueEncoder valueEncoder = (ValueEncoder) this.zzg.get(obj.getClass());
                    if (valueEncoder != null) {
                        zzl(valueEncoder, fieldDescriptor, obj, z3);
                        return this;
                    }
                    if (obj instanceof zzbj) {
                        zzd(fieldDescriptor, ((zzbj) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(fieldDescriptor, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, fieldDescriptor, obj, z3);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z3 || bArr.length != 0) {
                    zzn((zzh(fieldDescriptor) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzbn zzd(@NonNull FieldDescriptor fieldDescriptor, int i7, boolean z3) throws IOException {
        if (!z3 || i7 != 0) {
            zzbl zzblVarZzj = zzj(fieldDescriptor);
            zzbk zzbkVar = zzbk.DEFAULT;
            int iOrdinal = zzblVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzblVarZzj.zza() << 3);
                zzn(i7);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzblVarZzj.zza() << 3);
                zzn((i7 + i7) ^ (i7 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzblVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i7).array());
                return this;
            }
        }
        return this;
    }

    public final zzbn zze(@NonNull FieldDescriptor fieldDescriptor, long j6, boolean z3) throws IOException {
        if (!z3 || j6 != 0) {
            zzbl zzblVarZzj = zzj(fieldDescriptor);
            zzbk zzbkVar = zzbk.DEFAULT;
            int iOrdinal = zzblVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzblVarZzj.zza() << 3);
                zzo(j6);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzblVarZzj.zza() << 3);
                zzo((j6 >> 63) ^ (j6 + j6));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzblVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j6).array());
                return this;
            }
        }
        return this;
    }

    public final zzbn zzf(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        objectEncoder.encode(obj, this);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f10) throws IOException {
        zzb(fieldDescriptor, f10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i7) throws IOException {
        zzd(fieldDescriptor, i7, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j6) throws IOException {
        zze(fieldDescriptor, j6, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        zzc(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z3) throws IOException {
        zzd(fieldDescriptor, z3 ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, double d2) throws IOException {
        zza(FieldDescriptor.of(str), d2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, int i7) throws IOException {
        zzd(FieldDescriptor.of(str), i7, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, long j6) throws IOException {
        zze(FieldDescriptor.of(str), j6, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        zzc(FieldDescriptor.of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, boolean z3) throws IOException {
        zzd(FieldDescriptor.of(str), z3 ? 1 : 0, true);
        return this;
    }
}
