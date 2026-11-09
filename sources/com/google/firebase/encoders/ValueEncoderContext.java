package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface ValueEncoderContext {
    @NonNull
    ValueEncoderContext add(double d2) throws IOException;

    @NonNull
    ValueEncoderContext add(float f10) throws IOException;

    @NonNull
    ValueEncoderContext add(int i7) throws IOException;

    @NonNull
    ValueEncoderContext add(long j6) throws IOException;

    @NonNull
    ValueEncoderContext add(@Nullable String str) throws IOException;

    @NonNull
    ValueEncoderContext add(boolean z3) throws IOException;

    @NonNull
    ValueEncoderContext add(@NonNull byte[] bArr) throws IOException;
}
