package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class ProtobufValueEncoderContext implements ValueEncoderContext {
    private FieldDescriptor field;
    private final ProtobufDataEncoderContext objEncoderCtx;
    private boolean encoded = false;
    private boolean skipDefault = false;

    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.objEncoderCtx = protobufDataEncoderContext;
    }

    private void checkNotUsed() {
        if (this.encoded) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.encoded = true;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(@Nullable String str) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, str, this.skipDefault);
        return this;
    }

    public void resetContext(FieldDescriptor fieldDescriptor, boolean z3) {
        this.encoded = false;
        this.field = fieldDescriptor;
        this.skipDefault = z3;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(float f10) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, f10, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(double d2) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, d2, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(int i7) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, i7, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(long j6) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, j6, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(boolean z3) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, z3, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(@NonNull byte[] bArr) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, bArr, this.skipDefault);
        return this;
    }
}
