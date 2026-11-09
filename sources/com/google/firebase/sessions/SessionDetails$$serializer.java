package com.google.firebase.sessions;

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
import p162kg.A;
import p162kg.G;
import p162kg.L;
import p162kg.N;
import p162kg.Z;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/google/firebase/sessions/SessionDetails.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/google/firebase/sessions/SessionDetails;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = EnumC2125d.f43964c, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SessionDetails$$serializer implements GeneratedSerializer<SessionDetails> {

    @NotNull
    public static final SessionDetails$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SessionDetails$$serializer sessionDetails$$serializer = new SessionDetails$$serializer();
        INSTANCE = sessionDetails$$serializer;
        N n10 = new N("com.google.firebase.sessions.SessionDetails", sessionDetails$$serializer, 4);
        n10.a("sessionId", false);
        n10.a("firstSessionId", false);
        n10.a("sessionIndex", false);
        n10.a("sessionStartTimestampUs", false);
        descriptor = n10;
    }

    private SessionDetails$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        Z z3 = Z.f38824a;
        return new KSerializer[]{z3, z3, A.f38776a, G.f38786a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SessionDetails deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i7;
        int iDecodeIntElement;
        String str;
        long jDecodeLongElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            i7 = 15;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            str = strDecodeStringElement2;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement3 = null;
            boolean z3 = true;
            long jDecodeLongElement2 = 0;
            int i10 = 0;
            int iDecodeIntElement2 = 0;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z3 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i10 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i10 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new p104gg.d(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i10 |= 8;
                }
            }
            i7 = i10;
            iDecodeIntElement = iDecodeIntElement2;
            str = strDecodeStringElement3;
            jDecodeLongElement = jDecodeLongElement2;
        }
        String str2 = strDecodeStringElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SessionDetails(i7, str2, str, iDecodeIntElement, jDecodeLongElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SessionDetails value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SessionDetails.write$Self$com_google_firebase_firebase_sessions(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return L.f38797b;
    }
}
