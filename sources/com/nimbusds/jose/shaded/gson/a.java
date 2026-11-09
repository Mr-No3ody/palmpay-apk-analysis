package com.nimbusds.jose.shaded.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f23622a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f23622a = field;
    }

    public final String toString() {
        return this.f23622a.toString();
    }
}
