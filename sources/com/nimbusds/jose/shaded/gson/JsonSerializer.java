package com.nimbusds.jose.shaded.gson;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public interface JsonSerializer<T> {
    o serialize(T t, Type type, JsonSerializationContext jsonSerializationContext);
}
