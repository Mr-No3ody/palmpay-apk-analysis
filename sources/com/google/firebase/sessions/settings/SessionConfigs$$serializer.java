package com.google.firebase.sessions.settings;

import E.AbstractC0198c;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import org.jetbrains.annotations.NotNull;
import p104gg.d;
import p162kg.A;
import p162kg.C1814f;
import p162kg.C1824p;
import p162kg.G;
import p162kg.L;
import p162kg.N;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/google/firebase/sessions/settings/SessionConfigs.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = EnumC2125d.f43964c, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SessionConfigs$$serializer implements GeneratedSerializer<SessionConfigs> {

    @NotNull
    public static final SessionConfigs$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SessionConfigs$$serializer sessionConfigs$$serializer = new SessionConfigs$$serializer();
        INSTANCE = sessionConfigs$$serializer;
        N n10 = new N("com.google.firebase.sessions.settings.SessionConfigs", sessionConfigs$$serializer, 5);
        n10.a("sessionsEnabled", false);
        n10.a("sessionSamplingRate", false);
        n10.a("sessionTimeoutSeconds", false);
        n10.a("cacheDurationSeconds", false);
        n10.a("cacheUpdatedTimeSeconds", false);
        descriptor = n10;
    }

    private SessionConfigs$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializerB = AbstractC0198c.B(C1814f.f38838a);
        KSerializer<?> kSerializerB2 = AbstractC0198c.B(C1824p.f38870a);
        A a3 = A.f38776a;
        return new KSerializer[]{kSerializerB, kSerializerB2, AbstractC0198c.B(a3), AbstractC0198c.B(a3), AbstractC0198c.B(G.f38786a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SessionConfigs deserialize(@NotNull Decoder decoder) {
        int i7;
        Boolean bool;
        Double d2;
        Integer num;
        Integer num2;
        Long l5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, C1814f.f38838a, null);
            Double d10 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, C1824p.f38870a, null);
            A a3 = A.f38776a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a3, null);
            bool = bool3;
            num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a3, null);
            l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, G.f38786a, null);
            num = num3;
            d2 = d10;
            i7 = 31;
        } else {
            boolean z3 = true;
            int i10 = 0;
            Double d11 = null;
            Integer num4 = null;
            Integer num5 = null;
            Long l6 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z3 = false;
                } else if (iDecodeElementIndex == 0) {
                    bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, C1814f.f38838a, bool2);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    d11 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, C1824p.f38870a, d11);
                    i10 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, A.f38776a, num4);
                    i10 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, A.f38776a, num5);
                    i10 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new d(iDecodeElementIndex);
                    }
                    l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, G.f38786a, l6);
                    i10 |= 16;
                }
            }
            i7 = i10;
            bool = bool2;
            d2 = d11;
            num = num4;
            num2 = num5;
            l5 = l6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SessionConfigs(i7, bool, d2, num, num2, l5, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SessionConfigs value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SessionConfigs.write$Self$com_google_firebase_firebase_sessions(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return L.f38797b;
    }
}
