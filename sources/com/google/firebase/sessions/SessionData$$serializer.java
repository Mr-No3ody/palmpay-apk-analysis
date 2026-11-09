package com.google.firebase.sessions;

import E.AbstractC0198c;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import org.jetbrains.annotations.NotNull;
import p162kg.L;
import p162kg.N;
import p162kg.V;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/google/firebase/sessions/SessionData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/google/firebase/sessions/SessionData;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = EnumC2125d.f43964c, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SessionData$$serializer implements GeneratedSerializer<SessionData> {

    @NotNull
    public static final SessionData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        N n10 = new N("com.google.firebase.sessions.SessionData", sessionData$$serializer, 3);
        n10.a("sessionDetails", false);
        n10.a("backgroundTime", true);
        n10.a("processDataMap", true);
        descriptor = n10;
    }

    private SessionData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SessionDetails$$serializer.INSTANCE, AbstractC0198c.B(Time$$serializer.INSTANCE), AbstractC0198c.B((KSerializer) SessionData.$childSerializers[2].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SessionData deserialize(@NotNull Decoder decoder) {
        int i7;
        SessionDetails sessionDetails;
        Time time;
        Map map;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SessionData.$childSerializers;
        SessionDetails sessionDetails2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            SessionDetails sessionDetails3 = (SessionDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, SessionDetails$$serializer.INSTANCE, null);
            Time time2 = (Time) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Time$$serializer.INSTANCE, null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            sessionDetails = sessionDetails3;
            i7 = 7;
            time = time2;
        } else {
            boolean z3 = true;
            int i10 = 0;
            Time time3 = null;
            Map map2 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z3 = false;
                } else if (iDecodeElementIndex == 0) {
                    sessionDetails2 = (SessionDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, SessionDetails$$serializer.INSTANCE, sessionDetails2);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    time3 = (Time) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Time$$serializer.INSTANCE, time3);
                    i10 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new p104gg.d(iDecodeElementIndex);
                    }
                    map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), map2);
                    i10 |= 4;
                }
            }
            i7 = i10;
            sessionDetails = sessionDetails2;
            time = time3;
            map = map2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SessionData(i7, sessionDetails, time, map, (V) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SessionData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SessionData.write$Self$com_google_firebase_firebase_sessions(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return L.f38797b;
    }
}
