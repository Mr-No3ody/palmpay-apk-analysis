package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public interface ValueParser<V> {
    V parse(com.airbnb.lottie.parser.moshi.a aVar, float f10) throws IOException;
}
