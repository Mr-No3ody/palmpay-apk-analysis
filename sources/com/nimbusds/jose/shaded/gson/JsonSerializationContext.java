package com.nimbusds.jose.shaded.gson;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public interface JsonSerializationContext {
    o serialize(Object obj);

    o serialize(Object obj, Type type);
}
